import java.io.*;
class Ques_3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		int t=Integer.parseInt(k.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(k.readLine());
			String arr[]=k.readLine().split(" ");
			boolean flag=true;
			int coins[]=new int[3];
			for(int i=0;i<n;i++)
			{
				int x=Integer.parseInt(arr[i]);
				int ret=x-5;
				if(ret==5)
				{
					if(coins[0]!=0)coins[0]--;
					else
					{
						flag=false;
						break;
					}
				}
				else if(ret==10)
				{
					if(coins[1]>0)coins[1]--;
					else
					{
						if(coins[0]-2>=0)coins[0]-=2;
						else
						{
							flag=false;
							break;
						}
					}
				}
				int a=x/5-1;
				coins[a]++;
			}
			if(flag)
			out.write("YES\n");
			else
			out.write("NO\n");
		}
		out.flush();
	}
}