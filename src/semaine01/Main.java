package semaine01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // TEST 1 : Fusionner Deux Tableaux Triés
        // ==========================================
        System.out.println("=== TEST 1 : FUSION DE TABLEAUX ===");
        Fusionner_table_trie solution = new Fusionner_table_trie();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        System.out.println("Avant fusion :");
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println("nums2 = " + Arrays.toString(nums2));

        solution.merge(nums1, m, nums2, n);

        System.out.println("Après fusion :");
        System.out.println("nums1 = " + Arrays.toString(nums1));
        System.out.println();


        // ==========================================
        // TEST 2 : Supprimer un Élément
        // ==========================================
        System.out.println("=== TEST 2 : SUPPRESSION D'ÉLÉMENT ===");
        Suprimer_element service = new Suprimer_element();
        int val = 2;

        // Test Approche 1
        int[] nums3 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k1 = service.suprimer_Approche1(nums3, val);
        System.out.println("Approche 1 -> k = " + k1 + " | nums = " + Arrays.toString(nums3));

        // Test Approche 2
        int[] nums4 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int k2 = service.suprimer_Approche2(nums4, val);
        System.out.println("Approche 2 -> k = " + k2 + " | nums = " + Arrays.toString(nums4));
    }
}