import java.util.ArrayList;

public class Circuit { /*extends ? abstract ?*/
        protected ArrayList<Composante> contenu;
        protected ArrayList<Signal> internal;
        protected ArrayList<Signal> outputs;
        protected int nargs;

        public Circuit(int nargs) {
                /*?*/
        }

        public Circuit and (int id1, int id2) {
                /*?*/
                return this;
        }


        public Circuit or (int id1, int id2) {
                /*?*/
                return this;
        }

        public Circuit not (int id1) {
                /*?*/
                return this;
        }

        public Circuit addOutput(int id) {
                /*?*/
        }

        public String toString() {
                /*?*/
        }


        public boolean[] exec(boolean[] indata) {
                if (indata.length != nargs) {
                        System.out.println("Wrong argument number");
                        return null;
                }
                for (int i = 0; i < nargs; i++) {
                        internal.get(i).set(/*?*/);
                }
                boolean[] outs = new boolean[/*?*/];
                for (int i = 0; i < outputs.size(); i++) {
                        outputs.get(i).updateState();
                        outs[i] = /*?*/
                }

                return outs;

        }




}