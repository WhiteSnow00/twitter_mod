import java.io.IOException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l6p
{
    public static final rlp<l6p> h;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final List<String> f;
    public final kvj<Integer, String> g;
    
    static {
        l6p.h = new b();
    }
    
    public l6p(final l6p$a l6p$a) {
        this.a = l6p$a.a;
        this.b = l6p$a.b;
        this.c = l6p$a.c;
        this.d = l6p$a.d;
        this.e = l6p$a.e;
        this.f = l6p$a.f;
        this.g = (kvj<Integer, String>)l6p$a.g;
    }
    
    public static final class b extends zr2<l6p, l6p$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final l6p l6p = (l6p)o;
            wlp.E(l6p.a);
            wlp.E(l6p.b);
            wlp.E(l6p.c);
            wlp.r(l6p.d);
            wlp.r(l6p.e);
            p0f.k(lw6.f, wlp, (List)l6p.f);
            final int a = c5j.a;
            final kvj<Integer, String> g = l6p.g;
            final lw6$i b = lw6.b;
            ((y4j)new sp4()).c(wlp, (Object)g);
        }
        
        public final n4j g() {
            return (n4j)new l6p$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final l6p$a l6p$a = (l6p$a)n4j;
            l6p$a.a = vlp.G();
            l6p$a.b = vlp.G();
            l6p$a.c = vlp.G();
            l6p$a.d = vlp.s();
            l6p$a.e = vlp.s();
            l6p$a.f = (List)da8.i(lw6.f, vlp);
            final lw6$i b = lw6.b;
            l6p$a.g = (kvj)((y4j)new sp4()).a(vlp);
        }
    }
}
