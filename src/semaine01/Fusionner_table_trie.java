package semaine01;

public class Fusionner_table_trie {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m + n - 1; // Dernier emplacement libre dans nums1
        int p2 = m - 1;     // Dernier élément valide dans nums1
        int p3 = n - 1;     // Dernier élément dans nums2

        // Boucle 1 : tant qu'il reste des éléments à comparer dans les deux tableaux
        while (p2 >= 0 && p3 >= 0) {
            if (nums1[p2] <= nums2[p3]) {
                nums1[p1] = nums2[p3];
                p3--;
            } else {
                nums1[p1] = nums1[p2];
                p2--;
            }
            p1--; // p1 recule à chaque insertion
        }

        // Boucle 2 : s'il reste des éléments dans nums2
        while (p3 >= 0) {
            nums1[p1] = nums2[p3];
            p1--;
            p3--;  // placer tout dans dernier emplacement libre , complexiter o(m+n)
        }
    }

}

