import java.util.*;
class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arl=new ArrayList<String>();
		 System.out.println("Size of ArrayList" +arl.size());
		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");
		 System.out.println("Size of ArrayList" +arl.size());
		System.out.println("contents :"+arl);
		arl.remove(3);
		System.out.println("contents :"+arl);
		arl.remove("Apple");
		System.out.println("Contents after removing" +arl);
        System.out.println("Size of ArrayList" +arl.size());
		System.out.println("Extracting using iterator: ");
		
		Iterator it=arl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(String val : arl){
			System.out.println(val);
		}
	}
}
