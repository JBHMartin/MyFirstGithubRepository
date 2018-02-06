package myexercise;
import java.util.Arrays;
public class TwoSumFaster {
	public static int count(int[] a){
		Arrays.sort(a);
		int N =a.length;
		int midindex=0;
		for(int i=0;i<N-2;i++){
			if(a[i]<=0&&a[i+1]>=0){
				midindex=i;
				break;}
		}
		int cnt=0;
		int x=0;int y=N-1;
		do{
			int result=a[x]+a[y];
			if(result>0){
				y-=1;
			}else if(result==0){cnt++;y-=1;}else {x+=1;}
		}while(!(x==midindex||y==midindex));
			return cnt;
	}
	public static void main(String args[]){
		int[] a=StdIn.readAllInts();
		System.out.println(count(a));
	}
}
