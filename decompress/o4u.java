import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o4u implements wl6, wm1$a
{
    public final boolean a;
    public final List<wm1$a> b;
    public final int c;
    public final wm1<?, Float> d;
    public final wm1<?, Float> e;
    public final wm1<?, Float> f;
    
    public o4u(final ym1 ym1, final rsp rsp) {
        this.b = new ArrayList();
        Objects.requireNonNull(rsp);
        this.a = rsp.f;
        this.c = rsp.b;
        final wm1<Float, Float> g = rsp.c.g();
        this.d = (o7b)g;
        final wm1<Float, Float> g2 = rsp.d.g();
        this.e = (o7b)g2;
        final wm1<Float, Float> g3 = rsp.e.g();
        this.f = (o7b)g3;
        ym1.d(g);
        ym1.d(g2);
        ym1.d(g3);
        g.a((wm1$a)this);
        g2.a((wm1$a)this);
        g3.a((wm1$a)this);
    }
    
    public final void a() {
        for (int i = 0; i < this.b.size(); ++i) {
            ((wm1$a)this.b.get(i)).a();
        }
    }
    
    public final void b(final List<wl6> list, final List<wl6> list2) {
    }
    
    public final void d(final wm1$a wm1$a) {
        this.b.add(wm1$a);
    }
}
