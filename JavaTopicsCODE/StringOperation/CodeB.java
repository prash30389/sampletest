package StringOperation;

class CodeA
{
    public String type = "A ";
    public CodeA() {  
        System.out.print("CodeA "); 
    }
}
  
public class CodeB extends CodeA
{
    public CodeB() {
        System.out.print("CodeB ");
    }
  
    void go()
    {
        type = "B ";
        System.out.print(this.type + super.type);
    }
  
    public static void main(String[] args)
    {
        new CodeB().go();
    }
    	/* CodeB().go() executes in two phases:
    	 * CodeB class constructor is called followed by CodeA class constructor as CodeB extends CodeA.
    	go() function is called on CodeB object which overrides the variable "type" to B and hence, 
    	the same value "B" is printed twice. 
    	In this code snippet, super keyword is not playing any role.*/
}
