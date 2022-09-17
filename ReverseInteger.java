public class ReverseInteger {
    public static void main(String[] args) {
        
    }

    public int reverse(int x) {
        boolean neg = false;
        if(x < 0) {
            neg = true;
            x = -1 * x;
        }
        
        long reversed = 0;
        int curr = x;
        
        while(curr > 0) {
            reversed = (reversed) * 10 + (curr % 10);
            curr /= 10;
        }
        
        if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        } 
        
        return neg == false ? (int)reversed : (-1) * (int)reversed;
    }
}
