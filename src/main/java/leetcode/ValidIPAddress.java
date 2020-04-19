package leetcode;
//IP.chars().filter(ch -> ch == ':').count() == 8
public class ValidIPAddress {
    public static String validIPAddress(String IP) {
        System.out.println("IP.split(\":\").length: " + IP.split(":").length);
        System.out.println("IP.chars().filter(ch -> ch == ':').count(): " + IP.chars().filter(ch -> ch == ':').count());
        if(IP.split("\\.").length == 4) {
            // System.out.println(1);
            if(IP.charAt(0) == '.' || IP.charAt(IP.length()-1) == '.')
                return "Neither";
            return isIPv4(IP) ? "IPv4" : "Neither";
        } else if(IP.split(":").length == 8) {
            if(IP.charAt(0) == ':' || IP.charAt(IP.length()-1) == ':')
                return "Neither";
            // System.out.println(2);
            return isIPv6(IP) ? "IPv6" : "Neither";
        }
        return "Neither";
    }

    public static boolean isIPv4(String IP) {
        String[] numbers = IP.split("\\.");
        for(String number: numbers) {
            if(number.length() == 0 || number.length() > 3) {
                return false;
            }
            if(number.charAt(0) == '0' && number.length() > 1) {
                return false;
            }
            for(Character ch: number.toCharArray()) {
                if(!Character.isDigit(ch)) {
                    return false;
                }
            }
            if(Integer.parseInt(number) > 255) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIPv6(String IP) {
        String[] numbers = IP.split(":");
        String reference = "0123456789abcdefABCDEF";
        for(String number: numbers) {
            if(number.length() == 0 || number.length() > 4) {
                return false;
            }
            for(Character ch : number.toCharArray()) {
                if(reference.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String IP = "2001:102:";
        System.out.println(IP);
        validIPAddress(IP);
    }
}
