import java.math.*;
public class Paralelogram implements Comparable<Paralelogram> {
	int[] coordX = new int[4];
	int[] coordY = new int[4];
	Paralelogram next;	
	public Paralelogram(int[] coordX_, int[] coordY_) {
		for(int i = 0;i < 4;i++) {
			this.coordX[i] = coordX_[i];
			this.coordY[i] = coordY_[i];
			this.next = null;
		}
	}
	public int povrsina() {
		int height = Math.abs(this.coordY[0]-this.coordY[2]);
		int width = Math.abs(this.coordX[1] - this.coordX[0]);
		return height*width;
	}
	
	public double obim() {
		int width = Math.abs(this.coordX[1] - this.coordX[0]);
		double side = Math.sqrt(Math.pow(this.coordX[2]-this.coordX[0],2) +Math.pow(this.coordY[2]-this.coordY[0],2));
		return side*2+width*2;
	}
	
	@Override
	public int compareTo(Paralelogram p) {
		int p1 = this.povrsina();
		int p2 = p.povrsina();
		
		if(p1 == p2) {
			double o1 = this.obim();
			double o2 = p.obim();
			if(o1 - o2 < 0)
				return -1;
			else return 1;
		}
		if(p1 < p2)
			return -1;
			else return 1;
	}
	@Override
	public String toString() {
		return "("+this.coordX[0]+","+this.coordY[0]+")"+"-"+
				"("+this.coordX[1]+","+this.coordY[1]+")"+"-"+
				"("+this.coordX[2]+","+this.coordY[2]+")"+"-"+
				"("+this.coordX[3]+","+this.coordY[3]+")"+"- Povrsina: " + this.povrsina();
	}
	
 }
