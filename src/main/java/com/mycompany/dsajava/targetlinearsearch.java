/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsajava;

/**
 *
 * @author Dell
 */
import java.util.Scanner;
public class targetlinearsearch 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=rangesearch(arr,target,1,4);
        {
            System.out.println(ans);
        }
        
    }
    static int rangesearch(int[]arr,int target,int start,int end)
    {
      if(arr.length==0)
      {
          return -1;
          
      }
    
      for(int i=start;i<end;i++)
      {
            int element=arr[i];
            if(element==target)
            {
               return i;
            }
                   
      }
      return -1;
    }
    
}
