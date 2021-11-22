abstract class CShape
{
	protected String color;
	public void setColor(String str)
	{
		color=str;
	}
	public abstract void show();
}

class CRectangle extends CShape
{
	int width;
	int height;
	public CRectangle(int w,int h)
	{
		color=("bluee");
		width=w;
		height=h;
	}
	public void show()
	{
		System.out.print("color="+color+", ");
		System.out.println("area="+width*height);
	}
}

class CCircle extends CShape
{
	protected double radius;
	public CCircle(double r)
	{
		color=("blue");
		radius=r;
	}
	public void show()
	{
		System.out.print("color="+color+", ");
		System.out.println("area="+3.14*radius*radius);
	}
}
public class Class01 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CRectangle crl = new CRectangle(2,2);
		crl.show();
		CCircle cil= new CCircle(2);
		cil.show();
	}

}
