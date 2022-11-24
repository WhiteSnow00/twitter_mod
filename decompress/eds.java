import java.io.IOException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eds extends fk8<ofi, ids>
{
    public final int c;
    public final Context d;
    public final do0 e;
    public final boolean f;
    
    public eds(final int c, final Context d, final do0 e) {
        super(ids.class, "task_new_flow_request");
        this.c = c;
        this.d = d;
        this.f = ita.b().b("auth_timeline_token_tracking_enabled", false);
        this.e = e;
    }
    
    public final int g() {
        return this.c;
    }
    
    @Override
    public final void i(final trc$a trc$a, final Object o) {
        final ofi ofi = (ofi)o;
        ny0.a(trc$a, this.d, "Unable to get system user agent for OCF.", this.e);
        trc$a.e = asc$b.I0;
        final int a = o5j.a;
        trc$a.m(ofi.a);
        trc$a.d("flow_name", ofi.b);
        trc$a.c("api_version", 1L);
        trc$a.d("known_device_token", fcu.c().j("kdt", ""));
        final String b = ehk.b().b();
        if (flr.g((CharSequence)b)) {
            trc$a.d("sim_country_code", b);
        }
        if (this.f) {
            final String b2 = u51.b();
            if (flr.g((CharSequence)b2)) {
                trc$a.l("att", b2);
            }
        }
        try {
            final qkr d = new qkr(fjh.a((Object)ofi.c), "UTF-8");
            ((zb)d).e("application/json");
            trc$a.d = (vrc)d;
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
        }
    }
}
