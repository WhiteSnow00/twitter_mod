import java.util.List;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lth extends to1
{
    public final Pair a;
    public final mth$a b;
    
    public lth(final mth$a b, final Pair a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        so1.q(this.b.j());
    }
    
    public final void b() {
        synchronized (this.b) {
            final boolean remove = this.b.b.remove(this.a);
            List k = null;
            List l = null;
            List j = null;
            so1 f = null;
            Label_0093: {
                if (remove) {
                    if (!this.b.b.isEmpty()) {
                        k = this.b.k();
                        l = this.b.l();
                        j = this.b.j();
                        f = null;
                        break Label_0093;
                    }
                    f = this.b.f;
                }
                else {
                    f = null;
                }
                l = null;
                j = null;
            }
            monitorexit(this.b);
            so1.r(k);
            so1.s(l);
            so1.q(j);
            if (f != null) {
                if (this.b.h.c && !f.n()) {
                    so1.s(f.u(jzk.D0));
                }
                else {
                    f.t();
                }
            }
            if (remove) {
                ((jj6)this.a.first).a();
            }
        }
    }
    
    public final void c() {
        so1.s(this.b.l());
    }
    
    public final void d() {
        so1.r(this.b.k());
    }
}
