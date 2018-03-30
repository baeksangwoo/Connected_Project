package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()추가
@Component("myFood")  //default : myFoodMgr로 설정됨 첫글짜를 소문자로 받아서 사용
public class MyFoodMgr{
	@Autowired
	//우선 순위 이름 , 타입  이름대로 만들어진 객체가 대입되는 것이다.
	//@Qualifier(value="unFavoriteFood")
	//Qualifier는 특정 맴버 변수를 쓸 때 넣는다.
	private Food favoriteFood;     // setter 생략가능
	@Autowired
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는음식=" + unFavoriteFood + "]";
	}
}
