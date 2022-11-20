import java.util.Objects;
import java.io.IOException;
import com.twitter.model.timeline.IllegalTileStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qps
{
    public static final rlp<qps> d;
    public final jba a;
    public final i8t b;
    public final sps c;
    
    static {
        qps.d = new b();
    }
    
    public qps(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qps.class == o.getClass()) {
            final qps qps = (qps)o;
            if (!c5j.a((Object)this.a, (Object)qps.a) || !c5j.a((Object)this.b, (Object)qps.b) || !c5j.a((Object)this.c, (Object)qps.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends n4j<qps>
    {
        public jba a;
        public i8t b;
        public sps c;
        
        public final Object i() {
            return new qps(this);
        }
        
        public final boolean l() {
            final boolean b = this.c != null;
            if (!b) {
                m8a.d((Throwable)new IllegalTileStateException("Illegal Tile state: mContent is null"));
            }
            return b;
        }
    }
    
    public static final class b extends zr2<qps, a>
    {
        public b() {
            super(1);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final qps qps = (qps)o;
            wlp.A((Object)qps.a, (rlp)jba.e);
            wlp.A((Object)qps.b, (rlp)i8t.a);
            wlp.A((Object)qps.c, (rlp)sps.a);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            String a2 = "";
            String a3;
            if (n < 1) {
                a2 = vlp.A();
                a3 = vlp.A();
            }
            else {
                a3 = "";
            }
            final jba.b e = jba.e;
            Objects.requireNonNull(vlp);
            a.a = (jba)((y4j)e).a(vlp);
            a.b = (i8t)((y4j)i8t.a).a(vlp);
            if (n < 1) {
                final sg1 c = (sg1)((y4j)sg1.d).a(vlp);
                final wps$a wps$a = new wps$a();
                wps$a.a = a2;
                wps$a.b = a3;
                wps$a.c = c;
                a.c = (sps)((n4j)wps$a).e();
            }
            else {
                a.c = (sps)vlp.z((rlp)sps.a);
            }
        }
    }
}
