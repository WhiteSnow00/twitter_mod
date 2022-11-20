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

public final class hc8 implements g6s<hc8, hc8.hc8$a>, Serializable, Cloneable
{
    public static final j6s F0;
    public static final j6s G0;
    public static final Map<hc8.hc8$a, kwa> H0;
    public String D0;
    public String E0;
    
    static {
        F0 = new j6s("uri", (byte)11, (short)1);
        G0 = new j6s("scribeAction", (byte)11, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)hc8.hc8$a.class);
        enumMap.put(hc8.hc8$a.F0, new kwa());
        enumMap.put(hc8.hc8$a.G0, new kwa());
        kwa.a((Class)hc8.class, H0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final int compareTo(final Object o) {
        final hc8 hc8 = (hc8)o;
        int n;
        if (!hc8.class.equals(hc8.getClass())) {
            n = hc8.class.getName().compareTo(hc8.class.getName());
        }
        else {
            final hc8.hc8$a f0 = hc8.hc8$a.F0;
            n = Boolean.valueOf(this.g(f0)).compareTo(Boolean.valueOf(hc8.g(f0)));
            if (n == 0) {
                if (this.g(f0)) {
                    n = this.D0.compareTo(hc8.D0);
                    if (n != 0) {
                        return n;
                    }
                }
                final hc8.hc8$a g0 = hc8.hc8$a.G0;
                n = Boolean.valueOf(this.g(g0)).compareTo(Boolean.valueOf(hc8.g(g0)));
                if (n == 0) {
                    if (this.g(g0)) {
                        n = this.E0.compareTo(hc8.E0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    n = 0;
                }
            }
        }
        return n;
    }
    
    public final void e(final p6s p6s) throws TException {
        this.i();
        Objects.requireNonNull(p6s);
        if (this.D0 != null) {
            p6s.m(hc8.F0);
            p6s.q(this.D0);
        }
        if (this.E0 != null && this.g(hc8.hc8$a.G0)) {
            p6s.m(hc8.G0);
            p6s.q(this.E0);
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
        if (o instanceof hc8) {
            final hc8 hc8 = (hc8)o;
            final hc8.hc8$a f0 = hc8.hc8$a.F0;
            final boolean g = this.g(f0);
            final boolean g2 = hc8.g(f0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.equals(hc8.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final hc8.hc8$a g3 = hc8.hc8$a.G0;
            final boolean g4 = this.g(g3);
            final boolean g5 = hc8.g(g3);
            if (g4 || g5) {
                b2 = b;
                if (!g4) {
                    return b2;
                }
                if (!g5) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.equals(hc8.E0)) {
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
                    pps.q(p6s, b);
                }
                else if (b == 11) {
                    this.E0 = p6s.j();
                }
                else {
                    pps.q(p6s, b);
                }
            }
            else if (b == 11) {
                this.D0 = p6s.j();
            }
            else {
                pps.q(p6s, b);
            }
        }
        this.i();
    }
    
    public final boolean g(final hc8.hc8$a hc8$a) {
        final int ordinal = ((Enum)hc8$a).ordinal();
        final boolean b = true;
        boolean b2 = true;
        if (ordinal == 0) {
            return this.D0 != null && b;
        }
        if (ordinal == 1) {
            if (this.E0 == null) {
                b2 = false;
            }
            return b2;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(hc8.hc8$a.F0)) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(hc8.hc8$a.G0)) {
            n2 = n * 31 + this.E0.hashCode();
        }
        return n2;
    }
    
    public final void i() throws TException {
        if (this.D0 != null) {
            return;
        }
        final StringBuilder j = fu8.j("Required field 'uri' was not present! Struct: ");
        j.append(this.toString());
        throw new TProtocolException(j.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = shc.g("DeepLinkAction(", "uri:");
        final String d0 = this.D0;
        if (d0 == null) {
            g.append("null");
        }
        else {
            g.append(d0);
        }
        if (this.g(hc8.hc8$a.G0)) {
            g.append(", ");
            g.append("scribeAction:");
            final String e0 = this.E0;
            if (e0 == null) {
                g.append("null");
            }
            else {
                g.append(e0);
            }
        }
        g.append(")");
        return g.toString();
    }
}
