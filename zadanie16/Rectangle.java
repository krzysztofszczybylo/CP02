
public class Rectangle
{
    int a;
    int b;
    
    void showDimension(){
        System.out.println("Dimension of the rectangle is: "+a+"x"+b);
    };
    void showPerimeter(){
        System.out.println("Perimeter of the rectangle is: "+ (2*a+2*b));
    };
    void showSurface(){
        System.out.println("Surface area of the rectangle is: "+ (a*b));
    };
}
