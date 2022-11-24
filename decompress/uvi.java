import android.content.Context;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.notifications.settings.compose.NotificationSettingsNewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uvi
{
    public static final void a(final fci<?> fci, NotificationSettingsNewViewModel notificationSettingsNewViewModel, final d86 d86, final int n, final int n2) {
        e0e.f((Object)fci, "navigator");
        final d86 h = d86.h(-1556822776);
        if ((n2 & 0x2) != 0x0) {
            notificationSettingsNewViewModel = (NotificationSettingsNewViewModel)((z9x)h.m((df6)bmx.a)).a.c((oax)new oax$b(new fax((Class)NotificationSettingsNewViewModel.class, "")));
        }
        final sa6$b a = sa6.a;
        final uvi$b uvi$b = new uvi$b((mp6)null);
        h.x(-301010798);
        h.x(773894976);
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(d86.Companion);
        gf6 c;
        if ((c = (gf6)y) == d86$a.b) {
            c = j00.c(shw.y(h), h);
        }
        h.O();
        final iz6 f0 = c.F0;
        h.O();
        shw.i((Object)notificationSettingsNewViewModel, (Object)f0, (hub)new uvi$a((MviViewModel)notificationSettingsNewViewModel, f0, zzz.h0((Object)uvi$b, h), (mp6)null), h);
        h.O();
        final l9r n3 = eg8.N0(notificationSettingsNewViewModel, null, h, 1);
        final Context context = (Context)h.m((df6)z20.b);
        avi.c(b((l9r<vvi>)n3).a, ((vvi)n3.getValue()).f, ((vvi)n3.getValue()).d, ((vvi)n3.getValue()).e, (stb)new uvi$c((fci)fci, notificationSettingsNewViewModel), (ptb)new uvi$d((fci)fci), (dlh)null, h, 0, 64);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new uvi$e((fci)fci, notificationSettingsNewViewModel, n, n2));
        }
    }
    
    public static final vvi b(final l9r<vvi> l9r) {
        return (vvi)l9r.getValue();
    }
}
