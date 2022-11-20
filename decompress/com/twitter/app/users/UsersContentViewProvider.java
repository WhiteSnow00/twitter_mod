// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.users;

import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.widget.CheckBox;
import com.twitter.ui.user.BaseUserView;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Objects;
import android.widget.BaseAdapter;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;
import com.twitter.ui.user.UserView;
import android.view.View;

@v81
public class UsersContentViewProvider extends ucv<sbw> implements ygj<View, sbw>, xv8, aek
{
    public String A1;
    public kmw B1;
    public boolean C1;
    public boolean D1;
    public boolean c1;
    public boolean d1;
    public long[] e1;
    public cgv f1;
    public UserView g1;
    public long h1;
    public brb i1;
    public Map<UserIdentifier, Integer> j1;
    public f74 k1;
    public int l1;
    public int m1;
    public final kc1 n1;
    public final UsersContentViewProvider.UsersContentViewProvider$a o1;
    public final UsersContentViewProvider.UsersContentViewProvider$b p1;
    public final z9j<clg> q1;
    public final z9j<u37> r1;
    public final z9j<hs8> s1;
    public final z9j<ef3> t1;
    public final z9j<t12> u1;
    public final z9j<qem> v1;
    public final cwh w1;
    public final jn x1;
    public final dn6<k7l, mgl> y1;
    public boolean z1;
    
    public UsersContentViewProvider(final tcv tcv, final kc1 n1, final kas kas, final yaa<kjf> yaa, final obi<?> obi, final jn x1, final cwh w1) {
        super(tcv);
        this.o1 = new UsersContentViewProvider.UsersContentViewProvider$a(this);
        final UsersContentViewProvider.UsersContentViewProvider$b p7 = new UsersContentViewProvider.UsersContentViewProvider$b(this);
        this.p1 = p7;
        this.A1 = "unknown";
        this.n1 = n1;
        this.x1 = x1;
        this.q1 = kas.a(clg.class);
        this.t1 = kas.a(ef3.class);
        final z9j<u37> a = kas.a(u37.class);
        this.r1 = a;
        final z9j<hs8> a2 = kas.a(hs8.class);
        this.s1 = a2;
        final z9j<t12> a3 = kas.a(t12.class);
        this.u1 = a3;
        final z9j<qem> a4 = kas.a(qem.class);
        this.v1 = a4;
        this.w1 = w1;
        final Bundle q = tcv.q;
        final imw f1 = this.f1();
        this.l1 = f1.i();
        this.h1 = ((BaseBundle)((vl1)f1).a).getLong("tag", -1L);
        final long[] longArray = ((BaseBundle)((vl1)f1).a).getLongArray("user_ids");
        if (longArray != null && longArray.length > 0) {
            this.e1 = longArray;
        }
        this.z1 = ((vl1)f1).a.getBoolean("fetch_always", false);
        this.C1 = ((vl1)f1).a.getBoolean("hide_bio", false);
        this.A1 = "unknown";
        if (q != null) {
            j9r.restoreFromBundle((Object)this, q);
        }
        else {
            this.m1 = 0;
            this.i1 = new brb();
            if (this.l1 == 18) {
                this.j1 = xth.a(0);
            }
            final f74$a f74$a = (f74$a)((vl1)f1).a.getParcelable("checkbox_config");
            if (f74$a != null) {
                this.k1 = new f74(f74$a);
            }
        }
        final UserIdentifier f2 = super.F0;
        final UserIdentifier g1 = this.g1();
        final int l1 = this.l1;
        final kmw b1 = new kmw(f2, g1, l1, this.A1);
        this.B1 = b1;
        super.Z0 = b1.d;
        if (q == null) {
            if (l1 != 1) {
                if (l1 != 4) {
                    if (l1 == 18) {
                        final af4 af4 = new af4(g1);
                        ((u0p)af4).q(new String[] { "follower_requests::::impression" });
                        cbw.b((elm)af4);
                    }
                }
                else {
                    ffz.o0(kaa.a);
                }
            }
            else {
                final af4 af5 = new af4(g1);
                ((u0p)af5).q(new String[] { "followers::::impression" });
                cbw.b((elm)af5);
            }
        }
        f.i(super.T0.g(), (n93)new n3(this, 14));
        final adw h1 = this.h1();
        final boolean b2 = ((vl1)this.f1()).a.getBoolean("follow", false) || (h1.p() && super.F0.equals((Object)h1.k()) && this.l1 == 18);
        final UserIdentifier g2 = this.g1();
        final int l2 = this.l1;
        Object o = null;
        final my5 my5 = null;
        olw olw;
        if (l2 != 4) {
            if (l2 != 18) {
                if (l2 != 42) {
                    final odw$a$b odw$a$b = new odw$a$b();
                    ((odw$a$a)odw$a$b).h = b2;
                    final int a5 = c5j.a;
                    ((odw$a$a)odw$a$b).i = (this.C1 ^ true);
                    this.l1((odw$a$a)odw$a$b);
                    olw = new olw(this.q0(), (a3e)new odw(this.q0(), UserIdentifier.getCurrent(), (odw$a)((n4j)odw$a$b).e()), (ny5)new scn((Object)this, 12));
                    olw.H0 = (ygj)this;
                }
                else {
                    final a74$a$a a74$a$a = new a74$a$a();
                    ((odw$a$a)a74$a$a).h = b2;
                    final int a6 = c5j.a;
                    final f74 k1 = this.k1;
                    jee.l((Object)k1);
                    a74$a$a.m = k1;
                    a74$a$a.n = (odw$b)new amw((Object)p7, 0);
                    ((odw$a$a)a74$a$a).i = (this.C1 ^ true);
                    ((odw$a$a)a74$a$a).l = true;
                    this.l1((odw$a$a)a74$a$a);
                    olw = new olw(this.q0(), (a3e)new a74(this.q0(), UserIdentifier.getCurrent(), (a74$a)((n4j)a74$a$a).e()), (ny5)new eu4((Object)this, 27));
                    olw.H0 = (ygj)this;
                    final rcp b3 = new rcp((rcp$a)new emw(this), (BaseAdapter)olw);
                    final f74 k2 = this.k1;
                    jee.l((Object)k2);
                    k2.b = b3;
                    final cnd$b cnd$b = new cnd$b((y2e)olw, (my5)b3);
                    cnd$b.d = false;
                    o = new cnd(cnd$b);
                }
            }
            else {
                final hjd$a$a hjd$a$a = new hjd$a$a();
                ((r8w$a$a)hjd$a$a).a = (odw$b)new xlw(p7, 0);
                final int a7 = c5j.a;
                ((r8w$a$a)hjd$a$a).b = (odw$b)new ylw(p7, 0);
                hjd$a$a.c = (odw$b)new zlw(p7, 0);
                final olw olw2 = new olw(this.q0(), (a3e)new hjd(this.q0(), UserIdentifier.getCurrent(), (hjd$a)((n4j)hjd$a$a).e(), (Map)this.j1), (ny5)new lo((Object)this, 18));
                o = my5;
                olw = olw2;
            }
        }
        else {
            final odw$a$b odw$a$b2 = new odw$a$b();
            ((odw$a$a)odw$a$b2).h = true;
            final int a8 = c5j.a;
            ((odw$a$a)odw$a$b2).i = (this.C1 ^ true);
            ((odw$a$a)odw$a$b2).j = true;
            this.l1((odw$a$a)odw$a$b2);
            if (super.F0.equals((Object)g2) && ((vl1)this.f1()).a.getBoolean("enable_list_members_action", false)) {
                ((odw$a$a)odw$a$b2).k = true;
            }
            olw = new olw(this.q0(), (a3e)new odw(this.q0(), UserIdentifier.getCurrent(), (odw$a)((n4j)odw$a$b2).e()), (ny5)new qqd(this, 15));
            olw.H0 = (ygj)this;
        }
        if (o != null) {
            super.Y0.S1((my5)o);
        }
        else {
            super.Y0.S1((my5)olw);
        }
        super.H0.u1((n93)new dn((Object)this, 18));
        f.j((h5j)a.a(), (n93)new doa((Object)this, 12), (z9a)super.P0);
        f.j((h5j)a2.a(), (n93)new csf((Object)this, 17), (z9a)super.P0);
        f.j((h5j)a3.a(), (n93)new hg1((Object)this, 14), (z9a)super.P0);
        f.j((h5j)a4.a(), (n93)new o3((Object)this, (Object)yaa, 2), (z9a)super.P0);
        Objects.requireNonNull(mgl.Companion);
        final dn6 h2 = obi.h((Class)mgl.class, (tsm)new lgl());
        this.y1 = (dn6<k7l, mgl>)h2;
        f.i(h2.c().filter((ytk)b71.V0), (n93)new so3((Object)this, 17));
    }
    
    public static void m1(final int n) {
        m1f.e().c(n, 1);
    }
    
    public final void M0() {
        super.M0();
        if (this.z1) {
            if (this.d1) {
                this.c1();
            }
            else {
                this.e1(3);
            }
        }
        else if (!this.F0()) {
            this.c1();
        }
        else if (this.v0().f().isEmpty()) {
            this.e1(3);
        }
    }
    
    public final void O0(final n3e<sbw> n3e) {
        super.O0((n3e)n3e);
        if (this.l1 == 18 && !this.D1) {
            Objects.requireNonNull(n3e);
            final n3e$b n3e$b = new n3e$b((n3e)n3e);
            int n = 0;
            while (n3e$b.hasNext()) {
                if ((((sbw)((pgz)n3e$b).next()).b & 0x4) == 0x4) {
                    ++n;
                }
            }
            if (n > 0) {
                this.q1.d(new clg(this.g1()));
            }
            this.D1 = true;
        }
        if (!this.c1) {
            if (n3e.isEmpty()) {
                this.e1(3);
            }
            this.c1 = true;
        }
        else if (this.l1 == 4) {
            ffz.o0(maa.a);
        }
    }
    
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        ((j9r)new UsersContentViewProvider$SavedState(this)).saveToBundle(bundle);
    }
    
    public final void T0() {
        this.e1(2);
    }
    
    public final void W(final View view, final int n, final int n2) {
    }
    
    public final int X(int n, final int n2, final int n3) {
        if (n > 0 && n3 > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public final void a() {
        this.T0();
        final kmw b1 = this.B1;
        final int b2 = b1.b;
        String b3;
        if (b2 != 1) {
            if (b2 != 4) {
                b3 = null;
            }
            else {
                b3 = ed.B(new StringBuilder(), b1.c, ":::");
            }
        }
        else {
            b3 = "followers:::";
        }
        if (b3 != null) {
            final af4 af4 = new af4(b1.a);
            ((u0p)af4).q(new String[] { b3, "get_newer" });
            cbw.b((elm)af4);
        }
    }
    
    public final boolean d1(final int n) {
        if (!this.d1 && this.z1 && n == 200) {
            this.d1 = true;
            this.c1();
            return true;
        }
        return false;
    }
    
    public final void e1(final int n) {
        final int l1 = this.l1;
        Object o;
        if (l1 != 4) {
            if (l1 != 18) {
                if (l1 != 42) {
                    return;
                }
                o = new ohm(n, this.g1(), super.G0, this.e1, this.h1);
            }
            else {
                o = new jjd(n, this.g1());
            }
        }
        else {
            final UserIdentifier g1 = this.g1();
            final UserIdentifier f0 = super.F0;
            final long h1 = this.h1;
            int n2 = 0;
            if (n != 1) {
                if (n != 2 && n != 3) {
                    throw new IllegalArgumentException(udu.z("Invalid fetch type: ", n));
                }
                n2 = 0;
            }
            else if (this.v0().f().getSize() > 0) {
                n2 = 1;
            }
            o = new pkf(n, g1, f0, h1, n2);
            if (n == 3) {
                ffz.o0(maa.b);
            }
            else {
                ffz.o0(maa.c);
            }
        }
        ((yaa)super.H0).e(o);
    }
    
    public final imw f1() {
        return new imw(((Fragment)super.E0).J0);
    }
    
    public final void g(final View view, final Object o, final int n) {
        final sbw sbw = (sbw)o;
        if (view instanceof UserView && this.f1 != null) {
            final UserView g1 = (UserView)view;
            if (g1.c() && ((BaseUserView)g1).getUserId() == this.f1.D0) {
                this.g1 = g1;
            }
        }
    }
    
    public final UserIdentifier g1() {
        return this.h1().k();
    }
    
    public final adw h1() {
        final UserIdentifier fromId = UserIdentifier.fromId(((BaseBundle)((vl1)this.f1()).a).getLong("target_session_owner_id", UserIdentifier.UNDEFINED.getId()));
        adw adw;
        if (UserIdentifier.isCurrentlyLoggedIn(fromId)) {
            adw = zcw.b(fromId);
        }
        else {
            adw = zcw.d();
        }
        return adw;
    }
    
    public final boolean i1() {
        return UserIdentifier.isCurrentUser(UserIdentifier.fromId(((BaseBundle)((vl1)this.f1()).a).getLong("target_session_owner_id", UserIdentifier.UNDEFINED.getId())));
    }
    
    @Deprecated
    public final void j1() {
        final q3e v0 = this.v0();
        final int a = c5j.a;
        ((epi)v0).g();
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n != 2) {
            if (n != 3) {
                if (n == 4) {
                    if (n2 == -1) {
                        final UsersContentViewProvider.UsersContentViewProvider$a o1 = this.o1;
                        final cgv f1 = this.f1;
                        Objects.requireNonNull(o1);
                        final ef3 ef3 = new ef3(o1.a.q0(), o1.a.g1());
                        ef3.l1 = f1.D0;
                        o1.a.t1.d(ef3);
                        o1.a.i1.h(f1.D0);
                        final UserView g1 = this.g1;
                        if (g1 != null) {
                            g1.setPendingVisibility(8);
                            this.g1.setFollowVisibility(0);
                        }
                    }
                }
            }
            else if (n2 == -1) {
                UsersContentViewProvider.UsersContentViewProvider$a.b(this.o1, this.f1);
                final UserView g2 = this.g1;
                if (g2 != null) {
                    g2.setIsFollowing(false);
                    this.g1.E1 = true;
                }
            }
        }
        else if (n2 == -1) {
            this.x1.a();
        }
    }
    
    public final void k1(final sbw sbw, final View view) {
        if (sbw != null) {
            final cgv h = sbw.h;
            jee.l((Object)h);
            if (this.k1 == null) {
                this.p1.b(h);
            }
            else {
                final UserView userView = (UserView)view;
                final CheckBox y0 = userView.Y0;
                if (y0 != null && ((View)y0).isEnabled()) {
                    ((CompoundButton)y0).setChecked(((CompoundButton)y0).isChecked() ^ true);
                    this.p1.a((BaseUserView)userView, h);
                }
            }
        }
    }
    
    public final gdv$b l0(final gdv$b gdv$b) {
        gdv$b.a = "users";
        final i2a$d b = gdv$b.b;
        b.c = new i2a$e((g2a)dwj.f(((vl1)this.f1()).a, "empty_config", (rlp)g2a.i));
        b.b();
        return gdv$b;
    }
    
    public final void l1(final odw$a$a odw$a$a) {
        final UsersContentViewProvider.UsersContentViewProvider$b p = this.p1;
        Objects.requireNonNull(p);
        odw$a$a.a = (odw$b)new bmw(p);
        final int a = c5j.a;
        final UsersContentViewProvider.UsersContentViewProvider$b p2 = this.p1;
        Objects.requireNonNull(p2);
        odw$a$a.d = (odw$b)new xlw(p2, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b p3 = this.p1;
        Objects.requireNonNull(p3);
        odw$a$a.b = (odw$b)new ylw(p3, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b p4 = this.p1;
        Objects.requireNonNull(p4);
        odw$a$a.c = (odw$b)new zlw(p4, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b p5 = this.p1;
        Objects.requireNonNull(p5);
        odw$a$a.e = (odw$b)new cmw(p5);
        odw$a$a.f = (odw$b)new dmw(this);
        odw$a$a.g = (odw$b)new amw((Object)this, 1);
    }
}
