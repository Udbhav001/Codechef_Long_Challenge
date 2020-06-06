import java.io.*;
class Ques_2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
         FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
		int t=Integer.parseInt(k.readLine());
		while(t-->0)
		{
			String str=k.readLine();
			int max=0;
			for(int i=0;i<str.length()-1;i++)
			{
				char c=str.charAt(i);
				if((c=='x' && str.charAt(i+1)=='y') || (c=='y' && str.charAt(i+1)=='x'))
				{
					max++;
					i++;
				}
			}
			out.write(max+"\n");
		}
		out.flush();
	}
}