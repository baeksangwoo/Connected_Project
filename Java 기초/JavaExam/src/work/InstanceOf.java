package work;
class A {
	 void abc(){
	  System.out.println("Hello"); // ---> 그리고 이값은 왜 출력이 안되는지하구요
	 }
	}

	class B extends A{

	}
	public class InstanceOf{    /// ---------------------> 이것에 대한 개념
	  public static void main(String args[]){
	 B b = new B();
	    if(b instanceof B){
	  System.out.println("b is instance of B.");
	    }
	    if(b instanceof A){
	     System.out.println("b is instance of A.");
	    }
	    if(b instanceof Object){
	  System.out.println("b is instance of Object.");      // -------> Object에 역활 ....
	 }
	 
	   }
	}