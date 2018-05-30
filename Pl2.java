import java.io.*;
import java.util.*;

class Pl2
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s;
			System.out.print("Enter the string:");
			s=br.readLine();
	
			int l=s.length();
			char ch;
			int count;
                        HashMap<Character,Integer> hashMap = new HashMap<>();

			for(int j=0;j<l;j++)
			{
				count=0;
				ch=s.charAt(j);
				for(int i=0;i<l;i++)
				{
					if(s.charAt(i)==ch)
					{
						count++;
					}
				}
                                hashMap.put(ch, count);
			}

                        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) 
			{
                            System.out.println("Number of "+entry.getKey()+" = "+entry.getValue());
                    	}
			
			System.out.println();
			System.out.print("Resultant string:");

			for(int i=0;i<l;i++)
			{
				ch=s.charAt(i);
				if(i%2==0)
				{
					System.out.print(Character.toLowerCase(ch));
				}
				else
				{
					System.out.print(Character.toUpperCase(ch));
				}
			}
			System.out.println();

			
		}
		catch(Exception e) {}
	}
}
