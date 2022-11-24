import java.util.List;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbc implements fa4
{
    public final ViewGroup F0;
    public final AutoPlayBadgeView G0;
    public final int H0;
    public q4 I0;
    public Collection<? extends d2> J0;
    public yaq<TextView> K0;
    public long L0;
    public int M0;
    public int N0;
    
    public pbc(final ViewGroup f0) {
        e0e.f((Object)f0, "root");
        this.F0 = f0;
        final View viewById = ((View)f0).findViewById(2131427723);
        e0e.e((Object)viewById, "root.findViewById(R.id.av_badge_container)");
        final AutoPlayBadgeView g0 = (AutoPlayBadgeView)viewById;
        this.G0 = g0;
        this.H0 = 720;
        this.L0 = g0.getDefaultPlayStartPosition();
        this.M0 = -1;
        this.N0 = -1;
    }
    
    public final void a(final q4 q4) {
        final h1 e1 = q4.b.e1;
        xtg xtg;
        if (e1 instanceof xtg) {
            xtg = (xtg)e1;
        }
        else {
            xtg = null;
        }
        final boolean b = false;
        boolean o2 = false;
        Label_0062: {
            if (xtg != null) {
                final hp6 g0 = xtg.G0;
                if (g0 != null) {
                    o2 = g0.O2();
                    break Label_0062;
                }
            }
            o2 = false;
        }
        if (!d4j.a0(q4.a()) && !o2) {
            final int n0 = this.N0;
            final int h0 = this.H0;
            int n2 = b ? 1 : 0;
            if (n0 >= h0) {
                n2 = (b ? 1 : 0);
                if (this.M0 >= h0) {
                    n2 = 1;
                }
            }
            if (n2 != 0) {
                final yaq<TextView> k0 = this.K0;
                if (k0 != null) {
                    k0.show();
                }
                return;
            }
        }
        final yaq<TextView> k2 = this.K0;
        if (k2 != null) {
            k2.a();
        }
    }
    
    public final void g(final q4 i0) {
        e0e.f((Object)i0, "attachment");
        if (this.G0 != null && x6.h(i0.b.e1.getType())) {
            if (((View)this.F0).findViewById(2131427727) != null) {
                this.K0 = (yaq<TextView>)new yaq((View)this.G0, 2131427727, 2131427727);
            }
            this.I0 = i0;
            final List y0 = shw.y0((Object[])new btv[] { (btv)new jxk((jxk$a)new o71((Object)this, (Object)i0, 5)), (btv)new l4x((l4x$a)new x83((Object)this, (Object)i0, 4)), (btv)new jil((jil$a)new vrx((Object)this, 8)), (btv)new rok((rok$a)new obc(this, i0)) });
            i0.e.l((Collection)y0);
            this.J0 = y0;
        }
    }
    
    public final void h() {
        final yaq<TextView> k0 = this.K0;
        if (k0 != null) {
            k0.a();
        }
    }
    
    public final void unbind() {
        final q4 i0 = this.I0;
        if (i0 != null) {
            final List j0 = this.J0;
            if (j0 != null) {
                i0.e.Y((Collection)j0);
            }
        }
    }
}
