class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r){
            char c1=s.charAt(l);
            char c2=s.charAt(r);

            //check whether c1 is a character or not
            if(!isValid(c1)){  
                l++; //if not a character, then move the pointer
                continue;
            }

            if(!isValid(c2)){
                r--;
                continue;
            }

            //convert to lower case
            if(c1 >='A' && c1 <='Z') c1+=32;
            if(c2>='A' && c2<='Z') c2+=32;

            if(c1!=c2) return false;
            l++;
            r--;

        }
        return true;
    }
    static boolean isValid(char c){
        return (c>='A' && c<='Z') ||
                (c>='a' && c<='z') ||
                (c>='0' && c<= '9');
            
    }
}
