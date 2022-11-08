import android.content.Context;
import com.twitter.weaver.mvi.MviViewModel;
import java.util.Objects;
import com.twitter.notifications.settings.compose.NotificationSettingsNewViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvi
{
    public static final void a(final mbi<?> mbi, NotificationSettingsNewViewModel notificationSettingsNewViewModel, final m76 m76, final int n, final int n2) {
        zzd.f((Object)mbi, "navigator");
        final m76 h = m76.h(-1556822776);
        if ((n2 & 0x2) != 0x0) {
            notificationSettingsNewViewModel = (NotificationSettingsNewViewModel)((n8x)h.m((re6)skx.a)).a.c((a9x)new a9x$b(new r8x((Class)NotificationSettingsNewViewModel.class, "")));
        }
        final ea6$b a = ea6.a;
        final cvi$b cvi$b = new cvi$b((ap6)null);
        h.x(-301010798);
        h.x(773894976);
        h.x(-492369756);
        final Object y = h.y();
        Objects.requireNonNull(m76.Companion);
        ue6 d;
        if ((d = (ue6)y) == m76$a.b) {
            d = rb0.d(jgw.A(h), h);
        }
        h.O();
        final yy6 c0 = d.C0;
        h.O();
        jgw.g((Object)notificationSettingsNewViewModel, (Object)c0, (gub)new cvi$a((MviViewModel)notificationSettingsNewViewModel, c0, nkz.v((Object)cvi$b, h), (ap6)null), h);
        h.O();
        final q7r z = k3j.z((MviViewModel)notificationSettingsNewViewModel, (oy6)null, h, 1);
        final Context context = (Context)h.m((re6)a30.b);
        iui.c(b((q7r<dvi>)z).a, ((dvi)z.getValue()).f, ((dvi)z.getValue()).d, ((dvi)z.getValue()).e, (rtb)new cvi$c((mbi)mbi, notificationSettingsNewViewModel), (otb)new cvi$d((mbi)mbi), (jkh)null, h, 0, 64);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new cvi$e((mbi)mbi, notificationSettingsNewViewModel, n, n2));
        }
    }
    
    public static final dvi b(final q7r<dvi> q7r) {
        return (dvi)q7r.getValue();
    }
}
