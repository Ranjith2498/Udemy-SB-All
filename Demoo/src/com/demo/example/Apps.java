package com.demo.example;

public class Apps {

	public static void main(String[] args) {

//	Your music player contains n different songs. You want to listen to goal songs (not necessarily different) 
//	during your trip. To avoid boredom, you will create a playlist so that:
//	Every song is played at least once. A song can only be played again only if k other songs have been played.
//	Given n, goal, and k,
//	k < n <= goal
		
	String a[] = {"A","B","C","D","E","F","G","H"};
	int n = a.length;
	int k=5;
	int goal =20;
	
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Playing "+a[i]);
			count++;
		}
		
		for(j=0;j<goal;j++)
		{
			if(count<goal)
			{
				System.out.println("Playing "+a[j]);
				count++;
			}
			else
			{
				break;
			}
		}	
		
		
	}
}
