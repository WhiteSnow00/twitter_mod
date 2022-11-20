import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0k implements a00<k0k, in3>
{
    public static final n0k.n0k$a Companion;
    public static final Map<j06, i06> d;
    public final zbq<o0k> a;
    public final sbu b;
    public final cq0 c;
    
    static {
        Companion = new n0k.n0k$a();
        d = tkg.n0(new lvj[] { new lvj((Object)j06.E0, (Object)i06.E0), new lvj((Object)j06.F0, (Object)i06.F0), new lvj((Object)j06.G0, (Object)i06.G0), new lvj((Object)j06.H0, (Object)i06.H0) });
    }
    
    public n0k(final zbq<o0k> a, final sbu b, final cq0 c) {
        czd.f((Object)a, "sequenceManagerPct");
        czd.f((Object)b, "twSystemClock");
        czd.f((Object)c, "appUpgradeChecker");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final h00 a(final wz wz) {
        final k0k k0k = (k0k)wz;
        czd.f((Object)k0k, "event");
        final long a = this.b.a();
        final q63$a o0 = q63.O0;
        final u0k a2 = k0k.a;
        final UUID b = ((z0k)a2).R().b;
        final eh4$a eh4$a = new eh4$a();
        final eh4$b g0 = eh4$b.G0;
        final Long value = b.getMostSignificantBits();
        final Long value2 = b.getLeastSignificantBits();
        final nvt nvt = new nvt();
        if (value != null) {
            nvt.D0 = value;
            nvt.F0.set(0, true);
        }
        if (value2 != null) {
            nvt.E0 = value2;
            nvt.F0.set(1, true);
        }
        eh4$a.b(g0, (Object)nvt);
        final eh4$b f0 = eh4$b.F0;
        final zbq<o0k> a3 = this.a;
        final UserIdentifier a4 = ((z0k)a2).R().a;
        Objects.requireNonNull(a3);
        czd.f((Object)a4, "userIdentifier");
        eh4$a.b(f0, (Object)((o0k)a3.a.a(a4, a3.b)).a);
        eh4$a.b(eh4$b.H0, (Object)a2.e());
        eh4$a.b(eh4$b.I0, (Object)ikr.v(((z0k)a2).getName(), 128));
        final eh4$b j0 = eh4$b.J0;
        final String a5 = ((z0k)a2).T().a;
        Object value3 = null;
        eh4$a.b(j0, (Object)new wea(a5));
        final eh4$b k0 = eh4$b.K0;
        final u0k parent = a2.getParent();
        if (parent != null) {
            value3 = parent.e();
        }
        eh4$a.b(k0, value3);
        eh4$a.b(eh4$b.O0, (Object)((z0k)a2).V());
        eh4$a.b(eh4$b.P0, (Object)((z0k)a2).Z());
        final eh4$b q0 = eh4$b.Q0;
        final List x = ((z0k)a2).X();
        final ArrayList list = new ArrayList<zc0>(iq4.H((Iterable)x, 10));
        for (final z0k.c c : x) {
            final Long value4 = c.a;
            final String b2 = c.b;
            final zc0 zc0 = new zc0();
            if (value4 != null) {
                zc0.D0 = value4;
                zc0.F0.set(0, true);
            }
            if (b2 != null) {
                zc0.E0 = b2;
            }
            list.add(zc0);
        }
        eh4$a.b(q0, (Object)list);
        eh4$a.b(eh4$b.R0, (Object)new ao3());
        final eh4$b m0 = eh4$b.M0;
        final sro$a k2 = sro.K0;
        final Integer value5 = ((z0k)a2).Y();
        final t2k t2k = new t2k();
        if (value5 != null) {
            t2k.D0 = value5;
            t2k.E0.set(0, true);
        }
        eh4$a.b(m0, (Object)s9i.r(new sro(k2, (Object)t2k)));
        final eh4$b v0 = eh4$b.V0;
        final List c2 = a2.c();
        final ArrayList list2 = new ArrayList<i10>(iq4.H((Iterable)c2, 10));
        for (final u0k u0k : c2) {
            final i10$a i10$a = new i10$a();
            final i10$b f2 = i10$b.F0;
            final String name = ((z0k)u0k).getName();
            if (name != null) {
                i10$a.a = name;
            }
            if (i10$a.a == null) {
                final StringBuilder i = fu8.j("Required field 'Name' was not present! Struct: ");
                i.append(i10$a.toString());
                throw new IllegalArgumentException(i.toString());
            }
            list2.add(new i10(i10$a.a));
        }
        eh4$a.b(v0, (Object)list2);
        if (((z0k)a2).S().D0) {
            final eh4$b u0 = eh4$b.U0;
            final n0k.n0k$a companion = n0k.Companion;
            final j06 s = ((z0k)a2).S();
            Objects.requireNonNull(companion);
            final i06 value6 = n0k.d.get(s);
            czd.c((Object)value6);
            eh4$a.b(u0, (Object)new h06((i06)value6));
        }
        final cq0 c3 = this.c;
        if (c3.c || c3.a()) {
            final eh4$b t0 = eh4$b.T0;
            final olr olr = new olr();
            ((s6s)olr).p((k6s)olr$a.F0, (Object)new n0b());
            eh4$a.a((Object)olr);
        }
        final Long d = a2.d();
        if (d != null) {
            final long longValue = d.longValue();
            final eh4$b t2 = eh4$b.T0;
            final olr olr2 = new olr();
            final olr$a g2 = olr$a.G0;
            final Long value7 = longValue;
            final qdi qdi = new qdi();
            if (value7 != null) {
                qdi.D0 = value7;
                qdi.E0.set(0, true);
            }
            ((s6s)olr2).p((k6s)g2, (Object)qdi);
            eh4$a.a((Object)olr2);
        }
        final fh4$a j2 = fh4.J0;
        if (eh4$a.a == null) {
            final StringBuilder l = fu8.j("Required field 'messageSequenceNumber' was not present! Struct: ");
            l.append(eh4$a.toString());
            throw new IllegalArgumentException(l.toString());
        }
        if (eh4$a.b == null) {
            final StringBuilder j3 = fu8.j("Required field 'traceId' was not present! Struct: ");
            j3.append(eh4$a.toString());
            throw new IllegalArgumentException(j3.toString());
        }
        if (eh4$a.c == null) {
            final StringBuilder j4 = fu8.j("Required field 'spanId' was not present! Struct: ");
            j4.append(eh4$a.toString());
            throw new IllegalArgumentException(j4.toString());
        }
        if (eh4$a.d == null) {
            final StringBuilder j5 = fu8.j("Required field 'name' was not present! Struct: ");
            j5.append(eh4$a.toString());
            throw new IllegalArgumentException(j5.toString());
        }
        if (eh4$a.m != null) {
            final Long a6 = eh4$a.a;
            final nvt b3 = eh4$a.b;
            final Integer c4 = eh4$a.c;
            final String d2 = eh4$a.d;
            final wea e = eh4$a.e;
            final Integer f3 = eh4$a.f;
            final List g3 = eh4$a.g;
            final List h = eh4$a.h;
            final List i2 = eh4$a.i;
            final Long j6 = eh4$a.j;
            final Long k3 = eh4$a.k;
            final List l2 = eh4$a.l;
            final ao3 m2 = eh4$a.m;
            final Map n = eh4$a.n;
            final List o2 = eh4$a.o;
            final h06 p = eh4$a.p;
            final List q2 = eh4$a.q;
            final eh4 eh4 = new eh4();
            if (a6 != null) {
                eh4.D0 = a6;
                eh4.U0.set(0, true);
            }
            if (b3 != null) {
                eh4.E0 = b3;
            }
            if (c4 != null) {
                eh4.F0 = c4;
                eh4.U0.set(1, true);
            }
            if (d2 != null) {
                eh4.G0 = d2;
            }
            if (e != null) {
                eh4.H0 = e;
            }
            if (f3 != null) {
                eh4.I0 = f3;
                eh4.U0.set(2, true);
            }
            if (g3 != null) {
                eh4.J0 = g3;
            }
            if (h != null) {
                eh4.K0 = h;
            }
            if (i2 != null) {
                eh4.L0 = i2;
            }
            if (j6 != null) {
                eh4.M0 = j6;
                eh4.U0.set(3, true);
            }
            if (k3 != null) {
                eh4.N0 = k3;
                eh4.U0.set(4, true);
            }
            if (l2 != null) {
                eh4.O0 = l2;
            }
            if (m2 != null) {
                eh4.P0 = m2;
            }
            if (n != null) {
                eh4.Q0 = n;
            }
            if (o2 != null) {
                eh4.R0 = o2;
            }
            if (p != null) {
                eh4.S0 = p;
            }
            if (q2 != null) {
                eh4.T0 = q2;
            }
            return (h00)new in3(a, new q63(o0, (Object)new fh4(j2, (Object)eh4)));
        }
        final StringBuilder j7 = fu8.j("Required field 'cesMetadata' was not present! Struct: ");
        j7.append(eh4$a.toString());
        throw new IllegalArgumentException(j7.toString());
    }
}
