import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyj extends y4j<dyj>
{
    public static final fyj b;
    public static final rlp<List<exj>> c;
    
    static {
        b = new fyj();
        fyj.c = new vp4$a((rlp)exj.M0);
    }
    
    public fyj() {
        super(2);
    }
    
    public final Object d(final vlp vlp, final int n) {
        czd.f((Object)vlp, "input");
        final long y = vlp.y();
        final String a = vlp.A();
        czd.e((Object)a, "input.readNotNullString()");
        final long y2 = vlp.y();
        final long y3 = vlp.y();
        if (n < 2) {
            vlp.s();
        }
        final Object z = vlp.z((rlp)fyj.c);
        czd.e(z, "input.readNotNullObject<\u2026nt>?>(MetadataSerializer)");
        final List list = (List)z;
        if (n < 1) {
            vlp.y();
        }
        return new dyj(y, a, y2, y3, list);
    }
    
    public final void f(final wlp wlp, final Object o) {
        final dyj dyj = (dyj)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)dyj, "entry");
        wlp.y(dyj.c).E(dyj.d).y(dyj.e).y(dyj.f).A((Object)dyj.g, (rlp)fyj.c);
    }
}
