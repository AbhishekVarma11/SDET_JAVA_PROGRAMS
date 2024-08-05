package SDET_Java_Programs;

import java.util.ArrayList;
import java.util.List;

//product of an array expect itself

//product expect ith other elements needs to product
class products
{
public static void main(String args[])
{
int[] a={2,3,4,5};
List<Integer> products=new ArrayList<>();
for(int i=0;i<a.length;i++)
{
int product=1;
for(int j=0;j<a.length;j++)
{
if(j!=i)
{
  product=product*a[j];
}

}
products.add(product);
}
System.out.print(products);
}
}







