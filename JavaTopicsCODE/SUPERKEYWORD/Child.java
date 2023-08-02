package SUPERKEYWORD;

class Child {
int x = 10;
public static void main(String[] args) {
Child c = new Child();
c.fun();
Child c1 = new Child();
c1.x=30;
c1.fun();
}
void fun()
	{
	int x = 20;
	System.out.println(x);
	System.out.println(this.x);
	}
}
