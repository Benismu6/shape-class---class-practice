public abstract class CircularShape implements Shape3D {
 private double radius;
 public CircularShape() {
   radius = 0.0;
 }
  
 public CircularShape(double r) {
   radius = r;
 }
  
 public double getDiameter() {
   return radius * 2.0;
 }
 public double getRadius() {
   return radius;
 }
  
 public double getCrossSectionArea() {
   return Math.PI * Math.pow(radius, 2);
 }
  
 public double getCrossSectionPerimeter() {
 return 2 * Math.PI * radius;
 }
  
}

