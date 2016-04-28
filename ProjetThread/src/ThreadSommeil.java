import java.text.DecimalFormat;

public class ThreadSommeil extends Thread {

	@Override
	public void run() {
		ThreadReveil tReveil = new ThreadReveil();
		tReveil.start();
		long t = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			synchronized (tReveil) {
				try {
					tReveil.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("J'ai dormi " + difToString(t, System.nanoTime()));
				t = System.nanoTime();
			}

		}
		tReveil.sortie = true;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Arret du sommeil");
	}

	private String difToString(long avant, long apres) {
		double dif = ((double) apres - avant) / 100000;
		DecimalFormat df = new DecimalFormat("#####.00");
		return df.format(dif) + " ms";
	}

}
