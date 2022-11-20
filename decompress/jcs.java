import java.io.IOException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcs extends aj8<tji, qcs>
{
    public final Context c;
    public final do0 d;
    public final ecs e;
    public final boolean f;
    
    public jcs(final Context c, final do0 d, final ecs e) {
        super((Class)qcs.class, "task_get_next_request");
        this.c = c;
        this.e = e;
        this.f = asa.b().b("auth_timeline_token_tracking_enabled", false);
        this.d = d;
    }
    
    public final int g() {
        return 1;
    }
    
    public final void i(final tqc$a tqc$a, Object d) {
        final tji tji = (tji)d;
        try {
            d = new ujr(rih.a((Object)tji.b), "UTF-8");
            try {
                ((yb)d).e("application/json");
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex) {
            d = null;
        }
        final IOException ex;
        m8a.d((Throwable)ex);
        if (this.f) {
            final String b = n51.b();
            if (ikr.g((CharSequence)b)) {
                tqc$a.l("att", b);
            }
        }
        final String s = (String)c5j.b((Object[])new String[] { this.e.b(tji.b.a), tji.a });
        jy0.a(tqc$a, this.c, "Unable to get system user agent for OCF.", this.d);
        tqc$a.e = arc$b.G0;
        final int a = c5j.a;
        tqc$a.m(s);
        tqc$a.d = (vqc)d;
        tqc$a.k();
    }
}
