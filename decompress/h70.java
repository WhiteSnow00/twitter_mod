import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h70 implements g6s<h70, h70.h70$b>, Serializable, Cloneable
{
    public static final j6s O0;
    public static final j6s P0;
    public static final j6s Q0;
    public static final j6s R0;
    public static final j6s S0;
    public static final j6s T0;
    public static final j6s U0;
    public static final j6s V0;
    public static final j6s W0;
    public static final j6s X0;
    public static final j6s Y0;
    public static final Map<h70.h70$b, kwa> Z0;
    public static final h70.h70$b a1;
    public static final h70.h70$b b1;
    public static final h70.h70$b c1;
    public static final h70.h70$b d1;
    public static final h70.h70$b e1;
    public static final h70.h70$b f1;
    public static final h70.h70$b g1;
    public static final h70.h70$b h1;
    public static final h70.h70$b i1;
    public static final h70.h70$b j1;
    public static final h70.h70$b k1;
    public c70 D0;
    public c70 E0;
    public l40 F0;
    public g20 G0;
    public l40 H0;
    public c70 I0;
    public c70 J0;
    public c70 K0;
    public c70 L0;
    public c70 M0;
    public l40 N0;
    
    static {
        O0 = new j6s("context", (byte)12, (short)1);
        P0 = new j6s("title", (byte)12, (short)2);
        Q0 = new j6s("profileImage", (byte)12, (short)3);
        R0 = new j6s("tweetCard", (byte)12, (short)4);
        S0 = new j6s("tweetProfileImage", (byte)12, (short)5);
        T0 = new j6s("tweetProfileNameText", (byte)12, (short)6);
        U0 = new j6s("tweetProfileHandleText", (byte)12, (short)7);
        V0 = new j6s("tweetDivider", (byte)12, (short)8);
        W0 = new j6s("tweetTime", (byte)12, (short)9);
        X0 = new j6s("tweetText", (byte)12, (short)10);
        Y0 = new j6s("tweetImage", (byte)12, (short)11);
        final EnumMap enumMap = new EnumMap((Class<K>)h70.h70$b.class);
        final h70.h70$b f2 = h70.h70$b.F0;
        enumMap.put(f2, new kwa());
        final h70.h70$b g2 = h70.h70$b.G0;
        enumMap.put(g2, new kwa());
        final h70.h70$b h2 = h70.h70$b.H0;
        enumMap.put(h2, new kwa());
        final h70.h70$b i2 = h70.h70$b.I0;
        enumMap.put(i2, new kwa());
        final h70.h70$b j2 = h70.h70$b.J0;
        enumMap.put(j2, new kwa());
        final h70.h70$b k2 = h70.h70$b.K0;
        enumMap.put(k2, new kwa());
        final h70.h70$b l0 = h70.h70$b.L0;
        enumMap.put(l0, new kwa());
        final h70.h70$b m0 = h70.h70$b.M0;
        enumMap.put(m0, new kwa());
        final h70.h70$b n0 = h70.h70$b.N0;
        enumMap.put(n0, new kwa());
        final h70.h70$b o0 = h70.h70$b.O0;
        enumMap.put(o0, new kwa());
        final h70.h70$b p0 = h70.h70$b.P0;
        enumMap.put(p0, new kwa());
        kwa.a((Class)h70.class, Z0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        a1 = f2;
        b1 = g2;
        c1 = h2;
        d1 = i2;
        e1 = j2;
        f1 = k2;
        g1 = l0;
        h1 = m0;
        i1 = n0;
        j1 = o0;
        k1 = p0;
    }
    
    public h70() {
    }
    
    public h70(final c70 d0, final c70 e0, final l40 f0, final g20 g0, final l40 h0, final c70 i0, final c70 j0, final c70 k0, final c70 l0, final c70 m0, final l40 n0) {
        if (d0 != null) {
            this.D0 = d0;
        }
        if (e0 != null) {
            this.E0 = e0;
        }
        if (f0 != null) {
            this.F0 = f0;
        }
        if (g0 != null) {
            this.G0 = g0;
        }
        if (h0 != null) {
            this.H0 = h0;
        }
        if (i0 != null) {
            this.I0 = i0;
        }
        if (j0 != null) {
            this.J0 = j0;
        }
        if (k0 != null) {
            this.K0 = k0;
        }
        if (l0 != null) {
            this.L0 = l0;
        }
        if (m0 != null) {
            this.M0 = m0;
        }
        if (n0 != null) {
            this.N0 = n0;
        }
    }
    
    public final int compareTo(final Object o) {
        final h70 h70 = (h70)o;
        int n;
        if (!h70.class.equals(h70.getClass())) {
            n = h70.class.getName().compareTo(h70.class.getName());
        }
        else {
            final h70.h70$b f0 = h70.h70$b.F0;
            n = Boolean.valueOf(this.j(f0)).compareTo(Boolean.valueOf(h70.j(f0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.j(f0)) {
                        break Label_0092;
                    }
                    n = this.D0.compareTo((Object)h70.D0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final h70.h70$b g0 = h70.h70$b.G0;
                n = Boolean.valueOf(this.j(g0)).compareTo(Boolean.valueOf(h70.j(g0)));
                if (n == 0) {
                    if (this.j(g0)) {
                        n = this.E0.compareTo((Object)h70.E0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final h70.h70$b h71 = h70.h70$b.H0;
                    n = Boolean.valueOf(this.j(h71)).compareTo(Boolean.valueOf(h70.j(h71)));
                    if (n == 0) {
                        if (this.j(h71)) {
                            n = this.F0.compareTo((Object)h70.F0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        final h70.h70$b i0 = h70.h70$b.I0;
                        n = Boolean.valueOf(this.j(i0)).compareTo(Boolean.valueOf(h70.j(i0)));
                        if (n == 0) {
                            if (this.j(i0)) {
                                n = this.G0.compareTo(h70.G0);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            final h70.h70$b j0 = h70.h70$b.J0;
                            n = Boolean.valueOf(this.j(j0)).compareTo(Boolean.valueOf(h70.j(j0)));
                            if (n == 0) {
                                if (this.j(j0)) {
                                    n = this.H0.compareTo((Object)h70.H0);
                                    if (n != 0) {
                                        return n;
                                    }
                                }
                                final h70.h70$b k0 = h70.h70$b.K0;
                                n = Boolean.valueOf(this.j(k0)).compareTo(Boolean.valueOf(h70.j(k0)));
                                if (n == 0) {
                                    if (this.j(k0)) {
                                        n = this.I0.compareTo((Object)h70.I0);
                                        if (n != 0) {
                                            return n;
                                        }
                                    }
                                    final h70.h70$b l0 = h70.h70$b.L0;
                                    n = Boolean.valueOf(this.j(l0)).compareTo(Boolean.valueOf(h70.j(l0)));
                                    if (n == 0) {
                                        if (this.j(l0)) {
                                            n = this.J0.compareTo((Object)h70.J0);
                                            if (n != 0) {
                                                return n;
                                            }
                                        }
                                        final h70.h70$b m0 = h70.h70$b.M0;
                                        n = Boolean.valueOf(this.j(m0)).compareTo(Boolean.valueOf(h70.j(m0)));
                                        if (n == 0) {
                                            if (this.j(m0)) {
                                                n = this.K0.compareTo((Object)h70.K0);
                                                if (n != 0) {
                                                    return n;
                                                }
                                            }
                                            final h70.h70$b n2 = h70.h70$b.N0;
                                            n = Boolean.valueOf(this.j(n2)).compareTo(Boolean.valueOf(h70.j(n2)));
                                            if (n == 0) {
                                                if (this.j(n2)) {
                                                    n = this.L0.compareTo((Object)h70.L0);
                                                    if (n != 0) {
                                                        return n;
                                                    }
                                                }
                                                final h70.h70$b o2 = h70.h70$b.O0;
                                                n = Boolean.valueOf(this.j(o2)).compareTo(Boolean.valueOf(h70.j(o2)));
                                                if (n == 0) {
                                                    if (this.j(o2)) {
                                                        n = this.M0.compareTo((Object)h70.M0);
                                                        if (n != 0) {
                                                            return n;
                                                        }
                                                    }
                                                    final h70.h70$b p = h70.h70$b.P0;
                                                    n = Boolean.valueOf(this.j(p)).compareTo(Boolean.valueOf(h70.j(p)));
                                                    if (n == 0) {
                                                        if (this.j(p)) {
                                                            n = this.N0.compareTo((Object)h70.N0);
                                                            if (n != 0) {
                                                                return n;
                                                            }
                                                        }
                                                        n = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n;
    }
    
    public final void e(final p6s p6s) throws TException {
        Objects.requireNonNull(p6s);
        if (this.D0 != null && this.j(h70.h70$b.F0)) {
            p6s.m(h70.O0);
            this.D0.e(p6s);
        }
        if (this.E0 != null && this.j(h70.h70$b.G0)) {
            p6s.m(h70.P0);
            this.E0.e(p6s);
        }
        if (this.F0 != null && this.j(h70.h70$b.H0)) {
            p6s.m(h70.Q0);
            this.F0.e(p6s);
        }
        if (this.G0 != null && this.j(h70.h70$b.I0)) {
            p6s.m(h70.R0);
            this.G0.e(p6s);
        }
        if (this.H0 != null && this.j(h70.h70$b.J0)) {
            p6s.m(h70.S0);
            this.H0.e(p6s);
        }
        if (this.I0 != null && this.j(h70.h70$b.K0)) {
            p6s.m(h70.T0);
            this.I0.e(p6s);
        }
        if (this.J0 != null && this.j(h70.h70$b.L0)) {
            p6s.m(h70.U0);
            this.J0.e(p6s);
        }
        if (this.K0 != null && this.j(h70.h70$b.M0)) {
            p6s.m(h70.V0);
            this.K0.e(p6s);
        }
        if (this.L0 != null && this.j(h70.h70$b.N0)) {
            p6s.m(h70.W0);
            this.L0.e(p6s);
        }
        if (this.M0 != null && this.j(h70.h70$b.O0)) {
            p6s.m(h70.X0);
            this.M0.e(p6s);
        }
        if (this.N0 != null && this.j(h70.h70$b.P0)) {
            p6s.m(h70.Y0);
            this.N0.e(p6s);
        }
        ((i6s)p6s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (o instanceof h70) {
            final h70 h70 = (h70)o;
            final h70.h70$b f0 = h70.h70$b.F0;
            final boolean j = this.j(f0);
            final boolean i = h70.j(f0);
            if (j || i) {
                b2 = b;
                if (!j) {
                    return b2;
                }
                if (!i) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.g(h70.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b g0 = h70.h70$b.G0;
            final boolean k = this.j(g0);
            final boolean l = h70.j(g0);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.g(h70.E0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b h71 = h70.h70$b.H0;
            final boolean m = this.j(h71);
            final boolean j2 = h70.j(h71);
            if (m || j2) {
                b2 = b;
                if (!m) {
                    return b2;
                }
                if (!j2) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.g(h70.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b i2 = h70.h70$b.I0;
            final boolean j3 = this.j(i2);
            final boolean j4 = h70.j(i2);
            if (j3 || j4) {
                b2 = b;
                if (!j3) {
                    return b2;
                }
                if (!j4) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.g(h70.G0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b j5 = h70.h70$b.J0;
            final boolean j6 = this.j(j5);
            final boolean j7 = h70.j(j5);
            if (j6 || j7) {
                b2 = b;
                if (!j6) {
                    return b2;
                }
                if (!j7) {
                    b2 = b;
                    return b2;
                }
                if (!this.H0.g(h70.H0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b k2 = h70.h70$b.K0;
            final boolean j8 = this.j(k2);
            final boolean j9 = h70.j(k2);
            if (j8 || j9) {
                b2 = b;
                if (!j8) {
                    return b2;
                }
                if (!j9) {
                    b2 = b;
                    return b2;
                }
                if (!this.I0.g(h70.I0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b l2 = h70.h70$b.L0;
            final boolean j10 = this.j(l2);
            final boolean j11 = h70.j(l2);
            if (j10 || j11) {
                b2 = b;
                if (!j10) {
                    return b2;
                }
                if (!j11) {
                    b2 = b;
                    return b2;
                }
                if (!this.J0.g(h70.J0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b m2 = h70.h70$b.M0;
            final boolean j12 = this.j(m2);
            final boolean j13 = h70.j(m2);
            if (j12 || j13) {
                b2 = b;
                if (!j12) {
                    return b2;
                }
                if (!j13) {
                    b2 = b;
                    return b2;
                }
                if (!this.K0.g(h70.K0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b n0 = h70.h70$b.N0;
            final boolean j14 = this.j(n0);
            final boolean j15 = h70.j(n0);
            if (j14 || j15) {
                b2 = b;
                if (!j14) {
                    return b2;
                }
                if (!j15) {
                    b2 = b;
                    return b2;
                }
                if (!this.L0.g(h70.L0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b o2 = h70.h70$b.O0;
            final boolean j16 = this.j(o2);
            final boolean j17 = h70.j(o2);
            if (j16 || j17) {
                b2 = b;
                if (!j16) {
                    return b2;
                }
                if (!j17) {
                    b2 = b;
                    return b2;
                }
                if (!this.M0.g(h70.M0)) {
                    b2 = b;
                    return b2;
                }
            }
            final h70.h70$b p = h70.h70$b.P0;
            final boolean j18 = this.j(p);
            final boolean j19 = h70.j(p);
            if (j18 || j19) {
                b2 = b;
                if (!j18) {
                    return b2;
                }
                if (!j19) {
                    b2 = b;
                    return b2;
                }
                if (!this.N0.g(h70.N0)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void f(final p6s p6s) throws TException {
        Objects.requireNonNull(p6s);
        while (true) {
            final j6s d = p6s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            switch (d.c) {
                default: {
                    pps.q(p6s, b);
                    continue;
                }
                case 11: {
                    if (b == 12) {
                        (this.N0 = new l40()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 10: {
                    if (b == 12) {
                        (this.M0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 9: {
                    if (b == 12) {
                        (this.L0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 8: {
                    if (b == 12) {
                        (this.K0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 7: {
                    if (b == 12) {
                        (this.J0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 6: {
                    if (b == 12) {
                        (this.I0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 5: {
                    if (b == 12) {
                        (this.H0 = new l40()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 4: {
                    if (b == 12) {
                        (this.G0 = new g20()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 3: {
                    if (b == 12) {
                        (this.F0 = new l40()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 2: {
                    if (b == 12) {
                        (this.E0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
                case 1: {
                    if (b == 12) {
                        (this.D0 = new c70()).f(p6s);
                        continue;
                    }
                    pps.q(p6s, b);
                    continue;
                }
            }
        }
    }
    
    public final <Any> Any g(final h70.h70$b h70$b) {
        switch (((Enum)h70$b).ordinal()) {
            default: {
                throw new IllegalStateException("Invalid field type");
            }
            case 10: {
                return (Any)this.i(h70$b);
            }
            case 9: {
                return (Any)this.i(h70$b);
            }
            case 8: {
                return (Any)this.i(h70$b);
            }
            case 7: {
                return (Any)this.i(h70$b);
            }
            case 6: {
                return (Any)this.i(h70$b);
            }
            case 5: {
                return (Any)this.i(h70$b);
            }
            case 4: {
                return (Any)this.i(h70$b);
            }
            case 3: {
                return (Any)this.i(h70$b);
            }
            case 2: {
                return (Any)this.i(h70$b);
            }
            case 1: {
                return (Any)this.i(h70$b);
            }
            case 0: {
                return (Any)this.i(h70$b);
            }
        }
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.j(h70.h70$b.F0)) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.j(h70.h70$b.G0)) {
            n2 = n * 31 + this.E0.hashCode();
        }
        int n3 = n2;
        if (this.j(h70.h70$b.H0)) {
            n3 = n2 * 31 + this.F0.hashCode();
        }
        int n4 = n3;
        if (this.j(h70.h70$b.I0)) {
            n4 = n3 * 31 + this.G0.hashCode();
        }
        int n5 = n4;
        if (this.j(h70.h70$b.J0)) {
            n5 = n4 * 31 + this.H0.hashCode();
        }
        int n6 = n5;
        if (this.j(h70.h70$b.K0)) {
            n6 = n5 * 31 + this.I0.hashCode();
        }
        int n7 = n6;
        if (this.j(h70.h70$b.L0)) {
            n7 = n6 * 31 + this.J0.hashCode();
        }
        int n8 = n7;
        if (this.j(h70.h70$b.M0)) {
            n8 = n7 * 31 + this.K0.hashCode();
        }
        int n9 = n8;
        if (this.j(h70.h70$b.N0)) {
            n9 = n8 * 31 + this.L0.hashCode();
        }
        int n10 = n9;
        if (this.j(h70.h70$b.O0)) {
            n10 = n9 * 31 + this.M0.hashCode();
        }
        int n11 = n10;
        if (this.j(h70.h70$b.P0)) {
            n11 = n10 * 31 + this.N0.hashCode();
        }
        return n11;
    }
    
    public final Object i(final h70.h70$b h70$b) {
        switch (((Enum)h70$b).ordinal()) {
            default: {
                throw new IllegalStateException();
            }
            case 10: {
                return this.N0;
            }
            case 9: {
                return this.M0;
            }
            case 8: {
                return this.L0;
            }
            case 7: {
                return this.K0;
            }
            case 6: {
                return this.J0;
            }
            case 5: {
                return this.I0;
            }
            case 4: {
                return this.H0;
            }
            case 3: {
                return this.G0;
            }
            case 2: {
                return this.F0;
            }
            case 1: {
                return this.E0;
            }
            case 0: {
                return this.D0;
            }
        }
    }
    
    public final boolean j(final h70.h70$b h70$b) {
        final int ordinal = ((Enum)h70$b).ordinal();
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        final boolean b8 = false;
        final boolean b9 = false;
        final boolean b10 = false;
        final boolean b11 = false;
        switch (ordinal) {
            default: {
                throw new IllegalStateException();
            }
            case 10: {
                boolean b12 = b11;
                if (this.N0 != null) {
                    b12 = true;
                }
                return b12;
            }
            case 9: {
                boolean b13 = b;
                if (this.M0 != null) {
                    b13 = true;
                }
                return b13;
            }
            case 8: {
                boolean b14 = b2;
                if (this.L0 != null) {
                    b14 = true;
                }
                return b14;
            }
            case 7: {
                boolean b15 = b3;
                if (this.K0 != null) {
                    b15 = true;
                }
                return b15;
            }
            case 6: {
                boolean b16 = b4;
                if (this.J0 != null) {
                    b16 = true;
                }
                return b16;
            }
            case 5: {
                if (this.I0 != null) {
                    b5 = true;
                }
                return b5;
            }
            case 4: {
                boolean b17 = b6;
                if (this.H0 != null) {
                    b17 = true;
                }
                return b17;
            }
            case 3: {
                boolean b18 = b7;
                if (this.G0 != null) {
                    b18 = true;
                }
                return b18;
            }
            case 2: {
                boolean b19 = b8;
                if (this.F0 != null) {
                    b19 = true;
                }
                return b19;
            }
            case 1: {
                boolean b20 = b9;
                if (this.E0 != null) {
                    b20 = true;
                }
                return b20;
            }
            case 0: {
                boolean b21 = b10;
                if (this.D0 != null) {
                    b21 = true;
                }
                return b21;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidTweetExpandedLayout(");
        final boolean j = this.j(h70.h70$b.F0);
        final boolean b = false;
        boolean b2;
        if (j) {
            sb.append("context:");
            final c70 d0 = this.D0;
            if (d0 == null) {
                sb.append("null");
            }
            else {
                sb.append(d0);
            }
            b2 = false;
        }
        else {
            b2 = true;
        }
        boolean b3 = b2;
        if (this.j(h70.h70$b.G0)) {
            if ((b2 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("title:");
            final c70 e0 = this.E0;
            if (e0 == null) {
                sb.append("null");
            }
            else {
                sb.append(e0);
            }
            b3 = false;
        }
        boolean b4 = b3;
        if (this.j(h70.h70$b.H0)) {
            if ((b3 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("profileImage:");
            final l40 f0 = this.F0;
            if (f0 == null) {
                sb.append("null");
            }
            else {
                sb.append(f0);
            }
            b4 = false;
        }
        boolean b5 = b4;
        if (this.j(h70.h70$b.I0)) {
            if ((b4 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetCard:");
            final g20 g0 = this.G0;
            if (g0 == null) {
                sb.append("null");
            }
            else {
                sb.append(g0);
            }
            b5 = false;
        }
        boolean b6 = b5;
        if (this.j(h70.h70$b.J0)) {
            if ((b5 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetProfileImage:");
            final l40 h0 = this.H0;
            if (h0 == null) {
                sb.append("null");
            }
            else {
                sb.append(h0);
            }
            b6 = false;
        }
        boolean b7 = b6;
        if (this.j(h70.h70$b.K0)) {
            if ((b6 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetProfileNameText:");
            final c70 i0 = this.I0;
            if (i0 == null) {
                sb.append("null");
            }
            else {
                sb.append(i0);
            }
            b7 = false;
        }
        boolean b8 = b7;
        if (this.j(h70.h70$b.L0)) {
            if ((b7 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetProfileHandleText:");
            final c70 j2 = this.J0;
            if (j2 == null) {
                sb.append("null");
            }
            else {
                sb.append(j2);
            }
            b8 = false;
        }
        boolean b9 = b8;
        if (this.j(h70.h70$b.M0)) {
            if ((b8 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetDivider:");
            final c70 k0 = this.K0;
            if (k0 == null) {
                sb.append("null");
            }
            else {
                sb.append(k0);
            }
            b9 = false;
        }
        boolean b10 = b9;
        if (this.j(h70.h70$b.N0)) {
            if ((b9 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetTime:");
            final c70 l0 = this.L0;
            if (l0 == null) {
                sb.append("null");
            }
            else {
                sb.append(l0);
            }
            b10 = false;
        }
        int n;
        if (this.j(h70.h70$b.O0)) {
            if ((b10 ? 1 : 0) == 0) {
                sb.append(", ");
            }
            sb.append("tweetText:");
            final c70 m0 = this.M0;
            if (m0 == null) {
                sb.append("null");
                n = (b ? 1 : 0);
            }
            else {
                sb.append(m0);
                n = (b ? 1 : 0);
            }
        }
        else {
            n = (b10 ? 1 : 0);
        }
        if (this.j(h70.h70$b.P0)) {
            if (n == 0) {
                sb.append(", ");
            }
            sb.append("tweetImage:");
            final l40 n2 = this.N0;
            if (n2 == null) {
                sb.append("null");
            }
            else {
                sb.append(n2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
