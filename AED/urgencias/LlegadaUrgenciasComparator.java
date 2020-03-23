package aed.urgencias;

import java.util.Comparator;

/**
 * Implements a comparator for patients which depends on when they arrived at the urgencias.
 */
public class LlegadaUrgenciasComparator implements Comparator<Paciente> {
  
  /**
   * Implements a comparator for patients.
   * A patient p1 compares less than a patient p2 
   * if their arrival time at the urgencias of patient p1
   * is less than the arrival at the urgencias of patient p2.
   */
  public int compare(Paciente p1, Paciente p2) {
    long p1Time = p1.getHoraLlegadaUrgencias();
    long p2Time = p2.getHoraLlegadaUrgencias();
    if (p1Time < p2Time)
      return -1;
    else if (p1Time == p2Time)
      return 0;
    else
      return 1;
  }
}
