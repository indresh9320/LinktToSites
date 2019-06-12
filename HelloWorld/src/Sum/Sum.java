package Sum;

public class Sum {

	public static void main(String[] args) {
		int arrRes[]=new int[2];
		int nums[]= {3,2,4};
		int target=6;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            	int val=nums[i]+nums[j];
                if(target==val)
                {
                    arrRes[0]=i;
                    arrRes[1]=j;
                    System.out.println(i+" "+j);
                }
            }
        }

	}

}
