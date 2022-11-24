import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.analytics.ondevicemetrics.OnDeviceMetricsSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iij extends sp1<OnDeviceMetricsSchema>
{
    public static final iij.iij$a Companion;
    
    static {
        Companion = new iij.iij$a();
    }
    
    public iij(final Context context, final rfv$b rfv$b, final ccb ccb, final gcu gcu, final xk0 xk0) {
        e0e.f((Object)context, "context");
        e0e.f((Object)rfv$b, "factory");
        e0e.f((Object)ccb, "flushDatabaseManager");
        e0e.f((Object)gcu, "twPreferences");
        e0e.f((Object)xk0, "appConfig");
        super(context, (Class)OnDeviceMetricsSchema.class, "on_device_metrics", 1, rfv$b, UserIdentifier.LOGGED_OUT, ccb, gcu, xk0);
    }
    
    public final void i0(final h0s h0s, final zxo zxo, final int n, final int n2) {
        ((vk1)new jij(zxo, h0s)).e(n, n2, (zhj)((gra)fa8.Companion.a()).a((Object)"on_device_metrics"));
    }
}
