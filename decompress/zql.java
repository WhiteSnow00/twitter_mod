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

public final class zql
{
    public final q3e<uui> a;
    public final wxi b;
    public final p6m c;
    public final drl d;
    public final Activity e;
    public final vvi f;
    public final UserIdentifier g;
    public final tui h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public boolean l;
    public final obi<?> m;
    public final jam n;
    public final jkq o;
    public final cbw p;
    
    public zql(final Activity e, final drl d, final vvi f, final UserIdentifier g, final tui h, final q3e<uui> a, final adw adw, final xbm xbm, final boolean i, final int j, final obi<?> m, final jam n, final jkq o, final cbw p14) {
        this.l = false;
        this.e = e;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = adw.getUser().N0;
        this.a = a;
        final wxi b = new wxi((d4e)a, xbm);
        this.b = b;
        this.c = new p6m((RecyclerView$e)b);
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p14;
    }
    
    public final void a(final List<uui> list, final unp l0) {
        this.a.d((n3e)new ckf((Iterable)list));
        final wxi b = this.b;
        b.L0 = l0;
        this.d.a.setAdapter((RecyclerView$e)b);
    }
    
    public final void b(final List<pui> d, final boolean b) {
        if (!this.a.c()) {
            return;
        }
        int n = 0;
        final n3e f = this.a.f();
        Objects.requireNonNull(f);
        final n3e$b n3e$b = new n3e$b(f);
        while (n3e$b.hasNext()) {
            final uui uui = (uui)((pgz)n3e$b).next();
            if (uui instanceof txi) {
                final txi txi = (txi)uui;
                String j;
                if (b) {
                    j = "on";
                }
                else {
                    j = ((nui)txi).a.j;
                }
                ((nui)txi).b = j;
                txi.d = d;
                break;
            }
            ++n;
        }
        this.c.g(n);
    }
    
    public final void c(final vql vql, final List<pui> list, final unp unp, final boolean b) {
        final nqp a = vql.a;
        final Map<String, String> b2 = vql.b();
        final rif h = rif.H();
        if (this.o.a()) {
            final rif h2 = rif.H();
            final Iterator iterator = a.c.iterator();
            String s = "";
            while (iterator.hasNext()) {
                final nqp$b nqp$b = (nqp$b)iterator.next();
                final List w = rif.w((Object)"NewsSetting", (Object[])new String[] { "RecommendationsSetting" });
                final Iterator iterator2 = nqp$b.c.iterator();
                String s2 = s;
                while (true) {
                    s = s2;
                    if (!iterator2.hasNext()) {
                        break;
                    }
                    final nqp$c nqp$c = (nqp$c)iterator2.next();
                    final String a2 = nqp$c.a;
                    final String s3 = b2.get(a2);
                    if (!w.contains(a2)) {
                        continue;
                    }
                    String b3 = s2;
                    if (s2.isEmpty()) {
                        b3 = nqp$b.b;
                    }
                    if ("NewsSetting".equalsIgnoreCase(a2)) {
                        h2.o(0, (Object)new nui(nqp$c, s3, b));
                        s2 = b3;
                    }
                    else {
                        h2.p((Object)new nui(nqp$c, s3, b));
                        s2 = b3;
                    }
                }
            }
            new(kvj.class)();
            jee.l((Object)h2);
            final rif rif = h2;
            if (!h2.isEmpty()) {
                final String string = ((Context)this.e).getResources().getString(2131957865);
                jee.l((Object)s);
                h.p((Object)new oui(string));
                jee.l((Object)h2);
                h.q((Iterable)h2);
            }
            else {
                this.p.c((elm)new af4(vba.f((ica)PushNotificationsSettingsContentViewProvider.q1, "", "", "no_items_soft_user")));
            }
        }
        else {
            for (final nqp$b nqp$b2 : a.c) {
                final rif$a rif$a = new rif$a(nqp$b2.c.size());
                for (final nqp$c nqp$c2 : nqp$b2.c) {
                    final String s4 = b2.get(nqp$c2.a);
                    final String d = nqp$c2.d;
                    final String a3 = nqp$c2.a;
                    final String e = nqp$c2.e;
                    final String f = nqp$c2.f;
                    Objects.requireNonNull(nri.Companion);
                    final boolean b4 = asa.b().b("android_notifications_settings_in_network_recommendations_filter_enabled", false);
                    if ((d == null || (d.equals("vit-only") && this.k) || (d.equals("vit-off") && !this.k)) && (e == null || !e.equals("professional-only") || this.l)) {
                        if (a3.equals("TweetsSetting")) {
                            ((rif)rif$a).p((Object)new txi(nqp$c2, s4, (List)list, b));
                        }
                        else {
                            if ((boolean)b4 && f != null && f.equals("split-in-network-setting")) {
                                continue;
                            }
                            ((rif)rif$a).p((Object)new nui(nqp$c2, s4, b));
                        }
                    }
                }
                if (!((rif)rif$a).isEmpty()) {
                    h.p((Object)new oui(nqp$b2.a));
                    h.q((Iterable)rif$a);
                }
            }
        }
        if (h.isEmpty()) {
            this.h.b(true);
            return;
        }
        this.h.b(false);
        if (Build$VERSION.SDK_INT < 26 && this.i) {
            this.f.c(this.g).y(gmw.H()).G((lj6)new yql(this, b, h, unp), (lj6)wgd.O0);
        }
        else {
            this.a((List<uui>)((n4j)h).e(), unp);
        }
    }
}
