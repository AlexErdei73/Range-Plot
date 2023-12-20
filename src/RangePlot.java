/* The program plots the range of the projectile
as the function of the angle of ejection. It takes
the initial speed as a constant parameter. It uses
the Plot.java class to make the plot.
 */
public class RangePlot {
    public static void main(String[] args) {
        Range range20 = new Range(20);
        range20.plot();
        Range range10 = new Range(10);
        range10.plot();
    }
}