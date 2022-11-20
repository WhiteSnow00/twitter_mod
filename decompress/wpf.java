import java.util.regex.Pattern;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wpf implements fok$a
{
    public final xpf D0;
    
    public wpf(final xpf d0) {
        this.D0 = d0;
    }
    
    public final void c() {
    }
    
    public final void e(final g3 g3, final t5 t5) {
        if (this.D0.H0.b()) {
            this.D0.I0.m0((View$OnClickListener)new ji2((Object)this, 3));
        }
        this.D0.o();
        final xpf d0 = this.D0;
        final w4 l0 = d0.L0;
        boolean b = false;
        Label_0093: {
            if (l0 != null && l0.a() != null) {
                final String type = d0.L0.a().getType();
                final Pattern a = ikr.a;
                if (czd.a((Object)type, (Object)"video")) {
                    b = true;
                    break Label_0093;
                }
            }
            b = false;
        }
        if (b) {
            this.D0.J0.d();
            this.D0.J0.c();
        }
    }
    
    public final void g(final g3 g3) {
        this.D0.J0.b();
        this.D0.I0.m0((View$OnClickListener)null);
    }
    
    public final void i() {
    }
    
    public final void v(final g3 g3) {
        this.D0.J0.a();
        this.D0.J0.b();
    }
    
    public final void w() {
    }
}
