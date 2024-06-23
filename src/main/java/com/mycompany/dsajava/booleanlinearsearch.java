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
public class booleanlinearsearch
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int []arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean ans=linearsearch(arr,target);
        System.out.println(ans);    
    }
    static boolean linearsearch(int []arr,int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==target)
            {
                return true;
            }
           
        }
        return false;
        
        
    }
    
}
