import java.util.Objects;
import com.twitter.util.serialization.util.OptionalFieldException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z63 extends y4j<x63>
{
    public static final z63 b;
    
    static {
        b = new z63();
    }
    
    public z63() {
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
        final Object a2 = z63.a.b.a(vlp);
        jee.l(a2);
        czd.e(a2, "input.readNotNullObject(MetadataSerializer)");
        final x63.b b = (x63.b)a2;
        if (n < 1) {
            vlp.y();
        }
        Label_0095: {
            if (n >= 2) {
                break Label_0095;
            }
            try {
                vlp.G();
                return new x63(y, a, y2, y3, b);
            }
            catch (final OptionalFieldException ex) {
                return new x63(y, a, y2, y3, b);
            }
        }
    }
    
    public final void f(wlp y, final Object o) {
        final x63 x63 = (x63)o;
        czd.f((Object)y, "output");
        czd.f((Object)x63, "entry");
        y = y.y(x63.c).E(x63.d).y(x63.e).y(x63.f);
        final x63.b g = x63.g;
        final a b = a.b;
        Objects.requireNonNull(y);
        b.c(y, (Object)g);
        final int a = c5j.a;
    }
    
    public static final class a extends y4j<x63.b>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            return new x63.b(vlp.G(), vlp.x(), vlp.G());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final x63.b b = (x63.b)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)b, "metadata");
            wlp.E(b.a).x(b.b).E(b.c);
        }
    }
}
