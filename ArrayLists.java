import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List=new ArrayList<>();
		List.add(0);
		List.add(1);
		List.add(2);
		System.out.println(List);
		System.out.println(List.get(2));
		List.add(1, 4);
		System.out.println(List);
		List.set(1, 5);
		System.out.println(List);
		List.remove(1);
		System.out.println(List);
		System.out.println(List.size());
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i));
		}
		Collections.sort(List);
		System.out.println(List);
		Collections.reverse(List);
		System.out.println(List);
//		ArrayList<String> list2=new ArrayList<>();
//		ArrayList<Boolean> list3=new ArrayList<>();
	}

}
