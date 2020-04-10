package com.example.demo.Gameclass;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class gameclass {
	String[] arr={"Rock", "Paper", "Scissor"};
	Random r = new Random();
	public String p1="";
	public String p2="";
	public String p3="";
	public String p4="";
	public int[] ap1=new int[3];
	public int[] ap2=new int[3];
	public int[] ap3=new int[3];
	public int[] ap4=new int[3];
	public gameclass()
	{
		p1=arr[r.nextInt(arr.length)];
		p2=arr[r.nextInt(arr.length)];
		p3=arr[r.nextInt(arr.length)];
		p4=arr[r.nextInt(arr.length)];
		
		if(p1=="Rock")
		{
			if(p2=="Scissor")
			{
				ap1[0]=0;
				
			}
			if(p3=="Scissor")
			{
				ap1[1]=0;
				
			}
			if(p4=="Scissor")
			{
				ap1[2]=1;
				
			}
			
		}
		else if(p1=="Scissor")
		{
			if(p2=="Paper")
			{
				ap1[0]=1;
				
			}
			if(p3=="Paper")
			{
				ap1[1]=1;
				
			}
			if(p4=="Paper")
			{
				ap1[2]=1;
				
			}
			
		}
		else if(p1=="Paper")
		{
			if(p2=="Rock")
			{
				ap1[0]=1;
				
			}
			if(p3=="Rock")
			{
				ap1[1]=1;
				
			}
			if(p4=="Rock")
			{
				ap1[2]=1;
				
			}
			
		}
		///////////////////////////////////////////////////
		if(p2=="Rock")
		{
			if(p1=="Scissor")
			{
				ap2[0]=0;
				
			}
			if(p3=="Scissor")
			{
				ap2[1]=0;
				
			}
			if(p4=="Scissor")
			{
				ap1[2]=1;
				
			}
			
		}
		else if(p2=="Scissor")
		{
			if(p1=="Paper")
			{
				ap2[0]=1;
				
			}
			if(p3=="Paper")
			{
				ap2[1]=1;
				
			}
			if(p4=="Paper")
			{
				ap2[2]=1;
				
			}
			
		}
		else if(p2=="Paper")
		{
			if(p1=="Rock")
			{
				ap2[0]=1;
				
			}
			if(p3=="Rock")
			{
				ap2[1]=1;
				
			}
			if(p4=="Rock")
			{
				ap2[2]=1;
				
			}
			
		}
		///////////////////////////////////////////////
		if(p3=="Rock")
		{
			if(p1=="Scissor")
			{
				ap3[0]=0;
				
			}
			if(p2=="Scissor")
			{
				ap3[1]=0;
				
			}
			if(p4=="Scissor")
			{
				ap3[2]=1;
				
			}
			
		}
		else if(p3=="Scissor")
		{
			if(p1=="Paper")
			{
				ap3[0]=1;
				
			}
			if(p2=="Paper")
			{
				ap3[1]=1;
				
			}
			if(p4=="Paper")
			{
				ap3[2]=1;
				
			}
			
		}
		else if(p3=="Paper")
		{
			if(p1=="Rock")
			{
				ap3[0]=1;
				
			}
			if(p2=="Rock")
			{
				ap3[1]=1;
				
			}
			if(p4=="Rock")
			{
				ap3[2]=1;
				
			}
			
		}
		//////////////////////////////
		if(p4=="Rock")
		{
			if(p1=="Scissor")
			{
				ap4[0]=0;
				
			}
			if(p2=="Scissor")
			{
				ap4[1]=0;
				
			}
			if(p3=="Scissor")
			{
				ap4[2]=1;
				
			}
			
		}
		else if(p4=="Scissor")
		{
			if(p1=="Paper")
			{
				ap4[0]=1;
				
			}
			if(p2=="Paper")
			{
				ap4[1]=1;
				
			}
			if(p3=="Paper")
			{
				ap4[2]=1;
				
			}
			
		}
		else if(p4=="Paper")
		{
			if(p1=="Rock")
			{
				ap4[0]=1;
				
			}
			if(p2=="Rock")
			{
				ap4[1]=1;
				
			}
			if(p3=="Rock")
			{
				ap4[2]=1;
				
			}
			
		}

	
	}
	

}
