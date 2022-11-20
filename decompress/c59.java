import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c59 implements a94
{
    public final tyw D0;
    public w4 E0;
    public Collection<f2> F0;
    
    public c59(final tyw d0) {
        this.D0 = d0;
    }
    
    public final void g(final w4 e0) {
        this.E0 = e0;
        final String z0 = nza.Z0(e0.b.c1);
        Object o;
        if (e0.b.c1.getType() == 7 && e0.a() != null) {
            o = new mfx(e0.a(), (mfx$a)new y4w((Object)this, (Object)z0, 3));
        }
        else {
            o = new j0h((j0h$a)new j0h$a(this, z0) {
                public final String a;
                public final c59 b;
                
                public final void a() {
                }
                
                public final void b() {
                    this.b.D0.d(this.a, (i49)dfq.g);
                }
            });
        }
        final List v = rif.v(o);
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
