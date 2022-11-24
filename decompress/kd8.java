import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
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

public final class kd8 implements a7s<kd8, a>, Serializable, Cloneable
{
    public static final d7s H0;
    public static final d7s I0;
    public static final Map<a, oxa> J0;
    public String F0;
    public String G0;
    
    static {
        H0 = new d7s("uri", (byte)11, (short)1);
        I0 = new d7s("scribeAction", (byte)11, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)a.class);
        enumMap.put((Object)a.H0, new oxa());
        enumMap.put((Object)a.I0, new oxa());
        oxa.a((Class)kd8.class, J0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final int compareTo(final Object o) {
        final kd8 kd8 = (kd8)o;
        int n;
        if (!kd8.class.equals(kd8.getClass())) {
            n = kd8.class.getName().compareTo(kd8.class.getName());
        }
        else {
            final a h0 = a.H0;
            n = Boolean.valueOf(this.g(h0)).compareTo(Boolean.valueOf(kd8.g(h0)));
            if (n == 0) {
                if (this.g(h0)) {
                    n = this.F0.compareTo(kd8.F0);
                    if (n != 0) {
                        return n;
                    }
                }
                final a i0 = a.I0;
                n = Boolean.valueOf(this.g(i0)).compareTo(Boolean.valueOf(kd8.g(i0)));
                if (n == 0) {
                    if (this.g(i0)) {
                        n = this.G0.compareTo(kd8.G0);
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
        this.i();
        Objects.requireNonNull(j7s);
        if (this.F0 != null) {
            j7s.m(kd8.H0);
            j7s.q(this.F0);
        }
        if (this.G0 != null && this.g(a.I0)) {
            j7s.m(kd8.I0);
            j7s.q(this.G0);
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
        if (o instanceof kd8) {
            final kd8 kd8 = (kd8)o;
            final a h0 = a.H0;
            final boolean g = this.g(h0);
            final boolean g2 = kd8.g(h0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.equals(kd8.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final a i0 = a.I0;
            final boolean g3 = this.g(i0);
            final boolean g4 = kd8.g(i0);
            if (g3 || g4) {
                b2 = b;
                if (!g3) {
                    return b2;
                }
                if (!g4) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.equals(kd8.G0)) {
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
                else if (b == 11) {
                    this.G0 = j7s.j();
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
        this.i();
    }
    
    public final boolean g(final a a) {
        final int ordinal = a.ordinal();
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
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(a.H0)) {
            n = this.F0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(a.I0)) {
            n2 = n * 31 + this.G0.hashCode();
        }
        return n2;
    }
    
    public final void i() throws TException {
        if (this.F0 != null) {
            return;
        }
        final StringBuilder f = ehk.f("Required field 'uri' was not present! Struct: ");
        f.append(this.toString());
        throw new TProtocolException(f.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("DeepLinkAction(", "uri:");
        final String f0 = this.F0;
        if (f0 == null) {
            j.append("null");
        }
        else {
            j.append(f0);
        }
        if (this.g(a.I0)) {
            j.append(", ");
            j.append("scribeAction:");
            final String g0 = this.G0;
            if (g0 == null) {
                j.append("null");
            }
            else {
                j.append(g0);
            }
        }
        j.append(")");
        return j.toString();
    }
    
    public enum a implements e7s
    {
        H0((short)1, "uri"), 
        I0((short)2, "scribeAction");
        
        public static final Map<String, a> J0;
        public static final a[] K0;
        public final short F0;
        public final String G0;
        
        static {
            a.J0 = new HashMap();
            for (final a a : EnumSet.allOf(a.class)) {
                a.J0.put(a.G0, a);
            }
        }
        
        public a(final short f0, final String g0) {
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final short b() {
            return this.F0;
        }
    }
}
