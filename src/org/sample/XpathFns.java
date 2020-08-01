package org.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class XpathFns{
	
   public static void main(String[] args) {
  
	   List li= new ArrayList();
	   
	   li.add(10);
	   li.add(10);
	   li.add(2);
	   li.add(8);
	   
	   System.out.println(li);
	   
	   Collections.sort(li);
	   System.out.println(li);
	   
	  
	
	
	   
	   
	   Object min = Collections.min(li);
	   System.out.println(min);
   }
}
