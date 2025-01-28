package Extra;

public class Swap {
    public static void main(String[] args) {
        String str ="2Race e CAr2";
        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = cleanString(str);
        
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String cleanString(String str){
        StringBuilder stringBuilderObj= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
           char ch= str.charAt(i);
           if(Character.isLetterOrDigit(ch)){
            stringBuilderObj.append(Character.toLowerCase(ch));
           }
        }
        return stringBuilderObj.toString();
    }
}


