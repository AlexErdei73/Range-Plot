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
    public void plot() {
        Plot rangePlot = new Plot("Projectile range as function of angle", 0, 90, 5, 0, 50, 10);
        for (double angle = 0; angle <= 90; angle++) {
            rangePlot.addPoint(angle, calc(angle));
        }
    }
}
