
import java.util.ArrayList;

class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            if (list.indexOf(ch) == list.lastIndexOf(ch)) {
                return i;
            }
        }

        return -1;
    }
}
