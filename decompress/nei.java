import android.net.ConnectivityManager$NetworkCallback;
import android.content.Context;
import android.net.ConnectivityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nei extends qj6<mei>
{
    public final ConnectivityManager f;
    public final nei$a g;
    
    public nei(final Context context, final ycs ycs) {
        super(context, ycs);
        final Object systemService = super.b.getSystemService("connectivity");
        e0e.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)systemService;
        this.g = new nei$a(this);
    }
    
    public final Object a() {
        return oei.a(this.f);
    }
    
    public final void d() {
        try {
            jag.e().a(oei.a, "Registering network callback");
            zci.a(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            jag.e().d(oei.a, "Received exception while registering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            jag.e().d(oei.a, "Received exception while registering network callback", (Throwable)ex2);
        }
    }
    
    public final void e() {
        try {
            jag.e().a(oei.a, "Unregistering network callback");
            xci.c(this.f, (ConnectivityManager$NetworkCallback)this.g);
        }
        catch (final SecurityException ex) {
            jag.e().d(oei.a, "Received exception while unregistering network callback", (Throwable)ex);
        }
        catch (final IllegalArgumentException ex2) {
            jag.e().d(oei.a, "Received exception while unregistering network callback", (Throwable)ex2);
        }
    }
}
