import com.twitter.notifications.settings.compose.NotificationSettingsNewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvi extends k76
{
    public final fci<?> H0;
    
    public nvi(final v76 v76, final fci<?> h0) {
        e0e.f((Object)v76, "composeDependencies");
        e0e.f((Object)h0, "navigator");
        super(v76);
        this.H0 = h0;
    }
    
    public final void a(final d86 d86, final int n) {
        final d86 h = d86.h(983106335);
        final sa6$b a = sa6.a;
        uvi.a(this.H0, null, h, 8, 2);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new nvi$a(this, n));
        }
    }
}
