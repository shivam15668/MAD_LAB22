class Child extends Mother{
    public static void show(){
        System.out.println("Hello JUET");
        
    }
}

/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Mother m1=new Child();
		m1.show();
	}
}

class Mother{
    public static void show(){
        System.out.println("Hello World");
    }
}
