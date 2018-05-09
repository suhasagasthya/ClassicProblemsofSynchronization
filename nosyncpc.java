

class Qs
{
	int n;
	int get()
	{
		nosyncpcgui.con.append("Got : "+n+"\n");
		//System.out.println("Got : "+n);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Interrupted exception caught");
		}
		return n;
	}
		void put(int n)
	{
		this.n=n;
		nosyncpcgui.pro.append("Put : "+n+"\n");
		//System.out.println("Put :"+n);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Interrupted exception caught");
		}
	}
}

class Producers implements Runnable
{
	Qs q;
	Producers(Qs q)
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
				return;
			q.put(i++);
		}
	}
}

class Consumers implements Runnable{
	Qs q;
	Consumers(Qs q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		for(int i=0;i<16;i++)
		{
			q.get();
		}	
	}
}

public class nosyncpc {
	public static void main(String args[]) {
		
		nosyncpcgui nosyncg=new nosyncpcgui();
		nosyncg.setVisible(true);
		
		Qs q=new Qs();
		new Producers(q);
		new Consumers(q);
		
	}
}
