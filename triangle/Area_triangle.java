

class Area_triangle{

public static void main(String args[]){


Triangle t1 = new Triangle();
Triangle t2 = new Triangle();

t1.b = 5;
t1.h = 10;

t2.b = 15;
t2.h = 25;

t1.area();
t2.area();
}
}

class Triangle{
int b;
int h;

void area(){
System.out.println("The area of triangle is: ");
System.out.println(0.5*b*h);
}
}