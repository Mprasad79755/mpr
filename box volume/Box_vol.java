class Box_vol{

public static void main(String args[]){
Box b1 = new Box();
b1.height = 5;
b1.width = 10;
b1.depth = 20;
b1.volume();
}
}

class Box{
int height;
int width;
int depth;

void volume(){
System.out.print("The volume is: ");
System.out.print(height*width*depth);
}
}