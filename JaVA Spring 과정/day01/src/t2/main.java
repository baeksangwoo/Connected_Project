package t2;




class T1 extends Thread {
	
		int result = 1;
	   boolean flag = true;

	   public int getResult() {
	      return this.result;
	   }

	   public void setFlag(boolean flag) {
	      this.flag = flag;
	   }

	   @Override
	   public void run() {
	      while (flag) {
	         result++;
	         try {
	            Thread.sleep(300);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	   }
}
public class main {

	
	public static void main(String[] args) {
		
		T1 t1 =new T1();
		t1.start();
		int result =0;
		while(result<=20) {
			result=t1.getResult();
			System.out.println(result);
		}
		
	}

}
