package Day13.Main;
public class StrPalindrome {
    public StrPalindrome(){

    }
    public String palindrome(String str){
        char a[]=str.toCharArray();
        String s="",re="Not palindrome";
        for(int i=a.length-1;i>=0;i--){
            s+=a[i];
        }
        if(s.equals(str)){
            re="palindrome";
        }
        return re;
    }
    public static void main(String [] args){
        StrPalindrome r=new StrPalindrome();
        System.out.println(r.palindrome("Apple"));
        System.out.println(r.palindrome("racecar"));
        System.out.println(r.palindrome("234rfd"));
        System.out.println(r.palindrome(" "));
        System.out.println(r.palindrome("k"));
    }
}
