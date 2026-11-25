package semaine01;

public class Suprimer_element {
    public int suprimer_Approche1(int[] nums , int val) {
        int k = 0;
        for (int i = 0 ;i < nums.length ; i++) {
            if (nums[i] != val ) {
                nums[k] = nums[i];
                i++;
                k++;
            }
            else{
                i++;
            }
        }

        return k;

    }

    public int suprimer_Approche2( int[] nums , int val) {
        int p1 = 0;
        int p2 = nums.length - 1;

        while (p1 <= p2) {
            if (nums[p1] == val) {
                nums[p1] = nums[p2]; // Remplacement avec le dernier élément
                p2--;                // On réduit la fin sans faire avancer p1
            } else {
                p1++;                // L'élément est valide, on avance
            }
        }

        return p2 + 1; // p2 est un indice (0-indexed), donc le nombre d'éléments est p2 + 1
    }

}
