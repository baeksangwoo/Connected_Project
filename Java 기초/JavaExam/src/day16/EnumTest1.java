package day16;

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

public class EnumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season data = Season.FALL;
		if(data == Season.FALL)
		{
			System.out.println("가을에는 군고구마를 하나 선물하세요");
		}
	}
	

}
