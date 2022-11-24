import java.util.HashMap;
import android.os.Build$VERSION;
import android.os.Build;
import java.util.Objects;
import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.List;
import android.app.Notification;
import android.annotation.SuppressLint;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rri implements eo1
{
    public final Context a;
    public final pev b;
    public final wsi c;
    public final uwi d;
    public final ggr e;
    public final jgr f;
    public final erl g;
    public final dsi h;
    public final yri i;
    public final hv1 j;
    public final e39 k;
    public final aql l;
    public final rti m;
    public final tsc n;
    
    public rri(final Context a, final pev b, final wsi c, final uwi d, final erl g, final dsi h, final ggr e, final jgr f, final yri i, final hv1 j, final aql l, final rti m, final tsc n) {
        this.k = new e39();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.e = e;
        this.f = f;
        this.i = i;
        this.j = j;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static void j(final bti bti, final String s) {
        final fg4 fg4 = new fg4(bti.B);
        ((o1p)fg4).T = dda.g("notification", "", "push_layout", bti.h, s).toString();
        final int a = o5j.a;
        ((o1p)fg4).v = bti.c;
        ((o1p)fg4).A();
        nda.a().b(bti.B, (tlm)fg4);
    }
    
    @SuppressLint({ "CheckResult" })
    public final void a(final UserIdentifier userIdentifier, final String s) {
        this.g.d(userIdentifier, s).G((rk6)new n49(this, userIdentifier, s, String.valueOf(userIdentifier.hashCode()), 1), (rk6)lvb.e);
    }
    
    @SuppressLint({ "CheckResult" })
    public final void b(final UserIdentifier userIdentifier) {
        this.g.e(userIdentifier).w((rtb)vrf.R0).I(jxo.a()).y(jxo.a()).G((rk6)new des((Object)this, (Object)userIdentifier, 9), (rk6)lvb.e);
    }
    
    public final void c(final bti bti, final Notification notification) {
        this.h(iwi.d(), bti, notification);
    }
    
    @SuppressLint({ "CheckResult" })
    public final void d(final List<Long> list, final UserIdentifier userIdentifier) {
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("notification").authority(m61.a);
        uri$Builder.appendQueryParameter("user_id", Long.toString(userIdentifier.getId()));
        final String string = uri$Builder.toString();
        final Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.b.h(string, (long)iterator.next());
        }
        final int hashCode = userIdentifier.hashCode();
        this.g.b(userIdentifier, (List)list);
        this.i(userIdentifier, String.valueOf(hashCode));
    }
    
    public final void e(final bti bti, final iwi iwi) {
        final bbq bbq = (bbq)((gra)this.e).a((Object)bti);
        final bw7 bw7 = new bw7((Object)this, 4);
        Objects.requireNonNull(bbq);
        ((epg)new spg((idq)new ccq((idq)new hcq((idq)bbq, (rtb)bw7), (rk6)new wxw((Object)this, (Object)bti, (Object)iwi, 4)), (ouk)new f8f(bti, 8))).o((rk6)new jy0((Object)this, (Object)bti, (Object)iwi, 4), (rk6)lvb.e, (sj)lvb.c);
    }
    
    @SuppressLint({ "CheckResult" })
    public final void f(final UserIdentifier userIdentifier) {
        this.g.c(userIdentifier).G((rk6)new m2t((Object)this, (Object)userIdentifier, (Object)String.valueOf(userIdentifier.hashCode()), 1), (rk6)lvb.e);
    }
    
    public final void g(final iwi iwi, final fgr fgr, final bti bti) {
        Objects.requireNonNull(fgr);
        Object o;
        if (fgr instanceof ewr) {
            o = ged.G0;
            final int a = o5j.a;
        }
        else {
            o = fgr.d();
        }
        final Uri$Builder uri$Builder = new Uri$Builder();
        uri$Builder.scheme("notification").authority(m61.a);
        uri$Builder.appendQueryParameter("user_id", Long.toString(bti.B.getId()));
        final String string = uri$Builder.toString();
        for (final long longValue : o) {
            if (longValue != bti.a) {
                nag.a("NotificationController", "Notification already displaying, removing old one");
                this.b.h(string, longValue);
            }
        }
        final gri a2 = fgr.a(this.a, iwi);
        final t5j share = ((t5j)((gra)this.m).a((Object)bti)).share();
        share.filter((ouk)i71.f1).map((rtb)zvt.Q0).switchMap((rtb)new qri(this, a2, bti)).subscribe((rk6)new fr6((Object)this, (Object)bti, 4), (rk6)df3.K0);
        final t5j filter = share.filter((ouk)g71.Z0);
        boolean b = true;
        filter.flatMapMaybe((rtb)new si3((Object)this, (Object)a2, (Object)bti, 1)).subscribe((rk6)new o0p((Object)this, (Object)bti, 6), (rk6)yhd.M0);
        final Notification b2 = a2.b();
        if (b2 != null) {
            Label_0332: {
                if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                    final z0k f = bti.F;
                    if (f != null && f.a != null && d4j.y0() && ita.b().b("android_xiaomi_reflection_on_notification_object", false)) {
                        break Label_0332;
                    }
                }
                b = false;
            }
            if (b) {
                final e39 k = this.k;
                final bbq c = this.g.c(bti.B);
                final yvt q0 = yvt.Q0;
                Objects.requireNonNull(c);
                k.c(((bbq)new hcq((idq)c, (rtb)q0)).G((rk6)new pri(this, bti, b2, iwi, 0), (rk6)lvb.e));
            }
            else {
                this.h(iwi, bti, b2);
            }
        }
    }
    
    public final void h(final iwi iwi, final bti bti, final Notification notification) {
        try {
            final boolean a = this.d.a(bti.y, bti.h);
            final Uri$Builder uri$Builder = new Uri$Builder();
            uri$Builder.scheme("notification").authority(m61.a);
            uri$Builder.appendQueryParameter("user_id", Long.toString(bti.B.getId()));
            this.b.i(uri$Builder.toString(), bti.a, notification);
            if (a) {
                this.k(iwi, bti);
            }
        }
        catch (final RuntimeException b) {
            String t = ((o1p)this.f.d(bti, "fail")).T;
            if (t == null) {
                t = "unknown";
            }
            final m9a m9a = new m9a(bti.B.getId());
            ((HashMap<String, String>)m9a.a).put("notification-type", t);
            m9a.b = b;
            r9a.c(m9a);
        }
    }
    
    public final void i(final UserIdentifier userIdentifier, final String s) {
        if (this.h.c() && Build$VERSION.SDK_INT >= 26 && this.b.n(s) < 2) {
            final Uri$Builder uri$Builder = new Uri$Builder();
            uri$Builder.scheme("notification").authority(m61.a);
            uri$Builder.appendQueryParameter("user_id", Long.toString(userIdentifier.getId()));
            this.b.h(uri$Builder.toString(), flr.o(s, -1L));
        }
    }
    
    public final void k(final iwi iwi, final bti bti) {
        if (iwi.f || iwi.d || iwi.c != null) {
            iuk.k0(this.j, "impression");
            sbw.b((tlm)this.f.d(bti, "impression"));
            final UserIdentifier b = bti.B;
            if (mw.A(dsi.Companion, b, "userIdentifier", b, "android_notification_scribe_helper_request_enabled", false)) {
                this.n.f((osc)new a1p(bti.B));
            }
        }
    }
}
