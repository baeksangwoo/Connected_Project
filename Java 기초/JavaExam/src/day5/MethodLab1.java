package day5;

public class MethodLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		test('@',3);
		test('%',4);
		test('A',5);
		test('��',3);	
	}
	public static void test (char name, int num)
	{
		for(int i = 0; i<num; i++)
		{
			System.out.print(name);
		}
		System.out.println();
	}
	
}
/*[ �ǽ� 1 ]
1. Ŭ������ : MethodLab1

2. �����ؾ� �ϴ� �߰� �޼��� (public static �ٿ���)
   �Ű����� : char Ÿ�� 1��, int Ÿ�� 1 �� 
   ���ϰ� : ����
   �޼���� : ���Ƿ�
   ��� : ù��° �ƱԸ�Ʈ�� ���޵� ���ڸ� 
            �ι�° �ƱԸ�Ʈ�� ���޵� ������ ������ŭ 
            �� �࿡ ����Ѵ�.
3. main() �޼��忡���� ������ ���� �ƱԸ�Ʈ�� �����ϸ鼭
    ���� ������ �޼��带 ȣ���Ѵ�.

     xxxx('@', 3)
     xxxx('%', 4)
     xxxx('A', 5)
     xxxx('��', 3)


    ���
         @@@
         %%%%
         AAAAA  
         ������
*/
