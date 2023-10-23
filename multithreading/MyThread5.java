class MyThread extends Thread
{
}
 class MyThread5 
 {
 public static void main(String[] args)
 {
  System.out.println(Thread.currentThread().getPriority());
  MyThread t=new MyThread();
  System.out.println(t.getPriority());
  Thread.currentThread().setPriority(10);
  System.out.println(Thread.currentThread().getPriority());
  }
  }
  