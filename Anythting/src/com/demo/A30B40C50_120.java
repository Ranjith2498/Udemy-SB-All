package com.demo;

public class A30B40C50_120 {

	public static void main(String[] args) {

		
//		String s = "a30b40c50";
//		int i,j,k,sum=0;
//		
//		for(i=0;i<s.length();i++)
//		{
//			for(j=i;j<s.length();j++)
//			{
//				if(s.charAt(i)>=48&&s.charAt(i)<=56)
//				{
//					
//					if(s.charAt(j)>=48&&s.charAt(j)<=56)
//					{
//						sum=sum+(s.charAt(j)-48);
//						System.out.println(sum);
//					}
//
//				}
//			}
//			System.out.println(sum);
//			break;
		
		String str="a2b3c4";
		int j,p=0;
		char ch[]=new char[str.length()];
//		for(int i=0;i=48 && (int)ch[p]<=57)
		{
			int I=Character.getNumericValue(ch[p]);
			for(j=1;j<=I;j++)
			{
				System.out.print(ch[p-1]);
			}
			p++;
		}
		
		}

}
