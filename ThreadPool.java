import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ThreadPool{
	public static void main(String[] args) {
		ExecutorService srv = Executors.newFixedThreadPool(3);
		Runnable mp1 = new MessageProcessor(1);
		Runnable mp2 = new MessageProcessor(2);
		Runnable mp3 = new MessageProcessor(3);

		srv.execute(mp1);
		srv.execute(mp2);
		srv.execute(mp3);

		// srv.shutdown(); // gracefully
		srv.shutdownNow();  // immediately

	}
}