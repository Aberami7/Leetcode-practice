class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] s = sentence.split(" ");

        for (int i = 0; i < s.length; i++) {
            String a = s[i];

            if ("aeiouAEIOU".indexOf(a.charAt(0)) != -1) {
                sb.append(a);
            } else {
                StringBuilder z = new StringBuilder(a);
                char first = z.charAt(0);
                z.deleteCharAt(0);
                z.append(first);
                sb.append(z);
            }

            sb.append("ma");

            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }

            if (i != s.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}