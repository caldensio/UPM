
//Luis Dominguez Romero z170298 y Jaime Diez-Hochleitner Suarez z170198

package aed.urgencias;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class Tests extends UrgenciasAED{

	@Test
	public void testAdmitirGetProximo() throws NoHayPacienteExc{
	Urgencias u = new UrgenciasAED();
	admitirPaciente("111", 5);
	admitirPaciente("222", 5);
	Paciente p = getProximoPaciente();
	assertEquals("111", p.getDNI());
	}
	
	@Test
	public void testAtenderPaciente()throws NoHayPacienteExc{
		Urgencias u = new UrgenciasAED();
		admitirPaciente("111", 5);
		admitirPaciente("222", 5);
		Paciente p = atenderPaciente();
		assertEquals("111", p.getDNI());
		Paciente p2 = atenderPaciente();
		assertEquals("222", p2.getDNI());
		}
	@Test
	public void testGetProximoPaciente()throws NoHayPacienteExc{
		Urgencias u = new UrgenciasAED();
		admitirPaciente("111", 5);
		admitirPaciente("222", 1);
		Paciente p = getProximoPaciente();
		assertEquals("222", p.getDNI());
		}
	@Test
	public void testSalirPaciente()throws NoHayPacienteExc{
		Urgencias u = new UrgenciasAED();
		admitirPaciente("111", 5);
		admitirPaciente("222", 5);
		salirPaciente("111");
		Paciente p = getProximoPaciente();
		assertEquals("222", p.getDNI());
		}
	@Test
	public void testCambiarPrioridad()throws NoHayPacienteExc{
		Urgencias u = new UrgenciasAED();
		admitirPaciente("111", 5);
		admitirPaciente("222", 5);
		cambiarPrioridad("222",1);
		Paciente p = getProximoPaciente();
		assertEquals("222", p.getDNI());
		}
}
