/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

/**
 *
 * @author momo
 */
public final class Angle {

    private double angle;
    private Point start = new Point(0, 0);
    private Point end = new Point(0, 0);

    public Angle() {

    }

    public Angle(Point start, Point end) {
        this.setAngle(start, end);
    }

    public Angle(double angle) {
        this.setAngle(angle);
    }

    public static double calculateAngle(Point start, Point end) {
        int x1 = start.getX(),
                x2 = end.getX(),
                y1 = start.getY(),
                y2 = end.getY();
        int dx = x2 - x1;
        int dy = y2 - y1;
        double returnValue = Math.atan(dy / dx);
        return returnValue;
    }

    public final void setAngle(double angle) {
        this.angle = angle;
    }

    public final void setAngle(Point start, Point end) {
        this.angle = calculateAngle(start, end);
        this.setPoints(start, end);
    }

    public double getAngle() {
        return angle;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    private void setPoints(Point start, Point end) {
        this.end = end;
        this.start = start;
    }

}
