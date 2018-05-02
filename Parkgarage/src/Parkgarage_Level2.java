import java.util.ArrayList;

public class Parkgarage_Level2 {

	public static void main(String[] args) {

		int parkpleatze = 2;

		int Autos = 4;
		String parken = "1 2 -1 3 4 -3 -4 -2";
		ArrayList<Integer> warteListe = new ArrayList();
		String[] parkvorgaenge = parken.split(" ");
		int maxAutosInGarage = 0;
		int autosInGarage = 0;
		int maxAutosInWarteListe = 0;

		for (int a = 0; a < parkvorgaenge.length; a++) {

			int auto = Integer.parseInt(parkvorgaenge[a]);

			if (auto < 0) {
				System.out.println("Auto parkt aus...." + auto);
				if (warteListe.contains((Integer)auto)) {
					warteListe.remove((Integer)auto);
					maxAutosInWarteListe--;
				} else {
					autosInGarage --;
				}

			} else if (auto > 0 && autosInGarage>= parkpleatze) {

				warteListe.add(Integer.parseInt(parkvorgaenge[a]));
				maxAutosInWarteListe++;

			} else {
				System.out.println("Auto park ein..." + auto);
				autosInGarage++;

			}

			if (maxAutosInGarage < autosInGarage) {
				maxAutosInGarage = autosInGarage;

			}

		}

		System.out.println(" Es sind " + maxAutosInGarage + " maxAutos und " + maxAutosInWarteListe + warteListe);

	}

}
