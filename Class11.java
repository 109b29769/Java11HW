interface Data
{
	public void showData();
}
interface Test
{
	public void showScore();
	public double calcu();
}


class CStu implements Data,Test
{
	protected String id; //學號
	protected String name;//姓名
	protected int mid;//期中考成績
	protected int finl;//期末考成績
	protected int common;//平時成績
	
	
	public CStu(String a, String b, int c, int d, int e) {
		// TODO 自動產生的建構子 Stub
		id=a;
		name=b;
		mid=c;
		finl=d;
		common=e;
		
	}

	public void showData() {
		System.out.println("學號:"+id+"姓名:"+name);
	}

	public void showScore() {
		System.out.println("期中考成績:"+mid+"期末考成績:"+finl);
	}

	public double calcu() {
		int sum=0;
		sum=(int) ((mid+finl)*0.3+common*0.4);
		System.out.println(sum);
		return 0;
	}
		
	public void show() {
		showData();
		showScore();
	}
}

	

public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStu stu=new CStu("940001","Fiona",90,92,95);
		stu.show();
		
	}

}
