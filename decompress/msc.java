import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.BitSet;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msc implements n5s<msc, msc.msc$a>, Serializable, Cloneable
{
    public static final q5s I0;
    public static final q5s J0;
    public static final q5s K0;
    public static final q5s L0;
    public static final q5s M0;
    public static final Map<msc.msc$a, oxa> N0;
    public lsc C0;
    public String D0;
    public boolean E0;
    public boolean F0;
    public suv G0;
    public final BitSet H0;
    
    static {
        I0 = new q5s("httpRequest", (byte)12, (short)1);
        J0 = new q5s("scribeAction", (byte)11, (short)2);
        K0 = new q5s("isAuthorizationRequired", (byte)2, (short)3);
        L0 = new q5s("isDestructive", (byte)2, (short)4);
        M0 = new q5s("undoable", (byte)12, (short)5);
        final EnumMap enumMap = new EnumMap((Class<K>)msc.msc$a.class);
        enumMap.put(msc.msc$a.E0, new oxa());
        enumMap.put(msc.msc$a.F0, new oxa());
        enumMap.put(msc.msc$a.G0, new oxa());
        enumMap.put(msc.msc$a.H0, new oxa());
        enumMap.put(msc.msc$a.I0, new oxa());
        oxa.a((Class)msc.class, N0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public msc() {
        this.H0 = new BitSet(2);
    }
    
    public final int compareTo(final Object o) {
        final msc msc = (msc)o;
        int n;
        if (!msc.class.equals(msc.getClass())) {
            n = msc.class.getName().compareTo(msc.class.getName());
        }
        else {
            final msc.msc$a e0 = msc.msc$a.E0;
            n = Boolean.valueOf(this.g(e0)).compareTo(Boolean.valueOf(msc.g(e0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.g(e0)) {
                        break Label_0092;
                    }
                    n = this.C0.compareTo((Object)msc.C0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final msc.msc$a f0 = msc.msc$a.F0;
                n = Boolean.valueOf(this.g(f0)).compareTo(Boolean.valueOf(msc.g(f0)));
                if (n == 0) {
                    if (this.g(f0)) {
                        n = this.D0.compareTo(msc.D0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final msc.msc$a g0 = msc.msc$a.G0;
                    n = Boolean.valueOf(this.g(g0)).compareTo(Boolean.valueOf(msc.g(g0)));
                    if (n == 0) {
                        if (this.g(g0)) {
                            n = o5s.j(this.E0, msc.E0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        final msc.msc$a h0 = msc.msc$a.H0;
                        n = Boolean.valueOf(this.g(h0)).compareTo(Boolean.valueOf(msc.g(h0)));
                        if (n == 0) {
                            if (this.g(h0)) {
                                n = o5s.j(this.F0, msc.F0);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            final msc.msc$a i0 = msc.msc$a.I0;
                            n = Boolean.valueOf(this.g(i0)).compareTo(Boolean.valueOf(msc.g(i0)));
                            if (n == 0) {
                                if (this.g(i0)) {
                                    n = this.G0.compareTo((Object)msc.G0);
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
        return n;
    }
    
    public final void e(final w5s w5s) throws TException {
        this.i();
        Objects.requireNonNull(w5s);
        if (this.C0 != null) {
            w5s.m(msc.I0);
            ((z5s)this.C0).e(w5s);
        }
        if (this.D0 != null && this.g(msc.msc$a.F0)) {
            w5s.m(msc.J0);
            w5s.q(this.D0);
        }
        if (this.g(msc.msc$a.G0)) {
            w5s.m(msc.K0);
            ((p5s)w5s).k((byte)(byte)(this.E0 ? 1 : 0));
        }
        if (this.g(msc.msc$a.H0)) {
            w5s.m(msc.L0);
            ((p5s)w5s).k((byte)(byte)(this.F0 ? 1 : 0));
        }
        if (this.G0 != null && this.g(msc.msc$a.I0)) {
            w5s.m(msc.M0);
            this.G0.e(w5s);
        }
        ((p5s)w5s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (o instanceof msc) {
            final msc msc = (msc)o;
            final msc.msc$a e0 = msc.msc$a.E0;
            final boolean g = this.g(e0);
            final boolean g2 = msc.g(e0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.C0.u(msc.C0)) {
                    b2 = b;
                    return b2;
                }
            }
            final msc.msc$a f0 = msc.msc$a.F0;
            final boolean g3 = this.g(f0);
            final boolean g4 = msc.g(f0);
            if (g3 || g4) {
                b2 = b;
                if (!g3) {
                    return b2;
                }
                if (!g4) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.equals(msc.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final msc.msc$a g5 = msc.msc$a.G0;
            final boolean g6 = this.g(g5);
            final boolean g7 = msc.g(g5);
            if (g6 || g7) {
                b2 = b;
                if (!g6) {
                    return b2;
                }
                if (!g7) {
                    b2 = b;
                    return b2;
                }
                if (this.E0 != msc.E0) {
                    b2 = b;
                    return b2;
                }
            }
            final msc.msc$a h0 = msc.msc$a.H0;
            final boolean g8 = this.g(h0);
            final boolean g9 = msc.g(h0);
            if (g8 || g9) {
                b2 = b;
                if (!g8) {
                    return b2;
                }
                if (!g9) {
                    b2 = b;
                    return b2;
                }
                if (this.F0 != msc.F0) {
                    b2 = b;
                    return b2;
                }
            }
            final msc.msc$a i0 = msc.msc$a.I0;
            final boolean g10 = this.g(i0);
            final boolean g11 = msc.g(i0);
            if (g10 || g11) {
                b2 = b;
                if (!g10) {
                    return b2;
                }
                if (!g11) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.g(msc.G0)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void f(final w5s w5s) throws TException {
        Objects.requireNonNull(w5s);
        while (true) {
            final q5s d = w5s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            final short c = d.c;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                mb8.i(w5s, b);
                            }
                            else if (b == 12) {
                                (this.G0 = new suv()).f(w5s);
                            }
                            else {
                                mb8.i(w5s, b);
                            }
                        }
                        else if (b == 2) {
                            this.F0 = w5s.a();
                            this.H0.set(1, true);
                        }
                        else {
                            mb8.i(w5s, b);
                        }
                    }
                    else if (b == 2) {
                        this.E0 = w5s.a();
                        this.H0.set(0, true);
                    }
                    else {
                        mb8.i(w5s, b);
                    }
                }
                else if (b == 11) {
                    this.D0 = w5s.j();
                }
                else {
                    mb8.i(w5s, b);
                }
            }
            else if (b == 12) {
                ((z5s)(this.C0 = new lsc())).f(w5s);
            }
            else {
                mb8.i(w5s, b);
            }
        }
        this.i();
    }
    
    public final boolean g(final msc.msc$a msc$a) {
        final int ordinal = ((Enum)msc$a).ordinal();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (ordinal == 0) {
            return this.C0 != null && b2;
        }
        if (ordinal == 1) {
            return this.D0 != null && b;
        }
        if (ordinal == 2) {
            return this.H0.get(0);
        }
        if (ordinal == 3) {
            return this.H0.get(1);
        }
        if (ordinal == 4) {
            if (this.G0 == null) {
                b3 = false;
            }
            return b3;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(msc.msc$a.E0)) {
            n = this.C0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(msc.msc$a.F0)) {
            n2 = n * 31 + this.D0.hashCode();
        }
        int i = n2;
        if (this.g(msc.msc$a.G0)) {
            i = mag.i(this.E0, n2 * 31);
        }
        int j = i;
        if (this.g(msc.msc$a.H0)) {
            j = mag.i(this.F0, i * 31);
        }
        int n3 = j;
        if (this.g(msc.msc$a.I0)) {
            n3 = j * 31 + this.G0.hashCode();
        }
        return n3;
    }
    
    public final void i() throws TException {
        if (this.C0 != null) {
            return;
        }
        final StringBuilder g = w48.g("Required field 'httpRequest' was not present! Struct: ");
        g.append(this.toString());
        throw new TProtocolException(g.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = dia.t("HttpRequestAction(", "httpRequest:");
        final lsc c0 = this.C0;
        if (c0 == null) {
            t.append("null");
        }
        else {
            t.append(c0);
        }
        if (this.g(msc.msc$a.F0)) {
            t.append(", ");
            t.append("scribeAction:");
            final String d0 = this.D0;
            if (d0 == null) {
                t.append("null");
            }
            else {
                t.append(d0);
            }
        }
        if (this.g(msc.msc$a.G0)) {
            t.append(", ");
            t.append("isAuthorizationRequired:");
            t.append(this.E0);
        }
        if (this.g(msc.msc$a.H0)) {
            t.append(", ");
            t.append("isDestructive:");
            t.append(this.F0);
        }
        if (this.g(msc.msc$a.I0)) {
            t.append(", ");
            t.append("undoable:");
            final suv g0 = this.G0;
            if (g0 == null) {
                t.append("null");
            }
            else {
                t.append(g0);
            }
        }
        t.append(")");
        return t.toString();
    }
}
