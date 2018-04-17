package sample;

public class FlatLine {
private String Color = "BLACK";
private double StrokeWidth = 2.5;
private double startX;
private double startY;
private double endX;
private double endY;

public FlatLine(){

}
public FlatLine(double startX,double startY,double endX,double endY,String Color,double StrokeWidth){
    this.startX = startX;
    this.startY = startY;
    this.endX = endX;
    this.endY = endY;
    this.Color = Color;
    this.StrokeWidth = StrokeWidth;
}
}
