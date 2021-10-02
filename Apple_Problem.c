#include<stdio.h>
int main(void)
{
// int arr[] = {2,1,2,3,3,1,3,5};
int arr[] = {1,2,3,1,4,5,3,3};

int sz , pre_vs = 0 , pre_sum  = 0 ,num , num1 , dum1 , dum2 , pre_in; 
for (int i = 0; i < 10; i++)
{
    for (int  j = i; j < 10 ; j++)
    {
       if (arr[i] == arr[j])
       {
           sz = abs(i-j);
       }
        
    }
    if (pre_vs == 0)
    {
       dum1 = sz;
       dum2 = arr[i];   
    }

     if (pre_vs < sz)
     {
         num = arr[i];
         pre_vs = sz;
         
     }
     else if (pre_vs > sz)
     {
        if (pre_sum < sz )
        {
            num1 = arr[i];
            pre_sum = sz;
        }
     }
     
}

 dum1 > pre_sum ? num1 = dum2 : num1; 
 printf("The  Longest path for apples trees are :   %d  %d" , num, num1);

}






