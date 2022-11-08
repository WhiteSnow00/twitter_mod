import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzf implements vnk$a
{
    public final /* synthetic */ a0g C0;
    
    public yzf(final a0g c0) {
        this.C0 = c0;
    }
    
    public final void e(final d3 d3, final s5 s5) {
        final a0g c0 = this.C0;
        final u4 d4 = c0.D0;
        if (d4 != null && rez.u(d4.a())) {
            final a0g.a0g$a c2 = c0.C0;
            final u4 d5 = c0.D0;
            pf8.r(d5);
            c2.D0.k(0);
            final SkipWithCountDownBadgeView f0 = c2.F0;
            if (f0 != null) {
                f0.setAvPlayerAttachment(d5);
            }
            final AutoPlayBadgeView e0 = c2.E0;
            if (e0 != null) {
                final d3 a = d5.a();
                pf8.r(a);
                e0.setAvMedia(a);
                c2.E0.setAVDataSource(d5.b.b1);
                c2.E0.d();
                c2.E0.setTimeDurationVisibility(0);
            }
        }
        else {
            c0.C0.b();
        }
    }
    
    public final void f(final d3 d3) {
        this.C0.C0.b();
    }
    
    public final void m(final d3 d3) {
        this.C0.C0.b();
    }
}
