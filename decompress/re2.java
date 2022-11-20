import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class re2 implements fok$a
{
    public final te2 D0;
    
    public re2(final te2 d0) {
        this.D0 = d0;
    }
    
    public final void c() {
    }
    
    public final void e(g3 a, final t5 t5) {
        czd.f((Object)a, "media");
        czd.f((Object)t5, "startType");
        final te2 d0 = this.D0;
        final w4 e0 = d0.E0;
        if (e0 != null) {
            a = e0.a();
        }
        else {
            a = null;
        }
        if (g63.I(a)) {
            final w4 e2 = d0.E0;
            if (e2 != null) {
                final ve2 d2 = d0.D0;
                Objects.requireNonNull(d2);
                d2.E0.k(0);
                final SkipWithCountDownBadgeView g0 = d2.G0;
                if (g0 != null) {
                    g0.setAvPlayerAttachment(e2);
                }
                final AutoPlayBadgeView f0 = d2.F0;
                if (f0 != null) {
                    f0.setAvMedia(e2.a());
                    f0.setAVDataSource(e2.b.c1);
                    f0.d();
                    f0.setTimeDurationVisibility(0);
                }
            }
        }
        else {
            d0.D0.a();
        }
    }
    
    public final void g(final g3 g3) {
        czd.f((Object)g3, "media");
        this.D0.D0.a();
    }
    
    public final void i() {
    }
    
    public final void v(final g3 g3) {
        czd.f((Object)g3, "media");
        this.D0.D0.a();
    }
    
    public final void w() {
    }
}
