package myexercise;
import java.util.Arrays;
public class ThreeSumFaster {
	public static int count(int[] a){
		Arrays.sort(a);
		int N =a.length;
		int cnt=0;
		for(int i=0;i<N;i++){
			int midindex=0;
			for(int m=0;m<N-1;m++){
				if(a[m]<=-a[i]/2&&a[m+1]>=-a[i]/2){
					midindex=m;
					break;}
			}
		if(midindex<=i){continue;}
		int x=i+1;int y=N-1;
		do{
			int result=a[x]+a[y]+a[i];
			if(result>0){
				y-=1;
			}else if(result==0){
				cnt++;
				y-=1;
			}else {x+=1;}
		}while(!(x==midindex||y==midindex));
		}
		return cnt;
	}
	public static void main(String args[]){
		int[] a=StdIn.readAllInts();
		System.out.println(count(a));
	}
}
