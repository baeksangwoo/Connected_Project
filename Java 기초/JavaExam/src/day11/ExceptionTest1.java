package day11;



public class ExceptionTest1 {

	public static void main(String[] args) throws Exception { //throws �� try catch
		// TODO Auto-generated method stub
		//throws Exception ����ó�� �ϴ� ���� ���Ѵ�.
		
		System.out.println("main() �������...");
		try{
			int num1= Integer.parseInt(args[0]);
			System.out.printf("dddd");
			int num2= Integer.parseInt(args[1]); //���ܰ� �߻��߾�� �׷��� ���� ��ü�� ���Ϳ�
			int result= num1/num2; //�׷��� ���̻� ������ ���� �ʾƿ� ������ ���� ������ catch�� ����
			System.out.println("������: " +result);
			
		}/*catch (ArrayIndexOutOfBoundsException e){
			System.out.println("�� ���� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���.");
		}*/catch (ArithmeticException e)
		{
			System.out.println("�� ��° ���ڴ� 0�� �� �����");	
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();//���ܰ� �߻������� ���� ������ �� ����ϴ� ��� �ؿ��� ���� �귯 ����
			return;
		}catch (NumberFormatException e)
		{
			System.out.println("���ڸ� �Է��ϼ���");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("�� ���� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���.");
		}finally {       //0�� �Ǵ� 1���� �� �� �ִ� 
			System.out.println("�� ���� �ݵ�� �����մϴٿ�....");
		}
		System.out.println("main() ��������...");
		
		
	}

}
