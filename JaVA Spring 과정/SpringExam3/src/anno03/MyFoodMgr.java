package anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//setter, toString()�߰�
@Component("myFood")  //default : myFoodMgr�� ������ ù��¥�� �ҹ��ڷ� �޾Ƽ� ���
public class MyFoodMgr{
	@Autowired
	//�켱 ���� �̸� , Ÿ��  �̸���� ������� ��ü�� ���ԵǴ� ���̴�.
	//@Qualifier(value="unFavoriteFood")
	//Qualifier�� Ư�� �ɹ� ������ �� �� �ִ´�.
	private Food favoriteFood;     // setter ��������
	@Autowired
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[�����ϴ� ����=" + favoriteFood + ", �Ⱦ��ϴ�����=" + unFavoriteFood + "]";
	}
}
