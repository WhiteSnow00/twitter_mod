import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xdi extends vk2<udi>
{
    public final ConnectivityManager g;
    
    public xdi(final Context context, final gcs gcs) {
        super(context, gcs);
        final Object systemService = super.b.getSystemService("connectivity");
        czd.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)systemService;
    }
    
    @Override
    public final Object a() {
        return wdi.a(this.g);
    }
    
    @Override
    public final IntentFilter f() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }
    
    @Override
    public final void g(final Intent intent) {
        czd.f((Object)intent, "intent");
        if (czd.a((Object)intent.getAction(), (Object)"android.net.conn.CONNECTIVITY_CHANGE")) {
            o9g.e().a(wdi.a, "Network broadcast received");
            this.c(wdi.a(this.g));
        }
    }
}
