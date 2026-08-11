class Solution {
    public boolean isValid(String s) {
          String temp = ""; 

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                temp += ch; 
            } else {
                if (temp.isEmpty()) return false;

                char last = temp.charAt(temp.length() - 1);

                if ((ch == ')' && last == '(') ||
                    (ch == ']' && last == '[') ||
                    (ch == '}' && last == '{')) {
                    temp = temp.substring(0, temp.length() - 1);
                } else {
                    return false;
                }
            }
        }

        return temp.isEmpty();
    }
}
        
        