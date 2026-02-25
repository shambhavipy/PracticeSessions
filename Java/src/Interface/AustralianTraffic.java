package Interface;

    public class AustralianTraffic implements CentralTraffic {

        public static void main(String[] args) {
            CentralTraffic a = new AustralianTraffic();
            a.RedStop();
            a.GreenGo();
            a.YellowWait();
        }

        @Override
        public void GreenGo() {
            System.out.println("Run your vehicle");
        }

        @Override
        public void RedStop() {
            // TODO Auto-generated method stub
            System.out.println("Stop your vehicle");
        }

        @Override
        public void YellowWait() {
            // TODO Auto-generated method stub
            System.out.println("Start your vehicle");
        }
    }
