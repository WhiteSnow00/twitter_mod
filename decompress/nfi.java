import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfi extends pn7
{
    public final List<bsa> e;
    
    public nfi(final nfi.nfi$a nfi$a) {
        super((pn7.a)nfi$a, 4);
        this.e = nfi$a.d;
    }
    
    public final String e() {
        final rt6 rt6 = (rt6)kr4.q(super.d);
        String a;
        if (rt6 != null) {
            a = rt6.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final h57 f() {
        for (final ct6 ct6 : super.b) {
            if (ct6 instanceof h57) {
                final int a = o5j.a;
                return (h57)ct6;
            }
        }
        return null;
    }
}
