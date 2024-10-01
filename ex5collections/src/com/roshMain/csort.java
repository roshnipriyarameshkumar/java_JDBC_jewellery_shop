package com.roshMain;
import com.roshjewel.*;
import java.util.*;
public class csort implements Comparator<Jewellery> {
	public int compare(Jewellery jw1,Jewellery jw2)
	{
		return (jw1.getName()).compareTo(jw2.getName());
	}

}
