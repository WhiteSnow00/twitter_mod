import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpf implements a94
{
    public final ug2 D0;
    public w4 E0;
    public Collection<f2> F0;
    
    public rpf(final ug2 d0) {
        this.D0 = d0;
    }
    
    public final void g(final w4 e0) {
        this.E0 = e0;
        final List v = rif.v((Object)new sx0(e0, (sx0$a)new sx0$a(this, e0) {
            public final w4 a;
            public final rpf b;
            
            public final void a() {
                this.b.D0.a(this.a.b.c1).a(this.a);
            }
            
            public final void b() {
                this.b.D0.a(this.a.b.c1).i(this.a);
            }
        }));
        this.F0 = (gdd)v;
        this.E0.e.l((Collection)v);
    }
    
    public final void h() {
    }
    
    public final void unbind() {
        final w4 e0 = this.E0;
        if (e0 != null) {
            final gdd f0 = this.F0;
            if (f0 != null) {
                e0.e.Y((Collection)f0);
            }
        }
    }
}
