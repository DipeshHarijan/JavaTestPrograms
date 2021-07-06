public class StringBufferAndBuilder {
    public static void main(String args[]) {
        int N = 999999999;
        long t;
        {
            StringBuffer buffer = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0;) {
                buffer.append("str");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
        {
            StringBuilder builder = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i-- > 0;) {
                builder.append("str");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

    }
}