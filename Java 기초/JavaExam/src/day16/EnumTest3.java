package day16;


class Tour{
	enum Season{
		SPRING, SUMMER, FALL, WINTER
	}//value 와 valueof는 자동으로 컴파일 시 생성이 된다.
}


public class EnumTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tour.Season day[]= Tour.Season.values();
		for (Tour.Season value : day)
		{
			System.out.println(value);
		}
		Tour.Season season = Tour.Season.valueOf("SUMMER");
		System.out.println("Tour.Season.valueOf(\"summer\"):"+season);
		Season data = Season.FALL;
		if(data == Season.FALL)
		{
			System.out.println("가을에는 군고구마를 하나 선물하세요");
		}
	}
	

}
