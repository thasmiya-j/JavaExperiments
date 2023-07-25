package practice;
import java.util.*;

class even implements Runnable{
public int x;
public even(int x){
this.x=x;
    }

    @Override
public void run()
    {
System.out.println("Thread Name:Even Thread and square is: " + x * x);

    }

}

class odd implements Runnable{
public int x;
public odd(int x){
this.x=x;
    }
    @Override
public void run()
    {
System.out.println("Thread Name:Odd Thread and cube is :"+ x * x * x);

    }

}
class Th extends Thread{
public String tname;
public Random r;
public Thread t1,t2;
public Th(String s){
tname=s;
    }
    @Override
public void run()
{
int num=0;
    r=new Random();
try {
for(int i=0;i<50;i++){
num=r.nextInt(100);
System.out.println("main thread and generated number is"+num);
if(num%2==0)
        {
            t1=new Thread(new even(num));
t1.start();
}else{
           t2=new Thread(new odd(num));
t2.start(); 
        }
Thread.sleep(1000);
System.out.println("------------------------------------");
}
}           

catch(InterruptedException ex)
    {
System.out.println(ex.getMessage());
    }
}
}

public class Mthread {

public static void main(String[] args) {
         Th a=new Th("one");
a.start();
    }

}
