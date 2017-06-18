package text;

public class TimerThread extends Thread{

	public int a = 30;
	
	
		public void run(){
			
			
			
			for(int i = a;i>0;i--){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);;
				
				
				
				
				
				
				
				
				
				
				
				
				
			}}}

