package myexercise;
import java.util.*;
public class Stopwatch {
	private final long start;
	public Stopwatch(long a)
	{	start=a;	}
	public double elapsedTime()
	{
		long now=System.currentTimeMillis();
		return (now-start)/1000.0;
	}	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=0;
		if(sc.hasNext()){N=Integer.parseInt(sc.next());}
		//todo
		
		int[] a=new int[N];
		Random random = new Random();
		for(int i=0;i<N;i++)
			a[i]=random.nextInt()%2000000-1000000;
		Stopwatch timer=new Stopwatch(System.currentTimeMillis());
	/*	int cnt=ThreeSum.count(a);
		double time=timer.elapsedTime();
		System.out.println(cnt+" triples "+time+" seconds");
		*/
	/*	Stopwatch timer2=new Stopwatch(System.currentTimeMillis());
		int cnt2=ThreeSumFast.count(a);
		double time2=timer2.elapsedTime();
		System.out.println(cnt2+" triples "+time2+" seconds");
		*/
		Stopwatch timer3=new Stopwatch(System.currentTimeMillis());
		int cnt3=ThreeSumFaster.count(a);
		double time3=timer3.elapsedTime();
		System.out.println(cnt3+" triples "+time3+" seconds");
	}
}
