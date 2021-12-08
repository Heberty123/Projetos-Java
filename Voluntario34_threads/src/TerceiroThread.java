
public class TerceiroThread implements Runnable {

	
	private long ii;
	private long jj;

	
	public TerceiroThread(long i, long j) {
		this.ii = i;
		this.jj = j;
	}
	
	@Override
	public void run() {
		
		
		long result = 0;
		
		for (long i = 1 ; i<= ii ; i++) {
			for (long j = 1 ; j<= jj ; j++) {
				result += 1;
			}
		}
		
		System.out.println("Primeiro thread: " + result);
		
	}

}
