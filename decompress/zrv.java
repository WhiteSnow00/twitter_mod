import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zrv
{
    public static final rlp<zrv> e;
    public final c2u a;
    public final String b;
    @Deprecated
    public final int c;
    @Deprecated
    public final int d;
    
    static {
        zrv.e = new a();
    }
    
    public zrv(final c2u a, final String b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final class a extends y4j<zrv>
    {
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            final lw6$h a = lw6.a;
            final mw6 mw6 = new mw6((Class)c2u.class);
            Objects.requireNonNull(vlp);
            final Object a2 = ((y4j)mw6).a(vlp);
            jee.l(a2);
            return new zrv((c2u)a2, vlp.G(), vlp.x(), vlp.x());
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final zrv zrv = (zrv)o;
            final c2u a = zrv.a;
            final lw6$h a2 = lw6.a;
            final mw6 mw6 = new mw6((Class)c2u.class);
            Objects.requireNonNull(wlp);
            ((y4j)mw6).c(wlp, (Object)a);
            final int a3 = c5j.a;
            wlp.E(zrv.b).x(zrv.c).x(zrv.d);
        }
    }
}
