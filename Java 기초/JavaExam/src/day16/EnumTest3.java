package day16;


class Tour{
	enum Season{
		SPRING, SUMMER, FALL, WINTER
	}//value �� valueof�� �ڵ����� ������ �� ������ �ȴ�.
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
			System.out.println("�������� �������� �ϳ� �����ϼ���");
		}
	}
	

}
