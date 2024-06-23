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
public class linearsearchelement
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5,6};
        int target=sc.nextInt();
        int ans=linearsearch(arr,target);
        System.out.println(ans);
    }
        
    static int linearsearch(int []arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==target)
            {
                return target;
            }
            
        }
        return Integer.MAX_VALUE;
    }
        
    
}
