import com.twitter.media.ui.image.c;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aid implements fa4
{
    public boolean F0;
    public boolean G0;
    public final kcx<veq> H0;
    public final e39 I0;
    public q4 J0;
    public Collection<d2> K0;
    public veq L0;
    
    public aid(final ViewGroup viewGroup) {
        final kcx h0 = new kcx((View)viewGroup, 2131431480, 2131431480, (gra)zhd.b);
        this.I0 = new e39();
        this.H0 = (kcx<veq>)h0;
    }
    
    public final void g(final q4 j0) {
        this.J0 = j0;
        final List w = ojf.w((Object)new jxk((jxk$a)new isx((Object)this, 6)), (Object[])new d2[] { (d2)new x3x((x3x$a)new gf8((Object)this, 9)), (d2)new jil((jil$a)new qo((Object)this, 7)), (d2)new rok((rok$a)new rok$a(this) {
                public final aid F0;
                
                public final void b() {
                }
                
                public final void d(final a3 a3, final r5 r5) {
                    final aid f0 = this.F0;
                    f0.F0 = true;
                    if (f0.G0) {
                        f0.H0.h();
                    }
                }
                
                public final void e(final a3 a3) {
                }
                
                public final void g() {
                    this.F0.F0 = false;
                }
                
                public final void j(final a3 a3) {
                    this.F0.F0 = false;
                }
                
                public final void k() {
                }
            }), (d2)new bok((bok$a)new bok$a(this) {
                public final aid a;
                
                public final void a() {
                }
                
                public final void b(final gtv gtv) {
                    this.a.F0 = false;
                }
            }) });
        this.K0 = w;
        j0.e.l((Collection)w);
    }
    
    public final void h() {
        final veq l0 = this.L0;
        if (l0 != null) {
            l0.G0.setVisibility(8);
            l0.H0.setVisibility(8);
            l0.I0.setText((CharSequence)null);
            ((c)l0.J0).q((z8d$a)null, true);
        }
    }
    
    public final void unbind() {
        final q4 j0 = this.J0;
        if (j0 != null) {
            final List k0 = this.K0;
            if (k0 != null) {
                j0.e.Y((Collection)k0);
            }
        }
        this.I0.a();
    }
}
