package hackerranktest;
// http://hackerearthsolution.blogspot.com/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
//
class TestClassQ2 {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        try {
            int N = Integer.parseInt(line);

            for (int i = 0; i < N; i++) {

                line=br.readLine();

                String str[];

                str=line.split(" ");

                BigInteger a=new BigInteger(str[0]);

                BigInteger b=new BigInteger(str[1]);

                BigInteger c;

                c=b.add(a);

                System.out.println(c);

            }
        } catch (Exception ex) {

        }


    }

}