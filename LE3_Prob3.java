class Duck{
    public void swim(){
        System.out.println("I can swim");
    }
}

interface Fly{
    void fly();
}

class LD extends Duck implements Quack,Fly {
    public void quack(){
        System.out.println("I quack.");
    }
    public void fly(){
        System.out.println("I can Fly");
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
		RHD o=new RHD();
		o.swim();
		o.fly();
		o.quack();
	}
}

interface Quack{
    void quack();
}

class RD implements Quack extends Duck{
    public void quack(){
        System.out.println("I squeaks.");
    }
}

class RHD extends Duck implements Quack,Fly {
    public void quack(){
        System.out.println("I quack.");
    }
    public void fly(){
        System.out.println("I can Fly");
    }
}

class WD extends Duck implements Quack{
    public void quack(){
        System.out.println("I mute.");
    }
}
