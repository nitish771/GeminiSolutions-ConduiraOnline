
class MessageProcessor implements Runnable{

	private int msg;

	MessageProcessor(int msg){
		this.msg = msg;
	}

	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName() + " Processing Message " + msg);
		respondMsg();
		System.out.println(Thread.currentThread().getName() + " Done Processing " + msg);
	}

	public void respondMsg(){
		try{
			Thread.sleep(3000);
		} catch(InterruptedException e){
			System.out.println("Error " + e);
		}
	}

}