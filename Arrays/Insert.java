class Insert
{
	public static void main(String[] args)
	{
		int loc=2;
		int ele=100;
		int index=6,i;
		int arr[]={10,20,30,40,50,60};
		for(i=index-1; i==loc; i--)
		{
			arr[index+1]=arr[i];
		}
		arr[loc]=ele;
		System.out.println(arr[index+1]);
	}
}