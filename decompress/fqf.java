import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqf implements y94
{
    public final bh2 C0;
    public u4 D0;
    public Collection<e2> E0;
    
    public fqf(final bh2 c0) {
        this.C0 = c0;
    }
    
    public final void g(final u4 d0) {
        this.D0 = d0;
        final List v = ijf.v((Object)new xx0(d0, (xx0$a)new xx0$a() {
            public final void a() {
                fqf.this.C0.a(d0.b.b1).a(d0);
            }
            
            public final void b() {
                fqf.this.C0.a(d0.b.b1).i(d0);
            }
        }));
        this.E0 = (ced)v;
        this.D0.e.k((Collection)v);
    }
    
    public final void h() {
    }
    
    public final void unbind() {
        final u4 d0 = this.D0;
        if (d0 != null) {
            final ced e0 = this.E0;
            if (e0 != null) {
                d0.e.Z((Collection)e0);
            }
        }
    }
}
