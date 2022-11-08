import com.twitter.notifications.settings.compose.NotificationSettingsNewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vui extends u66
{
    public final mbi<?> E0;
    
    public vui(final e76 e76, final mbi<?> e77) {
        zzd.f((Object)e76, "composeDependencies");
        zzd.f((Object)e77, "navigator");
        super(e76);
        this.E0 = e77;
    }
    
    public final void a(m76 h, final int n) {
        h = h.h(983106335);
        final ea6$b a = ea6.a;
        cvi.a(this.E0, null, h, 8, 2);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new vui$a(this, n));
        }
    }
}
