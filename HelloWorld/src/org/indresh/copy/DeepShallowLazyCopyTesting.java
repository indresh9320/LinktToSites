package org.indresh.copy;

import java.util.Arrays;

public class DeepShallowLazyCopyTesting {

	public static void main(String[] args) {
		int arr[]= {1,4,10};
		Ex e=new Ex(arr);
		e.show();
		arr[1]=22;
		e.show();
	}
}
