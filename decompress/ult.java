import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ult
{
    public static final nmp<ult> d;
    public final String a;
    public final pej b;
    public final List<vlt> c;
    
    static {
        ult.d = new ult.ult$b();
    }
    
    public ult(final ult.ult$a ult$a) {
        final String a = ult$a.a;
        vmw.g((Object)a);
        this.a = a;
        final pej b = ult$a.b;
        final pej n0 = pej.N0;
        pej b2 = b;
        if (b == null) {
            b2 = n0;
        }
        this.b = b2;
        Object c;
        if ((c = ult$a.c) == null) {
            c = h3a.F0;
        }
        this.c = (List<vlt>)c;
    }
}
