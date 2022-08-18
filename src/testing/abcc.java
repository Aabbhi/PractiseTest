package testing;

 class abcc1 {
	public int maxall(int ar[])
	{
	int max=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]>max)
		{
			max=ar[i];
		}
		
		
	}
	return max;
	}
	
	public int[] newArray(int ar[],int max)
	{
		int b[]=new int[ar.length-1];
		for(int i=0;i<b.length;i++)
		{
			if(ar[i]!=max)
			{
				b[i]=ar[i];
			}
			
			
		}
		return b;
	}
	
	public void  printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			
		System.out.print(a[i]);
			
		}
	}
}

class abcc{
	public static void main(String a[])
	{
		abcc1 a1=new abcc1();
		int ar[]= {7,8,9,10};
		
		int max=a1.maxall(ar);
		int newArr[]=a1.newArray(ar, max);
		int secondlar=a1.maxall(newArr);
		
		
		System.out.print(secondlar);
		
		
		
		}
		
		
		}
