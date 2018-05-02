
public class Parkgarage_Level1 {

	public static void main(String[] args) {

		int parkpleatze = 10;
		int Autos = 4;
		String parken = "6 2 -6 3 4 -3 -4 -2";
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int autosInGarage = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {

			int auto = Integer.parseInt(parkvorgaenge[a]);

			if (auto < 0) {
				System.out.println("Auto parkt aus...." + auto);

			} else {
				System.out.println("Auto park ein..." + auto);

			}
		}

	}

}
