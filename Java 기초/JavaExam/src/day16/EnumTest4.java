package day16;


enum SeasonInit{
		SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");
		private final String name;
		SeasonInit(String name){
		this.name = name;
		}
		String returnName(){
		return name;
	}
}

public class EnumTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeasonInit day[]= SeasonInit.values();
		for (SeasonInit value : day)
		{
			System.out.println(value);
		}
		for (SeasonInit value : day)
		{
			System.out.println(value.returnName());
		}
		SeasonInit season = SeasonInit.valueOf("SUMMER");
		System.out.println("SeasonInit.valueOf(\"summer\"):"+season);
		System.out.println("SeasonInit.valueOf(\"summer\").returnName():"+season.returnName());
	}
	

}
