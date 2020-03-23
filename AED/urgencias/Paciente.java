package aed.urgencias;

/**
 * Provides the relevant patient data.
 */
public class Paciente {
  
  private String DNI;
  private int prioridad;
  private long horaLlegadaUrgencias;
  private long horaLlegadaPrioridad;
  
  
  /**
   * Creates a new paciente with DNI and initial priority.
   * Sets the arrivial time (at that priority).
   */
  public Paciente(String DNI, int prioridad) {
    this.DNI = DNI;
    this.prioridad = prioridad;
    this.horaLlegadaPrioridad = this.horaLlegadaUrgencias = Time.currentTimeMillis();
  }
  
  /**
   * Returns the DNI.
   */
  public String getDNI() {
    return this.DNI;
  }
  
  /**
   * Returns the priority.
   */
  public int getPrioridad() {
    return this.prioridad;
  }
  
  /**
   * Returns the arrival time (at the urgencias).
   */
  public long getHoraLlegadaUrgencias() {
    return	this.horaLlegadaUrgencias;
  }
  
  /**
   * Returns the arrival time (at the current priority).
   */
  public long getHoraLlegadaPrioridad() {
    return this.horaLlegadaPrioridad;
  }
  
  /**
   * Assigns a new priority.
   */
  public void setPrioridad(int prioridad) {
    this.prioridad = prioridad;
  }
  
  /**
   * Sets the arrival time (at that priority).
   */
  public void setHoraLlegadaPrioridad(long horaLlegadaPrioridad) {
    this.horaLlegadaPrioridad = horaLlegadaPrioridad;
  }
  
  public String toString() {
    return "paciente(DNI="+getDNI()+",prio="+getPrioridad()+
      ",llegada="+getHoraLlegadaUrgencias()+
      ",llegadaPrioridad="+getHoraLlegadaPrioridad()+")";
  }
}
