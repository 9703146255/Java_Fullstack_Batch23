class Demo
{
    
	
                    public void add(int a, int b)
	{
	     System.out.println(a+b);
	}
	 public void mul(int a, int b)
	{
	     System.out.println(a*b);
	}

  	public static void main(String[] args)
	{
	 	Demo d1=new Demo();
		d1.add(10,20);
		d1.mul(10,30);

		Demo d2=new Demo();
		d2.add(10,20);
		d2.mul(10,30);
		
	}

}