package pokemon;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PokemonDatabase {

	private Connection conn=null;
	
	
	public PokemonDatabase() {	
		
	}

	public boolean connect() {

		String serverAddress="localhost:3306";
		String db="pokemon";
		String user="pokemon_user";
		String pass="pokemon_pass";
		String url="jdbc:mysql://" + serverAddress + "/" + db;
		
		try {
			if(conn==null || conn.isClosed()){
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver cargado correctamente.");
				conn=DriverManager.getConnection(url, user, pass);
				System.out.println("Conexión a la base de datos realizada con éxito.");
				return true;
			}
			else if(conn!=null && !conn.isClosed()){
				System.out.println("Ya habia una conexión establecida a la BBDD.");
				return true;
			}
			else{
				return false;
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Error cargando el driver " + e.getMessage());
			return false;

		} catch (SQLException e) {
			System.err.println("Error cargando la conexión a la base de datos " + e.getMessage());
			return false;
		}
	}

	public boolean disconnect() {
		
		try {
			if(conn!=null && !conn.isClosed()){
				conn.close();
				conn=null;
				System.out.println("Se ha finalizado la conexión con la base de datos");
				return true;
			}
			else{
				System.out.println("No había una conexión previa a la BBDD");
				
				return true;
			}
		} catch (SQLException e) {
			System.err.println("Error al intentar desconectarse de la base de datos: "
					+ "no se había establecido una conexión previa. " + e.getMessage());
			return false;
		}
	}

	public boolean createTableAprende() {

		connect();

		String query="CREATE TABLE aprende ("
				+ "n_pokedex INT NOT NULL,"
				+ "id_ataque INT NOT NULL,"
				+ "nivel INT,"
				+ "PRIMARY KEY (n_pokedex , id_ataque),"
				+ "FOREIGN KEY (n_pokedex) REFERENCES especie (n_pokedex)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "FOREIGN KEY (id_ataque) REFERENCES ataque (id_ataque)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE);";

		Statement st;
		int filasActualizadas;
		try {
			st = conn.createStatement();
			filasActualizadas=st.executeUpdate(query);
			if(filasActualizadas==0){
				st.close();
				return true;
			}
			else{
				st.close();
				return false;
			}
		} catch (SQLException e) {
			System.err.println("No se ha podido crear la tabla Aprende: " + e.getErrorCode());
			System.err.println("No se ha podido crear la tabla Aprende: " + e.getMessage());
			return false;
		}
	}

	public boolean createTableConoce() {
		connect();

		String query="CREATE TABLE conoce ("
				+ "n_encuentro INT NOT NULL ,"
				+ "n_pokedex INT NOT NULL ,"
				+ "id_ataque INT NOT NULL ,"
				+ "PRIMARY KEY (n_encuentro , n_pokedex , id_ataque),"
				+ "FOREIGN KEY (n_pokedex , n_encuentro ) REFERENCES ejemplar (n_pokedex , n_encuentro)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE,"
				+ "FOREIGN KEY (id_ataque) REFERENCES ataque (id_ataque)"
				+ "ON DELETE CASCADE ON UPDATE CASCADE);";

		Statement st;
		int filasActualizadas;
		try {
			st = conn.createStatement();
			filasActualizadas=st.executeUpdate(query);
			if(filasActualizadas==0){
				st.close();
				return true;
			}
			else{
				st.close();
				return false;
			}
		} catch (SQLException e) {
			System.err.println("No se ha podido crear la tabla Conoce: " + e.getErrorCode());
			System.err.println("No se ha podido crear la tabla Conoce: " + e.getMessage());
			return false;
		}
	}

	public int loadAprende(String fileName) {
		//Variables locales
		ArrayList <Aprende> arrayAprende;
		int elementosInsertados=0;
		PreparedStatement pst;
		String query="INSERT INTO aprende VALUES (?,?,?);";
		
		/*Nos conectamos a la BBDD , leemos del fichero y vamos haciendo
		 * transacciones de inserciones con cada fila leida del fichero.
		 * En caso de error, saltamos por el catch y hacemos un rollback*/
		connect();						
		arrayAprende=Aprende.readData(fileName);
		try {
			conn.setAutoCommit(false);
			pst=conn.prepareStatement(query);
			for(Aprende a: arrayAprende){
				pst.setInt(1, a.getId_especie());
				pst.setInt(2, a.getId_ataque());
				pst.setInt(3, a.getNivel());
				pst.executeUpdate();
				conn.commit();
				elementosInsertados+=1;
			}
			conn.setAutoCommit(true);
			pst.close();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.err.println("No se ha podido hacer rollback: " + e1.getErrorCode());
				System.err.println("No se ha podido hacer rollback: " + e1.getMessage());
			}
			System.err.println("Ha surgido un error inesperado: " + e.getErrorCode());
			System.err.println("Ha surgido un error inesperado: " + e.getMessage());			
		}
		return elementosInsertados;
	}

	public int loadConoce(String fileName) {
				//Variables locales
				ArrayList <Conoce> arrayConoce;
				int elementosInsertados=0;
				PreparedStatement pst;
				String query="INSERT INTO conoce VALUES (?,?,?);";
				
				/*Nos conectamos a la BBDD , leemos del fichero y vamos haciendo
				 *  inserciones con cada fila leida del fichero y, por ultimo, hacemos 
				 *  un commit.
				 * En caso de error, saltamos por el catch y hacemos un rollback*/
				connect();						
				arrayConoce=Conoce.readData(fileName);
				try {
					conn.setAutoCommit(false);
					pst=conn.prepareStatement(query);
					for(Conoce c: arrayConoce){
						pst.setInt(1, c.getN_encuentro());
						pst.setInt(2, c.getId_especie());
						pst.setInt(3, c.getId_ataque());
						pst.executeUpdate();
						elementosInsertados+=1;
					}
					conn.commit();
					conn.setAutoCommit(true);
					pst.close();
				} catch (SQLException e) {
					try {
						conn.rollback();
					} catch (SQLException e1) {
						System.err.println("No se ha podido hacer rollback: " + e1.getErrorCode());
						System.err.println("No se ha podido hacer rollback: " + e1.getMessage());
					}
					System.err.println("Ha surgido un error inesperado: " + e.getErrorCode());
					System.err.println("Ha surgido un error inesperado: " + e.getMessage());			
				}
				return elementosInsertados;
	}

	public ArrayList<Especie> pokedex() {
		
		/*Variables para obtener las especies de la BBDD y almacenarlos en un arrayList*/
		ArrayList<Especie> arrayEspecies=new ArrayList<Especie>();
		String query="SELECT n_pokedex , nombre , descripcion , evoluciona FROM especie;";
		Statement st;
		ResultSet rs;
		
		/*Nos conectamos, ejecutamos la query con un statement y obtenemos los datos de cada especie con el ResultSet.
		 * Acto seguido, creamos una especie con esos datos y la añadimos al arrayList de especies.*/
		connect();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next()){
				int n_pokedex=rs.getInt(1);
				String nombre=rs.getString(2);
				String descripcion=rs.getString(3);
				int evoluciona=rs.getInt(4);
				Especie e=new Especie(n_pokedex, nombre, descripcion, evoluciona);
				arrayEspecies.add(e);				
			}
			st.close();
			rs.close();
			
		} catch (SQLException e) {
			System.err.println("Error al establecer el statement: " + e.getErrorCode());
			System.err.println("Error al establecer el statement: " + e.getMessage());
			return null;
		}
		
		return arrayEspecies; 
	}

	public ArrayList<Ejemplar> getEjemplares() {
		
		/*Variables para obtener los ejemplares de la BBDD y almacenarlos en un arrayList*/
		ArrayList<Ejemplar> arrayEjemplares=new ArrayList<Ejemplar>();
		String query="SELECT n_pokedex , n_encuentro , apodo , sexo, nivel , infectado "
				+ " FROM ejemplar "
				+ " ORDER BY n_pokedex ASC ,n_encuentro ASC ;";
		Statement st;
		ResultSet rs;
		
		/*Nos conectamos, ejecutamos la query con un statement y obtenemos los datos de cada ejemplar con el ResultSet.
		 * Acto seguido, creamos un ejemplar con esos datos y lo añadimos al arrayList de ejemplares.*/
		connect();
		try {
			st=conn.createStatement();
			rs=st.executeQuery(query);
			
			while(rs.next()){
				int n_pokedex=rs.getInt(1);
				int n_encuentro=rs.getInt(2);
				String apodo=rs.getString(3);
				char sexo=rs.getString(4).charAt(0);
				int nivel=rs.getInt(5);
				int infectado=rs.getInt(6);
				Ejemplar e=new Ejemplar(n_pokedex, n_encuentro, apodo, sexo, nivel, infectado);
				arrayEjemplares.add(e);				
			}
			st.close();
			rs.close();
			
		} catch (SQLException e) {
			System.err.println("Error al establecer el statement: " + e.getErrorCode());
			System.err.println("Error al establecer el statement: " + e.getMessage());
			return null;
		}
		
		return arrayEjemplares;
	}

	public int coronapokerus(ArrayList<Ejemplar> ejemplares, int dias) {
		
		/*Variables para la insercion de los pokemon infectados*/
		PreparedStatement pst;
		String query="UPDATE ejemplar SET infectado=1 "
				+ "WHERE n_pokedex = ? AND n_encuentro = ?;";
		
		/*Variables para el conteo de pokemon a infectar y el total de posibles infectados,
		 * El valor "infectados" puede ser mayor que el total de infectados debido a que un pokemon infectado se puede volver a reinfectar.*/
		
		int aInfectar=1;
		int infectados=0;
		int aux;
		
		/*Variables para el conteo de infectados al final de la pandemia.*/
		int pokemonContagiados=0;
		
		/*Nos conectamos a la BBDD, establecemos el autocommit a false para hacer un commit con el paso de cada dia.
		 * Llamamos a ejemplarRandom tantas veces como indique "aInfectar" y ejecutamos un update con el preparedStatement*/
		connect();		
		try {
			conn.setAutoCommit(false);
			pst=conn.prepareStatement(query);
			while(dias>0){
				for(int i=0; i<aInfectar; i++){
					Ejemplar e=Ejemplar.ejemplarRandom(ejemplares);
					if(e.getInfectado()==0){
					e.setInfectado(1);
					int n_pokedex=e.getN_pokedex();
					int n_encuentros=e.getN_encuentro();
					pst.setInt(1, n_pokedex);
					pst.setInt(2, n_encuentros);
					pst.executeUpdate();
					pokemonContagiados++;
					}
					
				}
				conn.commit();
				aux=infectados;
				infectados=aInfectar;
				aInfectar=aInfectar+aux;
				dias--;
			}
			conn.setAutoCommit(true);
			pst.close();
			
		} catch (SQLException e) {
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.err.println("Ha habido un fallo al intentar hacer rollback: " + e.getErrorCode());
				System.err.println("Ha habido un fallo al intentar hacer rollback: " + e.getMessage());
			}
			System.err.println("Ha habido un fallo al intentar expandir el coronapokerus: " + e.getErrorCode());
			System.err.println("Ha habido un fallo al intentar expandir el coronapokerus: " + e.getMessage());
		}
		
		return pokemonContagiados;
	}
		
	public boolean getSprite(int n_pokedex, String filename) {

		/*Variables para hacer la query que nos devolverá el sprite del pokemon.*/
		PreparedStatement pst;
		ResultSet rs;
		String query="SELECT sprite FROM especie "
				+ " WHERE n_pokedex = ? ;";
		
		/*Bytes es un array donde almacenaremos los pixeles de la imagen.
		 * Blob es una variable que hace referencia a un archivo binario, en este caso la imagen a descargar. */

		byte bytes[]=null;
		Blob blob=null;

		/*Nos conectamos a la BBDD, ejecutamos la query y con el ResultSet nos vamos moviendo por los datos de la imagen que nos ha devuelto 
		 * la query. Si ese dato al que apunta el ResultSet es null, no lo añadimos en bytes.*/
		connect();

		try {
			pst=conn.prepareStatement(query);
			pst.setInt(1, n_pokedex);
			rs=pst.executeQuery();

			while(rs.next()){

				blob=rs.getBlob("sprite");
				if(blob!=null){
					bytes=blob.getBytes(1, (int)blob.length());
				}

			}
			rs.close();
			pst.close();

			/*Si al final bytes queda con valor null, es porque la imagen no estaba en la BBDD.*/
			if(bytes==null){
				System.err.println("No se ha podido descargar la imagen debido a que no existe en la base de datos.");
				return false;
			}

			else{
				FileOutputStream fos=new FileOutputStream(filename);
				fos.write(bytes);
				fos.close();
				System.out.println("Se ha descargado la imagen correctamente.");
				return true;
			}

		} catch (SQLException e) {
			System.err.println("Ha habido un error al intentar descargar el archivo: " + e.getErrorCode());
			System.err.println("Ha habido un error al intentar descargar el archivo: " + e.getMessage());		
			return false;
		} catch (FileNotFoundException e) {
			System.err.println("No se ha podido encontrar el archivo dentro de la base de datos: " + e.getMessage());
			return false;
		} catch (IOException e) {
			System.err.println("Ha habido un error al intentar almacenar el archivo: " + e.getMessage());
			return false;
		}
	}

}
