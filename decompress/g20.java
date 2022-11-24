import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g20 implements a7s<g20, g20.g20$a>, Serializable, Cloneable
{
    public static final d7s G0;
    public static final Map<g20.g20$a, oxa> H0;
    public static final g20.g20$a I0;
    public t70 F0;
    
    static {
        G0 = new d7s("visibility", (byte)8, (short)1);
        final EnumMap enumMap = new EnumMap((Class<K>)g20.g20$a.class);
        final g20.g20$a h0 = g20.g20$a.H0;
        enumMap.put(h0, new oxa());
        oxa.a((Class)g20.class, H0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        I0 = h0;
    }
    
    public g20() {
    }
    
    public g20(final t70 f0) {
        if (f0 != null) {
            this.F0 = f0;
        }
    }
    
    public final int compareTo(final Object o) {
        final g20 g20 = (g20)o;
        int n;
        if (!g20.class.equals(g20.getClass())) {
            n = g20.class.getName().compareTo(g20.class.getName());
        }
        else {
            final g20.g20$a h0 = g20.g20$a.H0;
            n = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(g20.i()));
            if (n == 0) {
                if (this.i()) {
                    n = ((Enum)this.F0).compareTo((Object)g20.F0);
                    if (n != 0) {
                        return n;
                    }
                }
                n = 0;
            }
        }
        return n;
    }
    
    public final void e(final j7s j7s) throws TException {
        Objects.requireNonNull(j7s);
        if (this.F0 != null) {
            final g20.g20$a h0 = g20.g20$a.H0;
            if (this.i()) {
                j7s.m(g20.G0);
                j7s.o(this.F0.F0);
            }
        }
        ((c7s)j7s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof g20 && this.g((g20)o);
    }
    
    public final void f(final j7s j7s) throws TException {
        Objects.requireNonNull(j7s);
        while (true) {
            final d7s d = j7s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            if (d.c != 1) {
                xli.F(j7s, b);
            }
            else if (b == 8) {
                this.F0 = t70.b(j7s.f());
            }
            else {
                xli.F(j7s, b);
            }
        }
    }
    
    public final boolean g(final g20 g20) {
        if (g20 == null) {
            return false;
        }
        final g20.g20$a h0 = g20$a.H0;
        final boolean i = this.i();
        final boolean j = g20.i();
        if (i || j) {
            if (!i || !j) {
                return false;
            }
            if (!this.F0.equals(g20.F0)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final g20.g20$a h0 = g20.g20$a.H0;
        int n;
        if (this.i()) {
            n = this.F0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        return n;
    }
    
    public final boolean i() {
        final g20.g20$a h0 = g20.g20$a.H0;
        return this.F0 != null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidCardView(");
        final g20.g20$a h0 = g20.g20$a.H0;
        if (this.i()) {
            sb.append("visibility:");
            final t70 f0 = this.F0;
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
