import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lta
{
    public final dta a;
    public final Set<ysa> b;
    public final String c;
    public final String d;
    
    public lta(final dta a, final Set<ysa> set, final String s, final String s2) {
        czd.f((Object)a, "config");
        this.a = a;
        Object d0 = set;
        if (set == null) {
            d0 = p2a.D0;
        }
        this.b = (Set<ysa>)d0;
        String c;
        if ((c = s) == null) {
            c = "";
        }
        this.c = c;
        String d2;
        if ((d2 = s2) == null) {
            d2 = "";
        }
        this.d = d2;
    }
}
