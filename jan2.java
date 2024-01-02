public class jan2{
    public static void main(String[] args) {
        String str1="ab";
        String str2="a";
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            int m=str1.charAt(i);
            arr[m-97]=arr[m-97]+1;
        }
        for(int i=0;i<str2.length();i++)
        {
            int m=str2.charAt(i);
            arr[m-97]=arr[m-97]-1;
            if(arr[m-97]<0)
            {
                System.out.println("false");
                return;
            }
        }
        for(int count:arr)
    {
        if (count != 0) {
            System.out.println("false");
            return;
        }
    }
        System.out.println("true");

    }
}