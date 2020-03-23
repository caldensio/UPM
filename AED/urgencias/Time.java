package aed.urgencias;

/**
 * Provides time stamps.
 */
public class Time {
	static private long currentTime;

	/**
	 * Returns the current time. The current time is represented as 
	 * the number of milliseconds after some initial event.
	 */
	public static long currentTimeMillis() {
		return currentTime++;
	}

	/**
	 * Sets the current time. 
	 */
	public static void setCurrentTime(long currentTime) {
		Time.currentTime = currentTime;
	}
}

