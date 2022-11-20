import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g20 implements g6s<g20, g20.g20$a>, Serializable, Cloneable
{
    public static final j6s E0;
    public static final Map<g20.g20$a, kwa> F0;
    public static final g20.g20$a G0;
    public s70 D0;
    
    static {
        E0 = new j6s("visibility", (byte)8, (short)1);
        final EnumMap enumMap = new EnumMap((Class<K>)g20.g20$a.class);
        final g20.g20$a f0 = g20.g20$a.F0;
        enumMap.put(f0, new kwa());
        kwa.a((Class)g20.class, F0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        G0 = f0;
    }
    
    public g20() {
    }
    
    public g20(final s70 d0) {
        if (d0 != null) {
            this.D0 = d0;
        }
    }
    
    public final int compareTo(final Object o) {
        final g20 g20 = (g20)o;
        int n;
        if (!g20.class.equals(g20.getClass())) {
            n = g20.class.getName().compareTo(g20.class.getName());
        }
        else {
            final g20.g20$a f0 = g20.g20$a.F0;
            n = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(g20.i()));
            if (n == 0) {
                if (this.i()) {
                    n = ((Enum)this.D0).compareTo((Object)g20.D0);
                    if (n != 0) {
                        return n;
                    }
                }
                n = 0;
            }
        }
        return n;
    }
    
    public final void e(final p6s p6s) throws TException {
        Objects.requireNonNull(p6s);
        if (this.D0 != null) {
            final g20.g20$a f0 = g20.g20$a.F0;
            if (this.i()) {
                p6s.m(g20.E0);
                p6s.o(this.D0.D0);
            }
        }
        ((i6s)p6s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof g20 && this.g((g20)o);
    }
    
    public final void f(final p6s p6s) throws TException {
        Objects.requireNonNull(p6s);
        while (true) {
            final j6s d = p6s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            if (d.c != 1) {
                pps.q(p6s, b);
            }
            else if (b == 8) {
                this.D0 = s70.b(p6s.f());
            }
            else {
                pps.q(p6s, b);
            }
        }
    }
    
    public final boolean g(final g20 g20) {
        if (g20 == null) {
            return false;
        }
        final g20.g20$a f0 = g20$a.F0;
        final boolean i = this.i();
        final boolean j = g20.i();
        if (i || j) {
            if (!i || !j) {
                return false;
            }
            if (!this.D0.equals(g20.D0)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final g20.g20$a f0 = g20.g20$a.F0;
        int n;
        if (this.i()) {
            n = this.D0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public final boolean i() {
        final g20.g20$a f0 = g20.g20$a.F0;
        return this.D0 != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidCardView(");
        final g20.g20$a f0 = g20.g20$a.F0;
        if (this.i()) {
            sb.append("visibility:");
            final s70 d0 = this.D0;
            if (d0 == null) {
                sb.append("null");
            }
            else {
                sb.append(d0);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
