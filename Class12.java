interface Data1
{
	public void best();//�P�_���@�즨�Z����
	public void failed();//�P�_���@�즨�Z���C
}
interface Test1 extends Data1
{
	public void showData();//��ܾǥ͸�ƤΥ������Z	
	public void average();//�p��ƾǩM�^�奭��
}
class CStu1 implements Test1
{
	protected String name;
	protected int math;
	protected int english;

	
	public CStu1(String a, int b, int c) {
		// TODO �۰ʲ��ͪ��غc�l Stub
		name=a;
		math=b;
		english=c;
	}

	public void best() {
		// TODO �۰ʲ��ͪ���k Stub
		if(math>english)
		{
			System.out.println("Judy���ƾǤ�^��n");
		}
		else 
		{
			System.out.println("Judy���^���ƾǦn");
		}
	}

	public void failed() {
		// TODO �۰ʲ��ͪ���k Stub
		if(math<60)
		{
			System.out.println("Judy���ƾǷ��F");
		}
		else 
		{
			if(english<60)
			{
				System.out.println("Judy���^����F");
			}
		}
	}

	public void showData() {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.println("�m�W:"+name);
		System.out.println("�ƾǦ��Z:"+math);
		System.out.println("�^�妨�Z:"+english);
	}

	public void average() {
		// TODO �۰ʲ��ͪ���k Stub
		double sum=0;
		sum=(english+math)/2.0;
		System.out.println("�������Z:"+sum);
		
	}
	public void show() {
		// TODO �۰ʲ��ͪ���k Stub
		showData();
		average();
		best();
		failed();
	}
	
}
public class Class12 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CStu1 stu=new CStu1("Judy",58,91);
		stu.show();
	}

}
