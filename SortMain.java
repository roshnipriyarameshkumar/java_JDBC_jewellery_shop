package com.roshMain;
import com.roshjewel.*;
import java.util.*;
public class SortMain {

	public static void main(String[] args) {
		Set<Jewellery> s=new TreeSet<>();
		Jewellery jw=new Jewellery();
		Inventory inv=new Inventory();
		Scanner sc=new Scanner(System.in);
		int op;
		System.out.println("Enter name/shop name/branch/jewel type/quantity");
		do
		{
		s.add(new Jewellery(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt()));
		System.out.print("Press -1 to stop");
		op=sc.nextInt();
		}while(op==-1);
		System.out.println(jw);
	}

}
