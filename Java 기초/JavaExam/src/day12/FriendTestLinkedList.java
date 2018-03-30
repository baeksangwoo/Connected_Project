package day12;

import java.util.Iterator;
import java.util.LinkedList;

import day7.Friend;
public class FriendTestLinkedList{
		
	public static void main(String[] args)  {
		LinkedList<Friend> DD = new LinkedList<Friend>();
		
		DD.add(new Friend("호정  ","02-2323  ","2@naver.com"));
		DD.add(new Friend("까까오  ","12-1  ","12@naver.com"));
		DD.add(new Friend("피카츄","122-3","12@naver.com"));
		
		Iterator d = DD.iterator();
		while(d.hasNext()){
			System.out.println(((Friend) d.next()).getInfo());
		}
	}
	
}
