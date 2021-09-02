package DOP;
import java.io.*;
import java.util.*;

public class file {
	String loc;
	
	
	public int [] File2arr(String loc) {
		BufferedReader reader;
		this.loc=loc;
		ArrayList<String> s1=new ArrayList<String>();
		try {
			reader=new BufferedReader(new FileReader(loc));
			String tmp;
			
			while((tmp=reader.readLine()) !=null) {
				s1.add(tmp);
			}
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		int [] arr=new int[s1.size()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(s1.get(i));
		}
		return arr;
	}

	public void arr2File(int [] arr,String loc) {
		BufferedWriter writer;
		try {
			writer=new BufferedWriter(new FileWriter(loc));
			for(int i:arr) {
				writer.write(String.valueOf(i)+"\n");
			}
			writer.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
