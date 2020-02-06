import java.util.Scanner;

public class LogicalOpTable {
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("TRUTH TABLE\r\n");
  
       System.out.println("Input true or false for P: ");
        String pp=sc.nextLine();
        String pp1=sc.nextLine();
        String pp2=sc.nextLine();
        String pp3=sc.nextLine();
        System.out.println("Input true or false for Q: ");
        String qq=sc.nextLine();
        String qq1=sc.nextLine();
        String qq2=sc.nextLine();
        String qq3=sc.nextLine();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("P\t|\tQ\t|\tP&Q\t|\tP|Q\t|\tP->Q\t|\tP<->Q\t|\t");
        System.out.println("-----------------------------------------------------------------------------------------");
        
       boolean p = Boolean.parseBoolean(pp);
       boolean q = Boolean.parseBoolean(qq);
       boolean q1 = Boolean.parseBoolean(qq1);
       boolean p1 = Boolean.parseBoolean(pp1);
       boolean p2 = Boolean.parseBoolean(pp2);
       boolean q2 = Boolean.parseBoolean(qq2);
       boolean p3 = Boolean.parseBoolean(pp3);
       boolean q3 = Boolean.parseBoolean(qq3);
     
        if(p && q) {
        // p= true; q= true;
        System.out.print(p + "\t|\t" + q +"\t|\t");
        System.out.print((p&q) + "\t|\t" + (p|q) + "\t|\t");
        System.out.print("true\t|\t");
        System.out.println("true\t|\t");
        }                
        else if(p && !q) {
      // p = true; q = false;
        	System.out.print(p + "\t|\t" + q +"\t|\t");
        	System.out.print((p&q) + "\t|\t" + (p|q) + "\t|\t");
        System.out.print("false\t|\t");
        System.out.println("false\t|\t");
        }
        else if(!p && q) {
        //p = false; q = true;
        	System.out.print(p + "\t|\t" + q +"\t|\t");
        	System.out.print((p&q) + "\t|\t" + (p|q) + "\t|\t");
        System.out.print("true\t|\t");
        System.out.println("false\t|\t");
        }
        else if(!p && !q) {
        //p = false; q = false;
        	System.out.print(p + "\t|\t" + q +"\t|\t");
        	System.out.print((p&q) + "\t|\t" + (p|q) + "\t|\t");
        System.out.print("true\t|\t");
        System.out.println("true\t|\t");
        }
        else System.out.println("error");
        
        if(p1 && q1) {
            // p= true; q= false;
            System.out.print(p1 + "\t|\t" + q1 +"\t|\t");
            System.out.print((p1&q1) + "\t|\t" + (p1|q1) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            }                     
            else if(p1 && !q1) {
          // p = true; q = false;
            	System.out.print(p1 + "\t|\t" + q1 +"\t|\t");
            	System.out.print((p1&q1) + "\t|\t" + (p1|q1) + "\t|\t");
            System.out.print("false\t|\t");
            System.out.println("false\t|\t");
            }
            else if(!p1 && q1) {
            //p = false; q = true;
            	System.out.print(p1 + "\t|\t" + q1 +"\t|\t");
            	System.out.print((p1&q1) + "\t|\t" + (p1|q1) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("false\t|\t");
            }
            else if(!p1 && !q1) {
            //p = false; q = false;
            	System.out.print(p1 + "\t|\t" + q1 +"\t|\t");
            	System.out.print((p1&q1) + "\t|\t" + (p1|q1) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            }
            else System.out.println("error");
        	if(p2 && q2) {
            // p= true; q= false;
           System.out.print(p2 + "\t|\t" + q2 +"\t|\t");
            System.out.print((p2&q2) + "\t|\t" + (p2|q2) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            }                  
            else if(p2 && !q2) {
          // p = true; q = false;
            	System.out.print(p2 + "\t|\t" + q2 +"\t|\t");
            	System.out.print((p2&q2) + "\t|\t" + (p2|q2) + "\t|\t");
            System.out.print("false\t|\t");
            System.out.println("false\t|\t");
            }
            else if(!p2 && q2) {
            //p = false; q = true;
            	System.out.print(p2 + "\t|\t" + q2 +"\t|\t");
            	System.out.print((p2&q2) + "\t|\t" + (p2|q2) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("false\t|\t");
            }
            else if(!p2 && !q2) {
            //p = false; q = false;
            	System.out.print(p2 + "\t|\t" + q2 +"\t|\t");
            	System.out.print((p2&q2) + "\t|\t" + (p2|q2) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            }
            else System.out.println("error");
        if(p3 && q3) {
            // p= true; q= false;
        	System.out.print(p3 + "\t|\t" + q3 +"\t|\t");
            System.out.print((p3&q3) + "\t|\t" + (p3|q3) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            System.out.println("-----------------------------------------------------------------------------------------");
            }
            else if(p3 && !q3) {
          // p = true; q = false;
            	System.out.print(p3 + "\t|\t" + q3 +"\t|\t");
            	System.out.print((p3&q3) + "\t|\t" + (p3|q3) + "\t|\t");
            System.out.print("false\t|\t");
            System.out.println("false\t|\t");
            System.out.println("-----------------------------------------------------------------------------------------");
            }
            else if(!p3 && q3) {
            //p = false; q = true;
            	System.out.print(p3 + "\t|\t" + q3 +"\t|\t");
            	System.out.print((p3&q3) + "\t|\t" + (p3|q3) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("false\t|\t");
            System.out.println("-----------------------------------------------------------------------------------------");
            }
            else if(!p3 && !q3) {
            //p = false; q = false;
            	System.out.print(p3 + "\t|\t" + q3 +"\t|\t");
            	System.out.print((p3&q3) + "\t|\t" + (p3|q3) + "\t|\t");
            System.out.print("true\t|\t");
            System.out.println("true\t|\t");
            System.out.println("-----------------------------------------------------------------------------------------");
            }
            else System.out.println("error");
  }
   
   
}