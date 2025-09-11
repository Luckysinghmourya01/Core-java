package com.rays.collectioncomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		

    List<MarksheetComparable> l = new ArrayList<MarksheetComparable>();
    
    l.add(new MarksheetComparable("aman", "100", 90));
    l.add(new MarksheetComparable("raj", "106", 88));
    l.add(new MarksheetComparable("vipin", "103", 85));
    l.add(new MarksheetComparable("manthan", "105", 78));
    l.add(new MarksheetComparable("vipul", "102", 67));
    l.add(new MarksheetComparable("pawan", "104", 79));
    

     Iterator<MarksheetComparable> m     = l.iterator();
     while(m.hasNext()) {
    	 MarksheetComparable mc = m.next();
    	 System.out.println(mc);
     }
    
    
    
   System.out.println("------------------ after sorting roll no ----------------");   
      Collections.sort(l);
     
          l.forEach(System.out :: println);

	}
}


