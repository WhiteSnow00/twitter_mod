import java.util.List;
import android.view.View$OnClickListener;
import java.util.Collection;
import android.view.View;
import com.twitter.media.av.ui.control.VideoControlView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xas implements a94
{
    public final ViewGroup D0;
    public final VideoControlView E0;
    public final View F0;
    public w4 G0;
    public Collection<f2> H0;
    public boolean I0;
    
    public xas(final ViewGroup d0) {
        this.I0 = false;
        this.D0 = d0;
        this.E0 = (VideoControlView)((View)d0).findViewById(2131432555);
        this.F0 = ((View)d0).findViewById(2131432564);
    }
    
    public final void g(final w4 g0) {
        this.G0 = g0;
        final List w = rif.w((Object)new j0h((j0h$a)new j0h$a(this) {
            public final xas a;
            
            public final void a() {
            }
            
            public final void b() {
                final xas a = this.a;
                final VideoControlView e0 = a.E0;
                if (e0 != null) {
                    e0.g();
                }
                final View f0 = a.F0;
                if (f0 != null && a.I0) {
                    ec0.c(f0);
                }
            }
        }), (Object[])new f2[] { (f2)new mrg((mrg$a)new dga((Object)this, (Object)g0, 5)) });
        this.H0 = w;
        this.G0.e.l((Collection)w);
        final int type = g0.b.c1.getType();
        if (type != 3 && type != 2) {
            ((View)this.D0).setOnClickListener((View$OnClickListener)new was((Object)this, (Object)g0, 0));
        }
        else {
            ((View)this.D0).setOnClickListener((View$OnClickListener)new sy((Object)g0, 2));
        }
    }
    
    public final void h() {
        ((View)this.D0).setOnClickListener((View$OnClickListener)null);
        final VideoControlView e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
        final View f0 = this.F0;
        if (f0 != null) {
            f0.setVisibility(8);
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
