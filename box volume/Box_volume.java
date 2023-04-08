import java.util.Scanner;

class Box_volume{

public static void main(String args[]){
Box b1 = new Box();

Scanner inp = new Scanner(System.in);

System.out.print("Enter height: ");
b1.height = inp.nextInt();

System.out.print("Enter width: ");
b1.width = inp.nextInt();

System.out.print("Enter depth: ");
b1.depth = inp.nextInt();


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