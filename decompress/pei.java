import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pei extends ll2<mei>
{
    public final ConnectivityManager g;
    
    public pei(final Context context, final ycs ycs) {
        super(context, ycs);
        final Object systemService = super.b.getSystemService("connectivity");
        e0e.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)systemService;
    }
    
    public final Object a() {
        return oei.a(this.g);
    }
    
    @Override
    public final IntentFilter f() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }
    
    @Override
    public final void g(final Intent intent) {
        e0e.f((Object)intent, "intent");
        if (e0e.a((Object)intent.getAction(), (Object)"android.net.conn.CONNECTIVITY_CHANGE")) {
            jag.e().a(oei.a, "Network broadcast received");
            this.c((Object)oei.a(this.g));
        }
    }
}
