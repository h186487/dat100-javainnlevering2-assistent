package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        for (int a : tabell){
		System.out.println(a);

        }

	}

	// b)
	public static String tilStreng(int[] tabell) {
        String result = "[";
        for (int i = 0; i<tabell.length; i++){
            result += tabell[i];
            if (i < tabell.length - 1){
                result += ",";
            }
        }
        result += "]";
        return result;
	}

	// c)
	public static int summer(int[] tabell) {
        int result = 0;
        for (int i = 0; i < tabell.length; i++){
            result += tabell[i];
        }
		return result;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean result = false;
        for (int i = 0; i < tabell.length; i++){
            if (tabell[i] == tall){
                result = true;
            }
        }
        return result;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++){
            if ( tabell[i] == tall){
                return i;
            }
        }
        return - 1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversertTabell = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++){
            reversertTabell[i] = tabell[tabell.length - i - 1];
        }
        return reversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length - 1; i++){
            if (tabell[i] > tabell[i + 1]){
                return false;
            }
        }
        return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] tabellSattSammen = new int[tabell1.length + tabell2.length];

        for (int i = 0; i < tabell1.length; i++){
            tabellSattSammen[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++){
            tabellSattSammen[tabell1.length + i] = tabell2[i];
        }
        return tabellSattSammen;




	}
}
