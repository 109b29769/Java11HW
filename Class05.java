interface Math0
{
	public void show();
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
class Compute0 implements Math0
{
	int ans;
	public void add(int a,int b) 
	{
		ans=a+b;
	}


	public void sub(int a, int b) {
	
		ans=a-b;
	}


	public void mul(int a, int b) {
	
		ans=a*b;
	}


	public void div(int a, int b) {
	
		ans=a/b;
	}


	public void show() {
		// TODO 自動產生的方法 Stub
		System.out.println(ans);
	}
}

public class Class05 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Compute0 cmp=new Compute0();
		cmp.mul(3, 5);
		cmp.show();
	}

}
