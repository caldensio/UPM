package aed.hashtables;

/**
 * Provides the relevant person data.
 */
public class Person {

	private String DNI;
        private String nombre;
        private String apellido1;
        private String apellido2;

	/**
	 * Creates a new person with DNI and nombre.
	 */
    public Person(String DNI, String nombre, String apellido1, String apellido2) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	/**
	 * Returns the DNI.
	 */
	public String getDNI() {
		return this.DNI;
	}

	/**
	 * Returns the nombre.
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Returns apellido1.
	 */
	public String getApellido1() {
		return this.apellido1;
	}

	/**
	 * Returns apellido2.
	 */
	public String getApellido2() {
		return this.apellido2;
	}

        public int hashCode() {	    
	    return this.DNI.hashCode();
        }

        public boolean equals(Object obj) {
        		Person p=(Person)obj;  
        		return obj!=null && obj instanceof Person && p.getDNI().hashCode()==this.DNI.hashCode();
        }

	public String toString() {
		return "person(DNI="+getDNI()+",nombre="+getNombre()+",apellido1="+apellido1+",apellido2="+apellido2+")";
	}
}
