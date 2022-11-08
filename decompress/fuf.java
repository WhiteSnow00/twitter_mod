import android.view.View;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collection;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuf implements y94
{
    public final guf C0;
    public final fuf.fuf$a D0;
    public final Resources E0;
    public final wsf F0;
    public u4 G0;
    public Collection<e2> H0;
    
    public fuf(final guf c0, final fuf.fuf$a d0, final Resources e0, final wsf f0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final vo6 a() {
        final u4 g0 = this.G0;
        if (g0 == null) {
            return null;
        }
        return ajy.B(g0.b.b1);
    }
    
    public final void b() {
        final vo6 a = this.a();
        if (a == null) {
            return;
        }
        final fuf.fuf$a d0 = this.D0;
        Objects.requireNonNull(d0);
        final p1v p1v = new p1v();
        p1v.g(a);
        p1v.b(d0.a);
    }
    
    public final void g(final u4 g0) {
        this.G0 = g0;
        final ArrayList h0 = new ArrayList();
        h0.add(new vnk((vnk$a)new euf(this)));
        if (this.F0.b()) {
            h0.add(new vnk((vnk$a)new duf(this)));
        }
        else {
            this.C0.l0((View$OnClickListener)new ry((Object)this, 5));
        }
        ((View)this.C0.D0).setOnClickListener((View$OnClickListener)new qi2((Object)this, 4));
        this.H0 = h0;
        this.G0.e.k((Collection)h0);
    }
    
    public final void h() {
        final guf c0 = this.C0;
        c0.l0((View$OnClickListener)null);
        ((View)c0.D0).setOnClickListener((View$OnClickListener)null);
        c0.D0.setText((CharSequence)null);
        ((View)c0.D0).setVisibility(8);
    }
    
    public final void unbind() {
        final u4 g0 = this.G0;
        if (g0 != null) {
            final ArrayList h0 = this.H0;
            if (h0 != null) {
                g0.e.Z((Collection)h0);
            }
        }
    }
}
