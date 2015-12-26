public class Solution {
    public String intToRoman(int num) {
        char[] alpha = new char[]{ 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        String roman = new String("");
        int bit = 0;
        while (num > 0)  
        {  
            int tempnum = num % 10;
            switch (tempnum)  
            {  
                case 3:  
                {   
                    roman=String.valueOf(alpha[bit])+roman;
                    tempnum--;
                }  
                case 2:  
                {  
                    roman=String.valueOf(alpha[bit])+roman;  
                    tempnum--;
                }  
                case 1:  
                {  
                    roman=String.valueOf(alpha[bit])+roman;  
                    break;  
                }  
                case 4:  
                {  
                    roman=String.valueOf(alpha[bit+1])+roman;
                    roman=String.valueOf(alpha[bit])+roman;  
                    break;  
                }  
                case 8:  
                {  
                    roman=String.valueOf(alpha[bit])+roman; 
                    tempnum--;
                }  
                case 7:  
                {  
                    roman=String.valueOf(alpha[bit])+roman; 
                    tempnum--;
                }  
                case 6:  
                {  
                    roman=String.valueOf(alpha[bit])+roman;  
                    tempnum--;
                }  
                case 5:  
                {  
                    roman=String.valueOf(alpha[bit+1])+roman;  
                    break;  
                }  
                case 9:  
                { 
                    roman=String.valueOf(alpha[bit+2])+roman; 
                    roman=String.valueOf(alpha[bit])+roman; 
                    break;  
                }  
                default:  
                {  
                    break;  
                }  
            }  
            bit += 2;  
            num = num/10;  
        }  
     return roman;
    }
}