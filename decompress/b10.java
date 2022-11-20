import java.util.Iterator;
import java.util.Map;
import com.twitter.analytics.service.core.diagnostics.AnalyticsPipelineDataLossException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b10
{
    public static final a Companion;
    public final uew a;
    
    static {
        Companion = new a();
    }
    
    public b10(final uew a) {
        czd.f((Object)a, "userManager");
        this.a = a;
    }
    
    public final boolean a() {
        return asa.d().b("android_scribe_loss_reporting_enabled", false);
    }
    
    public final void b(final a10 a10) {
        if (this.a() && ((AnalyticsPipelineDataLossException)a10.b).E0.b()) {
            final h8a h8a = new h8a((Throwable)a10.b);
            String stringId;
            if ((stringId = (String)a10.c) == null) {
                stringId = this.a.b().getStringId();
            }
            h8a.b("user_id", (Object)stringId);
            h8a.b("logs_count", (Object)a10.a);
            for (final Map.Entry<String, V> entry : ((Map)a10.d).entrySet()) {
                h8a.b((String)entry.getKey(), (Object)entry.getValue());
            }
            m8a.c(h8a);
        }
    }
    
    public static final class a
    {
    }
}
