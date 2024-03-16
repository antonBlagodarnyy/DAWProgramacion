package arrayList;
import java.util.LinkedList; 

public class ArrayList {


	public static void main (String [] args) {
		ArrayList <Karateka> karatekas;
		karatekas= new ArrayList<Karateka>();
		
		LinkedList<Boxeador> boxeadores = new LinkedList<Boxeador>();
		
		Karateka manuel = new Karateka("Manuel", 0);
		Karateka ana = new Karateka("Manuel", 0);
		Karateka rosa = new Karateka("Manuel", 0);
		karatekas.add(manuel);
		karatekas.add(ana);
		karatekas.add(rosa);
		
		System.out.println(karatekas);
	
	
	}

}
