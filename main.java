import java.util.ArrayList;


public class main {

        //public static String btos(boolean[] vec) {
        //        String ch = "";
        //        for (int i = 0; i < vec.length; i++) {
        //                ch += vec[i] ? 1 + "\t" : 0 + "\t";
        //        }
        //        return ch + "\n";
        //}

        public static void test1() {
                Composante c1 = new Composante();
                Composante c2 = new Composante();
                System.out.println(c1);
                System.out.println(c2);
        }


        public static void test2() {
                Signal s1 = new Signal();
                Signal s2 = new Signal();
                Signal s3 = new Signal();
                Signal s4 = new Signal();
                //Votre code qui crée le circuit X
                System.out.println(s4.functionContent());
        }

        public static void test3() {
                Circuit c1 = new Circuit(4).and(0, 1).or(2, 3).and(0, 4).or(5, 3).or(6, 7).createOutput(7).createOutput(8);
                System.out.println(c1);
        }

        public static void test4() {
                Circuit c1 = new Circuit(4).and(0, 1).or(2, 3).and(1, 5).or(6, 4).createOutput(7).createOutput(6);
                System.out.println(c1);
                boolean[] inData = {true, false, true, false};
                System.out.println(btos(inData));
                System.out.println(btos(c1.exec(inData)));
        }


        public static void main(String[] args) {
                test3();
        }
}
