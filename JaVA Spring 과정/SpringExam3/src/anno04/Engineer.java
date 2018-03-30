package anno04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//기본생성자, setter, toString()
@Component
public class Engineer {
	//@Autowired
	//@Qualifier("emp2")
	@Resource(name="emp1")
	//리소스도 이름으로 먼저 찾고 그다음으로 타입으로 찾습니다.
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
		return emp.toString()+"\n"+ dept +"에 근무 합니다";
	}
}







