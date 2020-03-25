package leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedand" +
                "sodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhat" +
                "warWehavecometodedicpateaportionofthatfieldasafinalrestingpl" +
                "aceforthosewhoheregavetheirlivesthatthatnationmightliveItisa" +
                "ltogetherfangandproperthatweshoulddothisButinalargersensewec" +
                "annotdedicatewecannotconsecratewecannothallowthisgroundThebr" +
                "avelmenlivinganddeadwhostruggledherehaveconsecrateditfarabov" +
                "eourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorl" +
                "ongrememberwhatwesayherebutitcanneverforgetwhattheydidhereIt" +
                "isforusthelivingrathertobededicatedheretotheulnfinishedworkwh" +
                "ichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforus" +
                "tobeherededicatedtothegreattdafskremainingbeforeusthatfromthe" +
                "sehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheyga" +
                "vethelastpfullmeasureofdevotionthatweherehighlyresolvethatthe" +
                "sedeadshallnothavediedinvainthatthisnationunsderGodshallhavea" +
                "newbirthoffreedomandthatgovernmentofthepeoplebythepeopleforth" +
                "epeopleshallnotperishfromtheearth";
        int arrInt[] = new int[52];
        for(int i = 0; i < 52; i++) {
            arrInt[i] = 0;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                arrInt[(int)s.charAt(i) - 'A']++;
            } else {
                arrInt[(int)s.charAt(i) - 'a' + 26]++;
            }
        }
        int length = 0;
        boolean flag = false;
        for(int i = 0; i < 52; i++) {
            System.out.print(arrInt[i] + " ");
        }
        for(int i = 0; i < 52; i++) {
            if(arrInt[i] % 2 == 0) {
                length += arrInt[i];
            } else if(arrInt[i] % 2 != 0) {
                length += (--arrInt[i]);
                flag = true;
            }
        }
        if(flag) {
            length++;
        }
        System.out.println("length: " + length);
    }
}
