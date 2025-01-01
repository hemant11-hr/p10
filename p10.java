class TestSleepMethod1 extends Thread  
{     public void 
run()  
{  
try  
for(int i=1;i<=5;i++)  
{             
{  
}  
System.out.println(i);  
Thread.sleep(500);  
catch(InterruptedException e)  
{  
}  
}  
}  
}  
System.out.println(e);  
public class Assignment10   
{     public static void main(String[] 
args)   
{  
TestSleepMethod1 t1=new TestSleepMethod1();  
TestSleepMethod1 t2=new TestSleepMethod1();  
TestSleepMethod1 t3=new TestSleepMethod1();  
t1.start();         
t2.start();         
t3.start();     } 
45  
46  
  
 }
