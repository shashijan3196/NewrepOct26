package OnlyJavacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) 
	{
		String[] name= {"shashi", "kumar","bhagya","lakshmi"};
	ArrayList<String>	names = new ArrayList<String>(Arrays.asList(name));
	

//	List<String> names = Arrays.asList(name);
	System.out.println(names);
	names.add("umesh");
	names.add("shashnk");
	System.out.println(names);
		for(int i=0 ; i<names.size(); i++)
		{
			System.out.println(names.get(i));
		}
	}
}
