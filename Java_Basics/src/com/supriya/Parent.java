package com.supriya;

public class Parent extends Thread{
	public static void main(String args[])
	{
		Parent p1=new Parent();
		Parent p2=new Parent();
		//Parent p3=new Parent();
		p1.start();
		p1.setName("xyz");
		p1.setPriority(Thread.MIN_PRIORITY);
		/*
		 * try { p1.join(1200); } catch (InterruptedException e) { e.printStackTrace();
		 * }
		 */
		p2.start();
		p2.setName("abc");
		p2.setPriority(Thread.MAX_PRIORITY);
		
		
		//p3.start();
		//p2.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{ 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("name of thread is : "+Thread.currentThread().getName());
			System.out.println("priority of thread is : "+Thread.currentThread().getPriority());
			//System.out.println("id of thread is : "+Thread.currentThread().getId());
			System.out.println(i);
		}
	}
}
