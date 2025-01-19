package shape;
 public class Shape{
	int x,y,w,h;
	public Shape(int x,int y,int w,int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public Shape(int w,int h){
		this(0,0,w,h);
	}
	public Shape(){
		this(1,1);
	}
	public String toString(){
		return "X: "+this.x+" Y: "+this.y+" W: "+this.w+" H: "+this.h;
	}
}