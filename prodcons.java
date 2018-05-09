

class Q
{
	
	int n;
	boolean valueSet=false;
	synchronized int get()
	{
		while(!valueSet)
			try {
				wait();
			}catch(InterruptedException e)
		{
				System.out.println("Interrupted Exception Caught");
		}
		prodconsgui.pccon.append("Got : "+n+"\n");
	//	System.out.println("Got : "+n);
		valueSet=false;
		notify();
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			System.out.println("Interrupted exception caught");
		}
		return n;
	}
	synchronized void put(int n)
	{
		while(valueSet)
		{
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}
		this.n=n;
		valueSet=true;
		prodconsgui.pcpro.append("Put : "+n+"\n");
		//System.out.println("Put :"+n);
		notify();
		try {
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			System.out.println("Interrupted exception caught");
		}
	}
	
}

class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			if(i==15)
				break;
			q.put(i++);
		}
	}
}

class Consumer implements Runnable{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
			q.get();
	}
}

public class prodcons {
	public static void main(String args[]) {
		
		prodconsgui pcgui=new prodconsgui();
		pcgui.setVisible(true);
		
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
		return;
	}

}
