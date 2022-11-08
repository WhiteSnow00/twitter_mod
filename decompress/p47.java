import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.Locale;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p47 extends i1v<hfv$b>
{
    public static final tba v1;
    public final Context i1;
    public final long j1;
    public final hil k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public int[] o1;
    public int p1;
    public hfv q1;
    public final String r1;
    public final aav s1;
    public final wsc<hfv$b, pav> t1;
    public final dw0 u1;
    
    static {
        v1 = (tba)rba.c("app", "twitter_service", "follow", "create");
    }
    
    public p47(final Context context, final UserIdentifier userIdentifier, final long n, final hil hil) {
        this(context, userIdentifier, n, hil, aav.d2(userIdentifier), (wsc<hfv$b, pav>)f9g.c((Class)hfv$b.class), dw0.a());
    }
    
    public p47(final Context i1, final UserIdentifier userIdentifier, final long j1, final hil k1, final aav s1, final wsc<hfv$b, pav> t1, final dw0 u1) {
        super(userIdentifier, 0);
        this.p1 = -1;
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.s1 = s1;
        this.t1 = t1;
        this.u1 = u1;
        ((cw0)this).G((ysm)new jdi());
        final vom y = this.Y();
        final wg4 i2 = wg4.I0;
        final j1p$a j1p$a = (j1p$a)y;
        j1p$a.c(i2);
        final tba v1 = p47.v1;
        final j1p a = j1p$a.a;
        a.J0 = (sba)v1;
        a.K0 = (otk<tsc<OBJECT, ERROR>>)m0p.e;
        this.r1 = o0(j1, super.P0);
    }
    
    public static String o0(final long n, final UserIdentifier userIdentifier) {
        return String.format(Locale.ENGLISH, "follow_%d_%d", userIdentifier.getId(), n);
    }
    
    public final void C(final tsc<hfv$b, pav> tsc) {
        final hn6 z = this.Z(this.i1);
        if (((ksc)this).T().b) {
            final hfv$b hfv$b = (hfv$b)this.t1.C0;
            if (hfv$b != null && hfv$b.l()) {
                final int x2 = this.s1.x2(this.j1);
                int h;
                if (((hfv$a)hfv$b).k) {
                    h = tdy.L0(tdy.Y0(x2, 1), 16384);
                }
                else {
                    h = tdy.L0(x2, 1);
                }
                ((hfv$a)hfv$b).H = h;
                final int a = w4j.a;
                final hfv z2 = this.s1.Z1(this.j1);
                if (z2 != null) {
                    ((hfv$a)hfv$b).s = z2.K1;
                }
                final hfv q1 = (hfv)((h4j)hfv$b).e();
                this.q1 = q1;
                this.s1.r0((Collection)ijf.v((Object)q1), super.P0.getId(), z);
                final dw0 u1 = this.u1;
                final ds ds = new ds(this.i1, super.P0, this.q1);
                Objects.requireNonNull(u1);
                u1.d((cw0<Object>)new cw0((fw0)ds));
                final dw0 u2 = this.u1;
                final j2c j2c = new j2c(this.i1, super.P0, this.s1);
                j2c.i1 = this.q1;
                u2.d((cw0<Object>)j2c);
            }
        }
        else {
            final pav pav = (pav)this.t1.D0;
            this.o1 = pav.g(pav);
            if (pav != null) {
                final Iterator<mav> iterator = pav.iterator();
                while (iterator.hasNext() && iterator.next().a != 250) {}
            }
            this.s1.Z1(super.P0.getId());
            this.s1.q4(this.j1, 1, z, true, super.P0.getId());
        }
        z.b();
    }
    
    public final Runnable d(final cw0 cw0) {
        if (cw0 != null) {
            cw0.H(false);
        }
        return (Runnable)new o20((Object)this, 8);
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        rbv.q();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/friendships/create.json", "/");
        ((qrc.a)rbv).f("send_error_codes", true);
        ((qrc.a)rbv).d("user_id", String.valueOf(this.j1));
        if (this.l1) {
            ((qrc.a)rbv).d("follow", "true");
        }
        final hil k1 = this.k1;
        if (k1 != null) {
            final String a2 = k1.a;
            if (a2 != null) {
                ((qrc.a)rbv).d("impression_id", a2);
            }
            if (this.k1.d()) {
                ((qrc.a)rbv).f("earned", true);
            }
        }
        ((qrc.a)rbv).d("handles_challenges", "1");
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<hfv$b, pav> g0() {
        return this.t1;
    }
    
    public final String s() {
        return this.r1;
    }
}
