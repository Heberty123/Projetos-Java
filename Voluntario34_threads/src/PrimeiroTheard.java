
public class PrimeiroTheard implements Runnable {

	
	private long ii;
	private long jj;

	
	public PrimeiroTheard(long i, long j) {
		this.ii = i;
		this.jj = j;
	}
	
	@Override
	public void run() {
		
		SegundoThread st = new SegundoThread(ii, jj);
		Thread thread = new Thread(st);
		thread.start();
		
		long result = 0;
		
		for (long i = 1 ; i<= ii ; i++) {
			for (long j = 1 ; j<= jj ; j++) {
				result += 1;
			}
		}
		
		System.out.println("Primeiro thread: " + result);
	}
	
}
