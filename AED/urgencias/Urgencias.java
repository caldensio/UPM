package aed.urgencias;

import es.upm.aedlib.positionlist.PositionList;


interface Urgencias {

  /**
   * Admite un paciente nuevo.
   */ 
  public void admitirPaciente(String DNI, int prioridad);

  /**
   * Un paciente admitido sale.
   */ 
  public void salirPaciente(String DNI) throws NoHayPacienteExc;

  /**
   * Cambia la prioridad de un paciente admitido.
   */ 
  public void cambiarPrioridad(String DNI, int nuevaPrioridad) throws NoHayPacienteExc;

  /* Cual es el siguente paciente de ser atendido, en orden 
   * de prioridad.
   * @return el siguiente paciente que va a ser atendido.
   */
  public Paciente getProximoPaciente() throws NoHayPacienteExc;
  
  /* Atende el siguente paciente.
   * @return el paciente atendido.
   */
  public Paciente atenderPaciente() throws NoHayPacienteExc;

  /**
   * Aumenta la prioridad de todos los pacientes que
   * han esperado mas cantidad de tiempo que maxTiempoEspera
   * EN SU PRIORIDAD ACTUAL. 
   */ 
  public void aumentaPrioridad(long maxTiempoEspera);

  /**
   * Devuelve una lista ORDENADA de todos los pacientes admitido
   * y todavia no atendidos. Deberian estar ordenadas segun
   * cuando fueron admitidos (primero el paciente que ha esperado
   * mas tiempo, etc).
   * @return una lista ORDENADA que contenta todos los pacientes admitidos
   * y no atendidos.
   */
  public Iterable<Paciente> getPacientesPorOrdenDeLlegada();

}
