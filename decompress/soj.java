import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class soj
{
    public static final b d;
    public static final soj e;
    public final String a;
    public final edq b;
    public final List<pbm> c;
    
    static {
        d = new b();
        e = new soj("", edq.g(0, 0));
    }
    
    public soj(final String a, final edq b) {
        final gdd$b e0 = gdd.E0;
        final int a2 = c5j.a;
        this.a = a;
        this.b = b;
        this.c = (List<pbm>)e0;
    }
    
    public soj(final soj$a soj$a) {
        this.a = soj$a.a;
        this.b = soj$a.b;
        Object c = soj$a.c;
        if (c == null) {
            c = gdd.E0;
            final int a = c5j.a;
        }
        this.c = (List<pbm>)c;
    }
    
    public final boolean a(final soj soj) {
        return this == soj || (soj != null && c5j.a((Object)this.a, (Object)soj.a) && c5j.a((Object)this.b, (Object)soj.b) && c5j.a((Object)this.c, (Object)soj.c));
    }
    
    public final boolean b() {
        return this.a.isEmpty() ^ true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof soj && this.a((soj)o));
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class b extends zr2<soj, soj$a>
    {
        public b() {
            super(2);
        }
        
        public final void f(wlp x, final Object o) throws IOException {
            final soj soj = (soj)o;
            x = x.E(soj.a).x(soj.b.a).x(soj.b.b);
            final List<pbm> c = soj.c;
            final vp4$a vp4$a = new vp4$a((rlp)pbm.e);
            Objects.requireNonNull(x);
            ((y4j)vp4$a).c(x, (Object)c);
            final int a = c5j.a;
        }
        
        public final n4j g() {
            return (n4j)new soj$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final soj$a soj$a = (soj$a)n4j;
            soj$a.a = vlp.A();
            soj$a.b = edq.g(vlp.x(), vlp.x());
            List d;
            if (n < 2) {
                d = vp4.d(vlp, (rlp)pbm.e);
            }
            else {
                d = (List)((y4j)new vp4$a((rlp)pbm.e)).a(vlp);
            }
            soj$a.c = d;
        }
    }
}
