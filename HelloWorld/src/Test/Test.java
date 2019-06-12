package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception{


        //Scanner
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();                 
        int []arr=new int[N];  
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int K=sc.nextInt();
        int []noOfPages=new int[N];
        int res;
        for(int i=0;i<N-1;i++)
        {
            int count=0;
            int highCheck=0;
            res=arr[i]*K;
            for(int j=i+1;j<N;j++)
            {
                if(res<=arr[j] && highCheck<arr[j])
                {
                    highCheck=arr[j];
                    count++;
                }
            }
            noOfPages[i]=count;
        }
        Arrays.sort(noOfPages);

	}

}
