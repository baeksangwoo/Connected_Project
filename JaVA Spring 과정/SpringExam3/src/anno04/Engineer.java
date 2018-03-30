package anno04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//�⺻������, setter, toString()
@Component
public class Engineer {
	//@Autowired
	//@Qualifier("emp2")
	@Resource(name="emp1")
	//���ҽ��� �̸����� ���� ã�� �״������� Ÿ������ ã���ϴ�.
	private Emp emp;
	private String dept;
	
	public Engineer() {
		super();
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString()+"\n"+ dept +"�� �ٹ� �մϴ�";
	}
}







