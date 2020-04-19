package leetcode;

public class FindSubstringInWraproundString {
    public static int findSubstringInWraproundString(String p) {
        String[] strings = new String[26];
        char[] arr = p.toCharArray();
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            int start = i;
            while(i + 1 < arr.length && (arr[i] + 1) % 26 == (arr[i+1]) % 26) {
                i++;
            }
            System.out.println("start: " + start + " i:" + i);
            for(int j = start; j <= i; j++) {
                String pre  = strings[arr[j] - 'a'] == null ? "" : strings[arr[j] - 'a'];
                if(i - j + 1 <= pre.length()) {
                    break;
                } else {
                    result += (i - j + 1 - pre.length());
                    strings[arr[j] - 'a'] = p.substring(j, i+1);
                    System.out.println(arr[j]-'a' + " " + strings[arr[j] - 'a']);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String p = "abcdzab";
        System.out.println(findSubstringInWraproundString(p));
    }
}
