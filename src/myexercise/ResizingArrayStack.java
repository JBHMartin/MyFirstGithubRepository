package myexercise;
import java.util.Iterator;
import java.util.Scanner;
public class ResizingArrayStack<Item> implements Iterable<Item>{
	private Item[] a=(Item[])new Object[1];
	private int N=0;
	public boolean isEmpty(){return N==0;}
	public int size(){return N;}
	private void resize(int max){
		Item[] temp=(Item[])new Object[max];
		for(int i=0;i<N;i++){temp[i]=a[i];}
		a=temp;
	}
	public void push(Item item){
		if(N==a.length)resize(2*a.length);
		a[N++]=item;
	}
	public Item pop(){
		Item item=a[--N];
		a[N]=null;
		if((N>0)&&(N==a.length/4))resize(a.length);
		return item;
	}
	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i=N;
		public boolean hasNext(){return i>0;}
		public Item next(){return a[--i];}
		public void remove(){}
		}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ResizingArrayStack<String> s;
		s=new ResizingArrayStack<String>();
		while (sc.hasNext()){
			String item=sc.next();
			if(!item.equals("-")){s.push(item);}
			else if(!s.isEmpty()){System.out.print(s.pop()+" ");}
		}
		System.out.print("("+s.size()+" left on stack)");
	}
}
