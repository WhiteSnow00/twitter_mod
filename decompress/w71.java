import android.view.View;
import com.twitter.media.av.ui.AutoPlayBadgeView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w71 implements rok$a
{
    public final y71 F0;
    
    public w71(final y71 f0) {
        this.F0 = f0;
    }
    
    public final void b() {
    }
    
    public final void d(final a3 a3, final r5 r5) {
        if (r5 != r5.I0) {
            final y71 f0 = this.F0;
            f0.K0 = true;
            final AutoPlayBadgeView g0 = f0.G0;
            if (g0 != null) {
                ((View)g0).setVisibility(0);
                f0.G0.d();
            }
        }
    }
    
    public final void e(final a3 a3) {
        y71.a(this.F0);
    }
    
    public final void g() {
        y71.a(this.F0);
    }
    
    public final void j(final a3 a3) {
        y71.a(this.F0);
    }
    
    public final void k() {
    }
}
