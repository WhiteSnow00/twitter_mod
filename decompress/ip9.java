import java.io.PrintStream;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class ip9
{
    public static ip9 b;
    public static String[] c;
    public String a;
    
    static {
        ip9.b = new ip9();
        ip9.c = new String[] { "standard", "accelerate", "decelerate", "linear" };
    }
    
    public ip9() {
        this.a = "identity";
    }
    
    public static ip9 c(final String s) {
        if (s == null) {
            return null;
        }
        if (s.startsWith("cubic")) {
            return (ip9)new ip9.ip9$a(s);
        }
        if (s.startsWith("spline")) {
            return (ip9)new lgr(s);
        }
        if (s.startsWith("Schlick")) {
            return (ip9)new hxo(s);
        }
        s.hashCode();
        int n = -1;
        switch (s) {
            case "standard": {
                n = 5;
                break;
            }
            case "overshoot": {
                n = 4;
                break;
            }
            case "linear": {
                n = 3;
                break;
            }
            case "anticipate": {
                n = 2;
                break;
            }
            case "decelerate": {
                n = 1;
                break;
            }
            case "accelerate": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                final PrintStream err = System.err;
                final StringBuilder j = fu8.j("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                j.append(Arrays.toString(ip9.c));
                err.println(j.toString());
                return ip9.b;
            }
            case 5: {
                return (ip9)new ip9.ip9$a("cubic(0.4, 0.0, 0.2, 1)");
            }
            case 4: {
                return (ip9)new ip9.ip9$a("cubic(0.34, 1.56, 0.64, 1)");
            }
            case 3: {
                return (ip9)new ip9.ip9$a("cubic(1, 1, 0, 0)");
            }
            case 2: {
                return (ip9)new ip9.ip9$a("cubic(0.36, 0, 0.66, -0.56)");
            }
            case 1: {
                return (ip9)new ip9.ip9$a("cubic(0.0, 0.0, 0.2, 0.95)");
            }
            case 0: {
                return (ip9)new ip9.ip9$a("cubic(0.4, 0.05, 0.8, 0.7)");
            }
        }
    }
    
    public double a(final double n) {
        return n;
    }
    
    public double b(final double n) {
        return 1.0;
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
