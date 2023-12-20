public class Range {
    private static Plot rangePlot = new Plot("Projectile range as function of angle", 0, 90, 5, 0, 50, 10);
    private double speed;
    Range(double speed) {
        this.speed = speed;
    }
    public double calc(double angleInGrads) {
        double g, angleInRads, range;
        g = 9.8;
        angleInRads = angleInGrads / 180 * Math.PI;
        range = 2 * this.speed * this.speed / g * Math.sin(angleInRads) * Math.cos(angleInRads);
        return range;
    }
    public void plot() {
        for (double angle = 0; angle <= 90; angle++) {
            rangePlot.addPoint(angle, calc(angle));
        }
    }
}
