public class And extends Composante {

        public And(Composante input1, Composante input2) {
                super();
                connectInput(input1);
                connectInput(input2);
        }


        protected void computeState() {
                state = inputs.get(0).state && inputs.get(1).state;
        }
}