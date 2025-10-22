public class ClassesExercise {
    public class Robot {
        private double target;
        private double position;

        public Robot() {
            target = 5;
            position = 0;
        }

        public Robot(double target, double position) {
            this.target = target;
            this.position = position;
        }

        public double getTarget() {
            return target;
        }

        // Continued
        public void setTarget(double target) {
            this.target = target;
        }

        public double getPosition() {
            return position;
        }

        public void setPosition(double position) {
            this.position = position;
        }
    }
}
