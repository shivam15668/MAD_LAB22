public class Main
{
    public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

public class Main
{
public static void main(String[] args) {
for(int i=0;i<4;i++)
    {
        for(int k=0;k<4-i;k++)
            System.out.print(" ");
        for(int j=0;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}
}

public class Main
{
	public static void main(String[] args) {
		int i;
		int x = Integer.parseInt(args[0]);
		for(i=1;i<=10;i++)
		{
		    System.out.println(x+"x"+i+"="+x*i);
		}
	}
}
