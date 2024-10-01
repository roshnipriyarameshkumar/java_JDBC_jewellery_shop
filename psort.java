package com.roshMain;
import com.roshjewel.*;
import java.util.*;
public class psort implements Comparator<Jewellery> {
	public int compare(Jewellery jw1,Jewellery jw2)
	{
		return jw1.getQuantity()>jw2.getQuantity()?1:-1;
	}

}
