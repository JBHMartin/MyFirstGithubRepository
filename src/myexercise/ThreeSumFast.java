package myexercise;
import java.util.Arrays;
public class ThreeSumFast {
	public static int count(int[] a){
		Arrays.sort(a);
		int N =a.length;
		int cnt=0;
		for(int i=0;i<N&&a[i]<0;i++)
			{for(int j=i+1;j<N;j++){
				int l=BinarySearch.rank(-a[i]-a[j],a);
				if(l>j){
					cnt++;}}}
		return cnt;
	}
	public static void main(String args[]){
		int[] a=StdIn.readAllInts();
		System.out.println(count(a));
	}
}
