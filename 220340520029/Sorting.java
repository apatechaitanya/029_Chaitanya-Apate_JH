import java.util.*;
import java.util.Scanner;
class Sorting
{
	public static void main(String[] args)
	{
		int [] srt_Arr = {2,4,6,8,3};
		for(int i = srt_Arr.length-1;i>=0;i--)
		{
			int j,temp = srt_Arr[i];
			for(j = i-1;j>=0 && srt_Arr[j]>temp;j--)
			{
				srt_Arr[j+1] = srt_Arr[j];
				System.out.println(Arrays.toString(srt_Arr));
			}
			srt_Arr[j+1] = temp;
		}
		System.out.println(Arrays.toString(srt_Arr));
	}
}