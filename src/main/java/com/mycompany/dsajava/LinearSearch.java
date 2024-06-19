/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsajava;

/**
 *
 * @author Dell
 */
public class LinearSearch 
{
    public static void main(String[]args)
    {
        int[]nums={23,34,45,24,56,76,58,99,8,768};
        int target=56;
        int answer=linearSearch(nums,target);
        System.out.println(answer);
    }
        static int linearSearch(int[]arr,int target){
         if(arr.length==0)
         {
             return -1;
         }
         for(int index=0;index<arr.length;index++)
         {
            int element=arr[index];
            if(element==target)
            {
              return index;  
            }
         }
        return -1;
     }
    
    
}
