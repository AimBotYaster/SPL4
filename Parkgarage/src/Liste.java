import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {

		ArrayList<String> warteliste = new ArrayList();
		warteliste.add("4");
		warteliste.add("1");
		warteliste.add("18");
		System.out.println(warteliste);
		System.out.println(warteliste.size());

		if (warteliste.contains("1")) {
			warteliste.remove("1");
		}
		warteliste.remove("9");
		System.out.println(warteliste);

	}

}
