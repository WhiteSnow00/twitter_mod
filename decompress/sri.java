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

public final class sri implements a7s<sri, sri.sri$a>, Serializable, Cloneable
{
    public static final d7s H0;
    public static final d7s I0;
    public static final Map<sri.sri$a, oxa> J0;
    public static final sri.sri$a K0;
    public String F0;
    public ua7 G0;
    
    static {
        H0 = new d7s("title", (byte)11, (short)1);
        I0 = new d7s("action", (byte)12, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)sri.sri$a.class);
        enumMap.put(sri.sri$a.H0, new oxa());
        final sri.sri$a i0 = sri.sri$a.I0;
        enumMap.put(i0, new oxa());
        oxa.a((Class)sri.class, J0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        K0 = i0;
    }
    
    public final int compareTo(final Object o) {
        final sri sri = (sri)o;
        int n;
        if (!sri.class.equals(sri.getClass())) {
            n = sri.class.getName().compareTo(sri.class.getName());
        }
        else {
            final sri.sri$a h0 = sri.sri$a.H0;
            n = Boolean.valueOf(this.i(h0)).compareTo(Boolean.valueOf(sri.i(h0)));
            if (n == 0) {
                if (this.i(h0)) {
                    n = this.F0.compareTo(sri.F0);
                    if (n != 0) {
                        return n;
                    }
                }
                final sri.sri$a i0 = sri.sri$a.I0;
                n = Boolean.valueOf(this.i(i0)).compareTo(Boolean.valueOf(sri.i(i0)));
                if (n == 0) {
                    if (this.i(i0)) {
                        n = this.G0.compareTo((Object)sri.G0);
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
    
    public final void e(final j7s j7s) throws TException {
        this.j();
        Objects.requireNonNull(j7s);
        if (this.F0 != null && this.i(sri.sri$a.H0)) {
            j7s.m(sri.H0);
            j7s.q(this.F0);
        }
        if (this.G0 != null) {
            j7s.m(sri.I0);
            ((m7s)this.G0).e(j7s);
        }
        ((c7s)j7s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (o instanceof sri) {
            final sri sri = (sri)o;
            final sri.sri$a h0 = sri.sri$a.H0;
            final boolean i = this.i(h0);
            final boolean j = sri.i(h0);
            if (i || j) {
                b2 = b;
                if (!i) {
                    return b2;
                }
                if (!j) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.equals(sri.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final sri.sri$a i2 = sri.sri$a.I0;
            final boolean k = this.i(i2);
            final boolean l = sri.i(i2);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.u(sri.G0)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void f(final j7s j7s) throws TException {
        Objects.requireNonNull(j7s);
        while (true) {
            final d7s d = j7s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            final short c = d.c;
            if (c != 1) {
                if (c != 2) {
                    xli.F(j7s, b);
                }
                else if (b == 12) {
                    ((m7s)(this.G0 = new ua7())).f(j7s);
                }
                else {
                    xli.F(j7s, b);
                }
            }
            else if (b == 11) {
                this.F0 = j7s.j();
            }
            else {
                xli.F(j7s, b);
            }
        }
        this.j();
    }
    
    public final Object g(final sri.sri$a sri$a) {
        final int ordinal = ((Enum)sri$a).ordinal();
        if (ordinal == 0) {
            return this.F0;
        }
        if (ordinal == 1) {
            return this.G0;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.i(sri.sri$a.H0)) {
            n = this.F0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.i(sri.sri$a.I0)) {
            n2 = n * 31 + this.G0.hashCode();
        }
        return n2;
    }
    
    public final boolean i(final sri.sri$a sri$a) {
        final int ordinal = ((Enum)sri$a).ordinal();
        boolean b = true;
        final boolean b2 = true;
        if (ordinal == 0) {
            if (this.F0 == null) {
                b = false;
            }
            return b;
        }
        if (ordinal == 1) {
            return this.G0 != null && b2;
        }
        throw new IllegalStateException();
    }
    
    public final void j() throws TException {
        if (this.G0 != null) {
            return;
        }
        final StringBuilder f = ehk.f("Required field 'action' was not present! Struct: ");
        f.append(this.toString());
        throw new TProtocolException(f.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NotificationCustomAction(");
        boolean b;
        if (this.i(sri.sri$a.H0)) {
            sb.append("title:");
            final String f0 = this.F0;
            if (f0 == null) {
                sb.append("null");
            }
            else {
                sb.append(f0);
            }
            b = false;
        }
        else {
            b = true;
        }
        if (!b) {
            sb.append(", ");
        }
        sb.append("action:");
        final ua7 g0 = this.G0;
        if (g0 == null) {
            sb.append("null");
        }
        else {
            sb.append(g0);
        }
        sb.append(")");
        return sb.toString();
    }
}
