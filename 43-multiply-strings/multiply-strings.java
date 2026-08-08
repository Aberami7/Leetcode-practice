
class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {

            int carry = 0;

            for (int j = num2.length() - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int c = a * b + carry + result[i + j + 1];

                result[i + j + 1] = c % 10;
                carry = c / 10;
            }

            result[i] += carry;
        }

        StringBuilder sb = new StringBuilder();

        for (int num : result) {
            if (sb.length() == 0 && num == 0)
                continue;

            sb.append(num);
        }

        return sb.toString();
    }
}

