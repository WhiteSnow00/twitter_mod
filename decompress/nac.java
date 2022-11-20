import java.util.List;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nac implements a94
{
    public final ViewGroup D0;
    public final AutoPlayBadgeView E0;
    public final int F0;
    public w4 G0;
    public Collection<? extends f2> H0;
    public baq<TextView> I0;
    public long J0;
    public int K0;
    public int L0;
    
    public nac(final ViewGroup d0) {
        czd.f((Object)d0, "root");
        this.D0 = d0;
        final View viewById = ((View)d0).findViewById(2131427723);
        czd.e((Object)viewById, "root.findViewById(R.id.av_badge_container)");
        final AutoPlayBadgeView e0 = (AutoPlayBadgeView)viewById;
        this.E0 = e0;
        this.F0 = 720;
        this.J0 = e0.getDefaultPlayStartPosition();
        this.K0 = -1;
        this.L0 = -1;
    }
    
    public final void a(final w4 w4) {
        final i1 c1 = w4.b.c1;
        etg etg;
        if (c1 instanceof etg) {
            etg = (etg)c1;
        }
        else {
            etg = null;
        }
        final boolean b = false;
        boolean n2 = false;
        Label_0062: {
            if (etg != null) {
                final bo6 e0 = etg.E0;
                if (e0 != null) {
                    n2 = e0.N2();
                    break Label_0062;
                }
            }
            n2 = false;
        }
        if (!g63.I(w4.a()) && !n2) {
            final int l0 = this.L0;
            final int f0 = this.F0;
            int n3 = b ? 1 : 0;
            if (l0 >= f0) {
                n3 = (b ? 1 : 0);
                if (this.K0 >= f0) {
                    n3 = 1;
                }
            }
            if (n3 != 0) {
                final baq<TextView> i0 = this.I0;
                if (i0 != null) {
                    i0.show();
                }
                return;
            }
        }
        final baq<TextView> i2 = this.I0;
        if (i2 != null) {
            i2.a();
        }
    }
    
    public final void g(final w4 g0) {
        czd.f((Object)g0, "attachment");
        if (this.E0 != null && y6.h(g0.b.c1.getType())) {
            if (((View)this.D0).findViewById(2131427727) != null) {
                this.I0 = (baq<TextView>)new baq((View)this.E0, 2131427727, 2131427727);
            }
            this.G0 = g0;
            final List s = s9i.s((qsv)new swk((swk$a)new h71((Object)this, (Object)g0, 5)), (qsv)new t3x((t3x$a)new dga((Object)this, (Object)g0, 4)), (qsv)new xhl((xhl$a)new erx((Object)this, 8)), (qsv)new fok((fok$a)new mac(this, g0)));
            g0.e.l((Collection)s);
            this.H0 = s;
        }
    }
    
    public final void h() {
        final baq<TextView> i0 = this.I0;
        if (i0 != null) {
            i0.a();
        }
    }
    
    public final void unbind() {
        final w4 g0 = this.G0;
        if (g0 != null) {
            final List h0 = this.H0;
            if (h0 != null) {
                g0.e.Y((Collection)h0);
            }
        }
    }
}
