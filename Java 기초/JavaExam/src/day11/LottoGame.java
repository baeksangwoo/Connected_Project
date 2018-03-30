package day11;

public class LottoGame extends LottoMachine  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		LottoMachine a=new LottoMachine();		
		a.createLottoNums();
		a.checkLottoNums();
			
		for(int i=0;i<6;i++)
		{
			System.out.print(a.getNums()[i]+"\t");
		}
		
		}
		catch(DuplicateException e){
					System.out.println(e.getMessage());
		}
	}
}