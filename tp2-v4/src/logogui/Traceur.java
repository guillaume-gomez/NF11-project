/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.util.ArrayList;

public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private boolean isDrawing = true;
	private static final ArrayList<Color> TabColor = new ArrayList<Color>(); 
	
	public Traceur() {
		setTeta();
		
		TabColor.add(Color.BLACK);
		TabColor.add(Color.RED);
		TabColor.add(Color.GREEN);
		TabColor.add(Color.YELLOW);
		TabColor.add(Color.BLUE);
		TabColor.add(new Color(0, 191, 255));
		TabColor.add(new Color(148, 0, 211));
		TabColor.add(Color.WHITE);
				
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if (isDrawing) {
			g2d.drawLine(x1,y1,x2,y2);
		}
		posx = a;
		posy = b;
	}
	
	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void re(double r) {
		double a = posx - r * Math.cos(teta) ;
		double b = posy + r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if (isDrawing) {
			g2d.drawLine(x1,y1,x2,y2);
		}
		posx = a;
		posy = b;
	}
	
	public void lc() {
		isDrawing = false;
	}
	
	public void bc() {
		isDrawing = true;
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}
	
	public void fpos(double x, double y) {
		posx = x;
		posy = y;
	}
	
	public void fcc(double idColor) {
		g2d.setColor( TabColor.get( toInt(idColor) % TabColor.size() ) );
	}

	
	/*
	 * TODO mettre les valeurs de la fenetre en width et height
	 */
	public void ve() {
		g2d.clearRect(0, 0,1000,1000 );
	}
	

}
