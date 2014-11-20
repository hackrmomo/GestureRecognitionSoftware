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
public class Angle {
    public Angle(){
                
    }
    private double calculateAngle(Point start, Point end){
        int x1 = start.getX(),
                x2 = end.getX(),
                y1 = start.getY(),
                y2 = end.getY();
        int dx = x2-x1;
        int dy = y2-y1;
        double returnValue = Math.atan(dy/dx);
        return returnValue;
    }
}
