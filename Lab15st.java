// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6;

	public void init()
	
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"me.jpg");
		picture2 = getImage(getDocumentBase(),"928engine.jpg");
		picture3 = getImage(getDocumentBase(),"nj.png");
		picture4 = getImage(getDocumentBase(),"Tennesss.jpg");
		picture5 = getImage(getDocumentBase(),"Rutgers_University_New_Brunswick.png");
		picture6 = getImage(getDocumentBase(), "WHITE-PORSCHE-BANNER2.jpg");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		tracker.addImage(picture6,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}
	
	public void page1(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterBlue);
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"About Me",218,100);
		Expo.setColor(g,Expo.yellow);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,425,285,150,150,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Ryan McGuire.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterBlue);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"Early Life",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,500,500);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,260,this);
		//g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in Paterson,NJ in 1997.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterBlue);
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"Intrests",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture4,150,225,275,200,this);
		g.drawImage(picture2,500,193,400,300,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"Mechanics, Tennis, and Driving",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page4(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterBlue);
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"Future Schooling",200,100);
		Expo.setColor(g,Expo.darkGreen);
		g.drawImage(picture5,475,175,this);
		//g.drawImage(picture2,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am going to attend Rutgers University in New Brunswick, NJ.",100,150);
		Expo.drawString(g,"I will be studying Mechanical Engineering.",100,300);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	public void page5(Graphics g)
	{
		Expo.setBackground(g,Expo.lighterBlue);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"Later Life",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,500);
		Expo.setColor(g,Expo.chartreuse);
		//g.drawImage(picture3,200,300,this);
		g.drawImage(picture6,150,280,700,200,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I hope to become a mechanical engineer and work with a major car company",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}





}

