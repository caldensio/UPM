package aed.urgencias;

import java.util.Comparator;

/**
 * Implements a comparator for patients which depends on their priority.
 */
public class PrioridadComparator implements Comparator<Paciente> {
  
  /**
   * Implements a comparator for patients depending on
   * when they arrived at their current priority.
   * A patient p1 compares less than a patient p2 
   * if either the priority of p1 is higher than the priority of
   * p2 (a lower number),
   * or if priorities are equal, if the arrival time of p1 at that priority
   * is earlier than the arrival time of p2 at that priority.
   */
  public int compare(Paciente p1, Paciente p2) {
    if (p1.getPrioridad() < p2.getPrioridad()) {
      return -1;
    }
    else if (p1.getPrioridad() > p2.getPrioridad()) {
      return 1;
    }
    else {  // The same priority
      if (p1.getHoraLlegadaPrioridad() < p2.getHoraLlegadaPrioridad()) {
	return -1;
      }
      else if (p1.getHoraLlegadaPrioridad() > p2.getHoraLlegadaPrioridad()) {
	return 1;
      }
      else {
	return 0;
      }
    }
  }
}
