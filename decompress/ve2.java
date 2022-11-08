import com.twitter.media.av.ui.AutoPlayBadgeView;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ve2 implements vnk$a
{
    public final /* synthetic */ xe2 C0;
    
    public ve2(final xe2 c0) {
        this.C0 = c0;
    }
    
    public final void e(d3 a, final s5 s5) {
        zzd.f((Object)a, "media");
        zzd.f((Object)s5, "startType");
        final xe2 c0 = this.C0;
        final u4 d0 = c0.D0;
        if (d0 != null) {
            a = d0.a();
        }
        else {
            a = null;
        }
        if (rez.u(a)) {
            final u4 d2 = c0.D0;
            if (d2 != null) {
                final ze2 c2 = c0.C0;
                Objects.requireNonNull(c2);
                c2.D0.k(0);
                final SkipWithCountDownBadgeView f0 = c2.F0;
                if (f0 != null) {
                    f0.setAvPlayerAttachment(d2);
                }
                final AutoPlayBadgeView e0 = c2.E0;
                if (e0 != null) {
                    e0.setAvMedia(d2.a());
                    e0.setAVDataSource(d2.b.b1);
                    e0.d();
                    e0.setTimeDurationVisibility(0);
                }
            }
        }
        else {
            c0.C0.b();
        }
    }
    
    public final void f(final d3 d3) {
        zzd.f((Object)d3, "media");
        this.C0.C0.b();
    }
    
    public final void m(final d3 d3) {
        zzd.f((Object)d3, "media");
        this.C0.C0.b();
    }
}
