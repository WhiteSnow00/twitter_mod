import android.widget.TextView;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqf implements a94
{
    public final eqf D0;
    public final a E0;
    public final xkp F0;
    public w4 G0;
    public Collection<? extends f2> H0;
    
    public bqf(final eqf d0, final a e0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = new xkp();
    }
    
    public final void g(final w4 g0) {
        czd.f((Object)g0, "avPlayerAttachment");
        this.G0 = g0;
        final xx0 e = g0.e;
        czd.e((Object)e, "avPlayerAttachment.eventDispatcher");
        final List s = s9i.s((qsv)new fok((fok$a)new cqf(this)), (qsv)new nnk((nnk$a)new dqf(this)));
        e.l((Collection)s);
        this.H0 = s;
    }
    
    public final void h() {
        final eqf d0 = this.D0;
        ((TextView)d0.E0.f()).setText((CharSequence)null);
        d0.a();
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
    
    public interface a
    {
        String a(final i1 p0);
    }
}
