import java.util.AbstractCollection;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cli implements n73, omx, bsl, pyy
{
    public static cli C0;
    public static final cli D0;
    public static final String[] E0;
    public static final int[] F0;
    public static final int[] G0;
    public static final cli H0;
    
    public static final boolean c(final bkv bkv, final f9q f9q) {
        final boolean z = bkv.z(f9q);
        boolean b = true;
        if (!z) {
            boolean b2 = false;
            Label_0085: {
                if (f9q instanceof fi3) {
                    final miv e = bkv.E(bkv.Y((fi3)f9q));
                    if (!bkv.V(e) && bkv.z(bkv.C(bkv.n(e)))) {
                        b2 = true;
                        break Label_0085;
                    }
                }
                b2 = false;
            }
            b = (b2 && b);
        }
        return b;
    }
    
    public static final boolean d(final bkv bkv, final qiv qiv, final f9q f9q, final f9q f9q2, final boolean b) {
        final Collection r = bkv.r(f9q);
        final boolean b2 = r instanceof Collection;
        final boolean b3 = false;
        boolean b4;
        if (b2 && r.isEmpty()) {
            b4 = b3;
        }
        else {
            final Iterator iterator = r.iterator();
            tse tse;
            do {
                b4 = b3;
                if (!iterator.hasNext()) {
                    return b4;
                }
                tse = (tse)iterator.next();
            } while (!zzd.a((Object)bkv.q0(tse), (Object)bkv.f(f9q2)) && (!b || !n(cli.D0, qiv, (tse)f9q2, tse)));
            b4 = true;
        }
        return b4;
    }
    
    public static wev h(final String s) {
        final Long a = f1v.a;
        return xev.b(s, xev.b);
    }
    
    public static boolean n(cli d0, final qiv qiv, final tse tse, tse tse2) {
        Objects.requireNonNull(d0);
        zzd.f((Object)qiv, "state");
        zzd.f((Object)tse, "subType");
        zzd.f((Object)tse2, "superType");
        while (true) {
            Iterator iterator9 = null;
        Label_1612:
            while (true) {
                Collection b11;
                while (true) {
                    if (tse != tse2) {
                        if (qiv.c(tse, tse2)) {
                            final bkv d2 = qiv.d;
                            final tse e = qiv.e(qiv.f(tse));
                            final tse e2 = qiv.e(qiv.f(tse2));
                            final cli d3 = cli.D0;
                            final f9q a0 = d2.a0(e);
                            final f9q c = d2.C(e2);
                            final bkv d4 = qiv.d;
                            Boolean b2 = null;
                            Label_0863: {
                                if (!d4.S((tse)a0) && !d4.S((tse)c)) {
                                    if (d4.X(a0) && d4.X(c)) {
                                        final vl8 y0 = d4.y0(a0);
                                        f9q s0;
                                        if (y0 == null || (s0 = d4.s0(y0)) == null) {
                                            s0 = a0;
                                        }
                                        final vl8 y2 = d4.y0(c);
                                        f9q s2;
                                        if (y2 == null || (s2 = d4.s0(y2)) == null) {
                                            s2 = c;
                                        }
                                        boolean b = false;
                                        Label_0297: {
                                            if (d4.f(s0) == d4.f(s2)) {
                                                if (d4.u((tse)a0) || !d4.u((tse)c)) {
                                                    if (!d4.I(a0) || d4.I(c)) {
                                                        b = true;
                                                        break Label_0297;
                                                    }
                                                }
                                            }
                                            b = false;
                                        }
                                        b2 = (b || qiv.b);
                                    }
                                    else if (!d4.d0(a0) && !d4.d0(c)) {
                                        final vl8 y3 = d4.y0(c);
                                        f9q s3;
                                        if (y3 == null || (s3 = d4.s0(y3)) == null) {
                                            s3 = c;
                                        }
                                        final fi3 i = d4.i(s3);
                                        tse q;
                                        if (i != null) {
                                            q = d4.q(i);
                                        }
                                        else {
                                            q = null;
                                        }
                                        if (i != null && q != null) {
                                            Label_0471: {
                                                tse tse3;
                                                if (d4.I(c)) {
                                                    tse3 = d4.R(q);
                                                }
                                                else {
                                                    tse2 = q;
                                                    if (!d4.u((tse)c)) {
                                                        break Label_0471;
                                                    }
                                                    tse3 = d4.l0(q);
                                                }
                                                tse2 = tse3;
                                            }
                                            zzd.f((Object)a0, "subType");
                                            if (n(d3, qiv, (tse)a0, tse2)) {
                                                b2 = Boolean.TRUE;
                                                break Label_0863;
                                            }
                                        }
                                        final siv f = d4.f(c);
                                        if (d4.o(f)) {
                                            d4.I(c);
                                            final Collection b3 = d4.b0(f);
                                            boolean b4 = false;
                                            Label_0602: {
                                                if (!(b3 instanceof Collection) || !b3.isEmpty()) {
                                                    final Iterator iterator = b3.iterator();
                                                    while (iterator.hasNext()) {
                                                        if (!n(cli.D0, qiv, (tse)a0, (tse)iterator.next())) {
                                                            b4 = false;
                                                            break Label_0602;
                                                        }
                                                    }
                                                }
                                                b4 = true;
                                            }
                                            b2 = b4;
                                        }
                                        else {
                                            final siv f2 = d4.f(a0);
                                            Label_0757: {
                                                if (!(a0 instanceof fi3)) {
                                                    if (!d4.o(f2)) {
                                                        break Label_0757;
                                                    }
                                                    final Collection b5 = d4.b0(f2);
                                                    boolean b6 = false;
                                                    Label_0708: {
                                                        if (!(b5 instanceof Collection) || !b5.isEmpty()) {
                                                            final Iterator iterator2 = b5.iterator();
                                                            while (iterator2.hasNext()) {
                                                                if (!(((tse)iterator2.next()) instanceof fi3)) {
                                                                    b6 = false;
                                                                    break Label_0708;
                                                                }
                                                            }
                                                        }
                                                        b6 = true;
                                                    }
                                                    if (!b6) {
                                                        break Label_0757;
                                                    }
                                                }
                                                final kjv j = cli.D0.i(qiv.d, (tse)c, (tse)a0);
                                                if (j != null && d4.T(j, d4.f(c))) {
                                                    b2 = Boolean.TRUE;
                                                    break Label_0863;
                                                }
                                            }
                                            b2 = null;
                                        }
                                    }
                                    else {
                                        b2 = qiv.b;
                                    }
                                }
                                else if (qiv.a) {
                                    b2 = Boolean.TRUE;
                                }
                                else if (d4.I(a0) && !d4.I(c)) {
                                    b2 = Boolean.FALSE;
                                }
                                else {
                                    final f9q d5 = d4.d(a0, false);
                                    final f9q d6 = d4.d(c, false);
                                    zzd.f((Object)d5, "a");
                                    zzd.f((Object)d6, "b");
                                    b2 = ck1.A(d4, (tse)d5, (tse)d6);
                                }
                            }
                            if (b2 != null) {
                                final boolean b7 = b2;
                                qiv.a(e, e2);
                                return b7;
                            }
                            qiv.a(e, e2);
                            final f9q a2 = d2.a0(e);
                            final f9q c2 = d2.C(e2);
                            final bkv d7 = qiv.d;
                            zzd.f((Object)a2, "subType");
                            zzd.f((Object)c2, "superType");
                            final bkv d8 = qiv.d;
                            boolean b8 = false;
                            Label_1434: {
                                Label_1431: {
                                    if (!d8.I(c2)) {
                                        if (!d8.u((tse)a2)) {
                                            if (!d8.H((tse)a2)) {
                                                if (!(a2 instanceof fi3) || !d8.u0((fi3)a2)) {
                                                    if (!ukg.i0(qiv, a2, (qiv$b)qiv$b$b.a)) {
                                                        if (!d8.u((tse)c2)) {
                                                            if (!ukg.i0(qiv, c2, (qiv$b)qiv$b$d.a)) {
                                                                if (!d8.Z(a2)) {
                                                                    final siv f3 = d8.f(c2);
                                                                    zzd.f((Object)f3, "end");
                                                                    final bkv d9 = qiv.d;
                                                                    if (ukg.p0(qiv, a2, f3)) {
                                                                        break Label_1431;
                                                                    }
                                                                    qiv.d();
                                                                    final ArrayDeque h = qiv.h;
                                                                    zzd.c((Object)h);
                                                                    final mfq k = qiv.i;
                                                                    zzd.c((Object)k);
                                                                    h.push(a2);
                                                                    while (h.isEmpty() ^ true) {
                                                                        if (k.D0 > 1000) {
                                                                            final StringBuilder z = gd.z("Too many supertypes for type: ", a2, ". Supertypes = ");
                                                                            z.append(or4.M1((Iterable)k, (CharSequence)null, (CharSequence)null, (CharSequence)null, (rtb)null, 63));
                                                                            throw new IllegalStateException(z.toString().toString());
                                                                        }
                                                                        final f9q f9q = h.pop();
                                                                        zzd.e((Object)f9q, "current");
                                                                        if (!k.add((Object)f9q)) {
                                                                            continue;
                                                                        }
                                                                        Object o;
                                                                        if (d9.I(f9q)) {
                                                                            o = qiv$b$c.a;
                                                                        }
                                                                        else {
                                                                            o = qiv$b$b.a;
                                                                        }
                                                                        if (!(true ^ zzd.a(o, (Object)qiv$b$c.a))) {
                                                                            o = null;
                                                                        }
                                                                        if (o == null) {
                                                                            continue;
                                                                        }
                                                                        final bkv d10 = qiv.d;
                                                                        final Iterator iterator3 = d10.b0(d10.f(f9q)).iterator();
                                                                        while (true) {
                                                                            boolean o2 = false;
                                                                            if (!iterator3.hasNext()) {
                                                                                break;
                                                                            }
                                                                            final f9q a3 = ((qiv$b)o).a(qiv, (tse)iterator3.next());
                                                                            final bkv d11 = qiv.d;
                                                                            Label_1354: {
                                                                                if (!d11.e0((tse)a3)) {
                                                                                    if (d11.I(a3)) {
                                                                                        break Label_1354;
                                                                                    }
                                                                                    if (!qiv.b || !d11.d0(a3)) {
                                                                                        o2 = d11.o0(d11.f(a3), f3);
                                                                                        break Label_1354;
                                                                                    }
                                                                                }
                                                                                o2 = true;
                                                                            }
                                                                            if (o2) {
                                                                                qiv.b();
                                                                                break Label_1431;
                                                                            }
                                                                            h.add(a3);
                                                                        }
                                                                    }
                                                                    qiv.b();
                                                                }
                                                            }
                                                        }
                                                        b8 = false;
                                                        break Label_1434;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                b8 = true;
                            }
                            if (b8) {
                                final f9q a4 = d7.a0((tse)a2);
                                final f9q c3 = d7.C((tse)c2);
                                final bkv d12 = qiv.d;
                                Boolean b9 = null;
                                if (d12.z(a4) || d12.z(c3)) {
                                    if (c(d12, a4) && c(d12, c3)) {
                                        b9 = Boolean.TRUE;
                                        break Label_1720;
                                    }
                                    if (d12.z(a4) ? d(d12, qiv, a4, c3, false) : d12.z(c3)) {
                                        b9 = Boolean.TRUE;
                                        break Label_1720;
                                    }
                                }
                                Label_1718: {
                                    b9 = null;
                                }
                                if (b9 != null) {
                                    final boolean b7 = b9;
                                    qiv.a((tse)a2, (tse)c2);
                                    return b7;
                                }
                                final siv f4 = d7.f(c2);
                                if (d7.o0(d7.f(a2), f4) && d7.B(f4) == 0) {
                                    return true;
                                }
                                if (d7.t0(d7.f(c2))) {
                                    return true;
                                }
                                d0 = cli.D0;
                                zzd.f((Object)f4, "superConstructor");
                                final bkv d13 = qiv.d;
                                List list;
                                if (d13.Z(a2)) {
                                    list = d0.f(qiv, a2, f4);
                                }
                                else if (!d13.p(f4) && !d13.r0(f4)) {
                                    list = d0.e(qiv, a2, f4);
                                }
                                else {
                                    final ifq ifq = new ifq();
                                    qiv.d();
                                    final ArrayDeque h2 = qiv.h;
                                    zzd.c((Object)h2);
                                    final mfq l = qiv.i;
                                    zzd.c((Object)l);
                                    h2.push(a2);
                                    while (h2.isEmpty() ^ true) {
                                        if (l.D0 > 1000) {
                                            final StringBuilder z2 = gd.z("Too many supertypes for type: ", a2, ". Supertypes = ");
                                            z2.append(or4.M1((Iterable)l, (CharSequence)null, (CharSequence)null, (CharSequence)null, (rtb)null, 63));
                                            throw new IllegalStateException(z2.toString().toString());
                                        }
                                        final f9q f9q2 = h2.pop();
                                        zzd.e((Object)f9q2, "current");
                                        if (!l.add((Object)f9q2)) {
                                            continue;
                                        }
                                        Object o3;
                                        if (d13.Z(f9q2)) {
                                            ifq.add((Object)f9q2);
                                            o3 = qiv$b$c.a;
                                        }
                                        else {
                                            o3 = qiv$b$b.a;
                                        }
                                        if (!(zzd.a(o3, (Object)qiv$b$c.a) ^ true)) {
                                            o3 = null;
                                        }
                                        if (o3 == null) {
                                            continue;
                                        }
                                        final bkv d14 = qiv.d;
                                        final Iterator iterator4 = d14.b0(d14.f(f9q2)).iterator();
                                        while (iterator4.hasNext()) {
                                            h2.add(((qiv$b)o3).a(qiv, (tse)iterator4.next()));
                                        }
                                    }
                                    qiv.b();
                                    list = new ArrayList();
                                    for (final f9q f9q3 : ifq) {
                                        final cli d15 = cli.D0;
                                        zzd.e((Object)f9q3, "it");
                                        mr4.n1((Collection)list, (Iterable)d15.f(qiv, f9q3, f4));
                                    }
                                }
                                final ArrayList list2 = new ArrayList<f9q>(kr4.h1((Iterable)list, 10));
                                for (f9q f9q4 : list) {
                                    final f9q c4 = d7.c(qiv.e((tse)f9q4));
                                    if (c4 != null) {
                                        f9q4 = c4;
                                    }
                                    list2.add(f9q4);
                                }
                                final int size = list2.size();
                                if (size != 0) {
                                    if (size == 1) {
                                        return cli.D0.k(qiv, d7.W((f9q)or4.G1((List)list2)), c2);
                                    }
                                    final is0 is0 = new is0(d7.B(f4));
                                    final int b10 = d7.B(f4);
                                    int n = 0;
                                    int n2 = 0;
                                    while (n < b10) {
                                        if (n2 == 0 && d7.g0(d7.F(f4, n)) == 2) {
                                            n2 = 0;
                                        }
                                        else {
                                            n2 = 1;
                                        }
                                        if (n2 == 0) {
                                            final ArrayList list3 = new ArrayList<tse>(kr4.h1((Iterable)list2, 10));
                                            for (final f9q f9q5 : list2) {
                                                miv m = d7.J(f9q5, n);
                                                if (m != null) {
                                                    if (d7.w0(m) != 3) {
                                                        m = null;
                                                    }
                                                    if (m != null) {
                                                        final tse n3 = d7.n(m);
                                                        if (n3 != null) {
                                                            list3.add(n3);
                                                            continue;
                                                        }
                                                    }
                                                }
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("Incorrect type: ");
                                                sb.append(f9q5);
                                                sb.append(", subType: ");
                                                sb.append(a2);
                                                sb.append(", superType: ");
                                                sb.append(c2);
                                                throw new IllegalStateException(sb.toString().toString());
                                            }
                                            ((AbstractCollection<miv>)is0).add(d7.D(d7.h0((List)list3)));
                                        }
                                        ++n;
                                    }
                                    if (n2 == 0 && cli.D0.k(qiv, (liv)is0, c2)) {
                                        return true;
                                    }
                                    final me me = new me((List)list2, qiv, d7, c2);
                                    final qiv$a$a qiv$a$a = new qiv$a$a();
                                    me.invoke((Object)qiv$a$a);
                                    return qiv$a$a.a;
                                }
                                else {
                                    final bkv d16 = qiv.d;
                                    final siv f5 = d16.f(a2);
                                    if (d16.p(f5)) {
                                        return d16.L(f5);
                                    }
                                    if (d16.L(d16.f(a2))) {
                                        return true;
                                    }
                                    qiv.d();
                                    final ArrayDeque h3 = qiv.h;
                                    zzd.c((Object)h3);
                                    final mfq i2 = qiv.i;
                                    zzd.c((Object)i2);
                                    h3.push(a2);
                                    while (h3.isEmpty() ^ true) {
                                        if (i2.D0 > 1000) {
                                            final StringBuilder z3 = gd.z("Too many supertypes for type: ", a2, ". Supertypes = ");
                                            z3.append(or4.M1((Iterable)i2, (CharSequence)null, (CharSequence)null, (CharSequence)null, (rtb)null, 63));
                                            throw new IllegalStateException(z3.toString().toString());
                                        }
                                        final f9q f9q6 = h3.pop();
                                        zzd.e((Object)f9q6, "current");
                                        if (!i2.add((Object)f9q6)) {
                                            continue;
                                        }
                                        Object o4;
                                        if (d16.Z(f9q6)) {
                                            o4 = qiv$b$c.a;
                                        }
                                        else {
                                            o4 = qiv$b$b.a;
                                        }
                                        if (!(zzd.a(o4, (Object)qiv$b$c.a) ^ true)) {
                                            o4 = null;
                                        }
                                        if (o4 == null) {
                                            continue;
                                        }
                                        final bkv d17 = qiv.d;
                                        final Iterator iterator8 = d17.b0(d17.f(f9q6)).iterator();
                                        while (iterator8.hasNext()) {
                                            final f9q a5 = ((qiv$b)o4).a(qiv, (tse)iterator8.next());
                                            if (d16.L(d16.f(a5))) {
                                                qiv.b();
                                                return true;
                                            }
                                            h3.add(a5);
                                        }
                                    }
                                    qiv.b();
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                    bkv d12 = null;
                    Label_1677: {
                        break Label_1677;
                        final siv siv;
                        b11 = d12.b0(siv);
                        iftrue(Label_1603:)(!(b11 instanceof Collection) || !b11.isEmpty());
                    }
                    final boolean b12 = false;
                    f9q a4 = null;
                    f9q c3 = null;
                    iftrue(Label_1718:)(!b12 && !d(d12, qiv, c3, a4, true));
                    Boolean b9 = Boolean.TRUE;
                    continue;
                }
                Label_1603: {
                    iterator9 = b11.iterator();
                }
                break Label_1612;
                bkv d12 = null;
                final f9q c5 = d12.c((tse)iterator9.next());
                iftrue(Label_1612:)(c5 == null || !d12.z(c5));
                final boolean b12 = true;
                continue;
            }
            iftrue(Label_1677:)(!iterator9.hasNext());
            continue;
        }
    }
    
    public static final boolean p(final kap kap, boolean b) {
        zzd.f((Object)kap, "<this>");
        final int ordinal = ((Enum)kap).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                b = false;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public static final boolean q() {
        return dta.c().b("android_use_payload_badge_count", false);
    }
    
    public Object a() {
        final azy c = fzy.c;
        return fsz.D0.b().b();
    }
    
    public String[] b() {
        return cli.E0;
    }
    
    public List e(final qiv qiv, f9q f9q, final siv siv) {
        final bkv d = qiv.d;
        d.Q(f9q, siv);
        if (!d.p(siv) && d.Z(f9q)) {
            return (List)v2a.C0;
        }
        if (d.M(siv)) {
            Object o;
            if (d.o0(d.f(f9q), siv)) {
                final f9q a = d.A(f9q);
                if (a != null) {
                    f9q = a;
                }
                o = tdy.u0((Object)f9q);
            }
            else {
                o = v2a.C0;
            }
            return (List)o;
        }
        final ifq ifq = new ifq();
        qiv.d();
        final ArrayDeque h = qiv.h;
        zzd.c((Object)h);
        final mfq i = qiv.i;
        zzd.c((Object)i);
        h.push(f9q);
        while (h.isEmpty() ^ true) {
            if (i.D0 > 1000) {
                final StringBuilder z = gd.z("Too many supertypes for type: ", f9q, ". Supertypes = ");
                z.append(or4.M1((Iterable)i, (CharSequence)null, (CharSequence)null, (CharSequence)null, (rtb)null, 63));
                throw new IllegalStateException(z.toString().toString());
            }
            final f9q f9q2 = h.pop();
            zzd.e((Object)f9q2, "current");
            if (!i.add((Object)f9q2)) {
                continue;
            }
            Object a2;
            if ((a2 = d.A(f9q2)) == null) {
                a2 = f9q2;
            }
            Object o2;
            if (d.o0(d.f((f9q)a2), siv)) {
                ifq.add(a2);
                o2 = qiv$b$c.a;
            }
            else if (d.U((tse)a2) == 0) {
                o2 = qiv$b$b.a;
            }
            else {
                o2 = qiv.d.w((f9q)a2);
            }
            if (!(zzd.a(o2, (Object)qiv$b$c.a) ^ true)) {
                o2 = null;
            }
            if (o2 == null) {
                continue;
            }
            final bkv d2 = qiv.d;
            final Iterator iterator = d2.b0(d2.f(f9q2)).iterator();
            while (iterator.hasNext()) {
                h.add(((qiv$b)o2).a(qiv, (tse)iterator.next()));
            }
        }
        qiv.b();
        return (List)ifq;
    }
    
    public List f(final qiv qiv, final f9q f9q, final siv siv) {
        final List e = this.e(qiv, f9q, siv);
        final bkv d = qiv.d;
        List list;
        if (e.size() < 2) {
            list = e;
        }
        else {
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = e.iterator();
            while (true) {
                final boolean hasNext = iterator.hasNext();
                final int n = 1;
                if (!hasNext) {
                    break;
                }
                final Object next = iterator.next();
                final liv w = d.W((f9q)next);
                final int l = d.l(w);
                int n2 = 0;
                int n3;
                while (true) {
                    n3 = n;
                    if (n2 >= l) {
                        break;
                    }
                    if (d.p0(d.n(d.v0(w, n2))) != null) {
                        n3 = 0;
                        break;
                    }
                    ++n2;
                }
                if (n3 == 0) {
                    continue;
                }
                list2.add(next);
            }
            list = e;
            if (list2.isEmpty() ^ true) {
                list = list2;
            }
        }
        return list;
    }
    
    public boolean g(final qiv qiv, final tse tse, final tse tse2) {
        zzd.f((Object)qiv, "state");
        zzd.f((Object)tse, "a");
        zzd.f((Object)tse2, "b");
        final bkv d = qiv.d;
        boolean b = true;
        final boolean b2 = true;
        if (tse == tse2) {
            return true;
        }
        final cli d2 = cli.D0;
        if (d2.j(d, tse) && d2.j(d, tse2)) {
            final tse e = qiv.e(qiv.f(tse));
            final tse e2 = qiv.e(qiv.f(tse2));
            final f9q a0 = d.a0(e);
            if (!d.o0(d.q0(e), d.q0(e2))) {
                return false;
            }
            if (d.U((tse)a0) == 0) {
                boolean b3 = b2;
                if (!d.t(e)) {
                    if (d.t(e2)) {
                        b3 = b2;
                    }
                    else {
                        b3 = (d.I(a0) == d.I(d.a0(e2)) && b2);
                    }
                }
                return b3;
            }
        }
        if (!n(d2, qiv, tse, tse2) || !n(d2, qiv, tse2, tse)) {
            b = false;
        }
        return b;
    }
    
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
    
    public kjv i(final bkv bkv, final tse tse, final tse tse2) {
        final int u = bkv.U(tse);
        int n = 0;
        while (true) {
            miv miv = null;
            if (n >= u) {
                return null;
            }
            final miv n2 = bkv.N(tse, n);
            final boolean v = bkv.V(n2);
            boolean b = true;
            if (v ^ true) {
                miv = n2;
            }
            if (miv != null) {
                final tse n3 = bkv.n(miv);
                if (n3 != null) {
                    if (!bkv.j0((tse)bkv.a0(n3)) || !bkv.j0((tse)bkv.a0(tse2))) {
                        b = false;
                    }
                    if (zzd.a((Object)n3, (Object)tse2) || (b && zzd.a((Object)bkv.q0(n3), (Object)bkv.q0(tse2)))) {
                        return bkv.F(bkv.q0(tse), n);
                    }
                    final kjv i = this.i(bkv, n3, tse2);
                    if (i != null) {
                        return i;
                    }
                }
            }
            ++n;
        }
    }
    
    public boolean j(final bkv bkv, final tse tse) {
        return bkv.c0(bkv.q0(tse)) && !bkv.m(tse) && !bkv.u(tse) && !bkv.H(tse) && zzd.a((Object)bkv.f(bkv.a0(tse)), (Object)bkv.f(bkv.C(tse)));
    }
    
    public boolean k(final qiv qiv, final liv liv, final f9q f9q) {
        zzd.f((Object)qiv, "<this>");
        zzd.f((Object)liv, "capturedSubArguments");
        zzd.f((Object)f9q, "superType");
        final bkv d = qiv.d;
        final siv f = d.f(f9q);
        final int l = d.l(liv);
        final int b = d.B(f);
        if (l == b && l == d.U((tse)f9q)) {
            for (int i = 0; i < b; ++i) {
                final miv n = d.N((tse)f9q, i);
                if (!d.V(n)) {
                    final tse n2 = d.n(n);
                    final miv v0 = d.v0(liv, i);
                    d.w0(v0);
                    final tse n3 = d.n(v0);
                    final cli d2 = cli.D0;
                    final int g0 = d.g0(d.F(f, i));
                    int w0 = d.w0(n);
                    k1b.i(g0, "declared");
                    k1b.i(w0, "useSite");
                    if (g0 != 3) {
                        if (w0 == 3) {
                            w0 = g0;
                        }
                        else if (g0 == w0) {
                            w0 = g0;
                        }
                        else {
                            w0 = 0;
                        }
                    }
                    if (w0 == 0) {
                        return qiv.a;
                    }
                    if (w0 != 3 || (!d2.o(d, n3, n2, f) && !d2.o(d, n2, n3, f))) {
                        final int g2 = qiv.g;
                        if (g2 > 100) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Arguments depth is too high. Some related argument: ");
                            sb.append(n3);
                            throw new IllegalStateException(sb.toString().toString());
                        }
                        qiv.g = g2 + 1;
                        final int d3 = nb0.D(w0);
                        boolean b2;
                        if (d3 != 0) {
                            if (d3 != 1) {
                                if (d3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                b2 = d2.g(qiv, n3, n2);
                            }
                            else {
                                b2 = n(d2, qiv, n3, n2);
                            }
                        }
                        else {
                            b2 = n(d2, qiv, n2, n3);
                        }
                        --qiv.g;
                        if (!b2) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public zrl$a l(final Object o) {
        zzd.f((Object)o, "it");
        return new zrl$a();
    }
    
    public boolean m(final qiv qiv, final tse tse, final tse tse2) {
        zzd.f((Object)tse, "subType");
        zzd.f((Object)tse2, "superType");
        return n(this, qiv, tse, tse2);
    }
    
    public boolean o(final bkv bkv, final tse tse, final tse tse2, final siv siv) {
        final f9q c = bkv.c(tse);
        final boolean b = c instanceof fi3;
        boolean b2 = true;
        if (b) {
            final fi3 fi3 = (fi3)c;
            if (!bkv.k(fi3)) {
                if (bkv.V(bkv.E(bkv.Y(fi3)))) {
                    if (bkv.s(fi3) != rh3.C0) {
                        return false;
                    }
                    final siv q0 = bkv.q0(tse2);
                    jkv jkv;
                    if (q0 instanceof jkv) {
                        jkv = (jkv)q0;
                    }
                    else {
                        jkv = null;
                    }
                    if (jkv == null) {
                        return false;
                    }
                    final kjv y = bkv.y(jkv);
                    if (y != null && bkv.T(y, siv)) {
                        return b2;
                    }
                }
            }
        }
        b2 = false;
        return b2;
    }
}
