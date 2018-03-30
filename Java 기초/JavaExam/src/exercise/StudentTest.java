package exercise;

public class StudentTest extends Student {
	public static void main(String args[]) {
	Student arrays [] = new Student[3];
	arrays[0]=new Student("홍길동",20 ,171 ,81 ,"201101" ,"영문");
	arrays[1]=new Student("고길동", 21 ,183, 72, "201102", "건축");
	arrays[2]=new Student("박길동", 22, 175, 65, "201103", "컴공");
	// Student 객체를 3개 생성하여 배열에 넣는다.
	// 배열에 있는 객체 정보를 printInformation()을 호출하여 모두 출력 한다.
	for(Student d:arrays)
	{
		System.out.print(d.printInformation()+"\n");
	}
//	System.out.println(arrays[0].printInformation());
//	System.out.println(arrays[1].printInformation());
//	System.out.println(arrays[2].printInformation());
	
	}
}
