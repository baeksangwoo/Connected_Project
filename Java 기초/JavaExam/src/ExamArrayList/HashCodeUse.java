package ExamArrayList;

import java.util.HashMap;

class	Name{
	String firstName;
	String lastName;
	Name(String firstName,String lastName){
 this.firstName=firstName;
 this.lastName=lastName;
}
public boolean equals(Object obj){
if(!(obj instanceof Name))
return false;
Name name=(Name)obj;
if(firstName.equals(name.firstName)&&lastName.equals(name.lastName))
return true;
else
return false;
}
public int hashCode(){
return firstName.hashCode()+lastName.hashCode();
}
}

public class HashCodeUse {

//	String FistName;
//	String LastName;
//	
//	
//	HashCodeUse(String fistName, String LastName)
//	{
//		this.FistName=FistName;
//
//		this.LastName=LastName;
//	}
//	public boolean equals(Object obj)
//	{
//		if(!(obj instanceof HashCodeUse))
//			return false;
//		HashCodeUse name= (HashCodeUse)obj;
//		if(FistName.equals(name.FistName) && LastName.equals(name.LastName))
//			return true;
//		else
//			return false;
//	}
//	
//	public int HashCodeUse()
//	{
//		return FistName.hashCode() + LastName.hashCode();
//	}
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1= new String("sdfsfdddd");
		String obj2=new String("dddd");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		
		System.out.println(hash1);
		System.out.println(hash2);
		
		HashMap<Name,Integer> dd=new HashMap<Name,Integer>();
		dd.put(new Name("해히", "포터"),10);
		dd.put(new Name("헤르미온느","그레인져"),new Integer(100));
		
		
		Integer num = dd.get(new Name("헤르미온느","그레인져"));
		System.out.println("헤르미오오오오느"+num);
	}

}
