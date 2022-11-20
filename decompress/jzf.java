import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzf implements fok$a
{
    public final lzf D0;
    
    public jzf(final lzf d0) {
        this.D0 = d0;
    }
    
    public final void c() {
    }
    
    public final void e(final g3 g3, final t5 t5) {
        final lzf d0 = this.D0;
        final w4 e0 = d0.E0;
        if (e0 != null && g63.I(e0.a())) {
            final lzf$a d2 = d0.D0;
            final w4 e2 = d0.E0;
            jee.l((Object)e2);
            d2.E0.k(0);
            final SkipWithCountDownBadgeView g4 = d2.G0;
            if (g4 != null) {
                g4.setAvPlayerAttachment(e2);
            }
            final AutoPlayBadgeView f0 = d2.F0;
            if (f0 != null) {
                final g3 a = e2.a();
                jee.l((Object)a);
                f0.setAvMedia(a);
                d2.F0.setAVDataSource(e2.b.c1);
                d2.F0.d();
                d2.F0.setTimeDurationVisibility(0);
            }
        }
        else {
            d0.D0.a();
        }
    }
    
    public final void g(final g3 g3) {
        this.D0.D0.a();
    }
    
    public final void i() {
    }
    
    public final void v(final g3 g3) {
        this.D0.D0.a();
    }
    
    public final void w() {
    }
}
