import java.io.IOException;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcs extends aj8<wei, qcs>
{
    public final int c;
    public final Context d;
    public final do0 e;
    public final boolean f;
    
    public mcs(final int c, final Context d, final do0 e) {
        super((Class)qcs.class, "task_new_flow_request");
        this.c = c;
        this.d = d;
        this.f = asa.b().b("auth_timeline_token_tracking_enabled", false);
        this.e = e;
    }
    
    public final int g() {
        return this.c;
    }
    
    public final void i(final tqc$a tqc$a, final Object o) {
        final wei wei = (wei)o;
        jy0.a(tqc$a, this.d, "Unable to get system user agent for OCF.", this.e);
        tqc$a.e = arc$b.G0;
        final int a = c5j.a;
        tqc$a.m(wei.a);
        tqc$a.d("flow_name", wei.b);
        tqc$a.c("api_version", 1L);
        tqc$a.d("known_device_token", pbu.c().j("kdt", ""));
        final String b = x1b.c().b();
        if (ikr.g((CharSequence)b)) {
            tqc$a.d("sim_country_code", b);
        }
        if (this.f) {
            final String b2 = n51.b();
            if (ikr.g((CharSequence)b2)) {
                tqc$a.l("att", b2);
            }
        }
        try {
            final ujr d = new ujr(rih.a((Object)wei.c), "UTF-8");
            ((yb)d).e("application/json");
            tqc$a.d = (vqc)d;
        }
        catch (final IOException ex) {
            m8a.d((Throwable)ex);
        }
    }
}
