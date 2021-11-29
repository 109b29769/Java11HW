interface Data1
{
	public void best();//判斷哪一科成績較高
	public void failed();//判斷哪一科成績較低
}
interface Test1 extends Data1
{
	public void showData();//顯示學生資料及平均成績	
	public void average();//計算數學和英文平均
}
class CStu1 implements Test1
{
	protected String name;
	protected int math;
	protected int english;

	
	public CStu1(String a, int b, int c) {
		// TODO 自動產生的建構子 Stub
		name=a;
		math=b;
		english=c;
	}

	public void best() {
		// TODO 自動產生的方法 Stub
		if(math>english)
		{
			System.out.println("Judy的數學比英文好");
		}
		else 
		{
			System.out.println("Judy的英文比數學好");
		}
	}

	public void failed() {
		// TODO 自動產生的方法 Stub
		if(math<60)
		{
			System.out.println("Judy的數學當掉了");
		}
		else 
		{
			if(english<60)
			{
				System.out.println("Judy的英文當掉了");
			}
		}
	}

	public void showData() {
		// TODO 自動產生的方法 Stub
		System.out.println("姓名:"+name);
		System.out.println("數學成績:"+math);
		System.out.println("英文成績:"+english);
	}

	public void average() {
		// TODO 自動產生的方法 Stub
		double sum=0;
		sum=(english+math)/2.0;
		System.out.println("平均成績:"+sum);
		
	}
	public void show() {
		// TODO 自動產生的方法 Stub
		showData();
		average();
		best();
		failed();
	}
	
}
public class Class12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CStu1 stu=new CStu1("Judy",58,91);
		stu.show();
	}

}
