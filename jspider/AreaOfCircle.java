
public class AreaOfCircle
{
	void AreaOfCircle(double radius)
	{
		double PI=22.0/7.0;
		double area=PI*radius*radius;
		System.out.println(area);
	}
	

	public static void main(String[] args)
	{
		AreaOfCircle s1=new AreaOfCircle();
		s1.AreaOfCircle(10);


	}

}
