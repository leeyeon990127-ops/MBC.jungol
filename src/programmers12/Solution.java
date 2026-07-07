package programmers12;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String moem = "aeiou";
        for(int i =0; i<my_string.length(); i++ ) {
            char c = my_string.charAt(i);

            if(!moem.contains(String.valueOf(c))) {
                answer += c;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("bus"));
    }
}

/*
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u') {
                answer += ch;
            }
        }

        return answer;
    }
 */

/*
class Solution {
    public String solution(String my_string) {
        StringBuilder b = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                b.append(c);
            }
        }
        String answer = b.toString();
        return answer;
    }
}

 */

/*
class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

 */