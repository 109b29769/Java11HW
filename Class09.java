import java.lang.Math; 
interface Math1
{
	public void show();
	public abstract void add(int a,int b);
	public abstract void sub(int a,int b);
	public abstract void mul(int a,int b);
	public abstract void div(int a,int b);
}
interface AdvancedMath
{
	public void mod(int a,int b);//a%b
	public void fac(int a);//a階層 !
	public void pow(int a,int b); //a平方b
}

class Compute1 implements Math1,AdvancedMath
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


	@Override
	public void mod(int a, int b) 
	{
		// TODO 自動產生的方法 Stub
		ans=a%b;
	}


	@Override
	public void fac(int a) {
		// TODO 自動產生的方法 Stub
		ans=1;
		for(int i=1;i<=a;i++) 
		{
			ans*=i;
		}
		
	}


	@Override
	public void pow(int a, int b) {
		// TODO 自動產生的方法 Stub
		ans=(int) Math.pow(a,b);
	}
}
public class Class09 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Compute1 cmp=new Compute1();
		cmp.mul(3, 5);
		cmp.show();
		cmp.mod(14, 5);
		cmp.show();
		cmp.fac(5);
		cmp.show();
	}

}
