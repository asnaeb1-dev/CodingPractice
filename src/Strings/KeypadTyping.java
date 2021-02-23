package Strings;

public class KeypadTyping {
    public static void main(String[] args) {
        String s = "amazon";
        System.out.println(keypadCount(s));
    }
    private static String keypadCount(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 99){
                    sb.append(2);
            }else if(str.charAt(i) >= 100 && str.charAt(i) <= 102){
                    sb.append(3);
            }else if(str.charAt(i) >= 103 && str.charAt(i) <= 105){
                    sb.append(4);
            }else if(str.charAt(i) >= 106 && str.charAt(i) <= 108){
                    sb.append(5);
            }else if(str.charAt(i) >= 109 && str.charAt(i) <= 111){
                    sb.append(6);
            }else if(str.charAt(i) >= 112 && str.charAt(i) <= 115){
                    sb.append(7);
            }else if(str.charAt(i) >= 116 && str.charAt(i) <= 118){
                    sb.append(8);
            }else if(str.charAt(i) >= 119 && str.charAt(i) <= 122){
                    sb.append(9);
            }
        }
        return sb.toString();
    }
}
