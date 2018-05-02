import java.util.Arrays;

public class Notendurchschnitt {

	public static void main(String[] args) {
		int[] Noten = { 1, 1, 3, 2, 4, 5, 5, 4, 4, 3, 2, 2, 1, 1, 3, 2, 4, 5, 4, 3, 2, 1, 4, 4, 3, 2, 1, 1, 5, 3 };

		System.out.println(Arrays.toString(Noten));

		double durchschnitt = 0;
		for (int i = 0; i < Noten.length; i++) {
			durchschnitt += Noten[i];
		}
		durchschnitt = durchschnitt / Noten.length;
		System.out.println(durchschnitt);

		int[] notenspiegel = new int[5];
		for (int i = 0; i < Noten.length; i++) {
			switch (Noten[i]) {
			case (1):
				notenspiegel[0]++;
				break;
			case (2):
				notenspiegel[1]++;
				break;
			case (3):
				notenspiegel[2]++;
				break;
			case (4):
				notenspiegel[3]++;
				break;
			case (5):
				notenspiegel[4]++;
				break;
			}
		}
		System.out.println(" 1  2  3  4  5 \n I  I  I  I  I \n V  V  V  V  V\n" + Arrays.toString(notenspiegel));
	}
}
