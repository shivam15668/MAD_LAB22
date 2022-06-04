class Arjun extends Pandavs{}

abstract class Bharatvanshi{
    public void fight(){
        System.out.println("I am Fighter");
    }
   abstract public void obey();
   abstract public void kind();
}

class Bheem extends Pandavs{
    public void kind(){
        System.out.println("I am less kind");
    }
}

class Duryodhan extends Kaurav{
    
}

class Kaurav extends  Bharatvanshi{
    public void obey(){
         System.out.println("I am dis-obedience");
    }
    public void kind(){
         System.out.println("I am cruel");
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
		Arjun a=new Arjun();
		a.fight();
		a.obey();
		a.kind();
		
	}
}

class Pandavs extends  Bharatvanshi{
    public void obey(){
        System.out.println("I am obedience");
    }
     public void kind(){
        System.out.println("I am kind");
    }
}

class Vikarn extends Kaurav{
    public void obey(){
         System.out.println("I am obedience");
    }
    public void kind(){
         System.out.println("I am kind");
    }
}
