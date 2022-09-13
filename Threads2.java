class MyThread implements Runnable{ 

	Thread t;

	MyThread(){
		t = new Thread();
	}

  public void run() { 
    System.out.println(t.getName() + " - Hello India");
  } 
}


 class Threads2 {
  public static void main (String arg[]) { 

    for (int x=0; x<5; x++)
    {
        Thread t= new Thread(new MyThread());
        t.start();
    }
}
}