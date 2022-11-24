import java.util.List;
import android.view.View$OnClickListener;
import java.util.Collection;
import android.view.View;
import com.twitter.media.av.ui.control.VideoControlView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbs implements fa4
{
    public final ViewGroup F0;
    public final VideoControlView G0;
    public final View H0;
    public q4 I0;
    public Collection<d2> J0;
    public boolean K0;
    
    public pbs(final ViewGroup f0) {
        this.K0 = false;
        this.F0 = f0;
        this.G0 = (VideoControlView)((View)f0).findViewById(2131432556);
        this.H0 = ((View)f0).findViewById(2131432565);
    }
    
    public final void g(final q4 i0) {
        this.I0 = i0;
        final List w = ojf.w((Object)new b1h((b1h$a)new b1h$a(this) {
            public final pbs a;
            
            public final void a() {
            }
            
            public final void b() {
                final pbs a = this.a;
                final VideoControlView g0 = a.G0;
                if (g0 != null) {
                    g0.g();
                }
                final View h0 = a.H0;
                if (h0 != null && a.K0) {
                    fc0.c(h0);
                }
            }
        }), (Object[])new d2[] { (d2)new esg((esg$a)new x83((Object)this, (Object)i0, 5)) });
        this.J0 = w;
        this.I0.e.l((Collection)w);
        final int type = i0.b.e1.getType();
        if (type != 3 && type != 2) {
            ((View)this.F0).setOnClickListener((View$OnClickListener)new obs((Object)this, (Object)i0, 0));
        }
        else {
            ((View)this.F0).setOnClickListener((View$OnClickListener)new sy((Object)i0, 2));
        }
    }
    
    public final void h() {
        ((View)this.F0).setOnClickListener((View$OnClickListener)null);
        final VideoControlView g0 = this.G0;
        if (g0 != null) {
            g0.b();
        }
        final View h0 = this.H0;
        if (h0 != null) {
            h0.setVisibility(8);
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
