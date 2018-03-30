package day11;



public class ExceptionTest1 {

	public static void main(String[] args) throws Exception { //throws 절 try catch
		// TODO Auto-generated method stub
		//throws Exception 예외처리 하는 것을 말한다.
		
		System.out.println("main() 수행시작...");
		try{
			int num1= Integer.parseInt(args[0]);
			System.out.printf("dddd");
			int num2= Integer.parseInt(args[1]); //예외가 발생했어요 그러면 에러 객체가 나와요
			int result= num1/num2; //그러면 더이상 수행을 하지 않아요 에러가 나온 데에서 catch로 가요
			System.out.println("연산결과: " +result);
			
		}/*catch (ArrayIndexOutOfBoundsException e){
			System.out.println("두 개의 프로그램 아규먼트를 입력하세요.");
		}*/catch (ArithmeticException e)
		{
			System.out.println("두 번째 숫자는 0일 수 없어요");	
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();//예외가 발생했을때 스택 정보를 쭉 출력하는 기능 밑에서 위로 흘러 갔다
			return;
		}catch (NumberFormatException e)
		{
			System.out.println("숫자만 입력하세요");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("두 개의 프로그램 아규먼트를 입력하세요.");
		}finally {       //0개 또는 1개만 올 수 있다 
			System.out.println("이 블럭은 반드시 수행합니다요....");
		}
		System.out.println("main() 수행종료...");
		
		
	}

}
