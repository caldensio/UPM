// Implementación de la interfaz del manager

package manager;
import java.util.List;
import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;

import interfaces.*;

public class ManagerImpl extends UnicastRemoteObject implements Manager {
    public static final long  serialVersionUID=1234567891;
    private ArrayList<DataNode> nodeList;
    private int contador;
    public ManagerImpl() throws RemoteException {
    	this.nodeList  = new ArrayList<DataNode>();
    	this.contador = 0;
    }
    // alta de un nodo de datos
    public synchronized void addDataNode(DataNode n) throws RemoteException {
    	this.nodeList.add(n);    	
    }
    // obtiene lista de nodos de datos del sistema
    public synchronized List <DataNode> getDataNodes() throws RemoteException {
        return this.nodeList;
    }
    // método no remoto que selecciona un nodo de datos para ser usado
    // para almacenar un chunk
    public synchronized DataNode selectDataNode() {
    	if(this.contador < this.nodeList.size()-1) {
    		this.contador++;
    	}
    	else {
    		this.contador = 0;
    	}
    	return this.nodeList.get(contador);
    }
}
