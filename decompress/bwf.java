import android.view.MenuItem;
import com.twitter.util.user.UserIdentifier$Companion;
import android.content.Context;
import com.twitter.android.liveevent.landing.header.a$a;
import java.util.Iterator;
import java.util.Objects;
import android.view.Menu;
import android.os.Parcelable;
import android.view.View$OnClickListener;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.Intent;
import com.twitter.android.liveevent.landing.scribe.a;
import android.content.res.Resources;
import com.twitter.android.liveevent.landing.cover.c;
import com.twitter.android.liveevent.landing.header.b;
import com.twitter.android.liveevent.landing.LiveEventLandingActivity;
import com.twitter.ui.widget.FloatingActionButton;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwf extends go6 implements gto<Bundle>, ppd
{
    public mxe<tai> A1;
    public final FloatingActionButton B1;
    public boolean C1;
    public boolean D1;
    public final iwf b1;
    public final LiveEventLandingActivity c1;
    public final kyf d1;
    public final b e1;
    public final c f1;
    public final k3a g1;
    public final nn h1;
    public final de6 i1;
    public final e39 j1;
    public final vxf k1;
    public final Resources l1;
    public final bxo m1;
    public final bxo n1;
    public final mxe<ktf> o1;
    public final a p1;
    public final bpf q1;
    public final cyf r1;
    public final gzf s1;
    public final tuf t1;
    public final gwf u1;
    public final wcp v1;
    public final pvf w1;
    public final stf x1;
    public final glq y1;
    public zof z1;
    
    public bwf(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> a1, final nn h1, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv mcv, final mxe<ypa> mxe, final a7g a7g, final o9p o9p, final ibm ibm, final fci<?> fci, final c8p c8p, final View view, final iwf b1, final c f1, final kyf d1, final b e1, final gzf s1, final k3a g1, final vxf k1, final mxe<ktf> o1, final a p43, final bpf q1, final cyf r1, final tuf t1, final gwf u1, final kcm kcm, final duo duo, final bxo m1, final bxo n1, final wcp v1, final pvf w1, final stf x1, final fda<fo> fda2, final glq y1, final m9p m9p) {
        super(intent, k9x, resources, cbs, (mxe)a1, h1, dob, cbf, cbg, layoutInflater, (fda)fda, userIdentifier, mcv, (mxe)mxe, a7g, o9p, ibm, (fci)fci, c8p, m9p);
        final de6 i1 = new de6();
        this.i1 = i1;
        this.j1 = new e39();
        ((u9)this).R4(view);
        this.t1 = t1;
        final int a2 = o5j.a;
        this.c1 = (LiveEventLandingActivity)dob;
        this.e1 = e1;
        this.b1 = b1;
        this.p1 = p43;
        this.q1 = q1;
        this.f1 = f1;
        this.d1 = d1;
        this.h1 = h1;
        this.k1 = k1;
        this.o1 = o1;
        this.l1 = ((Context)dob).getResources();
        this.m1 = m1;
        this.n1 = n1;
        this.g1 = g1;
        this.r1 = r1;
        this.s1 = s1;
        this.u1 = u1;
        vmw.g((Object)a1);
        this.A1 = a1;
        this.v1 = v1;
        this.w1 = w1;
        this.x1 = x1;
        this.y1 = y1;
        ((View)(this.B1 = (FloatingActionButton)view.findViewById(2131427546))).setOnClickListener((View$OnClickListener)new quf(this, 2));
        duo.a((gto<?>)this);
        i1.a(k9x.d().subscribe((rk6)new u1p((Object)this, 6)));
        i1.a(k9x.l().subscribe((rk6)new w1p((Object)p43, 4)));
        kcm.i((sj)new eck((Object)this, 3));
        f.i(ak1.B((fda)fda, (Class)h5h$c.class).filter((ouk)y2r.S0), (fa3)new es2((Object)this, 2));
        f.i(fda2.v0(), (fa3)new wgk((Object)this, 1));
    }
    
    public final Parcelable C3() {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("share_menu_button_impression_logged", this.C1);
        bundle.putBoolean("share_fab_impression_logged", this.D1);
        return (Parcelable)bundle;
    }
    
    public final boolean N2(final zai zai, final Menu menu) {
        super.N2(zai, menu);
        Objects.requireNonNull(this.u1);
        e0e.f((Object)zai, "navComponent");
        e0e.f((Object)menu, "menu");
        zai.z(2131689498, menu);
        ((View)zai.d().getView()).setOnClickListener((View$OnClickListener)new g2p((Object)this, 4));
        return true;
    }
    
    public final void T0() {
    }
    
    public final void X4() {
        this.j1.c(this.k1.a().subscribeOn(this.m1).observeOn(this.n1).subscribe((rk6)new kd1((Object)this, 4), (rk6)new ppa(this, 2)));
    }
    
    public final void Y() {
        this.W4();
    }
    
    public final void Y4(final String s) {
        if (this.t1.a()) {
            ((tai)this.A1.get()).a((CharSequence)s);
        }
    }
    
    public final void Z4(final Throwable t) {
        if (fbx.A(t) != null) {
            final wbv a = fbx.A(t);
            CharSequence b;
            if (a == null) {
                b = null;
            }
            else {
                b = a.b;
            }
            final k3a$d g0 = this.g1.G0;
            final i3a$a i3a$a = new i3a$a();
            final tx6 a2 = lfs.a;
            i3a$a.a = (lfs)new zkr(2131954751);
            String s;
            if (flr.g(b)) {
                s = this.l1.getString(2131954750, new Object[] { b });
            }
            else {
                s = this.l1.getString(2131954749);
            }
            i3a$a.b = lfs.a(s);
            i3a$a.c = (lfs)new zkr(2131952177);
            final k3a$e d = new k3a$e((i3a)((z4j)i3a$a).e());
            final nn h1 = this.h1;
            Objects.requireNonNull(h1);
            d.a = (k3a$c)new gf8((Object)h1, 10);
            g0.d = d;
        }
        else {
            final k3a$d g2 = this.g1.G0;
            final i3a$a i3a$a2 = new i3a$a();
            final tx6 a3 = lfs.a;
            i3a$a2.a = (lfs)new zkr(2131954771);
            i3a$a2.b = (lfs)new zkr(2131954770);
            final k3a$e d2 = new k3a$e((i3a)((z4j)i3a$a2).e());
            d2.a = (k3a$c)new qo((Object)this, 11);
            g2.d = d2;
        }
        final k3a g3 = this.g1;
        g3.b(g3.L0 = true);
        this.r1.b();
    }
    
    public final void a5(final hwf hwf, final boolean b) {
        final k3a g1 = this.g1;
        final int n = 0;
        g1.b(false);
        final zof a = hwf.a;
        this.z1 = a;
        String title = "";
        if (a != null) {
            if (hwf.a() && !ita.b().b("moments_new_share_variant_floating_action_button", false) && !this.C1) {
                final a p2 = this.p1;
                Objects.requireNonNull(p2);
                p2.o(dda.g("live_event_timeline", "live_event_header", "", "share_menu", "impression"), (d1p)p2.m((String)null));
                this.C1 = true;
            }
            if (hwf.a() && ita.b().b("moments_new_share_variant_floating_action_button", false)) {
                if (!this.D1) {
                    final a p3 = this.p1;
                    Objects.requireNonNull(p3);
                    p3.o(dda.g("live_event_timeline", "", "", "share_moment_floating_button", "impression"), (d1p)p3.m((String)null));
                    this.D1 = true;
                }
                ((com.google.android.material.floatingactionbutton.FloatingActionButton)this.B1).setVisibility(0);
            }
            else {
                this.D1 = false;
                ((com.google.android.material.floatingactionbutton.FloatingActionButton)this.B1).setVisibility(8);
                if (this.y1.a()) {
                    ((ktf)this.o1.get()).c.I1();
                }
                else {
                    ((sl8)((ktf)this.o1.get()).c.L0).F0.setVisibility(0);
                }
            }
            final tai tai = (tai)this.A1.get();
            final String h = this.z1.h;
            if (h != null) {
                title = h;
            }
            tai.setTitle((CharSequence)title);
            if (this.t1.a() && ita.b().b("live_event_squishy_header_show_tap_to_expand_label", false)) {
                this.Y4(this.l1.getString(2131954773));
            }
            else {
                this.Y4(this.l1.getString(2131954772));
            }
        }
        else {
            ((ktf)this.o1.get()).c.I1();
            ((tai)this.A1.get()).setTitle((CharSequence)"");
            this.Y4("");
        }
        final kyf d1 = this.d1;
        final zof z1 = this.z1;
        d1.J0 = z1;
        final c f1 = this.f1;
        final boolean b2 = this.x1.a() && b;
        if (z1 != null && f1.M0) {
            final bl1 bl1 = (bl1)f1.H0.a.H("interstitial_dialog");
            if (bl1 != null) {
                bl1.W1 = (dx8)f1;
                final int a2 = o5j.a;
            }
            else {
                c0e.i("Sensitive information dialog not found");
            }
        }
        else if (z1 != null && b2) {
            f1.K0.a((Object)eyf.G0);
            f1.L0 = true;
        }
        else if (z1 != null && !f1.L0 && !f1.I0.startedFromDock && !k6e.j((Iterable)f1.J0.a.b()).W0((nuk)new c0g(z1, 0))) {
            final boolean l = z1.l;
            final qgv g2 = z1.g;
            int n2 = n;
            if (g2 != null) {
                n2 = n;
                if (fbx.E(g2.K1)) {
                    n2 = 1;
                }
            }
            if (l && n2 != 0) {
                f1.b(f1.G0.getString(2131954746), f1.a(z1.g.M0), f1.G0.getString(2131959594));
            }
            else if (l) {
                f1.b(f1.G0.getString(2131954766), (fym)null, f1.G0.getString(2131952819));
            }
            else if (n2 != 0) {
                f1.b(f1.G0.getString(2131954748), f1.a(z1.g.M0), f1.G0.getString(2131959594));
            }
        }
        else {
            f1.L0 = true;
        }
        final b e1 = this.e1;
        Objects.requireNonNull(e1);
        final com.twitter.android.liveevent.landing.header.a l2 = e1.L0;
        Objects.requireNonNull(l2);
        while (true) {
            for (final mm3 mm3 : hwf.d) {
                if (mm3.i) {
                    final noj b3 = new noj((Object)mm3);
                    if (!hwf.d.isEmpty() && !b3.e()) {
                        final tlp b4 = l2.b;
                        final bbq y = l2.a.d(hwf, b3).I(l2.c).y(l2.d);
                        final a$a e2 = l2.e;
                        Objects.requireNonNull(e2);
                        b4.b(y.G((rk6)new ppa(e2, 3), (rk6)avf.G0));
                    }
                    else {
                        l2.e.e0((uuf)((z4j)new uuf$a(hwf)).e());
                    }
                    return;
                }
            }
            final noj b3 = noj.b;
            final int a3 = o5j.a;
            continue;
        }
    }
    
    public final int d2(final zai zai) {
        zai.d().F(b1b.B((Context)this.c1, 2130969053));
        final zof z1 = this.z1;
        if (z1 != null) {
            final gwf u1 = this.u1;
            Objects.requireNonNull(u1);
            final qgv g = z1.g;
            boolean b = false;
            Label_0108: {
                if (g != null) {
                    final UserIdentifier$Companion companion = UserIdentifier.Companion;
                    final UserIdentifier f = g.f();
                    e0e.e((Object)f, "author.userIdentifier");
                    if (!companion.d(f) && !u1.j.a()) {
                        b = true;
                        break Label_0108;
                    }
                }
                b = false;
            }
            final MenuItem item = zai.findItem(2131430003);
            u1.k = item;
            if (item != null) {
                item.setVisible(b);
                if (b && g != null) {
                    f.a(u1.f.a(g.F0).I(u1.g).y(u1.h).G((rk6)new zna((stb)new ewf(u1, g), 5), (rk6)new aoa((stb)fwf.F0, 5)), (gba)u1.i);
                }
            }
            final MenuItem item2 = zai.findItem(2131430026);
            if (item2 != null) {
                item2.setVisible(b);
            }
        }
        return 2;
    }
    
    public final String getId() {
        return bwf.class.getName();
    }
    
    public final boolean n(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        if (2131430035 == itemId) {
            final zof z1 = this.z1;
            if (z1 != null) {
                final gwf u1 = this.u1;
                Objects.requireNonNull(u1);
                u1.b.a(z1, "");
                final a d = u1.d;
                Objects.requireNonNull(d);
                d.o(dda.g("live_event_timeline", "live_event_header", "", "share", "share_menu_click"), (d1p)d.m((String)null));
            }
            return true;
        }
        if (2131430003 == itemId) {
            final zof z2 = this.z1;
            if (z2 != null) {
                final gwf u2 = this.u1;
                Objects.requireNonNull(u2);
                final qgv g = z2.g;
                if (g != null) {
                    f.a(u2.f.a(g.F0).I(u2.g).y(u2.h).G((rk6)new ug((stb)new dwf(u2, g), 4), (rk6)new wj4((stb)fwf.F0, 3)), (gba)u2.i);
                }
            }
            return true;
        }
        if (2131430026 == itemId) {
            final zof z3 = this.z1;
            if (z3 != null) {
                final gwf u3 = this.u1;
                Objects.requireNonNull(u3);
                final qgv g2 = z3.g;
                if (g2 != null) {
                    final noj noj = (noj)((lhm)u3.c).c();
                    afq e;
                    if (noj != null && noj.f()) {
                        e = ((mm3)noj.c()).e;
                    }
                    else {
                        e = null;
                    }
                    final ye e2 = u3.e;
                    Objects.requireNonNull(e2);
                    final xkm xkm = new xkm();
                    xkm.s("reportmoment");
                    xkm.t(g2.F0);
                    final String a = z3.a;
                    e0e.e((Object)a, "event.id");
                    ((aj1)xkm).mIntent.putExtra("moment_id", Long.parseLong(a));
                    xkm.o(false);
                    if (e != null) {
                        final String f = e.f;
                        if (f != null) {
                            final hp6 g3 = e2.f.g(f);
                            xkm.v(Long.parseLong(f));
                            e0e.c((Object)g3);
                            xkm.o(g3.O2());
                            ((aj1)xkm).mIntent.putExtra("is_media", true);
                        }
                    }
                    e2.b.d((cn)xkm);
                    final a d2 = u3.d;
                    Objects.requireNonNull(d2);
                    d2.o(dda.g("live_event_timeline", "live_event_header", "action_sheet", "", "report"), (d1p)d2.m((String)null));
                }
            }
            return true;
        }
        return super.n(menuItem);
    }
    
    public final void v(final Parcelable parcelable) {
        final Bundle bundle = (Bundle)parcelable;
        this.C1 = bundle.getBoolean("share_menu_button_impression_logged");
        this.D1 = bundle.getBoolean("share_fab_impression_logged");
    }
}
