import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xpv
{
    public static final rlp<xpv> d;
    public final boolean a;
    public final String b;
    public final List<jov> c;
    
    static {
        xpv.d = new xpv.xpv$a();
    }
    
    public xpv(final boolean a, final String b, final List<jov> list) {
        this.a = a;
        this.b = b;
        Object d0 = list;
        if (list == null) {
            d0 = f2a.D0;
        }
        this.c = (List<jov>)d0;
    }
}
