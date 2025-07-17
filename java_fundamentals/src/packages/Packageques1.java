package packages;
import java.u
class foundation {
    private int var1 = 1;      // private
    int var2 = 2;              // default
    protected int var3 = 3;    // protected
    public int var4 = 4;       // public
}

public class Packageques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foundation f = new foundation();
        // System.out.println(f.var1); // Not accessible: private
        // System.out.println(f.var2); // Accessible only if in same package
        // System.out.println(f.var3); // Accessible only if in same package or subclass
        System.out.println(f.var4);   // Accessible: public

	}

}
