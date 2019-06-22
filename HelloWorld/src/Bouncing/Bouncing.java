package p1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bouncing extends JFrame implements ActionListener,Runnable {

	MyPanel p1;
	JPanel p2;
	Thread t,t1,t2,t3;
	int x,y,dx,dy;
	boolean exit;
	JButton b1,b2;
	Random r;
	
	public Bouncing()
	{
		initGUI();
	}
	
	public static void main(String[] args) {
		Bouncing b = new Bouncing();
	}
	
	public void initGUI()
	{
		setTitle("Bouncing");
		setSize(400,300);
		setLocationRelativeTo(null);
		
		p1 = new MyPanel();
		p1.setBackground(Color.WHITE);
		add(p1);
		r=new Random();
		p2 = new JPanel();
		b1=new JButton("Start");
		b1.addActionListener(this);
		b2=new JButton("Stop");
		b2.addActionListener(this);
		p2.add(b1);
		p2.add(b2);
		add(p2,BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//x=y=1;
		dx=r.nextInt(10)+1;
		dy=r.nextInt(10)+1;
	}
	
	class MyPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			System.out.println("in pC");
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.setColor(Color.cyan);
			g.fillOval(x, y, 50, 50);
		}
	}
	
	public void movingBall() throws InterruptedException
	{
		while(!exit)
		{
			x+=dx;
			y+=dy;
			
			if(x<0 || x>p1.getSize().height-10)
				dx=-dy;
			if(y<0 || y>p1.getSize().width-15)
				dy=-dx;
			Thread.sleep(10);
			repaint();
		}
	}
	
	@Override
	public void run()
	{
		try{
			System.out.println("in run method....");
			movingBall();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			System.out.println("in actp b1");
			t1=new Thread(this);
			t2=new Thread(this);
			t3=new Thread(this);
			t2.start();
			t3.start();
			t1.start();
			
			exit=false;
		}
		else
		{
			exit=true;
			System.out.println("in actp b2");
		}
	}
}
