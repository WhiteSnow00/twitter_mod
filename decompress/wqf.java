import android.view.View;
import android.widget.TextView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqf implements ij3, vqf$a
{
    public final wqf.wqf$a D0;
    public final vqf E0;
    public gbh F0;
    
    public wqf(final wqf.wqf$a d0, final vqf e0) {
        this.D0 = d0;
        Objects.requireNonNull(this.E0 = e0);
        e0.c = (vqf$a)this;
    }
    
    public final void b(final jqf jqf) {
        v68.P(this.D0.a, jqf.e);
        final wqf.wqf$a d0 = this.D0;
        v68.P(d0.b, jqf.d);
        d0.c.k(8);
        final int n = 0;
        d0.d = false;
        final gbh f0 = this.F0;
        Label_0113: {
            if (f0 == null) {
                final gbh g = jqf.g;
                if (g != null) {
                    this.F0 = g;
                    this.D0.a(g);
                    break Label_0113;
                }
            }
            if (f0 != null) {
                this.D0.a(f0);
            }
        }
        final wqf.wqf$a d2 = this.D0;
        final boolean b = ((View)d2.b).getVisibility() == 0;
        int dimensionPixelSize = n;
        if (!b) {
            if (d2.d) {
                dimensionPixelSize = n;
            }
            else {
                dimensionPixelSize = ((View)d2.a).getResources().getDimensionPixelSize(2131166074);
            }
        }
        final TextView a = d2.a;
        a.setPaddingRelative(((View)a).getPaddingStart(), dimensionPixelSize, ((View)d2.a).getPaddingEnd(), ((View)d2.a).getPaddingBottom());
    }
    
    public final void j() {
        final vqf e0 = this.E0;
        final tqf d0 = tqf.D0;
        Objects.requireNonNull(e0);
        e0.c = (vqf$a)d0;
    }
    
    public final void k() {
        this.E0.b.a();
    }
    
    public final void l(final m9i m9i) {
        final vqf e0 = this.E0;
        e0.b.c((t19)((h5j)((wgm)e0.a).D0).distinctUntilChanged().subscribeWith((ccj)new sqf(e0)));
    }
}
