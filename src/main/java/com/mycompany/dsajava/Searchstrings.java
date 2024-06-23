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
public class Searchstrings 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         String[]arr=new String[4];
         for(int i=0;i<arr.length;i++)
         {
             arr[i]=sc.nextLine();
         }
         
         char target=sc.next().charAt(0);
         boolean ans=search(arr,target);
         System.out.println(ans);
         
        
    }
    static boolean search(String[]arr, char target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i =0;i<arr.length;i++)
        {
            String element=arr[i];
            if(element.indexOf(target) != -1)
            {
                return true;
            }
          
        }
          return false;
        
    }
}

  