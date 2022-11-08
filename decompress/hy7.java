import kotlin.NoWhenBranchMatchedException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hy7 extends gue implements rtb<wx7, Long>
{
    public static final hy7 C0;
    
    static {
        C0 = new hy7();
    }
    
    public hy7() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wx7 wx7 = (wx7)o;
        zzd.f((Object)wx7, "item");
        int n;
        if (wx7 instanceof wx7$h) {
            n = ((wx7$h)wx7).a.hashCode();
        }
        else if (wx7 instanceof wx7$c) {
            n = ((wx7$c)wx7).g().a.hashCode();
        }
        else if (wx7 instanceof wx7$f || wx7 instanceof wx7$b) {
            n = wx7.hashCode();
        }
        else {
            if (wx7 instanceof wx7$e$b) {
                return ((wx7$e$b)wx7).a.f.C0;
            }
            if (wx7 instanceof wx7$e$a) {
                n = ((wx7$e$a)wx7).a.b.hashCode();
            }
            else {
                if (!(wx7 instanceof wx7$d)) {
                    throw new NoWhenBranchMatchedException();
                }
                final long b = ((wx7$d)wx7).j().b;
                n = (int)(b ^ b >>> 32);
            }
        }
        return n;
    }
}
