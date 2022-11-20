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

public final class his implements g6s<his, his.his$a>, Serializable, Cloneable
{
    public static final j6s I0;
    public static final j6s J0;
    public static final j6s K0;
    public static final j6s L0;
    public static final j6s M0;
    public static final Map<his.his$a, kwa> N0;
    public prc D0;
    public String E0;
    public String F0;
    public String G0;
    public lvv H0;
    
    static {
        I0 = new j6s("httpRequest", (byte)12, (short)1);
        J0 = new j6s("textInputParam", (byte)11, (short)2);
        K0 = new j6s("hint", (byte)11, (short)3);
        L0 = new j6s("scribeAction", (byte)11, (short)4);
        M0 = new j6s("undoable", (byte)12, (short)5);
        final EnumMap enumMap = new EnumMap((Class<K>)his.his$a.class);
        enumMap.put(his.his$a.F0, new kwa());
        enumMap.put(his.his$a.G0, new kwa());
        enumMap.put(his.his$a.H0, new kwa());
        enumMap.put(his.his$a.I0, new kwa());
        enumMap.put(his.his$a.J0, new kwa());
        kwa.a((Class)his.class, N0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final int compareTo(final Object o) {
        final his his = (his)o;
        int n;
        if (!his.class.equals(his.getClass())) {
            n = his.class.getName().compareTo(his.class.getName());
        }
        else {
            final his.his$a f0 = his.his$a.F0;
            n = Boolean.valueOf(this.g(f0)).compareTo(Boolean.valueOf(his.g(f0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.g(f0)) {
                        break Label_0092;
                    }
                    n = this.D0.compareTo(his.D0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final his.his$a g0 = his.his$a.G0;
                n = Boolean.valueOf(this.g(g0)).compareTo(Boolean.valueOf(his.g(g0)));
                if (n == 0) {
                    if (this.g(g0)) {
                        n = this.E0.compareTo(his.E0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final his.his$a h0 = his.his$a.H0;
                    n = Boolean.valueOf(this.g(h0)).compareTo(Boolean.valueOf(his.g(h0)));
                    if (n == 0) {
                        if (this.g(h0)) {
                            n = this.F0.compareTo(his.F0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        final his.his$a i0 = his.his$a.I0;
                        n = Boolean.valueOf(this.g(i0)).compareTo(Boolean.valueOf(his.g(i0)));
                        if (n == 0) {
                            if (this.g(i0)) {
                                n = this.G0.compareTo(his.G0);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            final his.his$a j0 = his.his$a.J0;
                            n = Boolean.valueOf(this.g(j0)).compareTo(Boolean.valueOf(his.g(j0)));
                            if (n == 0) {
                                if (this.g(j0)) {
                                    n = this.H0.compareTo((Object)his.H0);
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
    
    public final void e(final p6s p6s) throws TException {
        this.i();
        Objects.requireNonNull(p6s);
        if (this.D0 != null) {
            p6s.m(his.I0);
            this.D0.e(p6s);
        }
        if (this.E0 != null) {
            p6s.m(his.J0);
            p6s.q(this.E0);
        }
        if (this.F0 != null && this.g(his.his$a.H0)) {
            p6s.m(his.K0);
            p6s.q(this.F0);
        }
        if (this.G0 != null && this.g(his.his$a.I0)) {
            p6s.m(his.L0);
            p6s.q(this.G0);
        }
        if (this.H0 != null && this.g(his.his$a.J0)) {
            p6s.m(his.M0);
            this.H0.e(p6s);
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
        if (o instanceof his) {
            final his his = (his)o;
            final his.his$a f0 = his.his$a.F0;
            final boolean g = this.g(f0);
            final boolean g2 = his.g(f0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.u(his.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final his.his$a g3 = his.his$a.G0;
            final boolean g4 = this.g(g3);
            final boolean g5 = his.g(g3);
            if (g4 || g5) {
                b2 = b;
                if (!g4) {
                    return b2;
                }
                if (!g5) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.equals(his.E0)) {
                    b2 = b;
                    return b2;
                }
            }
            final his.his$a h0 = his.his$a.H0;
            final boolean g6 = this.g(h0);
            final boolean g7 = his.g(h0);
            if (g6 || g7) {
                b2 = b;
                if (!g6) {
                    return b2;
                }
                if (!g7) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.equals(his.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final his.his$a i0 = his.his$a.I0;
            final boolean g8 = this.g(i0);
            final boolean g9 = his.g(i0);
            if (g8 || g9) {
                b2 = b;
                if (!g8) {
                    return b2;
                }
                if (!g9) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.equals(his.G0)) {
                    b2 = b;
                    return b2;
                }
            }
            final his.his$a j0 = his.his$a.J0;
            final boolean g10 = this.g(j0);
            final boolean g11 = his.g(j0);
            if (g10 || g11) {
                b2 = b;
                if (!g10) {
                    return b2;
                }
                if (!g11) {
                    b2 = b;
                    return b2;
                }
                if (!this.H0.g(his.H0)) {
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
            final short c = d.c;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            if (c != 5) {
                                pps.q(p6s, b);
                            }
                            else if (b == 12) {
                                (this.H0 = new lvv()).f(p6s);
                            }
                            else {
                                pps.q(p6s, b);
                            }
                        }
                        else if (b == 11) {
                            this.G0 = p6s.j();
                        }
                        else {
                            pps.q(p6s, b);
                        }
                    }
                    else if (b == 11) {
                        this.F0 = p6s.j();
                    }
                    else {
                        pps.q(p6s, b);
                    }
                }
                else if (b == 11) {
                    this.E0 = p6s.j();
                }
                else {
                    pps.q(p6s, b);
                }
            }
            else if (b == 12) {
                (this.D0 = new prc()).f(p6s);
            }
            else {
                pps.q(p6s, b);
            }
        }
        this.i();
    }
    
    public final boolean g(final his.his$a his$a) {
        final int ordinal = ((Enum)his$a).ordinal();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        final boolean b4 = true;
        final boolean b5 = true;
        if (ordinal == 0) {
            return this.D0 != null && b4;
        }
        if (ordinal == 1) {
            if (this.E0 == null) {
                b3 = false;
            }
            return b3;
        }
        if (ordinal == 2) {
            return this.F0 != null && b2;
        }
        if (ordinal == 3) {
            return this.G0 != null && b;
        }
        if (ordinal == 4) {
            return this.H0 != null && b5;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(his.his$a.F0)) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(his.his$a.G0)) {
            n2 = n * 31 + this.E0.hashCode();
        }
        int n3 = n2;
        if (this.g(his.his$a.H0)) {
            n3 = n2 * 31 + this.F0.hashCode();
        }
        int n4 = n3;
        if (this.g(his.his$a.I0)) {
            n4 = n3 * 31 + this.G0.hashCode();
        }
        int n5 = n4;
        if (this.g(his.his$a.J0)) {
            n5 = n4 * 31 + this.H0.hashCode();
        }
        return n5;
    }
    
    public final void i() throws TException {
        if (this.D0 == null) {
            final StringBuilder j = fu8.j("Required field 'httpRequest' was not present! Struct: ");
            j.append(this.toString());
            throw new TProtocolException(j.toString());
        }
        if (this.E0 != null) {
            return;
        }
        final StringBuilder i = fu8.j("Required field 'textInputParam' was not present! Struct: ");
        i.append(this.toString());
        throw new TProtocolException(i.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = shc.g("TextInputAction(", "httpRequest:");
        final prc d0 = this.D0;
        if (d0 == null) {
            g.append("null");
        }
        else {
            g.append(d0);
        }
        g.append(", ");
        g.append("textInputParam:");
        final String e0 = this.E0;
        if (e0 == null) {
            g.append("null");
        }
        else {
            g.append(e0);
        }
        if (this.g(his.his$a.H0)) {
            g.append(", ");
            g.append("hint:");
            final String f0 = this.F0;
            if (f0 == null) {
                g.append("null");
            }
            else {
                g.append(f0);
            }
        }
        if (this.g(his.his$a.I0)) {
            g.append(", ");
            g.append("scribeAction:");
            final String g2 = this.G0;
            if (g2 == null) {
                g.append("null");
            }
            else {
                g.append(g2);
            }
        }
        if (this.g(his.his$a.J0)) {
            g.append(", ");
            g.append("undoable:");
            final lvv h0 = this.H0;
            if (h0 == null) {
                g.append("null");
            }
            else {
                g.append(h0);
            }
        }
        g.append(")");
        return g.toString();
    }
}
