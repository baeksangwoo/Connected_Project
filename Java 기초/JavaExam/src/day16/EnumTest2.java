package day16;

enum Season2{
	봄, 여름,가을, 겨울
}

public class EnumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println(Season2.봄);
		System.out.println(Season2.여름);
		System.out.println(Season2.가을);
		System.out.println(Season2.겨울);
		Season2 data = Season2.여름;
		if(data == Season2.가을)
		{
			System.out.println("가을에는 군고구마를 하나 선물하세요");
		}
	}
	

}
