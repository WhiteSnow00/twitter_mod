// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.users;

import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.twitter.ui.user.UserApprovalView;
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

@a91
public class UsersContentViewProvider extends idv<icw> implements mhj<View, icw>, dx8, oek
{
    public final jo6<b8l, ygl> A1;
    public boolean B1;
    public String C1;
    public zmw D1;
    public boolean E1;
    public boolean F1;
    public boolean e1;
    public boolean f1;
    public long[] g1;
    public qgv h1;
    public UserView i1;
    public long j1;
    public dsb k1;
    public Map<UserIdentifier, Integer> l1;
    public j84 m1;
    public int n1;
    public int o1;
    public final oc1 p1;
    public final UsersContentViewProvider.UsersContentViewProvider$a q1;
    public final UsersContentViewProvider.UsersContentViewProvider$b r1;
    public final laj<vlg> s1;
    public final laj<z47> t1;
    public final laj<nt8> u1;
    public final laj<eg3> v1;
    public final laj<b22> w1;
    public final laj<ffm> x1;
    public final swh y1;
    public final nn z1;
    
    public UsersContentViewProvider(final hdv hdv, final oc1 p7, final cbs cbs, final fca<ikf> fca, final fci<?> fci, final nn z1, final swh y1) {
        super(hdv);
        this.q1 = new UsersContentViewProvider.UsersContentViewProvider$a(this);
        final UsersContentViewProvider.UsersContentViewProvider$b r1 = new UsersContentViewProvider.UsersContentViewProvider$b(this);
        this.r1 = r1;
        this.C1 = "unknown";
        this.p1 = p7;
        this.z1 = z1;
        this.s1 = (laj<vlg>)cbs.a((Class)vlg.class);
        this.v1 = (laj<eg3>)cbs.a((Class)eg3.class);
        final laj a = cbs.a((Class)z47.class);
        this.t1 = (laj<z47>)a;
        final laj a2 = cbs.a((Class)nt8.class);
        this.u1 = (laj<nt8>)a2;
        final laj a3 = cbs.a((Class)b22.class);
        this.w1 = (laj<b22>)a3;
        final laj a4 = cbs.a((Class)ffm.class);
        this.x1 = (laj<ffm>)a4;
        this.y1 = y1;
        final Bundle q = hdv.q;
        final xmw f1 = this.f1();
        this.n1 = f1.i();
        this.j1 = ((BaseBundle)((am1)f1).a).getLong("tag", -1L);
        final long[] longArray = ((BaseBundle)((am1)f1).a).getLongArray("user_ids");
        if (longArray != null && longArray.length > 0) {
            this.g1 = longArray;
        }
        this.B1 = ((am1)f1).a.getBoolean("fetch_always", false);
        this.E1 = ((am1)f1).a.getBoolean("hide_bio", false);
        this.C1 = "unknown";
        if (q != null) {
            iar.restoreFromBundle((Object)this, q);
        }
        else {
            this.o1 = 0;
            this.k1 = new dsb();
            if (this.n1 == 18) {
                this.l1 = nuh.a(0);
            }
            final j84$a j84$a = (j84$a)((am1)f1).a.getParcelable("checkbox_config");
            if (j84$a != null) {
                this.m1 = new j84(j84$a);
            }
        }
        final UserIdentifier h0 = super.H0;
        final UserIdentifier g1 = this.g1();
        final int n1 = this.n1;
        final zmw d1 = new zmw(h0, g1, n1, this.C1);
        this.D1 = d1;
        super.b1 = d1.d;
        if (q == null) {
            if (n1 != 1) {
                if (n1 != 4) {
                    if (n1 == 18) {
                        final fg4 fg4 = new fg4(g1);
                        ((o1p)fg4).q(new String[] { "follower_requests::::impression" });
                        sbw.b((tlm)fg4);
                    }
                }
                else {
                    jty.T(rba.a);
                }
            }
            else {
                final fg4 fg5 = new fg4(g1);
                ((o1p)fg5).q(new String[] { "followers::::impression" });
                sbw.b((tlm)fg5);
            }
        }
        f.i(super.V0.g(), (fa3)new in((Object)this, 13));
        final qdw h2 = this.h1();
        final boolean b = ((am1)this.f1()).a.getBoolean("follow", false) || (h2.p() && super.H0.equals((Object)h2.k()) && this.n1 == 18);
        final UserIdentifier g2 = this.g1();
        final int n2 = this.n1;
        Object o = null;
        fmw fmw;
        if (n2 != 4) {
            if (n2 != 18) {
                if (n2 != 42) {
                    final dew$a$b dew$a$b = new dew$a$b();
                    ((dew$a$a)dew$a$b).h = b;
                    final int a5 = o5j.a;
                    ((dew$a$a)dew$a$b).i = (this.E1 ^ true);
                    this.l1((dew$a$a)dew$a$b);
                    fmw = new fmw(this.q0(), (b4e)new dew(this.q0(), UserIdentifier.getCurrent(), (dew.a)((z4j)dew$a$b).e()), (tz5<icw>)new gf8((Object)this, 21));
                    fmw.J0 = (mhj<View, icw>)this;
                }
                else {
                    final e84$a$a e84$a$a = new e84$a$a();
                    ((dew$a$a)e84$a$a).h = b;
                    final int a6 = o5j.a;
                    final j84 m1 = this.m1;
                    vmw.g((Object)m1);
                    e84$a$a.m = m1;
                    e84$a$a.n = (dew.b)new qmw((Object)r1, 0);
                    ((dew$a$a)e84$a$a).i = (this.E1 ^ true);
                    ((dew$a$a)e84$a$a).l = true;
                    this.l1((dew$a$a)e84$a$a);
                    fmw = new fmw(this.q0(), (b4e)new e84(this.q0(), UserIdentifier.getCurrent(), (e84$a)((z4j)e84$a$a).e()), (tz5<icw>)new isx((Object)this, 20));
                    fmw.J0 = (mhj<View, icw>)this;
                    final ndp b2 = new ndp((ndp$a)new umw(this), (BaseAdapter)fmw);
                    final j84 m2 = this.m1;
                    vmw.g((Object)m2);
                    m2.b = b2;
                    final cod$b cod$b = new cod$b((z3e)fmw, (sz5)b2);
                    cod$b.d = false;
                    o = new cod(cod$b);
                }
            }
            else {
                final ikd$a.a a7 = new ikd$a.a();
                a7.a = (dew.b)new nmw(r1, 0);
                final int a8 = o5j.a;
                a7.b = (dew.b)new omw(r1, 0);
                a7.c = (dew.b<UserApprovalView>)new pmw(r1, 0);
                fmw = new fmw(this.q0(), (b4e)new ikd(this.q0(), UserIdentifier.getCurrent(), (ikd$a)((z4j)a7).e(), (Map)this.l1), (tz5<icw>)new pn1((Object)this, 20));
            }
        }
        else {
            final dew$a$b dew$a$b2 = new dew$a$b();
            ((dew$a$a)dew$a$b2).h = true;
            final int a9 = o5j.a;
            ((dew$a$a)dew$a$b2).i = (this.E1 ^ true);
            ((dew$a$a)dew$a$b2).j = true;
            this.l1((dew$a$a)dew$a$b2);
            if (super.H0.equals((Object)g2) && ((am1)this.f1()).a.getBoolean("enable_list_members_action", false)) {
                ((dew$a$a)dew$a$b2).k = true;
            }
            fmw = new fmw(this.q0(), (b4e)new dew(this.q0(), UserIdentifier.getCurrent(), (dew.a)((z4j)dew$a$b2).e()), (tz5<icw>)new l71((Object)this, 23));
            fmw.J0 = (mhj<View, icw>)this;
        }
        if (o != null) {
            super.a1.S1((sz5)o);
        }
        else {
            super.a1.S1((sz5)fmw);
        }
        super.J0.u1((fa3)new h3((Object)this, 19));
        f.j(a.a(), (fa3)new jg1((Object)this, 14), (gba)super.R0);
        f.j(a2.a(), (fa3)new es2((Object)this, 17), (gba)super.R0);
        f.j(a3.a(), (fa3)new wgk((Object)this, 14), (gba)super.R0);
        f.j(a4.a(), (fa3)new zcl((Object)this, (Object)fca, 1), (gba)super.R0);
        Objects.requireNonNull(ygl.Companion);
        final jo6<b8l, ygl> h3 = fci.h(ygl.class, (itm<ygl>)new xgl());
        this.A1 = h3;
        f.i(h3.c().filter((ouk)g71.V0), (fa3)new qjl((Object)this, 16));
    }
    
    public static void m1(final int n) {
        ehk.c().c(n, 1);
    }
    
    public final void M0() {
        super.M0();
        if (this.B1) {
            if (this.f1) {
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
    
    public final void O0(final p4e<icw> p4e) {
        super.O0((p4e)p4e);
        if (this.n1 == 18 && !this.F1) {
            Objects.requireNonNull(p4e);
            final p4e$b p4e$b = new p4e$b((p4e)p4e);
            int n = 0;
            while (p4e$b.hasNext()) {
                if ((((icw)((ohz)p4e$b).next()).b & 0x4) == 0x4) {
                    ++n;
                }
            }
            if (n > 0) {
                this.s1.d((pnm)new vlg(this.g1()));
            }
            this.F1 = true;
        }
        if (!this.e1) {
            if (p4e.isEmpty()) {
                this.e1(3);
            }
            this.e1 = true;
        }
        else if (this.n1 == 4) {
            jty.T(tba.a);
        }
    }
    
    public final void Q0(final Bundle bundle) {
        super.Q0(bundle);
        ((iar)new UsersContentViewProvider$SavedState(this)).saveToBundle(bundle);
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
        final zmw d1 = this.D1;
        final int b = d1.b;
        String y;
        if (b != 1) {
            if (b != 4) {
                y = null;
            }
            else {
                y = m51.y(new StringBuilder(), d1.c, ":::");
            }
        }
        else {
            y = "followers:::";
        }
        if (y != null) {
            final fg4 fg4 = new fg4(d1.a);
            ((o1p)fg4).q(new String[] { y, "get_newer" });
            sbw.b((tlm)fg4);
        }
    }
    
    public final boolean d1(final int n) {
        if (!this.f1 && this.B1 && n == 200) {
            this.f1 = true;
            this.c1();
            return true;
        }
        return false;
    }
    
    public final void e1(final int n) {
        final int n2 = this.n1;
        Object o;
        if (n2 != 4) {
            if (n2 != 18) {
                if (n2 != 42) {
                    return;
                }
                o = new dim(n, this.g1(), super.I0, this.g1, this.j1);
            }
            else {
                o = new kkd(n, this.g1());
            }
        }
        else {
            final UserIdentifier g1 = this.g1();
            final UserIdentifier h0 = super.H0;
            final long j1 = this.j1;
            int n3 = 0;
            if (n != 1) {
                if (n != 2 && n != 3) {
                    throw new IllegalArgumentException(rk0.B("Invalid fetch type: ", n));
                }
                n3 = 0;
            }
            else if (this.v0().f().getSize() > 0) {
                n3 = 1;
            }
            o = new mlf(n, g1, h0, j1, n3);
            if (n == 3) {
                jty.T(tba.b);
            }
            else {
                jty.T(tba.c);
            }
        }
        ((fca)super.J0).e(o);
    }
    
    public final xmw f1() {
        return new xmw(((Fragment)super.G0).L0);
    }
    
    public final void g(final View view, final Object o, final int n) {
        final icw icw = (icw)o;
        if (view instanceof UserView && this.h1 != null) {
            final UserView i1 = (UserView)view;
            if (i1.c() && ((BaseUserView)i1).getUserId() == this.h1.F0) {
                this.i1 = i1;
            }
        }
    }
    
    public final UserIdentifier g1() {
        return this.h1().k();
    }
    
    public final qdw h1() {
        final UserIdentifier fromId = UserIdentifier.fromId(((BaseBundle)((am1)this.f1()).a).getLong("target_session_owner_id", UserIdentifier.UNDEFINED.getId()));
        qdw qdw;
        if (UserIdentifier.isCurrentlyLoggedIn(fromId)) {
            qdw = pdw.b(fromId);
        }
        else {
            qdw = pdw.d();
        }
        return qdw;
    }
    
    public final boolean i1() {
        return UserIdentifier.isCurrentUser(UserIdentifier.fromId(((BaseBundle)((am1)this.f1()).a).getLong("target_session_owner_id", UserIdentifier.UNDEFINED.getId())));
    }
    
    @Deprecated
    public final void j1() {
        final s4e v0 = this.v0();
        final int a = o5j.a;
        ((vpi)v0).g();
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        if (n != 2) {
            if (n != 3) {
                if (n == 4) {
                    if (n2 == -1) {
                        final UsersContentViewProvider.UsersContentViewProvider$a q1 = this.q1;
                        final qgv h1 = this.h1;
                        Objects.requireNonNull(q1);
                        final eg3 eg3 = new eg3(q1.a.q0(), q1.a.g1());
                        eg3.n1 = h1.F0;
                        q1.a.v1.d((pnm)eg3);
                        q1.a.k1.h(h1.F0);
                        final UserView i1 = this.i1;
                        if (i1 != null) {
                            i1.setPendingVisibility(8);
                            this.i1.setFollowVisibility(0);
                        }
                    }
                }
            }
            else if (n2 == -1) {
                UsersContentViewProvider.UsersContentViewProvider$a.b(this.q1, this.h1);
                final UserView i2 = this.i1;
                if (i2 != null) {
                    i2.setIsFollowing(false);
                    this.i1.G1 = true;
                }
            }
        }
        else if (n2 == -1) {
            this.z1.a();
        }
    }
    
    public final void k1(final icw icw, final View view) {
        if (icw != null) {
            final qgv h = icw.h;
            vmw.g((Object)h);
            if (this.m1 == null) {
                this.r1.b(h);
            }
            else {
                final UserView userView = (UserView)view;
                final CheckBox a1 = userView.a1;
                if (a1 != null && ((View)a1).isEnabled()) {
                    ((CompoundButton)a1).setChecked(((CompoundButton)a1).isChecked() ^ true);
                    this.r1.a((BaseUserView)userView, h);
                }
            }
        }
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "users";
        final k3a$d b = udv$b.b;
        b.c = new k3a$e((i3a)swj.f(((am1)this.f1()).a, "empty_config", (nmp)i3a.i));
        b.b();
        return udv$b;
    }
    
    public final void l1(final dew$a$a dew$a$a) {
        final UsersContentViewProvider.UsersContentViewProvider$b r1 = this.r1;
        Objects.requireNonNull(r1);
        dew$a$a.a = (dew.b)new rmw(r1);
        final int a = o5j.a;
        final UsersContentViewProvider.UsersContentViewProvider$b r2 = this.r1;
        Objects.requireNonNull(r2);
        dew$a$a.d = (dew.b)new nmw(r2, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b r3 = this.r1;
        Objects.requireNonNull(r3);
        dew$a$a.b = (dew.b)new omw(r3, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b r4 = this.r1;
        Objects.requireNonNull(r4);
        dew$a$a.c = (dew.b)new pmw(r4, 1);
        final UsersContentViewProvider.UsersContentViewProvider$b r5 = this.r1;
        Objects.requireNonNull(r5);
        dew$a$a.e = (dew.b)new smw(r5);
        dew$a$a.f = (dew.b)new tmw(this);
        dew$a$a.g = (dew.b)new qmw((Object)this, 1);
    }
}
