public class Range {
    private double speed, angle, range;
    Range(double speed) {
        this.speed = speed;
    }
    public double calc(double angleInGrads) {
        double g, angleInRads;
        g = 9.8;
        this.angle = angleInGrads;
        angleInRads = angleInGrads / 180 * Math.PI;
        this.range = 2 * this.speed * this.speed / g * Math.sin(angleInRads) * Math.cos(angleInRads);
        return this.range;
    }
}
