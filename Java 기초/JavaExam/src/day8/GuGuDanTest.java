package day8;
class GuGu{
	private int dan;
	private int number;
	GuGu(){}
	GuGu(int dan){
		this.dan=dan;
	}
	GuGu(int dan, int number){
		this.dan=dan;
		this.number=number;
	}
	void printPart(){
		if(number==0){
			for(int n=1;n<=9;n++) {
				System.out.print("\t"+dan+"*"+n+"="+dan*n);
			}
			System.out.println();
		}
		else{
			System.out.println(dan*number);
		}
	}
}
class GuGudan extends GuGu{
	GuGudan(){}
	GuGudan(int dan){
		super(dan);
	}
	GuGudan(int dan, int number){
		super(dan,number);
	}
	public static void printAll(){
		for(int i=1;i<10;i++){
			for (int j=1;j<10;j++){
				System.out.printf("%d * %d = %d  ",i,j,i*j);
			}
			System.out.println("");
				
		}
	}
}
public class GuGuDanTest {
	public static void main(String[] args){
		int dan=(int)(Math.random()*19)+1;
		int number=(int)(Math.random()*19)+1;
		System.out.println("´Ü : "+dan+", num : "+number);
		if(dan<10 && number<10){
			GuGu gu = new GuGu(dan,number);
			System.out.print(dan+"*"+number+"=");
			gu.printPart()
			;
		}
		else if (dan<10 && number>=10){
			GuGudan ggd = new GuGudan(dan,0);
			System.out.print(dan+"´Ü :");
			ggd.printPart();
			
		}
		else{
			GuGudan ggd = new GuGudan();
			ggd.printAll();
		}
	}
}
