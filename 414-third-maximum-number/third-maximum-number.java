class Solution {
    public int thirdMax(int[] nums) {

        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for (int a : nums) {

            if (a == m1 || a == m2 || a == m3) {
                continue;
            }

            if (a > m1) {
                m3 = m2;
                m2 = m1;
                m1 = a;
            }
            else if (a > m2) {
                m3 = m2;
                m2 = a;
            }
            else if (a > m3) {
                m3 = a;
            }
        }

        if (m3 == Long.MIN_VALUE) {
            return (int)m1;
        }

        return (int)m3;
    }
}