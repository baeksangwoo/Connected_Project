package day11;

import java.util.Random;

class DuplicateException extends Exception{
	DuplicateException()
	{
		super("중복된 로또 번호가 발생했습니다.");
	}
}

public class LottoMachine {
	private int[] nums;
	
	public int[] getNums() {
		return nums;
	}
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	public LottoMachine()
	{
		nums = new int[6];
	}
	public void createLottoNums()
	{
		Random r = new Random();
	
		for(int i=0 ;i<nums.length;i++)
		{
			this.nums[i] = r.nextInt(20)+1;
		}
		//할당해 주었다
	}
	public void checkLottoNums() throws DuplicateException
	{

			for(int i=0;i<nums.length;i++)
			{
					for(int k=i+1;k<nums.length;k++)
					{
						if(nums[i]==nums[k])
						{
							throw new DuplicateException();
						}
					}
			}
	}
}
