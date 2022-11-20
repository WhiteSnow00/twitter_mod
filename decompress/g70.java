import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g70 implements g6s<g70, g70.g70$b>, Serializable, Cloneable
{
    public static final j6s G0;
    public static final j6s H0;
    public static final j6s I0;
    public static final Map<g70.g70$b, kwa> J0;
    public static final g70.g70$b K0;
    public static final g70.g70$b L0;
    public static final g70.g70$b M0;
    public c70 D0;
    public c70 E0;
    public l40 F0;
    
    static {
        G0 = new j6s("title", (byte)12, (short)1);
        H0 = new j6s("tweetText", (byte)12, (short)2);
        I0 = new j6s("tweetProfileImage", (byte)12, (short)3);
        final EnumMap enumMap = new EnumMap((Class<K>)g70.g70$b.class);
        final g70.g70$b f0 = g70.g70$b.F0;
        enumMap.put(f0, new kwa());
        final g70.g70$b g0 = g70.g70$b.G0;
        enumMap.put(g0, new kwa());
        final g70.g70$b h0 = g70.g70$b.H0;
        enumMap.put(h0, new kwa());
        kwa.a((Class)g70.class, J0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        K0 = f0;
        L0 = g0;
        M0 = h0;
    }
    
    public g70() {
    }
    
    public g70(final c70 d0, final c70 e0, final l40 f0) {
        if (d0 != null) {
            this.D0 = d0;
        }
        if (e0 != null) {
            this.E0 = e0;
        }
        if (f0 != null) {
            this.F0 = f0;
        }
    }
    
    public final int compareTo(final Object o) {
        final g70 g70 = (g70)o;
        int n;
        if (!g70.class.equals(g70.getClass())) {
            n = g70.class.getName().compareTo(g70.class.getName());
        }
        else {
            final g70.g70$b f0 = g70.g70$b.F0;
            n = Boolean.valueOf(this.j(f0)).compareTo(Boolean.valueOf(g70.j(f0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.j(f0)) {
                        break Label_0092;
                    }
                    n = this.D0.compareTo((Object)g70.D0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final g70.g70$b g71 = g70.g70$b.G0;
                n = Boolean.valueOf(this.j(g71)).compareTo(Boolean.valueOf(g70.j(g71)));
                if (n == 0) {
                    if (this.j(g71)) {
                        n = this.E0.compareTo((Object)g70.E0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final g70.g70$b h0 = g70.g70$b.H0;
                    n = Boolean.valueOf(this.j(h0)).compareTo(Boolean.valueOf(g70.j(h0)));
                    if (n == 0) {
                        if (this.j(h0)) {
                            n = this.F0.compareTo((Object)g70.F0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        n = 0;
                    }
                }
            }
        }
        return n;
    }
    
    public final void e(final p6s p6s) throws TException {
        Objects.requireNonNull(p6s);
        if (this.D0 != null && this.j(g70.g70$b.F0)) {
            p6s.m(g70.G0);
            this.D0.e(p6s);
        }
        if (this.E0 != null && this.j(g70.g70$b.G0)) {
            p6s.m(g70.H0);
            this.E0.e(p6s);
        }
        if (this.F0 != null && this.j(g70.g70$b.H0)) {
            p6s.m(g70.I0);
            this.F0.e(p6s);
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
        if (o instanceof g70) {
            final g70 g70 = (g70)o;
            final g70.g70$b f0 = g70.g70$b.F0;
            final boolean j = this.j(f0);
            final boolean i = g70.j(f0);
            if (j || i) {
                b2 = b;
                if (!j) {
                    return b2;
                }
                if (!i) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.g(g70.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final g70.g70$b g71 = g70.g70$b.G0;
            final boolean k = this.j(g71);
            final boolean l = g70.j(g71);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.g(g70.E0)) {
                    b2 = b;
                    return b2;
                }
            }
            final g70.g70$b h0 = g70.g70$b.H0;
            final boolean m = this.j(h0);
            final boolean j2 = g70.j(h0);
            if (m || j2) {
                b2 = b;
                if (!m) {
                    return b2;
                }
                if (!j2) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.g(g70.F0)) {
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
                        pps.q(p6s, b);
                    }
                    else if (b == 12) {
                        (this.F0 = new l40()).f(p6s);
                    }
                    else {
                        pps.q(p6s, b);
                    }
                }
                else if (b == 12) {
                    (this.E0 = new c70()).f(p6s);
                }
                else {
                    pps.q(p6s, b);
                }
            }
            else if (b == 12) {
                (this.D0 = new c70()).f(p6s);
            }
            else {
                pps.q(p6s, b);
            }
        }
    }
    
    public final <Any> Any g(final g70.g70$b g70$b) {
        final int ordinal = ((Enum)g70$b).ordinal();
        if (ordinal == 0) {
            return (Any)this.i(g70$b);
        }
        if (ordinal == 1) {
            return (Any)this.i(g70$b);
        }
        if (ordinal == 2) {
            return (Any)this.i(g70$b);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.j(g70.g70$b.F0)) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.j(g70.g70$b.G0)) {
            n2 = n * 31 + this.E0.hashCode();
        }
        int n3 = n2;
        if (this.j(g70.g70$b.H0)) {
            n3 = n2 * 31 + this.F0.hashCode();
        }
        return n3;
    }
    
    public final Object i(final g70.g70$b g70$b) {
        final int ordinal = ((Enum)g70$b).ordinal();
        if (ordinal == 0) {
            return this.D0;
        }
        if (ordinal == 1) {
            return this.E0;
        }
        if (ordinal == 2) {
            return this.F0;
        }
        throw new IllegalStateException();
    }
    
    public final boolean j(final g70.g70$b g70$b) {
        final int ordinal = ((Enum)g70$b).ordinal();
        final boolean b = true;
        boolean b2 = true;
        final boolean b3 = true;
        if (ordinal == 0) {
            if (this.D0 == null) {
                b2 = false;
            }
            return b2;
        }
        if (ordinal == 1) {
            return this.E0 != null && b;
        }
        if (ordinal == 2) {
            return this.F0 != null && b3;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidTweetCollapsedLayout(");
        final boolean j = this.j(g70.g70$b.F0);
        final int n = 0;
        int n2;
        if (j) {
            sb.append("title:");
            final c70 d0 = this.D0;
            if (d0 == null) {
                sb.append("null");
            }
            else {
                sb.append(d0);
            }
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        if (this.j(g70.g70$b.G0)) {
            if (n2 == 0) {
                sb.append(", ");
            }
            sb.append("tweetText:");
            final c70 e0 = this.E0;
            if (e0 == null) {
                sb.append("null");
                n2 = n;
            }
            else {
                sb.append(e0);
                n2 = n;
            }
        }
        if (this.j(g70.g70$b.H0)) {
            if (n2 == 0) {
                sb.append(", ");
            }
            sb.append("tweetProfileImage:");
            final l40 f0 = this.F0;
            if (f0 == null) {
                sb.append("null");
            }
            else {
                sb.append(f0);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
