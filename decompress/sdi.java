import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sdi extends ej6<rdi>
{
    public final ConnectivityManager f;
    public final sdi$a g;
    
    public sdi(final Context context, final lbs lbs) {
        super(context, lbs);
        final Object systemService = super.b.getSystemService("connectivity");
        zzd.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)systemService;
        this.g = new sdi$a(this);
    }
    
    public final Object a() {
        return tdi.a(this.f);
    }
    
    public final void d() {
        try {
            y9g.e().a(tdi.a, "Registering network callback");
            gci.a(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            y9g.e().d(tdi.a, "Received exception while registering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            y9g.e().d(tdi.a, "Received exception while registering network callback", (Throwable)ex2);
        }
    }
    
    public final void e() {
        try {
            y9g.e().a(tdi.a, "Unregistering network callback");
            eci.c(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            y9g.e().d(tdi.a, "Received exception while unregistering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            y9g.e().d(tdi.a, "Received exception while unregistering network callback", (Throwable)ex2);
        }
    }
}
