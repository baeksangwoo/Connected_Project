package ExamLotto;

public class LottoMachine {

	private int [] nums;
	
	public LottoMachine()
	{
		nums = new int[6];
	}
	
	public void createLottoNums()
	{
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=(int)(Math.random()*20+1);
		}
	}
	
	public void checkLottoNums () throws DuplicateException
	{
		for(int d=0;d<nums.length;d++)
		{
			for(int p=d+1;p<nums.length;p++)
			{
				if(nums[d]==nums[p])
				{
					throw new DuplicateException();
				}
				else
				{
				
				}
			}
		}
	}

	public int[] getNums() {
		return nums;
	}

	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	
}
