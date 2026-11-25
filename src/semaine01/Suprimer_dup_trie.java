package semaine01;

public class Suprimer_dup_trie {
    public int suprimer_dup(int[] nums) {
        int k = 1;
        int i = 0;
        while (i <= nums.length) {
            if (nums[i]!=nums[k-1]) {
                nums[k]= nums[i];
                i++;
                k++;
            }
            else {
                i++;
            }
        }

        return k;
    }
}
