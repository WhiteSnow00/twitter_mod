import java.util.List;
import java.util.Map;
import com.twitter.util.serialization.util.SerializationException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zq7 extends y4j<xq7>
{
    public static final zq7 b;
    
    static {
        b = new zq7();
    }
    
    public zq7() {
        super(1);
    }
    
    public final Object d(final vlp vlp, final int n) {
        czd.f((Object)vlp, "input");
        final long y = vlp.y();
        final String a = vlp.A();
        czd.e((Object)a, "input.readNotNullString()");
        final long y2 = vlp.y();
        final long y3 = vlp.y();
        if (n < 1) {
            vlp.s();
        }
        final Object z = vlp.z((rlp)zq7.a.b);
        czd.e(z, "input.readNotNullObject(MetadataSerializer)");
        return new xq7(y, a, y2, (xq7$b)z, vlp.y(), y3, -1L, vlp.s());
    }
    
    public final void f(wlp wlp, final Object o) {
        final xq7 xq7 = (xq7)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)xq7, "entry");
        wlp = wlp.y(xq7.c).E(xq7.d).y(xq7.e).y(xq7.h);
        final xq7$b f = xq7.f;
        final a b = a.b;
        Objects.requireNonNull(wlp);
        b.c(wlp, (Object)f);
        final int a = c5j.a;
        wlp = wlp.y(xq7.g);
        wlp.r(xq7.k == 19);
    }
    
    public static final class a extends y4j<xq7$b>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public a() {
            super(2);
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            final long y = vlp.y();
            final ak1 ak1 = (ak1)((y4j)ak1.f).a(vlp);
            final String g = vlp.G();
            final boolean s = vlp.s();
            final boolean s2 = vlp.s();
            if (n < 2) {
                vlp.s();
                vlp.x();
            }
            cfu k0;
            try {
                final Object z = vlp.z((rlp)cfu.J0);
                czd.e(z, "{\n                input.\u2026SERIALIZER)\n            }");
                k0 = (cfu)z;
            }
            catch (final SerializationException ex) {
                m8a.d((Throwable)ex);
                k0 = cfu.K0;
                czd.e((Object)k0, "{\n                ErrorR\u2026ntent.EMPTY\n            }");
            }
            Object k2;
            if (n < 2) {
                k2 = new cfu(vlp.G(), (eku)((y4j)eku.i).a(vlp), (Map)null);
            }
            else {
                try {
                    k2 = vlp.z((rlp)cfu.J0);
                }
                catch (final SerializationException ex2) {
                    m8a.d((Throwable)ex2);
                    k2 = cfu.K0;
                }
            }
            Object d0;
            if ((d0 = ((y4j)new vp4$a((rlp)lyl.b)).a(vlp)) == null) {
                d0 = f2a.D0;
            }
            final gk1 gk1 = (gk1)((y4j)gk1.b).a(vlp);
            final long y2 = vlp.y();
            List d2;
            if (n < 1) {
                d2 = vp4.d(vlp, (rlp)dk1.b);
            }
            else {
                d2 = (List)((y4j)new vp4$a((rlp)dk1.b)).a(vlp);
            }
            Object d3 = d2;
            if (d2 == null) {
                d3 = f2a.D0;
            }
            final long y3 = vlp.y();
            czd.e(k2, "rawContent");
            return new xq7$b((cfu)k2, y, s, s2, (List)d0, g, k0, ak1, y2, y3, gk1, (List)d3, (String)null);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final xq7$b xq7$b = (xq7$b)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)xq7$b, "metadata");
            wlp.y(xq7$b.b);
            wlp.A((Object)xq7$b.h, (rlp)ak1.f);
            wlp.E(xq7$b.f);
            wlp.r(xq7$b.c);
            wlp.r(xq7$b.d);
            final cfu g = xq7$b.g;
            final cfu$b j0 = cfu.J0;
            wlp.A((Object)g, (rlp)j0);
            ((y4j)j0).c(wlp, (Object)xq7$b.a);
            final int a = c5j.a;
            ((y4j)new vp4$a((rlp)lyl.b)).c(wlp, (Object)xq7$b.e);
            wlp.A((Object)xq7$b.k, (rlp)gk1.b);
            wlp.y(xq7$b.i);
            fu8.n(dk1.b, wlp, xq7$b.l);
            wlp.y(xq7$b.j);
        }
    }
}
