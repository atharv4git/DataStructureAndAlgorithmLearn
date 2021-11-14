#include<stdio.h>                                                               
                                                                                
void main()                                                                     
{                                                                               
 int numbers[10], i, n,count=0;                                         
 printf("Enter number of elements:\n");                                         
 scanf("%d", &n);                                                               
                                                                                
 /* Reading array elements */                                                   
 printf("\nInput %d values: ", n);                                              
 for(i=0; i<n; i++)                                                             
 {                                                                              
  scanf("%d", &numbers[i]);                                                     
 }                                                          
 for(i=0;i<n;i++)                                                               
 {                                                                              
   for(int j = 1 ; j <= n ; j++){
       if(numbers[i]==numbers[j]){
           printf("%d",&numbers[j]);
           count++;
       };
   }                                                                            
 };                                                                     
 printf("\nElement %d is available in array count: %d", search, count);         
} 