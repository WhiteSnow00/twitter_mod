// 
// Decompiled by Procyon v0.6.0
// 

public final class g4u extends y4j<e4u>
{
    public static final g4u b;
    public static final rlp<String> c;
    
    static {
        b = new g4u();
        g4u.c = lw6.f;
    }
    
    public g4u() {
        super(2);
    }
    
    public final Object d(final vlp vlp, final int n) {
        czd.f((Object)vlp, "input");
        final long y = vlp.y();
        final String a = vlp.A();
        czd.e((Object)a, "input.readNotNullString()");
        final long y2 = vlp.y();
        if (n < 1) {
            vlp.y();
        }
        if (n < 2) {
            vlp.s();
        }
        final Object z = vlp.z((rlp)g4u.c);
        czd.e(z, "input.readNotNullObject(MetadataSerializer)");
        final String s = (String)z;
        if (n < 1) {
            vlp.y();
        }
        return new e4u(y, a, y2, s);
    }
    
    public final void f(final wlp wlp, final Object o) {
        final e4u e4u = (e4u)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)e4u, "entry");
        wlp.y(e4u.c).E(e4u.d).y(e4u.e).A((Object)e4u.f, (rlp)g4u.c);
    }
}
