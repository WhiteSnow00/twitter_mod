import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhs implements n5s<mhs, mhs.mhs$a>, Serializable, Cloneable
{
    public static final q5s H0;
    public static final q5s I0;
    public static final q5s J0;
    public static final q5s K0;
    public static final q5s L0;
    public static final Map<mhs.mhs$a, oxa> M0;
    public lsc C0;
    public String D0;
    public String E0;
    public String F0;
    public suv G0;
    
    static {
        H0 = new q5s("httpRequest", (byte)12, (short)1);
        I0 = new q5s("textInputParam", (byte)11, (short)2);
        J0 = new q5s("hint", (byte)11, (short)3);
        K0 = new q5s("scribeAction", (byte)11, (short)4);
        L0 = new q5s("undoable", (byte)12, (short)5);
        final EnumMap enumMap = new EnumMap((Class<K>)mhs.mhs$a.class);
        enumMap.put(mhs.mhs$a.E0, new oxa());
        enumMap.put(mhs.mhs$a.F0, new oxa());
        enumMap.put(mhs.mhs$a.G0, new oxa());
        enumMap.put(mhs.mhs$a.H0, new oxa());
        enumMap.put(mhs.mhs$a.I0, new oxa());
        oxa.a((Class)mhs.class, M0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final int compareTo(final Object o) {
        final mhs mhs = (mhs)o;
        int n;
        if (!mhs.class.equals(mhs.getClass())) {
            n = mhs.class.getName().compareTo(mhs.class.getName());
        }
        else {
            final mhs.mhs$a e0 = mhs.mhs$a.E0;
            n = Boolean.valueOf(this.g(e0)).compareTo(Boolean.valueOf(mhs.g(e0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.g(e0)) {
                        break Label_0092;
                    }
                    n = this.C0.compareTo((Object)mhs.C0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final mhs.mhs$a f0 = mhs.mhs$a.F0;
                n = Boolean.valueOf(this.g(f0)).compareTo(Boolean.valueOf(mhs.g(f0)));
                if (n == 0) {
                    if (this.g(f0)) {
                        n = this.D0.compareTo(mhs.D0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final mhs.mhs$a g0 = mhs.mhs$a.G0;
                    n = Boolean.valueOf(this.g(g0)).compareTo(Boolean.valueOf(mhs.g(g0)));
                    if (n == 0) {
                        if (this.g(g0)) {
                            n = this.E0.compareTo(mhs.E0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        final mhs.mhs$a h0 = mhs.mhs$a.H0;
                        n = Boolean.valueOf(this.g(h0)).compareTo(Boolean.valueOf(mhs.g(h0)));
                        if (n == 0) {
                            if (this.g(h0)) {
                                n = this.F0.compareTo(mhs.F0);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            final mhs.mhs$a i0 = mhs.mhs$a.I0;
                            n = Boolean.valueOf(this.g(i0)).compareTo(Boolean.valueOf(mhs.g(i0)));
                            if (n == 0) {
                                if (this.g(i0)) {
                                    n = this.G0.compareTo((Object)mhs.G0);
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
            w5s.m(mhs.H0);
            ((z5s)this.C0).e(w5s);
        }
        if (this.D0 != null) {
            w5s.m(mhs.I0);
            w5s.q(this.D0);
        }
        if (this.E0 != null && this.g(mhs.mhs$a.G0)) {
            w5s.m(mhs.J0);
            w5s.q(this.E0);
        }
        if (this.F0 != null && this.g(mhs.mhs$a.H0)) {
            w5s.m(mhs.K0);
            w5s.q(this.F0);
        }
        if (this.G0 != null && this.g(mhs.mhs$a.I0)) {
            w5s.m(mhs.L0);
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
        if (o instanceof mhs) {
            final mhs mhs = (mhs)o;
            final mhs.mhs$a e0 = mhs.mhs$a.E0;
            final boolean g = this.g(e0);
            final boolean g2 = mhs.g(e0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.C0.u(mhs.C0)) {
                    b2 = b;
                    return b2;
                }
            }
            final mhs.mhs$a f0 = mhs.mhs$a.F0;
            final boolean g3 = this.g(f0);
            final boolean g4 = mhs.g(f0);
            if (g3 || g4) {
                b2 = b;
                if (!g3) {
                    return b2;
                }
                if (!g4) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.equals(mhs.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final mhs.mhs$a g5 = mhs.mhs$a.G0;
            final boolean g6 = this.g(g5);
            final boolean g7 = mhs.g(g5);
            if (g6 || g7) {
                b2 = b;
                if (!g6) {
                    return b2;
                }
                if (!g7) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.equals(mhs.E0)) {
                    b2 = b;
                    return b2;
                }
            }
            final mhs.mhs$a h0 = mhs.mhs$a.H0;
            final boolean g8 = this.g(h0);
            final boolean g9 = mhs.g(h0);
            if (g8 || g9) {
                b2 = b;
                if (!g8) {
                    return b2;
                }
                if (!g9) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.equals(mhs.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final mhs.mhs$a i0 = mhs.mhs$a.I0;
            final boolean g10 = this.g(i0);
            final boolean g11 = mhs.g(i0);
            if (g10 || g11) {
                b2 = b;
                if (!g10) {
                    return b2;
                }
                if (!g11) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.g(mhs.G0)) {
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
                        else if (b == 11) {
                            this.F0 = w5s.j();
                        }
                        else {
                            mb8.i(w5s, b);
                        }
                    }
                    else if (b == 11) {
                        this.E0 = w5s.j();
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
    
    public final boolean g(final mhs.mhs$a mhs$a) {
        final int ordinal = ((Enum)mhs$a).ordinal();
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        final boolean b4 = true;
        boolean b5 = true;
        if (ordinal == 0) {
            return this.C0 != null && b4;
        }
        if (ordinal == 1) {
            return this.D0 != null && b3;
        }
        if (ordinal == 2) {
            return this.E0 != null && b2;
        }
        if (ordinal == 3) {
            return this.F0 != null && b;
        }
        if (ordinal == 4) {
            if (this.G0 == null) {
                b5 = false;
            }
            return b5;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(mhs.mhs$a.E0)) {
            n = this.C0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(mhs.mhs$a.F0)) {
            n2 = n * 31 + this.D0.hashCode();
        }
        int n3 = n2;
        if (this.g(mhs.mhs$a.G0)) {
            n3 = n2 * 31 + this.E0.hashCode();
        }
        int n4 = n3;
        if (this.g(mhs.mhs$a.H0)) {
            n4 = n3 * 31 + this.F0.hashCode();
        }
        int n5 = n4;
        if (this.g(mhs.mhs$a.I0)) {
            n5 = n4 * 31 + this.G0.hashCode();
        }
        return n5;
    }
    
    public final void i() throws TException {
        if (this.C0 == null) {
            final StringBuilder g = w48.g("Required field 'httpRequest' was not present! Struct: ");
            g.append(this.toString());
            throw new TProtocolException(g.toString());
        }
        if (this.D0 != null) {
            return;
        }
        final StringBuilder g2 = w48.g("Required field 'textInputParam' was not present! Struct: ");
        g2.append(this.toString());
        throw new TProtocolException(g2.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = dia.t("TextInputAction(", "httpRequest:");
        final lsc c0 = this.C0;
        if (c0 == null) {
            t.append("null");
        }
        else {
            t.append(c0);
        }
        t.append(", ");
        t.append("textInputParam:");
        final String d0 = this.D0;
        if (d0 == null) {
            t.append("null");
        }
        else {
            t.append(d0);
        }
        if (this.g(mhs.mhs$a.G0)) {
            t.append(", ");
            t.append("hint:");
            final String e0 = this.E0;
            if (e0 == null) {
                t.append("null");
            }
            else {
                t.append(e0);
            }
        }
        if (this.g(mhs.mhs$a.H0)) {
            t.append(", ");
            t.append("scribeAction:");
            final String f0 = this.F0;
            if (f0 == null) {
                t.append("null");
            }
            else {
                t.append(f0);
            }
        }
        if (this.g(mhs.mhs$a.I0)) {
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
