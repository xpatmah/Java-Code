//same code  SynchronizedDemo.java (synchronized method)  using synchronied block 

class Display {
	public  void wish(String name){

		// 1 lakh lines of code 
		synchronized(this) {
				for (int i=0;i<5 ;i++ ) {

			System.out.print("Good Morning :");
			
			try{ 
				Thread.sleep(2000);
				System.out.println(name);
			}	
			catch(InterruptedException e){
				System.out.println(e);				
				}

			}
		//1 lakh lines of code
		}
	}
}

class MyThread extends Thread{
	 Display d;
	 String name;
	 MyThread(Display d,String name){
	 	this.d=d;
	 	this.name=name;
	 }

	 public void run(){
	 	d.wish(name);
	 }
}

class SynchronizedBlockDemo{
public static void main(String[] args){

	Display d=new Display();
	MyThread t1 = new MyThread(d,"Dhoni");
	MyThread t2 = new MyThread(d,"Yuvraj");

	t1.start();
	t2.start();
	}
}	