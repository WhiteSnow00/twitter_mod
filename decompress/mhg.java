import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import android.os.Message;
import android.os.Handler;
import com.twitter.notifications.settings.args.NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs;
import com.twitter.onboarding.connect.tab.PeopleDiscoveryContentViewArgs;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$c;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.a$a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.account.navigation.LoginArgs;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.fragment.app.Fragment;
import android.content.pm.PackageManager;
import java.util.List;
import com.twitter.analytics.tracking.c$a;
import com.twitter.util.connectivity.TwConnectivityChangeEvent;
import android.os.Build$VERSION;
import android.app.Activity;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.Objects;
import android.net.Uri;
import android.content.SharedPreferences$Editor;
import android.view.Menu;
import com.twitter.account.smartlock.ActivityBasedLoginAssistResultResolver;
import android.preference.PreferenceManager;
import android.view.View;
import com.twitter.app.common.account.d;
import com.twitter.account.smartlock.a;
import android.os.Bundle;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewResult;
import com.twitter.trustedfriends.TrustedFriendsMembersContentViewArgs;
import com.twitter.navigation.settings.TrendsPrefContentViewResult;
import com.twitter.navigation.settings.TrendsPrefContentViewArgs;
import android.content.SharedPreferences;
import com.twitter.analytics.tracking.c;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhg extends un6 implements vr2.b, c6g$a, zjt
{
    public static final Map<Long, Long> g2;
    public static int h2;
    public static int i2;
    public final wh6 A1;
    public final com.twitter.analytics.tracking.c B1;
    public final fxe<ngg> C1;
    public final mg5 D1;
    public final azi E1;
    public final m49 F1;
    public final lht G1;
    public final bpa H1;
    public final cor I1;
    public final h8v J1;
    public final vfg K1;
    public final fxe<zhg> L1;
    public final fxe<upa> M1;
    public final xrt N1;
    public final boolean O1;
    public final p1c P1;
    public final g7w Q1;
    public final wjc R1;
    public final ial S1;
    public final k62 T1;
    public final rjq U1;
    public final fxe<igg> V1;
    public final yzz W1;
    public final wue X1;
    public final b Y0;
    public final ibm Y1;
    public final ouj Z0;
    public final x2s Z1;
    public final dgg a1;
    public long a2;
    public final y6k b1;
    public int b2;
    public final m29 c1;
    public int c2;
    public final m29 d1;
    public boolean d2;
    public final m29 e1;
    public boolean e2;
    public final SharedPreferences f1;
    public boolean f2;
    public final SharedPreferences g1;
    public final fxe<xfg> h1;
    public final vwz i1;
    public final c j1;
    public final c6g k1;
    public final zfg l1;
    public final xn6<TrendsPrefContentViewArgs, TrendsPrefContentViewResult> m1;
    public final xn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> n1;
    public final egd o1;
    public final vn p1;
    public final fve q1;
    public final r4s r1;
    public final AppBarLayout s1;
    public final TabLayout t1;
    public final aig u1;
    public final t9j<tcx> v1;
    public final t9j<hkd> w1;
    public final n5t x1;
    public final tl9 y1;
    public final psc z1;
    
    static {
        mhg.g2 = (tth$a)tth.a(0);
        mhg.h2 = 0;
        mhg.i2 = 0;
    }
    
    public mhg(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob a, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier b, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final fve q1, final Context context, final vn p72, final r4s r1, final ouj z0, final dgg a2, final aig u1, final AppBarLayout s1, final fxe<xfg> h1, final qfv qfv, final ibm y1, final Bundle bundle, final TabLayout t1, final com.twitter.account.smartlock.a a3, final xuu xuu, final d d, final n5t x1, final View view, final sso sso, final tl9 y2, final psc z2, final wh6 a4, final com.twitter.analytics.tracking.c b2, final fxe<ngg> c1, final mg5 d2, final azi e1, final m49 f1, final lht g1, final bpa h2, final cor i1, final h8v j1, final vfg k1, final fxe<zhg> l1, final fxe<upa> m1, final xrt n1, final y6k b3, final egd o1, final zfg l2, final xn6<TrustedFriendsMembersContentViewArgs, TrustedFriendsMembersContentViewResult> n2, final ohw ohw, final p1c p73, final epb q2, final g7w r2, final wjc v1, final fxe<igg> s2, final ial t2, final k62 u2, final rjq rjq, final pca<zf9> w1, final yzz x2, final wue wue, final a8p z3, final x2s x2s) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, a, uaf, sag, layoutInflater, (pca)pca, b, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, (a8p)wue);
        this.c1 = new m29();
        this.d1 = new m29();
        this.e1 = new m29();
        ((x9)this).R4(view);
        this.X1 = (wue)x2;
        this.m1 = mbi.a(TrendsPrefContentViewResult.class);
        this.q1 = q1;
        final b y3 = new b(context);
        this.Y0 = y3;
        final c j2 = new c(y3);
        this.j1 = j2;
        this.p1 = p72;
        this.r1 = r1;
        this.Z0 = z0;
        this.a1 = a2;
        z0.a(resources.getDimensionPixelSize(2131165912));
        z0.h(2131231191);
        this.u1 = u1;
        this.s1 = s1;
        final SharedPreferences preferences = ((Activity)a).getPreferences(0);
        this.f1 = preferences;
        this.g1 = PreferenceManager.getDefaultSharedPreferences((Context)a);
        this.h1 = h1;
        this.L1 = l1;
        this.M1 = m1;
        this.x1 = x1;
        this.y1 = y2;
        this.z1 = z2;
        this.A1 = a4;
        this.B1 = b2;
        this.C1 = c1;
        this.D1 = d2;
        this.E1 = e1;
        this.F1 = f1;
        this.G1 = g1;
        this.H1 = h2;
        this.I1 = i1;
        this.J1 = j1;
        this.N1 = n1;
        this.b1 = b3;
        this.P1 = p73;
        this.Q1 = (g7w)q2;
        this.R1 = (wjc)r2;
        this.S1 = (ial)s2;
        this.T1 = (k62)t2;
        this.U1 = (rjq)u2;
        this.V1 = (fxe<igg>)v1;
        this.W1 = (yzz)w1;
        this.Y1 = y1;
        (this.Z1 = (x2s)z3).a((rtb)new ywp((Object)this, 1));
        mhg.i2 = preferences.getInt("version_code", 0);
        nds.a((Class)mhg.class);
        final vwz i2 = new vwz(((x9)this).I4(), new bcs((Context)a, ((x9)this).I4(), new psa("teams_access_accounts_tooltip_fatigue", 1, 0L, UserIdentifier.UNDEFINED), (fxe)l1, qfv));
        this.i1 = i2;
        this.K1 = k1;
        i2.a = ((dj1)k1).mIntent.getBooleanExtra("extra_suppress_tooltips", false);
        final t9j a5 = p9s.a((Class)tcx.class);
        this.v1 = (t9j<tcx>)a5;
        final t9j a6 = p9s.a((Class)hkd.class);
        this.w1 = (t9j<hkd>)a6;
        this.o1 = o1;
        this.l1 = l2;
        final boolean c2 = s5u.Companion.c(b);
        this.O1 = c2;
        this.n1 = n2;
        if (c2) {
            f.i((b5j)n2.c(), (u93)new dhg(this, 0));
        }
        this.t1 = t1;
        f.g((b5j)z7x.l(), (u93)new fhg(this, (fxe)v1, qfv.m(), y1, qfv, xuu, d, (pca)rjq));
        if (bundle == null) {
            final ocw d3 = ncw.d();
            if (d3.p()) {
                final hfv user = d3.getUser();
                final tth$a g2 = mhg.g2;
                final Long n3 = (Long)((HashMap)g2).get(user.C0);
                final t3s a7 = mq1.a;
                final long currentTimeMillis = System.currentTimeMillis();
                if (n3 == null || currentTimeMillis - n3 > 60000L) {
                    ((HashMap)g2).put(user.C0, currentTimeMillis);
                    final tcx$a tcx$a = new tcx$a();
                    tcx$a.a = (Context)a;
                    final int a8 = w4j.a;
                    tcx$a.b = b;
                    a5.d((kmm)((h4j)tcx$a).e());
                    if (user.L0) {
                        a6.d((kmm)new hkd((Context)a, b));
                    }
                }
            }
            ohw.b((int[])null);
        }
        final boolean a9 = tle.a();
        boolean booleanExtra;
        if (intent.hasExtra("notif_triggered_intent")) {
            booleanExtra = intent.getBooleanExtra("notif_triggered_intent", false);
            intent.removeExtra("notif_triggered_intent");
        }
        else {
            booleanExtra = false;
        }
        f.g((b5j)z7x.l(), (u93)new ghg(this, booleanExtra, a9, intent));
        int[] array = b.b;
        if (((rjq)u2).a()) {
            array = b.c;
        }
        y3.a(30000L, j2, array);
        if (y3.hasMessages(5)) {
            y3.removeMessages(5);
        }
        y3.sendMessageDelayed(y3.obtainMessage(5), 15000L);
        if (ah.f((Context)a) && bundle == null) {
            final zf4 zf4 = new zf4(b);
            zf4.q(new String[] { "app::::explorebytouch_enabled" });
            saw.b((okm)zf4);
        }
        this.k1 = new c6g(a, "main_activity_location_dialog", b3, 3);
        if (!tbx.n() && a3.d()) {
            crf.B("home", "save_credential", "begin");
            a3.g(ActivityBasedLoginAssistResultResolver.a((snd)a)).c((nbq)new khg());
        }
        sso.a((vro)new lhg(this));
        f.i(xd.H((pca)pca, (Class)p4h.a.class), (u93)new chg(this, 0));
        f.i((b5j)z7x.l(), (u93)new bhg(this, 0));
        f.i((b5j)z7x.o(), (u93)new ehg(this, 0));
    }
    
    public static void c5(final String s) {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "home", "navigation_bar", "", s, "click" });
        saw.b((okm)zf4);
    }
    
    public final void J1() {
        ((abv)this).V4();
        this.g5(egg.b(this.Y4()));
        ((View)this.t1).setVisibility(0);
        this.f5(this.c2);
    }
    
    public final boolean N2(final fai fai, final Menu menu) {
        super.N2(fai, menu);
        fai.z(2131689540, menu);
        fai.z(2131689479, menu);
        return true;
    }
    
    public final void N4() {
        super.N4();
        this.c1.a();
        ((zhg)this.L1.get()).i(hfv.O1, ncw.d().A());
    }
    
    public final void O4(final Intent intent) {
        super.O4(intent);
        ((Activity)((x9)this).D0).setIntent(intent);
        this.e5(intent);
    }
    
    public final void P4() {
        super.P4();
        this.d1.a();
        final SharedPreferences$Editor edit = this.f1.edit();
        edit.putInt("ver", 6);
        edit.putInt("version_code", mhg.i2);
        final wue x1 = this.X1;
        final Uri o = ((jsj)x1.b).o();
        final Uri a = vfg.a;
        Uri uri = o;
        if (o == null) {
            uri = a;
        }
        x1.a.e((Object)"tag", (Object)uri.toString());
        edit.putLong("st", this.a2);
        edit.apply();
        final fai g4 = ((x9)this).G4();
        if (g4 != null && g4.b()) {
            g4.c();
        }
    }
    
    public final void Q4() {
        super.Q4();
        final igg igg = (igg)this.V1.get();
        if (igg.e.a()) {
            final List b = igg.e.b();
            final ogg d = igg.d;
            Objects.requireNonNull(d);
            final List t3 = new m5e((Iterable)b, (kub)new hgg((Object)d, 0)).t3();
            if (!t3.isEmpty()) {
                ((jsj)igg.b).z(t3);
                final esj w = ((jsj)igg.b).w();
                if (w != null) {
                    ((jsj)igg.b).s(w);
                }
            }
            igg.a();
        }
        if (!UserIdentifier.getCurrent().equals((Object)((x9)this).J0)) {
            final vfg b2 = vfg.b(this.Y4());
            ((x9)this).D4();
            ((Activity)((x9)this).D0).overridePendingTransition(2130772062, 2130772063);
            ((abv)this).Q0.d((zm)b2);
            return;
        }
        final hlv b3 = dta.b();
        this.d1.c(b3.a.a().map((qtb)new b6p((Object)b3, 7)).observeOn(h6q.L()).subscribe((fk6)new gdm((Object)this, 12)));
        final PackageManager packageManager = ((Context)((x9)this).D0).getPackageManager();
        try {
            mhg.i2 = packageManager.getPackageInfo(((Context)((x9)this).D0).getPackageName(), 0).versionCode;
            nds.a((Class)mhg.class);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            e9a.d((Throwable)ex);
        }
        boolean b4;
        if (mhg.h2 == 0) {
            final int int1 = this.f1.getInt("ver", 0);
            b4 = ((int1 == 0) ? ((abv)this).S4().C0() : ((int1 == 1 || int1 == 2) && !this.f1.getBoolean("suppress_location_dialogs", false) && ((abv)this).S4().C0()));
            mhg.h2 = 6;
            nds.a((Class)mhg.class);
        }
        else {
            b4 = false;
        }
        final psa d2 = psa.d("location_fatigue", ((x9)this).J0);
        if (b4 && d2.c() && b3.b("onboarding_location_backstop_prompt_enabled_by_account", false)) {
            d2.b();
            final c6g k1 = this.k1;
            k1.I0 = (c6g$a)this;
            k1.b(5);
        }
        else {
            ((View)((x9)this).K4()).post((Runnable)new r20(this.i1, 9));
        }
        if (this.f2) {
            this.f2 = false;
            if (this.P1.h()) {
                this.b1.i(3, (Activity)((x9)this).D0, new String[] { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" });
            }
        }
        if (Build$VERSION.SDK_INT >= 33) {
            final boolean b5 = b3.b("t_notification_permission_on_first_launch", false);
            final boolean e = wau.c().e("notification_permission_checked", false);
            if (b5 && !e) {
                wau.c().i().f("notification_permission_checked", true).e();
                if (this.b1.f((Context)((x9)this).D0, "android.permission.POST_NOTIFICATIONS") == 0) {
                    this.b1.i(1981, (Activity)((x9)this).D0, new String[] { "android.permission.POST_NOTIFICATIONS" });
                    saw.b((okm)new zf4(nca.g("home", "", "", "", "system_permission")));
                }
            }
        }
        final SharedPreferences f1 = this.f1;
        final t3s a = mq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final long long1 = f1.getLong("st", 0L);
        this.a2 = long1;
        if (long1 + 3600000L < currentTimeMillis) {
            this.z1.f((ksc)liw.s((Context)((x9)this).D0, ((x9)this).J0));
            this.a2 = currentTimeMillis;
        }
        this.A1.e((TwConnectivityChangeEvent)new xh6((Context)((x9)this).D0));
        if (this.d2) {
            this.y0();
            this.d2 = false;
        }
        this.B1.a((c$a)asx.K0);
    }
    
    public final boolean X1(final boolean b) {
        final zjt zjt = (zjt)r9x.i((Fragment)this.X4(), (Class)zjt.class);
        boolean x1;
        if (zjt != null) {
            x1 = zjt.X1(b);
            this.s1.setExpanded(true);
        }
        else {
            x1 = false;
        }
        return x1;
    }
    
    public final wl1 X4() {
        return this.Z4(((jsj)this.a1).w());
    }
    
    public final Uri Y4() {
        return ((jsj)this.a1).o();
    }
    
    public final wl1 Z4(final esj esj) {
        if (esj == null) {
            return null;
        }
        return ((jsj)this.a1).q(esj);
    }
    
    public final void a0() {
        ((abv)this).T4();
        ((View)this.t1).setVisibility(8);
        if (!iks.d(((x9)this).L0)) {
            Drawable o = goz.O((Context)((x9)this).D0, 2130970960, 2131233381);
            final ViewGroup k4 = ((x9)this).K4();
            pf8.r(k4);
            if (this.a1.g()) {
                o = null;
            }
            ((View)k4).setBackground(o);
            if (Build$VERSION.SDK_INT >= 23) {
                this.r1.g(goz.K((Context)((x9)this).D0, 2130969110, 2131100813));
                this.r1.d(true);
            }
        }
        final View e = this.Z0.e();
        e.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
            public final boolean onPreDraw() {
                if (((abv)mhg.this).S0.d()) {
                    e.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                    mhg.this.s1.f(true, false, true);
                    mhg.this.f5(0);
                    return true;
                }
                return false;
            }
        });
    }
    
    public final void a3() {
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "home", "navigation_bar", "overflow", "", "click" });
        saw.b((okm)zf4);
        final fai g4 = ((x9)this).G4();
        if (g4 != null) {
            g4.y();
        }
    }
    
    public final void a5(final ubg ubg, final hfv hfv) {
        final int ordinal = ((Enum)ubg).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    final gob d0 = ((x9)this).D0;
                    final ldj$a ldj$a = new ldj$a((Context)d0);
                    final sbs$a j = yqh.j("signup");
                    j.d = "account_switcher";
                    ldj$a.d = (sbs)((h4j)j).e();
                    ((Activity)d0).startActivity(((ldj)((h4j)ldj$a).e()).a());
                }
            }
            else {
                final gob d2 = ((x9)this).D0;
                if (dta.d().b("stateful_login_enabled", false)) {
                    final ldj$a ldj$a2 = new ldj$a((Context)d2);
                    final sbs$a i = yqh.j("login");
                    i.d = "account_switcher";
                    ldj$a2.d = (sbs)((h4j)i).e();
                    d2.startActivityForResult(((ldj)((h4j)ldj$a2).e()).a(), 3);
                }
                else {
                    d2.startActivityForResult(mn6.a().x8().a((Context)d2, (ContentViewArgs)new LoginArgs(true, null, null, false, null, null)), 3);
                }
            }
        }
        else if (hfv != null) {
            vfg.e(((abv)this).Q0, hfv.f(), vfg.b(this.Y4()));
        }
    }
    
    public final void b5(int n, esj w) {
        ((x9)this).F4().setTitle(((jsj)this.a1).u(n));
        ((jsj)this.a1).v(n);
        ((abv)this).U4((CharSequence)null);
        final jev e = w.e;
        final c8p s0 = ((abv)this).S0;
        final d8p$a d8p$a = new d8p$a(s0.l());
        d8p$a.f = ((vyo)e).d;
        d8p$a.g = ((vyo)e).e;
        d8p$a.h = ((vyo)e).f;
        s0.j((d8p)((h4j)d8p$a).e());
        final Uri a = w.a;
        if (((abv)this).U0.get() != null) {
            final boolean j = sbl.b().m().A().j;
            final spa spa = (spa)((abv)this).U0.get();
            if (vfg.d.equals((Object)a)) {
                n = 3;
            }
            else if (egg.b(a)) {
                n = 0;
            }
            else if (vfg.h.equals((Object)a) && !j && dta.b().b("android_audio_room_creation_enabled", false)) {
                n = 4;
            }
            else {
                n = 1;
            }
            spa.e = n;
            if (n == 0) {
                spa.b();
            }
            else {
                spa.c();
                spa.a.f(spa.e);
            }
        }
        if (egg.b(w.a)) {
            this.p1.a.setRequestedOrientation(1);
        }
        else {
            this.p1.a.setRequestedOrientation(-1);
        }
        final fai g4 = ((x9)this).G4();
        pf8.r(g4);
        final lht g5 = this.G1;
        final Uri a2 = w.a;
        Objects.requireNonNull(g5);
        g4.D(8);
        g4.d().E((View)null);
        final m49 a3 = g5.a;
        Objects.requireNonNull(a3);
        final boolean equals = vfg.d.equals((Object)a2);
        if (equals && dta.b().b("dm_inbox_search_server_enabled", false)) {
            if (a3.c == null) {
                final View inflate = LayoutInflater.from(((View)g4.d().getView()).getContext()).inflate(2131624360, (ViewGroup)null, false);
                a3.c = inflate;
                final TextView textView = (TextView)inflate.findViewById(2131430839);
                ((View)textView).setOnClickListener((View$OnClickListener)new u0p((Object)a3, 13));
                if (a3.a) {
                    n = 2131953413;
                }
                else {
                    n = 2131953412;
                }
                textView.setHint(n);
            }
            g4.d().M(a3.c, new a$a(-1, -1));
        }
        final MenuItem item = g4.findItem(2131432120);
        if (item != null) {
            item.setVisible(equals);
        }
        Objects.requireNonNull(g5.b);
        final boolean equals2 = vfg.b.equals((Object)a2);
        final MenuItem item2 = g4.findItem(2131432121);
        if (item2 != null) {
            item2.setVisible(equals2);
        }
        final koc c = g5.c;
        Objects.requireNonNull(c);
        if (vfg.a.equals((Object)a2)) {
            c.f.c((j29)((b5j)c.d.b).observeOn(h6q.L()).subscribeWith((wbj)new joc(c, g4)));
            g4.d().M(c.b.C0, new a$a(-2, -2, 17));
        }
        else {
            final MenuItem item3 = g4.findItem(2131432125);
            if (item3 != null) {
                item3.setVisible(false);
            }
            final MenuItem item4 = g4.findItem(2131432115);
            if (item4 != null) {
                item4.setVisible(false);
            }
        }
        final zma d = g5.d;
        Objects.requireNonNull(d);
        final boolean c2 = egg.c(a2);
        final boolean b = egg.b(a2);
        boolean d2;
        if (!c2 && !b) {
            d2 = false;
        }
        else {
            final View c3 = d.a.C0;
            g4.d().E(c3);
            g4.A(8);
            d2 = iks.d(c3.getResources());
        }
        if (b && !d2) {
            final ohr a4 = d.a;
            Objects.requireNonNull(a4);
            ((View)a4.D0).setBackground(((Context)new ContextThemeWrapper(a4.C0.getContext(), 2132018950)).getDrawable(2131233215));
        }
        final MenuItem item5 = g4.findItem(2131432238);
        if (!c2 && !b) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (item5 != null) {
            final boolean b2 = ncw.d().g() && lcs.b();
            item5.setVisible(n != 0 && ncw.d().p() && !b2);
        }
        if (b) {
            if (item5 != null) {
                xd9.c(item5.getIcon(), -1);
            }
            final ohr a5 = d.a;
            ((TextView)a5.D0).setGravity(17);
            ((View)a5.D0).setTextAlignment(1);
        }
        g5.e.a.b(egg.a(a2), g4);
        final boolean b3 = egg.b(w.a);
        if (b3) {
            this.c2 = 0;
        }
        else {
            this.c2 = this.b2;
        }
        this.f5(this.c2);
        this.g5(b3);
        w = ((jsj)this.a1).w();
        if (w != null) {
            final String f = w.f;
            if (f != null) {
                final bpa h1 = this.H1;
                Objects.requireNonNull(h1);
                h1.a = f;
            }
        }
    }
    
    public final String c2() {
        final vr2.b b = (vr2.b)r9x.i((Fragment)this.X4(), (Class)vr2.b.class);
        String c2;
        if (b != null) {
            c2 = b.c2();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public final int d2(final fai fai) {
        final zhg zhg = (zhg)this.L1.get();
        final rh1 h = zhg.h(2131430389);
        if (h != null) {
            this.J1.a((ez6)new ah1(h));
        }
        final rh1 h2 = zhg.h(2131428175);
        if (h2 != null) {
            this.J1.d((ez6)new ah1(h2));
        }
        final rh1 h3 = zhg.h(2131428768);
        if (h3 != null) {
            h3.setBadgeMode(2);
            this.J1.b((ez6)new ah1(h3));
        }
        final rh1 h4 = zhg.h(2131428307);
        if (h4 != null) {
            this.J1.e((ez6)new ah1(h4));
        }
        zhg.G0.onNext((Object)new fjj(zhg));
        zhg.E0.c();
        this.h5();
        return 2;
    }
    
    public final void d5(final Uri uri) {
        final ngg ngg = (ngg)this.C1.get();
        final int t = ((jsj)ngg.a).t(uri);
        if (t != -1) {
            final fve c = ngg.c;
            if (!(c.H = vfg.a.equals((Object)uri))) {
                c.b();
                final u0k z = c.z;
                if (z != null) {
                    z.cancel();
                }
                c.j.e();
            }
            final int t2 = ((jsj)this.a1).t(uri);
            final esj a = ((jsj)this.a1).A(t2);
            if (a != null) {
                this.b5(t2, a);
            }
            ngg.e.a(((jsj)ngg.a).A(t));
            ngg.b.d(t);
            ngg.d.filter((ptk)new f71(t)).map((qtb)rut.G0).firstElement().c((lpg)new mgg(uri));
        }
    }
    
    public final void e5(final Intent intent) {
        if ("twitter".equals(intent.getScheme()) && "timeline".equals(intent.getData().getHost())) {
            this.d5(vfg.a);
        }
        else {
            final Uri d = this.K1.d();
            if (d == null) {
                f.k(this.X1.a.get((Object)"tag").w((qtb)sut.E0).y(h6q.L()).I(yvo.c()), (u93)new dgk((Object)this, 11), (raa)this.Y1);
            }
            else {
                this.d5(d);
            }
        }
        this.d2 = intent.getBooleanExtra("scroll_to_top", false);
    }
    
    public final void f5(final int a) {
        final ViewGroup k4 = ((x9)this).K4();
        pf8.r(k4);
        final int a2 = w4j.a;
        final Toolbar toolbar = (Toolbar)k4;
        final AppBarLayout$c layoutParams = (AppBarLayout$c)((View)toolbar).getLayoutParams();
        layoutParams.a = a;
        ((View)toolbar).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void g5(final boolean b) {
        final boolean d = iks.d(((x9)this).L0);
        Object d2;
        if (!d && b) {
            d2 = new ContextThemeWrapper((Context)((x9)this).D0, 2132018950);
        }
        else {
            d2 = ((x9)this).D0;
        }
        final Drawable o = goz.O((Context)d2, 2130970960, 2131233381);
        final ViewGroup k4 = ((x9)this).K4();
        pf8.r(k4);
        final ViewGroup viewGroup = k4;
        Drawable background = o;
        if (this.a1.g()) {
            background = o;
            if (!b) {
                background = null;
            }
        }
        ((View)k4).setBackground(background);
        if (!d && Build$VERSION.SDK_INT >= 23) {
            this.r1.g(goz.K((Context)d2, 2130969110, 2131100813));
            if (b) {
                this.r1.b(true);
            }
            else {
                this.r1.d(true);
            }
        }
    }
    
    public final void h5() {
        final ocw d = ncw.d();
        ((zhg)this.L1.get()).i(d.getUser(), d.A());
    }
    
    public final boolean j() {
        final upa upa = (upa)this.M1.get();
        if (upa != null && upa.g()) {
            upa.d();
            return true;
        }
        if (((x9)this).F4().b()) {
            ((x9)this).F4().c();
            return true;
        }
        if (!((abv)this).S0.a()) {
            final dgg a1 = this.a1;
            final Uri a2 = vfg.a;
            if (this.Z0.c() != ((jsj)a1).t(a2)) {
                this.d5(a2);
                return true;
            }
        }
        return p70.k((Activity)((x9)this).D0) || super.j();
    }
    
    public final boolean n1() {
        final zjt zjt = (zjt)r9x.i((Fragment)this.X4(), (Class)zjt.class);
        return zjt != null && zjt.n1();
    }
    
    public final boolean p4() {
        return true;
    }
    
    public final boolean q(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (itemId == 2131432116) {
            ((abv)this).Q0.b((ContentViewArgs)PeopleDiscoveryContentViewArgs.INSTANCE);
            c5("peopleplus_overflow_item");
        }
        else if (itemId == 2131432125) {
            if (r9x.i((Fragment)this.X4(), (Class)m5t.class) != null) {
                this.x1.b();
            }
            c5("customize_button");
        }
        else if (itemId == 2131432115) {
            this.d5(vfg.d);
        }
        else if (itemId == 2131432121) {
            final azi e1 = this.E1;
            if (e1.b.a()) {
                e1.a.b((ContentViewArgs)new NotificationsSettingsContentViewArgs$PushNotificationsSettingsContentViewArgs());
            }
            else {
                e1.a.d((zm)new oxi());
            }
        }
        else if (itemId == 2131432120) {
            final m49 f1 = this.F1;
            Objects.requireNonNull(f1);
            final e49 e2 = new e49();
            ((dj1)e2).mIntent.putExtra("page_render_type", 1);
            e2.a(false);
            final Intent a = f1.e.a((Context)f1.b, (zm)e2);
            final Activity b = f1.b;
            b.startActivity(a, tn.a((Context)b, 2130772041, 2130772042).b());
        }
        else if (itemId == 2131432238) {
            if (sac.b()) {
                ((abv)this).Q0.d((zm)new xla());
            }
            else {
                this.m1.d(TrendsPrefContentViewArgs.INSTANCE);
            }
        }
        else if (!this.D1.a(itemId)) {
            return super.q(menuItem);
        }
        return true;
    }
    
    public final boolean y0() {
        return this.X1(true);
    }
    
    public static final class b extends Handler
    {
        public static final int[] b;
        public static final int[] c;
        public final Context a;
        
        static {
            b = new int[] { 2, 4 };
            c = new int[] { 2 };
        }
        
        public b(final Context a) {
            this.a = a;
        }
        
        public final void a(final long n, final c c, final int... array) {
            for (final int n2 : array) {
                if (this.hasMessages(n2)) {
                    this.removeMessages(n2);
                }
                this.sendMessageDelayed(this.obtainMessage(n2, -1, -1, (Object)c), n);
            }
        }
        
        public final void handleMessage(final Message message) {
            final Context a = this.a;
            final UserIdentifier current = UserIdentifier.getCurrent();
            final psc c = psc.c();
            final int what = message.what;
            if (what != 2) {
                if (what != 4) {
                    if (what == 5) {
                        final int a2 = j3s.a;
                        Objects.requireNonNull(k3s.Companion);
                        zzd.f((Object)current, "userIdentifier");
                        Objects.requireNonNull(n3s.Companion);
                        final kmm<?, ?> a3 = ((n3s)afw.Companion.a().e(current, (Class)n3s.class)).z6().a(false);
                        if (a3 != null) {
                            c.f((ksc)a3);
                        }
                    }
                }
                else {
                    c.f((ksc)new mso(a, current, dta.b().f("saved_searches_ttl_hours", 1) * 3600000L));
                }
            }
            else {
                final c c2 = (c)message.obj;
                final int arg1 = message.arg1;
                long millis;
                if (arg1 > -1) {
                    millis = arg1;
                }
                else {
                    final int a4 = hhv.a;
                    millis = TimeUnit.SECONDS.toMillis(dta.b().f("typeahead_user_prefetch_ttl_sec", hhv.a));
                }
                final jhv jhv = new jhv(a, current, millis);
                if (c2 != null) {
                    ((kmm)jhv).U((cw0$b)c2);
                }
                psc.c().f((ksc)jhv);
            }
        }
    }
    
    public static final class c implements ksc$a<jhv>
    {
        public final b C0;
        
        public c(final b c0) {
            this.C0 = c0;
        }
        
        public final void b(final cw0 cw0) {
            final jhv jhv = (jhv)cw0;
            if (!((ksc)jhv).T().b) {
                this.C0.a(600000L, this, jhv.i1);
            }
        }
    }
}
