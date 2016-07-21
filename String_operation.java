package wipro;
import java.util.*;


public class stringOperation {
	

		public static void main(String[] args) {
	      StringBuffer sb=new StringBuffer("MATHI ");
	      String s = "MATHEESH ";
	      System.out.println("Enter your option Either 1 OR 2 :");
	      Scanner rcb = new Scanner(System.in);
	      int ch = rcb.nextInt();
	      switch(ch){
	      
	      case 1:
	    	  sb.append("VIRAT");
	    	  System.out.println("OPERATION STRING APPEND :"+sb);
	    	  sb.delete(0, 4);
	    	  System.out.println("OPERATION STRING DELETE :"+sb);
	    	  
	    	  System.out.println("THE OPERATION IS TO GET 5 INDEX CHAR :"+sb.charAt(3));
	    	 
	    	  System.out.println("OPERATION EQUALS :" +sb.equals("A B DE"));
	    	  
	    	  System.out.println("THE OPERATION IS :"+sb.indexOf("a"));
	    	  break;
	      
	      case 2:
	    	  System.out.println("1.COMPARE THE TWO STRINGS AND RETURNS THE UNMATCHING CHAR COUNT:"+s.compareTo("jana"));
	    	  System.out.println("2.CHAR AT 1 st POSITION :"+s.charAt(1));
	    	  System.out.println("3.CHAR TO UPPERCASE :"+s.toUpperCase());
	    	  System.out.println("4.STRING CONCAT OPERATION :"+s.concat("VIJI"));
	    	  System.out.println("5.EQUAL OPERATION WITH IGNORE CASE :"+s.equalsIgnoreCase("MATHEESH"));
	    	  break;
	    	  default:
	    		  System.out.println("THE VALUE U ENTERED IS WRONG");
	      }
	}

	}


