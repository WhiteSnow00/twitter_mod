import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vdi extends ki6<udi>
{
    public final ConnectivityManager f;
    public final vdi$a g;
    
    public vdi(final Context context, final gcs gcs) {
        super(context, gcs);
        final Object systemService = super.b.getSystemService("connectivity");
        czd.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)systemService;
        this.g = new vdi$a(this);
    }
    
    @Override
    public final Object a() {
        return wdi.a(this.f);
    }
    
    @Override
    public final void d() {
        try {
            o9g.e().a(wdi.a, "Registering network callback");
            ici.a(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            o9g.e().d(wdi.a, "Received exception while registering network callback", ex);
        }
        catch (final IllegalArgumentException ex2) {
            o9g.e().d(wdi.a, "Received exception while registering network callback", ex2);
        }
    }
    
    @Override
    public final void e() {
        try {
            o9g.e().a(wdi.a, "Unregistering network callback");
            gci.c(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            o9g.e().d(wdi.a, "Received exception while unregistering network callback", ex);
        }
        catch (final IllegalArgumentException ex2) {
            o9g.e().d(wdi.a, "Received exception while unregistering network callback", ex2);
        }
    }
}
