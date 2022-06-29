class Fibonacci{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count=13;    
    
    
 for(i=0;i<count;++i)//loop starts from 2 because we have had 0 and 1 already printed

 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  