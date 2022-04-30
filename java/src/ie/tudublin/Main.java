package ie.tudublin;

import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;
import example.WaveForm;
import C20401562.*;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new RotatingAudioBands());		
	}

	public void start()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Start());	
	}

	public void myVisual()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());	
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.start();			
	}
}