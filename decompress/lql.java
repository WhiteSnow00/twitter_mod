import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import android.os.Build$VERSION;
import com.twitter.notifications.settings.presenter.PushNotificationsSettingsContentViewProvider;
import java.util.Objects;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$e;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lql
{
    public final l4e<tui> a;
    public final sxi b;
    public final z5m c;
    public final pql d;
    public final Activity e;
    public final uvi f;
    public final UserIdentifier g;
    public final sui h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public boolean l;
    public final mbi<?> m;
    public final u9m n;
    public final rjq o;
    public final saw p;
    
    public lql(final Activity e, final pql d, final uvi f, final UserIdentifier g, final sui h, final l4e<tui> a, final ocw ocw, final ibm ibm, final boolean i, final int j, final mbi<?> m, final u9m n, final rjq o, final saw p14) {
        this.l = false;
        this.e = e;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = ocw.getUser().M0;
        this.a = a;
        final sxi b = new sxi((y4e)a, ibm);
        this.b = b;
        this.c = new z5m((RecyclerView$e)b);
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p14;
    }
    
    public final void a(final List<tui> list, final enp k0) {
        this.a.d((i4e)new skf((Iterable)list));
        final sxi b = this.b;
        b.K0 = k0;
        this.d.a.setAdapter((RecyclerView$e)b);
    }
    
    public final void b(final List<oui> d, final boolean b) {
        if (!this.a.c()) {
            return;
        }
        int n = 0;
        final i4e f = this.a.f();
        Objects.requireNonNull(f);
        final i4e$b i4e$b = new i4e$b(f);
        while (i4e$b.hasNext()) {
            final tui tui = (tui)((bgz)i4e$b).next();
            if (tui instanceof qxi) {
                final qxi qxi = (qxi)tui;
                String j;
                if (b) {
                    j = "on";
                }
                else {
                    j = ((mui)qxi).a.j;
                }
                ((mui)qxi).b = j;
                qxi.d = d;
                break;
            }
            ++n;
        }
        this.c.g(n);
    }
    
    public final void c(final hql hql, final List<oui> list, final enp enp, final boolean b) {
        final vpp a = hql.a;
        final Map<String, String> b2 = hql.b();
        final ijf h = ijf.H();
        if (this.o.a()) {
            final ijf h2 = ijf.H();
            final Iterator iterator = a.c.iterator();
            String s = "";
            while (iterator.hasNext()) {
                final vpp$b vpp$b = (vpp$b)iterator.next();
                final List w = ijf.w((Object)"NewsSetting", (Object[])new String[] { "RecommendationsSetting" });
                final Iterator iterator2 = vpp$b.c.iterator();
                String s2 = s;
                while (true) {
                    s = s2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final vpp$c vpp$c = (vpp$c)iterator2.next();
                    final String a2 = vpp$c.a;
                    final String s3 = b2.get(a2);
                    if (!w.contains(a2)) {
                        continue;
                    }
                    String b3 = s2;
                    if (s2.isEmpty()) {
                        b3 = vpp$b.b;
                    }
                    if ("NewsSetting".equalsIgnoreCase(a2)) {
                        h2.o(0, (Object)new mui(vpp$c, s3, b));
                        s2 = b3;
                    }
                    else {
                        h2.p((Object)new mui(vpp$c, s3, b));
                        s2 = b3;
                    }
                }
            }
            new(fvj.class)();
            pf8.r(h2);
            if (!h2.isEmpty()) {
                final String string = ((Context)this.e).getResources().getString(2131957865);
                pf8.r(s);
                h.p((Object)new nui(string));
                pf8.r(h2);
                h.q((Iterable)h2);
            }
            else {
                this.p.c((okm)new zf4(nca.f((ada)PushNotificationsSettingsContentViewProvider.p1, "", "", "no_items_soft_user")));
            }
        }
        else {
            for (final vpp$b vpp$b2 : a.c) {
                final ijf$a ijf$a = new ijf$a(vpp$b2.c.size());
                for (final vpp$c vpp$c2 : vpp$b2.c) {
                    final String s4 = b2.get(vpp$c2.a);
                    final String d = vpp$c2.d;
                    final String a3 = vpp$c2.a;
                    final String e = vpp$c2.e;
                    final String f = vpp$c2.f;
                    Objects.requireNonNull(lri.Companion);
                    final boolean b4 = dta.b().b("android_notifications_settings_in_network_recommendations_filter_enabled", false);
                    if ((d == null || (d.equals("vit-only") && this.k) || (d.equals("vit-off") && !this.k)) && (e == null || !e.equals("professional-only") || this.l)) {
                        if (a3.equals("TweetsSetting")) {
                            ((ijf)ijf$a).p((Object)new qxi(vpp$c2, s4, (List)list, b));
                        }
                        else {
                            if ((boolean)b4 && f != null && f.equals("split-in-network-setting")) {
                                continue;
                            }
                            ((ijf)ijf$a).p((Object)new mui(vpp$c2, s4, b));
                        }
                    }
                }
                if (!((ijf)ijf$a).isEmpty()) {
                    h.p((Object)new nui(vpp$b2.a));
                    h.q((Iterable)ijf$a);
                }
            }
        }
        if (h.isEmpty()) {
            this.h.b(true);
            return;
        }
        this.h.b(false);
        if (Build$VERSION.SDK_INT < 26 && this.i) {
            this.f.c(this.g).y(h6q.L()).G((fk6)new kql(this, b, h, enp), (fk6)x41.J0);
        }
        else {
            this.a((List<tui>)((h4j)h).e(), enp);
        }
    }
}
