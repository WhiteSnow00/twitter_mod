import com.twitter.media.av.ui.ClosedCaptionsView;
import java.util.List;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ztf extends x59
{
    public cuf m;
    
    public ztf(final y59 y59, final z59 z59, final b79 b79, final WindowManager windowManager, final sq9 sq9, final o4c o4c) {
        super(y59, z59, b79, windowManager, sq9, o4c);
        this.m = (cuf)y59;
    }
    
    public final void a() {
        super.b.a.a();
        super.b.e = null;
        this.m.P0.dispose();
    }
    
    public final void b(final boolean b) {
        final cuf m = this.m;
        m.P0.e();
        m.P0.a(m.O0.b().subscribe((rk6)new auf(m, b)));
        m.P0.a(m.O0.a().subscribe((rk6)new dbg(m, 5)));
    }
    
    public final boolean c() {
        final cuf m = this.m;
        return lk4.b(m.T0, m.S0);
    }
    
    public final void d(final r2 r2) {
        final cuf m = this.m;
        final List<v87> a = lk4.a(r2);
        final ClosedCaptionsView r3 = m.R0;
        if (r3 != null) {
            r3.setSubtitles((List)a);
        }
    }
}
