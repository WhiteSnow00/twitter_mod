import android.view.View;
import java.util.List;
import java.util.Collection;
import android.widget.ProgressBar;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f3g implements y94
{
    public final ViewGroup C0;
    public final ProgressBar D0;
    public u4 E0;
    public Collection<e2> F0;
    
    public f3g(final ViewGroup c0) {
        this.C0 = c0;
        final ProgressBar d0 = (ProgressBar)((View)c0).findViewById(2131429856);
        pf8.r(d0);
        final ProgressBar progressBar = d0;
        this.D0 = d0;
    }
    
    public static void a(final f3g f3g) {
        ((View)f3g.D0).setVisibility(8);
        ((View)f3g.C0).setBackgroundColor(0);
    }
    
    public final void g(final u4 e0) {
        this.E0 = e0;
        final List w = ijf.w((Object)new xx0(e0, (xx0$a)new a3g(this)), (Object[])new e2[] { (e2)new vnk((vnk$a)new b3g(this)), (e2)new gnk((gnk$a)new c3g(this)), (e2)new h0h((h0h$a)new d3g(this)), (e2)new p0((p0$a)new e3g(this)).d });
        this.F0 = w;
        e0.e.k((Collection)w);
    }
    
    public final void h() {
        ((View)this.D0).setVisibility(8);
        ((View)this.C0).setBackgroundColor(0);
    }
    
    public final void unbind() {
        final u4 e0 = this.E0;
        if (e0 != null) {
            final List f0 = this.F0;
            if (f0 != null) {
                e0.e.Z((Collection)f0);
            }
        }
    }
}
