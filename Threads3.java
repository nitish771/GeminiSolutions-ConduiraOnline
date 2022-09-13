import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


class Message implements Runnable{ 
	Thread t;
	int n;

	Message(int n){
		t = new Thread();
		this.n = n;
	}

  public void run() { 
    System.out.println(t.getName() +" - Number(" + n + ")");
    wait_();
  } 

  void wait_(){
  	try{
	  	Thread.sleep(2000);
  	} catch(InterruptedException e){
  		e.printStackTrace();
  	}
  }
}


 class Threads3 {
  public static void main (String arg[]) { 
  		ExecutorService srv = Executors.newFixedThreadPool(5);
  		for(int i=0; i<10; i++)
  			srv.execute(new Message(i));
    
	}
}