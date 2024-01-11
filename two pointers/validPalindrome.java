public class validPalindrome{
    public static void main(String[] args) {
         String s = "A man, a plan, a canal: Panama";
         String result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

         // Convert to lowercase
        //  String finalResult = stringWithoutSpaces.toLowerCase();
         System.out.println(isPalindrome(s));
    }
    
    public  static boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i=0;
        // System.out.println(result);
        int j=result.length()-1;
            while(i<j)
            {
                if(result.charAt(i)!=result.charAt(j))
                {
                    return false;
                }
                i++;
                j--;
            }
            return true;
    }
}