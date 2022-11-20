import android.app.Dialog;
import java.util.Locale;
import java.util.Iterator;
import java.util.List;
import androidx.appcompat.app.e;
import java.util.Map;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$l;
import com.twitter.app.home.di.view.HomeTimelineViewGraph;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$m;
import android.view.View;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Objects;
import java.util.Calendar;
import android.content.Context;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmc extends eus implements lr2$b, cyk$a, d6t
{
    public final enc A1;
    public final t6k B1;
    public final v7k C1;
    public final rue D1;
    public final wc6 E1;
    public rlc F1;
    public final p3p G1;
    public gus H1;
    public WeakReference<xn0> I1;
    public final xk0 J1;
    public final qft K1;
    public final qbu L1;
    public boolean t1;
    public long u1;
    public long v1;
    public boolean w1;
    public e9q x1;
    public final obi<?> y1;
    public final b5s z1;
    
    public lmc(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv, final l6j<tmi, e2g<n3e<Object>>> l6j, final obi<?> y1, final b5s z1, final enc a1, final qbu l1, final xk0 j1, final qft k1, final t6k b1, final p3p g1) {
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv);
        this.v1 = 0L;
        this.w1 = false;
        final wc6 e1 = new wc6();
        this.E1 = e1;
        this.y1 = y1;
        this.z1 = z1;
        this.A1 = a1;
        this.B1 = b1;
        this.D1 = rue.d();
        this.L1 = l1;
        this.J1 = j1;
        this.K1 = k1;
        this.G1 = g1;
        v7k c1;
        if (super.e1 == 34) {
            c1 = new v7k(pbu.e(((ucv)this).G0, "timeline"), 1);
        }
        else {
            c1 = new v7k(pbu.e(((ucv)this).G0, "timeline"), 0);
        }
        this.C1 = c1;
        ((View)((ucv)this).Y0.I0.b).setContentDescription((CharSequence)((ucv)this).z0().getString(2131954314));
        final fmv b2 = asa.b();
        Label_0618: {
            if (b2.b("app_rating_prompt_enable", false)) {
                if (!b2.b("app_rating_prompt_show_now", false)) {
                    final SharedPreferences sharedPreferences = ((ucv)this).q0().getSharedPreferences("appratingusage", 0);
                    final boolean boolean1 = sharedPreferences.getBoolean("donotshow", false);
                    int int1 = -1;
                    if (!boolean1) {
                        final long long1 = sharedPreferences.getLong("lastuse", 0L);
                        int1 = sharedPreferences.getInt("consecutivedays", 0);
                        final SharedPreferences$Editor edit = sharedPreferences.edit();
                        final Calendar instance = Calendar.getInstance();
                        final Calendar instance2 = Calendar.getInstance();
                        instance2.setTimeInMillis(long1);
                        final Calendar instance3 = Calendar.getInstance();
                        instance3.add(5, -1);
                        if (zn0$a.a(instance2, instance3)) {
                            ++int1;
                            edit.putInt("consecutivedays", int1);
                        }
                        else if (!zn0$a.a(instance2, instance)) {
                            edit.putInt("consecutivedays", 0);
                            int1 = 0;
                        }
                        edit.putLong("lastuse", instance.getTimeInMillis());
                        edit.apply();
                    }
                    if (int1 < 7) {
                        break Label_0618;
                    }
                }
                final xn0 xn0 = (xn0)this.D1().M0().get();
                Objects.requireNonNull(xn0);
                xn0.a(1);
                final View inflate = ((LayoutInflater)((Context)xn0.D0).getSystemService("layout_inflater")).inflate(2131624032, (ViewGroup)null);
                zn0.a((Context)xn0.D0);
                xn0.I0 = (TextView)inflate.findViewById(2131427635);
                xn0.J0 = (TextView)inflate.findViewById(2131427634);
                xn0.E0 = (Button)inflate.findViewById(2131427632);
                xn0.F0 = (Button)inflate.findViewById(2131427631);
                xn0.H0 = (Button)inflate.findViewById(2131427633);
                xn0.G0 = (Button)inflate.findViewById(2131427630);
                xn0.K0 = new yn0((Context)xn0.D0, (LinearLayout)inflate.findViewById(2131427629), (yn0.a)xn0.M0);
                ((View)xn0.F0).setOnClickListener((View$OnClickListener)xn0);
                ((View)xn0.E0).setOnClickListener((View$OnClickListener)xn0);
                ((View)xn0.H0).setOnClickListener((View$OnClickListener)xn0);
                ((View)xn0.G0).setOnClickListener((View$OnClickListener)xn0);
                ((Dialog)(xn0.L0 = new pmg((Context)xn0.D0, 0).u(inflate).create())).show();
                this.I1 = new WeakReference<xn0>(xn0);
            }
        }
        final a7m i0 = ((ucv)this).Y0.I0;
        final boolean o0 = asa.c().b("android_growth_performance_holdback_should_avoid_htl_rv_prefetching", false) ^ true;
        final RecyclerView$m layoutManager = i0.b.getLayoutManager();
        jee.l((Object)layoutManager);
        if (o0 != layoutManager.O0) {
            layoutManager.O0 = o0;
            layoutManager.P0 = 0;
            final RecyclerView e2 = layoutManager.E0;
            if (e2 != null) {
                e2.E0.o();
            }
        }
        final HomeTimelineViewGraph d1 = this.D1();
        this.x1 = d1.E8();
        this.F1 = d1.O3();
        e1.a(l6j.v((Object)tmi.a).ofType((Class)e2g$d.class).subscribe((lj6)new z0p((Object)this, 15)));
        e1.a(((ucv)this).T0.b().subscribe((lj6)new y0p((Object)this, 13)));
        e1.a(((h5j)g1.c).subscribe((lj6)new hd1((Object)this, 11)));
        ((ucv)this).H0.u1((n93)new mr2((Object)this, 9));
        ((ucv)this).H0.c1((n93)new jgk((Object)this, 9));
        ((ucv)this).H0.r1((n93)new so3((Object)this, 11));
    }
    
    public final boolean B1() {
        final boolean w1 = this.w1;
        boolean b = false;
        if (!w1) {
            b = b;
            if (this.v1 < asa.b().f("home_timeline_bottom_cursor_max_retries", 0)) {
                b = true;
            }
        }
        return b;
    }
    
    public final void C() {
        this.t1 = true;
    }
    
    public final lmf C1() {
        final v7k c1 = this.C1;
        jee.l((Object)c1);
        return (lmf)c1;
    }
    
    public final HomeTimelineViewGraph D1() {
        final umd e0 = ((ucv)this).E0;
        Objects.requireNonNull(e0);
        return (HomeTimelineViewGraph)w1e.h((x1e)e0);
    }
    
    public final void L() {
    }
    
    public final void L0() {
        super.L0();
        final gus h1 = this.H1;
        if (h1 != null) {
            ((ucv)this).Y0.I0.b.o0((RecyclerView$l)h1);
        }
    }
    
    public final void O0(final n3e<cxs> n) {
        enl.a().c(7);
        if (this.t1) {
            ((ucv)this).Z0((n3e)n);
            if (!((ucv)this).C0(2)) {
                ((ucv)this).Y0.e2();
            }
        }
        else {
            super.O0((n3e)n);
        }
        if (asa.c().b("convo_units_enabled", false) && n instanceof ekd) {
            final lus j0 = ((ekd)n).J0;
            Map c;
            if (j0 == null) {
                c = null;
            }
            else {
                c = j0.K0.c;
            }
            if (c != null) {
                final gus h1 = this.H1;
                if (h1 != null) {
                    h1.a.clear();
                    h1.b.clear();
                    h1.p((n3e)n);
                }
                else {
                    final gus h2 = new gus((n3e)n, (Fragment)((ucv)this).E0);
                    this.H1 = h2;
                    ((ucv)this).Y0.I0.p((RecyclerView$l)h2);
                }
            }
        }
        final e9q x1 = this.x1;
        if (x1 != null) {
            final vai.a b = x1.b;
            if (b != null) {
                if (b.a) {
                    ((gdv)x1.a.get()).V1(0, 0, false);
                    x1.b = null;
                }
            }
        }
        if (this.F1.c() || this.F1.d()) {
            final rlc f1 = this.F1;
            Objects.requireNonNull(f1);
            czd.f((Object)n, "items");
            if (f1.m) {
                f1.m = false;
                f1.s.onNext((Object)rlc$d$c.a);
                f1.s.onNext((Object)rlc$d$a.a);
            }
            else if (f1.p) {
                f1.s.onNext((Object)rlc$d$a.a);
            }
            else if (f1.n == null && n.getSize() > 0) {
                f1.n = n;
                if (f1.d() && !f1.c()) {
                    f1.a();
                }
            }
        }
        this.D1.f((taf)taf$t.a);
        enl.a().c(8);
    }
    
    public final void P0(final kmf kmf) {
        ((ucv)this).Y0.V1(0, 0, false);
        cbw.b((elm)new af4(((ucv)this).G0, vba.g(this.h1(), "", "", "", "position_restore_failure")));
    }
    
    public final void S0() {
        this.D1.f((taf)taf$x.a);
        final WeakReference<xn0> i1 = this.I1;
        xn0 xn0;
        if (i1 == null) {
            xn0 = null;
        }
        else {
            xn0 = i1.get();
        }
        if (xn0 != null) {
            final e l0 = xn0.L0;
            if (l0 != null && ((Dialog)l0).isShowing()) {
                ((ck0)xn0.L0).dismiss();
            }
            xn0.L0 = null;
        }
        if (((ucv)this).C0(2)) {
            enl.a().d(oir.G0);
            ((cjg)flb.A("home:refresh", ((ucv)this).b1, ((ucv)this).G0, (w9h$b)w9h.k)).k();
        }
        if (((ucv)this).C0(1)) {
            ((cjg)flb.A("home:get_older", ((ucv)this).b1, ((ucv)this).G0, (w9h$b)w9h.k)).k();
        }
        super.S0();
    }
    
    public final void W0() {
        if (!((ucv)this).V0(this.C1().a()) && ((d4e)((ucv)this).v0()).a() > 0) {
            this.C1().c();
        }
        final af4 af4 = new af4(((ucv)this).G0, vba.g(this.h1(), "timeline", "position", "restore", "multiple"));
        ((u0p)af4).A();
        cbw.b((elm)af4);
    }
    
    public final boolean X1(final boolean b) {
        this.G1.a(ec4.D0);
        return super.X1(b);
    }
    
    public final void Y0() {
        final q3e g1 = ((ucv)this).Y0.G1();
        if (g1.c() && ((d4e)g1).a() > 0) {
            final List t0 = ((ucv)this).t0();
            if (asa.b().b("android_htl_position_metadata_capture_enabled", false)) {
                for (final kmf kmf : t0) {
                    final int c = kmf.c;
                    if (c >= 0 && c < ((d4e)g1).a()) {
                        final cxs cxs = (cxs)((d4e)g1).getItem(kmf.c);
                        kmf.d = new jmf(cxs.c().f, cxs.a, cxs.d(), cxs.e(), super.e1);
                    }
                }
            }
            this.C1().b(t0);
            final af4 af4 = new af4(((ucv)this).G0, vba.g(this.h1(), "timeline", "position", "save", "multiple"));
            ((u0p)af4).A();
            cbw.b((elm)af4);
        }
    }
    
    public final void a() {
        this.T0();
        this.A1.a();
        this.u1();
    }
    
    public final String c2() {
        final qbu c = pbu.c();
        final boolean e = c.e("inject_ptr_enabled", false);
        final String s = null;
        String trim;
        if (!e) {
            trim = s;
        }
        else {
            final String j = c.j("inject_ptr_order", "");
            final String i = c.j("inject_ptr_index", "0");
            trim = s;
            if (!ikr.e((CharSequence)j)) {
                if (ikr.e((CharSequence)i)) {
                    trim = s;
                }
                else {
                    final int int1 = Integer.parseInt(i);
                    final String[] split = j.split(",");
                    if (int1 >= 0 && int1 < split.length) {
                        c.i().b("inject_ptr_index", Integer.toString((int1 + 1) % split.length)).e();
                        trim = split[int1].trim();
                    }
                    else {
                        c.i().b("inject_ptr_index", "0").e();
                        trim = s;
                    }
                }
            }
        }
        return String.format(Locale.ENGLISH, "PTR Override: %s", trim != null);
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        int c;
        if (djo.a()) {
            c = 2131624610;
        }
        else {
            c = 2131624609;
        }
        gdv$b.c = c;
        gdv$b.g = 2131624572;
        gdv$b.a = "home";
        final i2a$d b = gdv$b.b;
        final umd e0 = ((ucv)this).E0;
        Objects.requireNonNull(e0);
        final g2a d4 = ((elf)((co1)e0.n()).B((Class)elf.class)).D4();
        final i2a$e c2 = new i2a$e(d4);
        if (ikr.e((CharSequence)d4.d)) {
            c2.a = (i2a$c)new scn((Object)this, 9);
        }
        b.c = c2;
        i2a$e d5;
        if (asa.b().b("timelines_error_view_enabled", false)) {
            final g2a$a g2a$a = new g2a$a();
            final nw6 a = tes.a;
            g2a$a.a = (tes)new dkr(2131953931);
            g2a$a.b = (tes)new dkr(2131953915);
            g2a$a.c = (tes)new dkr(2131953917);
            g2a$a.e = 0;
            d5 = new i2a$e((g2a)((n4j)g2a$a).e());
            d5.a = (i2a$c)new eu4((Object)this, 20);
        }
        else {
            d5 = null;
        }
        b.d = d5;
        b.f = 2131166694;
        b.b();
        gdv$b.d = 2131625753;
        return gdv$b;
    }
    
    public final f4f n0() {
        if (!asa.b().b("home_timeline_start_at_top_uprank_unseen_tweets_enabled", false)) {
            return (f4f)new ve6((czr)new jmc((eus)this, 0), true, (ve6$a)this);
        }
        return (f4f)new x73(((unc)mfw.a().c((Class)unc.class)).y7(), (czr)new kmc(this), (ve6$a)this);
    }
    
    public final void r() {
        this.d1(13);
        this.W0();
    }
    
    public final void r1() {
        super.r1();
        this.B1.a();
    }
    
    public final void s1(final View view, final cxs cxs, final int n) {
        super.s1(view, cxs, n);
        if (cxs != null) {
            final n3e j1 = this.j1();
            final int size = j1.getSize();
            if (size < this.g1().m() && size - n <= 20) {
                if (!super.r1) {
                    if (j1.getSize() - 1 != this.u1) {
                        this.d1(1);
                    }
                }
                else if (this.B1()) {
                    this.w1 = true;
                    this.d1(1);
                    mmc.b(super.e1);
                }
            }
        }
    }
    
    public final void t() {
    }
}
