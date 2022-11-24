import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k40 implements a7s<k40, a>, Serializable, Cloneable
{
    public static final d7s H0;
    public static final d7s I0;
    public static final Map<a, oxa> J0;
    public static final a K0;
    public static final a L0;
    public e40 F0;
    public t70 G0;
    
    static {
        H0 = new d7s("image", (byte)12, (short)1);
        I0 = new d7s("visibility", (byte)8, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)a.class);
        final a h0 = a.H0;
        enumMap.put((Object)h0, new oxa());
        final a i0 = a.I0;
        enumMap.put((Object)i0, new oxa());
        oxa.a((Class)k40.class, J0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        K0 = h0;
        L0 = i0;
    }
    
    public k40() {
    }
    
    public k40(final e40 f0, final t70 g0) {
        if (f0 != null) {
            this.F0 = f0;
        }
        if (g0 != null) {
            this.G0 = g0;
        }
    }
    
    public final int compareTo(final Object o) {
        final k40 k40 = (k40)o;
        int n;
        if (!k40.class.equals(k40.getClass())) {
            n = k40.class.getName().compareTo(k40.class.getName());
        }
        else {
            final a h0 = a.H0;
            n = Boolean.valueOf(this.m(h0)).compareTo(Boolean.valueOf(k40.m(h0)));
            if (n == 0) {
                if (this.m(h0)) {
                    n = this.F0.compareTo(k40.F0);
                    if (n != 0) {
                        return n;
                    }
                }
                final a i0 = a.I0;
                n = Boolean.valueOf(this.m(i0)).compareTo(Boolean.valueOf(k40.m(i0)));
                if (n == 0) {
                    if (this.m(i0)) {
                        n = ((Enum)this.G0).compareTo((Object)k40.G0);
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
        Objects.requireNonNull(j7s);
        if (this.F0 != null && this.m(a.H0)) {
            j7s.m(k40.H0);
            this.F0.e(j7s);
        }
        if (this.G0 != null && this.m(a.I0)) {
            j7s.m(k40.I0);
            j7s.o(this.G0.F0);
        }
        ((c7s)j7s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof k40 && this.g((k40)o);
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
                else if (b == 8) {
                    this.G0 = t70.b(j7s.f());
                }
                else {
                    xli.F(j7s, b);
                }
            }
            else if (b == 12) {
                (this.F0 = new e40()).f(j7s);
            }
            else {
                xli.F(j7s, b);
            }
        }
    }
    
    public final boolean g(final k40 k40) {
        if (k40 == null) {
            return false;
        }
        final a h0 = a.H0;
        final boolean m = this.m(h0);
        final boolean i = k40.m(h0);
        if (m || i) {
            if (!m) {
                return false;
            }
            if (!i) {
                return false;
            }
            if (!this.F0.u(k40.F0)) {
                return false;
            }
        }
        final a i2 = a.I0;
        final boolean j = this.m(i2);
        final boolean l = k40.m(i2);
        if (j || l) {
            if (!j) {
                return false;
            }
            if (!l) {
                return false;
            }
            if (!this.G0.equals(k40.G0)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.m(a.H0)) {
            n = this.F0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.m(a.I0)) {
            n2 = n * 31 + this.G0.hashCode();
        }
        return n2;
    }
    
    public final <Any> Any i(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return (Any)this.j(a);
        }
        if (ordinal == 1) {
            return (Any)this.j(a);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    public final Object j(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return this.F0;
        }
        if (ordinal == 1) {
            return this.G0;
        }
        throw new IllegalStateException();
    }
    
    public final boolean m(final a a) {
        final int ordinal = a.ordinal();
        final boolean b = true;
        boolean b2 = true;
        if (ordinal == 0) {
            return this.F0 != null && b;
        }
        if (ordinal == 1) {
            if (this.G0 == null) {
                b2 = false;
            }
            return b2;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidImageView(");
        boolean b;
        if (this.m(a.H0)) {
            sb.append("image:");
            final e40 f0 = this.F0;
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
        if (this.m(a.I0)) {
            if (!b) {
                sb.append(", ");
            }
            sb.append("visibility:");
            final t70 g0 = this.G0;
            if (g0 == null) {
                sb.append("null");
            }
            else {
                sb.append(g0);
            }
        }
        sb.append(")");
        return sb.toString();
    }
    
    public enum a implements e7s
    {
        H0((short)1, "image"), 
        I0((short)2, "visibility");
        
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
