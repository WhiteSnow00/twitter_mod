import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v3u implements qk6, a
{
    public final boolean a;
    public final List<a> b;
    public final int c;
    public final rm1<?, Float> d;
    public final rm1<?, Float> e;
    public final rm1<?, Float> f;
    
    public v3u(final tm1 tm1, final wrp wrp) {
        this.b = new ArrayList();
        Objects.requireNonNull(wrp);
        this.a = wrp.f;
        this.c = wrp.b;
        final rm1<Float, Float> v = wrp.c.V();
        this.d = (m6b)v;
        final rm1<Float, Float> v2 = wrp.d.V();
        this.e = (m6b)v2;
        final rm1<Float, Float> v3 = wrp.e.V();
        this.f = (m6b)v3;
        tm1.d((rm1)v);
        tm1.d((rm1)v2);
        tm1.d((rm1)v3);
        v.a((rm1.a)this);
        v2.a((rm1.a)this);
        v3.a((rm1.a)this);
    }
    
    public final void a() {
        for (int i = 0; i < this.b.size(); ++i) {
            ((a)this.b.get(i)).a();
        }
    }
    
    public final void b(final List<qk6> list, final List<qk6> list2) {
    }
    
    public final void d(final a a) {
        this.b.add(a);
    }
}
