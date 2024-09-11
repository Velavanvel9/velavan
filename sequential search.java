class linear{
public static int search(int arr[],int x)
{ 
int n=arr.length;
for(int i=0;i<n;i++){
if(arr[i]==x)
return i;
}
return 0;
}
 public static void main(string args[])
{
int arr[]={2,3,4,10,40};
int x=10;
int result=search(arr,x);          
if(result==-1)
system.out.print("element is not present in array");
else
system.out.print("element is present"+"at intex"+result);
}
}





