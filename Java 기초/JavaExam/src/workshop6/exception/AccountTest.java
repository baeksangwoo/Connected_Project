package workshop6.exception;



public class AccountTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("441-0290-1203",500000.0 ,7.3);
		
		System.out.print("��������: "+a.getAccount());
		System.out.print(" "+a.getBalance());
		System.out.print(" "+a.getInterestRate()+"\n");
		try{
			a.deposit(-10);
		}
		catch(Exception e)
		{
			System.out.println("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		try{
			a.withdraw(600000);
		}
		catch(Exception e)
		{
			System.out.println("�ݾ��� 0���� ���ų� �ܾ׺��� �����ϴ�.");
		}
		System.out.println("����: "+a.calculateInterest());
		
	}

}
