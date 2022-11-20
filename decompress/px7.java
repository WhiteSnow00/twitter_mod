import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class px7 extends ste implements qsb<ex7, Long>
{
    public static final px7 D0;
    
    static {
        D0 = new px7();
    }
    
    public px7() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ex7 ex7 = (ex7)o;
        czd.f((Object)ex7, "item");
        int n;
        if (ex7 instanceof ex7$h) {
            n = ((ex7$h)ex7).a.hashCode();
        }
        else if (ex7 instanceof ex7$c) {
            n = ((ex7$c)ex7).g().a.hashCode();
        }
        else if (ex7 instanceof ex7$f || ex7 instanceof ex7$b) {
            n = ex7.hashCode();
        }
        else {
            if (ex7 instanceof ex7$e$b) {
                return ((ex7$e$b)ex7).a.f.D0;
            }
            if (ex7 instanceof ex7$e$a) {
                n = ((ex7$e$a)ex7).a.b.hashCode();
            }
            else {
                if (!(ex7 instanceof ex7$d)) {
                    throw new NoWhenBranchMatchedException();
                }
                final long b = ((ex7$d)ex7).j().b;
                n = (int)(b ^ b >>> 32);
            }
        }
        return n;
    }
}
