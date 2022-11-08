import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.analytics.ondevicemetrics.OnDeviceMetricsSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohj extends rp1<OnDeviceMetricsSchema>
{
    public static final ohj.ohj$a Companion;
    
    static {
        Companion = new ohj.ohj$a();
    }
    
    public ohj(final Context context, final iev$b iev$b, final ecb ecb, final xau xau, final cl0 cl0) {
        zzd.f((Object)context, "context");
        zzd.f((Object)iev$b, "factory");
        zzd.f((Object)ecb, "flushDatabaseManager");
        zzd.f((Object)xau, "twPreferences");
        zzd.f((Object)cl0, "appConfig");
        super(context, (Class)OnDeviceMetricsSchema.class, "on_device_metrics", 1, iev$b, UserIdentifier.LOGGED_OUT, ecb, xau, cl0);
    }
    
    public final void i0(final tyr tyr, final nwo nwo, final int n, final int n2) {
        ((wk1)new phj(nwo, tyr)).e(n, n2, (fhj)((bra)r98.Companion.a()).a((Object)"on_device_metrics"));
    }
}
