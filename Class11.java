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
	protected String id; //�Ǹ�
	protected String name;//�m�W
	protected int mid;//�����Ҧ��Z
	protected int finl;//�����Ҧ��Z
	protected int common;//���ɦ��Z
	
	
	public CStu(String a, String b, int c, int d, int e) {
		// TODO �۰ʲ��ͪ��غc�l Stub
		id=a;
		name=b;
		mid=c;
		finl=d;
		common=e;
		
	}

	public void showData() {
		System.out.println("�Ǹ�:"+id+"�m�W:"+name);
	}

	public void showScore() {
		System.out.println("�����Ҧ��Z:"+mid+"�����Ҧ��Z:"+finl);
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
