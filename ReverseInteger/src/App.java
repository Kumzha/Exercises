public class App {

    public static int reverse(int x) {
        boolean isNegative = false;

        if (x<0) {
            isNegative = true;
        }
        
        x = Math.abs(x);

        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if(isNegative) {
            sb.insert(0, '-');
        }

        try {
            int reverse = Integer.parseInt(sb.toString());
            return reverse;
        } catch (Exception e) {
            return 0;
        }
        
    }
    public static void main(String[] args) throws Exception {
        int x = -123;
        System.out.println(reverse(x));
    }
}
