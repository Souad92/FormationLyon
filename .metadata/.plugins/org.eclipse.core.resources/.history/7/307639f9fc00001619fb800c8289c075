import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadReveil extends Thread {
	public boolean sortie;

	@Override
	public void run() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (!sortie) {
			System.out.println("Appuyer sur Entrer");
			try {
				in.readLine();
				System.out.println("Debout là dedans");
				synchronized (this) {
					notify();
				}
			} catch (IOException e) {
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println("FIN");
	}
}
