package work;
class A {
	 void abc(){
	  System.out.println("Hello"); // ---> �׸��� �̰��� �� ����� �ȵǴ����ϱ���
	 }
	}

	class B extends A{

	}
	public class InstanceOf{    /// ---------------------> �̰Ϳ� ���� ����
	  public static void main(String args[]){
	 B b = new B();
	    if(b instanceof B){
	  System.out.println("b is instance of B.");
	    }
	    if(b instanceof A){
	     System.out.println("b is instance of A.");
	    }
	    if(b instanceof Object){
	  System.out.println("b is instance of Object.");      // -------> Object�� ��Ȱ ....
	 }
	 
	   }
	}