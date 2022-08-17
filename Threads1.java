class MyThread extends Thread { 

  public void run() { 
    System.out.println(getName() + " - Hello All");
  } 
}


 class Threads1 {
  public static void main (String arg[]) { 

    for (int x=0; x<5; x++)
    {
        MyThread temp= new MyThread();
        temp.start();
    }
}
}