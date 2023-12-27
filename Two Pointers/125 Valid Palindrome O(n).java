class Solution {
    public boolean isPalindrome(String s) {
        String final_ = "";

        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c) || Character.isLetter(c))
            {
                final_+=c;
            }
        }

        final_ = final_.toLowerCase();

        int a_pointer = 0;
        int b_pointer = final_.length()-1;

        while(a_pointer <= b_pointer)
        {
            if(final_.charAt(a_pointer) != final_.charAt(b_pointer))
            {
                return false;
            }
            a_pointer += 1;
            b_pointer -= 1;
        }
        return true;
    } 
}