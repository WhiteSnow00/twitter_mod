import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z50 implements g6s<z50, z50.z50$a>, Serializable, Cloneable
{
    public static final j6s F0;
    public static final j6s G0;
    public static final Map<z50.z50$a, kwa> H0;
    public static final z50.z50$a I0;
    public static final z50.z50$a J0;
    public j20 D0;
    public v30 E0;
    
    static {
        F0 = new j6s("collapsedLayout", (byte)12, (short)1);
        G0 = new j6s("expandedLayout", (byte)12, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)z50.z50$a.class);
        final z50.z50$a f0 = z50.z50$a.F0;
        enumMap.put(f0, new kwa());
        final z50.z50$a g0 = z50.z50$a.G0;
        enumMap.put(g0, new kwa());
        kwa.a((Class)z50.class, H0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        I0 = f0;
        J0 = g0;
    }
    
    public z50() {
    }
    
    public z50(final j20 d0, final v30 e0) {
        if (d0 != null) {
            this.D0 = d0;
        }
        if (e0 != null) {
            this.E0 = e0;
        }
    }
    
    public final int compareTo(final Object o) {
        final z50 z50 = (z50)o;
        int n;
        if (!z50.class.equals(z50.getClass())) {
            n = z50.class.getName().compareTo(z50.class.getName());
        }
        else {
            final z50.z50$a f0 = z50.z50$a.F0;
            n = Boolean.valueOf(this.j(f0)).compareTo(Boolean.valueOf(z50.j(f0)));
            if (n == 0) {
                if (this.j(f0)) {
                    n = this.D0.compareTo((Object)z50.D0);
                    if (n != 0) {
                        return n;
                    }
                }
                final z50.z50$a g0 = z50.z50$a.G0;
                n = Boolean.valueOf(this.j(g0)).compareTo(Boolean.valueOf(z50.j(g0)));
                if (n == 0) {
                    if (this.j(g0)) {
                        n = this.E0.compareTo((Object)z50.E0);
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
        Objects.requireNonNull(p6s);
        if (this.D0 != null && this.j(z50.z50$a.F0)) {
            p6s.m(z50.F0);
            ((s6s)this.D0).e(p6s);
        }
        if (this.E0 != null && this.j(z50.z50$a.G0)) {
            p6s.m(z50.G0);
            ((s6s)this.E0).e(p6s);
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
        if (o instanceof z50) {
            final z50 z50 = (z50)o;
            final z50.z50$a f0 = z50.z50$a.F0;
            final boolean j = this.j(f0);
            final boolean i = z50.j(f0);
            if (j || i) {
                b2 = b;
                if (!j) {
                    return b2;
                }
                if (!i) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.u(z50.D0)) {
                    b2 = b;
                    return b2;
                }
            }
            final z50.z50$a g0 = z50.z50$a.G0;
            final boolean k = this.j(g0);
            final boolean l = z50.j(g0);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.u(z50.E0)) {
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
                else if (b == 12) {
                    ((s6s)(this.E0 = new v30())).f(p6s);
                }
                else {
                    pps.q(p6s, b);
                }
            }
            else if (b == 12) {
                ((s6s)(this.D0 = new j20())).f(p6s);
            }
            else {
                pps.q(p6s, b);
            }
        }
    }
    
    public final <Any> Any g(final z50.z50$a z50$a) {
        final int ordinal = ((Enum)z50$a).ordinal();
        if (ordinal == 0) {
            return (Any)this.i(z50$a);
        }
        if (ordinal == 1) {
            return (Any)this.i(z50$a);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.j(z50.z50$a.F0)) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.j(z50.z50$a.G0)) {
            n2 = n * 31 + this.E0.hashCode();
        }
        return n2;
    }
    
    public final Object i(final z50.z50$a z50$a) {
        final int ordinal = ((Enum)z50$a).ordinal();
        if (ordinal == 0) {
            return this.D0;
        }
        if (ordinal == 1) {
            return this.E0;
        }
        throw new IllegalStateException();
    }
    
    public final boolean j(final z50.z50$a z50$a) {
        final int ordinal = ((Enum)z50$a).ordinal();
        boolean b = true;
        final boolean b2 = true;
        if (ordinal == 0) {
            if (this.D0 == null) {
                b = false;
            }
            return b;
        }
        if (ordinal == 1) {
            return this.E0 != null && b2;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidPushLayout(");
        boolean b;
        if (this.j(z50.z50$a.F0)) {
            sb.append("collapsedLayout:");
            final j20 d0 = this.D0;
            if (d0 == null) {
                sb.append("null");
            }
            else {
                sb.append(d0);
            }
            b = false;
        }
        else {
            b = true;
        }
        if (this.j(z50.z50$a.G0)) {
            if (!b) {
                sb.append(", ");
            }
            sb.append("expandedLayout:");
            final v30 e0 = this.E0;
            if (e0 == null) {
                sb.append("null");
            }
            else {
                sb.append(e0);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
