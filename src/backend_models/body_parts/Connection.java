/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models.body_parts;

import backend_models.Angle;
import backend_models.Point;

/**
 *
 * @author momo
 */
public class Connection {

    private double sourceAngle;
    private double destinationAngle;
    private Point connectionPoint;

    public Connection(double sourceAngle, double destinationAngle, Point connectionPoint) {
        this.sourceAngle = sourceAngle;
        this.destinationAngle = destinationAngle;
        this.connectionPoint = connectionPoint;
    }

    public Connection(Point connectionPoint) {
        this.connectionPoint = connectionPoint;
    }

    public Connection(double sourceAngle, double destinationAngle) {
        this.sourceAngle = sourceAngle;
        this.destinationAngle = destinationAngle;
    }

    public Connection() {

    }

    public Connection(Point startSource, Point endSource, Point startDestination, Point endDestination, Point connectionPoint) {
        this.sourceAngle = Angle.calculateAngle(startSource, endSource);
        this.destinationAngle = Angle.calculateAngle(startDestination, endDestination);
        this.connectionPoint = connectionPoint;
    }

    public Connection(Point startSource, Point endSource, Point startDestination, Point endDestination) {
        this.sourceAngle = Angle.calculateAngle(startSource, endSource);
        this.destinationAngle = Angle.calculateAngle(startDestination, endDestination);
    }

    public void setSourceAngle(double sourceAngle) {
        this.sourceAngle = sourceAngle;
    }

    public void setDestinationAngle(double destinationAngle) {
        this.destinationAngle = destinationAngle;
    }

    public void setConnectionPoint(Point connectionPoint) {
        this.connectionPoint = connectionPoint;
    }

    public void setSourceAngle(Point startSource, Point endSource) {
        this.sourceAngle = Angle.calculateAngle(startSource, endSource);
    }

    public void setDestinationAngle(Point startDestination, Point endDestination) {
        this.destinationAngle = Angle.calculateAngle(startDestination, endDestination);
    }
    public double getSourceAngle(){
        return this.sourceAngle;
    }
    public double getDestinationAngle(){
        return this.destinationAngle;
    }
    public Point getConnectionPoint(){
        return this.connectionPoint;
    }
}
