import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.TException;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.BitSet;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h40 implements a7s<h40, a>, Serializable, Cloneable
{
    public static final d7s J0;
    public static final d7s K0;
    public static final d7s L0;
    public static final Map<a, oxa> M0;
    public static final a N0;
    public static final a O0;
    public static final a P0;
    public int F0;
    public int G0;
    public int H0;
    public final BitSet I0;
    
    static {
        J0 = new d7s("red", (byte)8, (short)1);
        K0 = new d7s("green", (byte)8, (short)2);
        L0 = new d7s("blue", (byte)8, (short)3);
        final EnumMap enumMap = new EnumMap((Class<K>)a.class);
        final a h0 = a.H0;
        enumMap.put((Object)h0, new oxa());
        final a i0 = a.I0;
        enumMap.put((Object)i0, new oxa());
        final a j0 = a.J0;
        enumMap.put((Object)j0, new oxa());
        oxa.a((Class)h40.class, M0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        N0 = h0;
        O0 = i0;
        P0 = j0;
    }
    
    public h40() {
        this.I0 = new BitSet(3);
    }
    
    public final int compareTo(final Object o) {
        final h40 h40 = (h40)o;
        int n;
        if (!h40.class.equals(h40.getClass())) {
            n = h40.class.getName().compareTo(h40.class.getName());
        }
        else {
            final a h41 = a.H0;
            n = Boolean.valueOf(this.m(h41)).compareTo(Boolean.valueOf(h40.m(h41)));
            if (n == 0) {
                Label_0092: {
                    if (!this.m(h41)) {
                        break Label_0092;
                    }
                    n = b7s.c(this.F0, h40.F0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final a i0 = a.I0;
                n = Boolean.valueOf(this.m(i0)).compareTo(Boolean.valueOf(h40.m(i0)));
                if (n == 0) {
                    if (this.m(i0)) {
                        n = b7s.c(this.G0, h40.G0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final a j0 = a.J0;
                    n = Boolean.valueOf(this.m(j0)).compareTo(Boolean.valueOf(h40.m(j0)));
                    if (n == 0) {
                        if (this.m(j0)) {
                            n = b7s.c(this.H0, h40.H0);
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
    
    public final void e(final j7s j7s) throws TException {
        Objects.requireNonNull(j7s);
        j7s.m(h40.J0);
        j7s.o(this.F0);
        j7s.m(h40.K0);
        j7s.o(this.G0);
        j7s.m(h40.L0);
        j7s.o(this.H0);
        ((c7s)j7s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof h40 && this.g((h40)o);
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
                    if (c != 3) {
                        xli.F(j7s, b);
                    }
                    else if (b == 8) {
                        this.H0 = j7s.f();
                        this.I0.set(2, true);
                    }
                    else {
                        xli.F(j7s, b);
                    }
                }
                else if (b == 8) {
                    this.G0 = j7s.f();
                    this.I0.set(1, true);
                }
                else {
                    xli.F(j7s, b);
                }
            }
            else if (b == 8) {
                this.F0 = j7s.f();
                this.I0.set(0, true);
            }
            else {
                xli.F(j7s, b);
            }
        }
        if (!this.m(a.H0)) {
            final StringBuilder f = ehk.f("Required field 'red' was not found in serialized data! Struct: ");
            f.append(this.toString());
            throw new TProtocolException(f.toString());
        }
        if (!this.m(a.I0)) {
            final StringBuilder f2 = ehk.f("Required field 'green' was not found in serialized data! Struct: ");
            f2.append(this.toString());
            throw new TProtocolException(f2.toString());
        }
        if (this.m(a.J0)) {
            return;
        }
        final StringBuilder f3 = ehk.f("Required field 'blue' was not found in serialized data! Struct: ");
        f3.append(this.toString());
        throw new TProtocolException(f3.toString());
    }
    
    public final boolean g(final h40 h40) {
        return h40 != null && this.F0 == h40.F0 && this.G0 == h40.G0 && this.H0 == h40.H0;
    }
    
    @Override
    public final int hashCode() {
        return jba.n(this.H0, (Integer.valueOf(this.G0).hashCode() + (Integer.valueOf(this.F0).hashCode() + 31) * 31) * 31);
    }
    
    public final <Any> Any i(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return (Any)this.j(a);
        }
        if (ordinal == 1) {
            return (Any)this.j(a);
        }
        if (ordinal == 2) {
            return (Any)this.j(a);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    public final Object j(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return new Integer(this.F0);
        }
        if (ordinal == 1) {
            return new Integer(this.G0);
        }
        if (ordinal == 2) {
            return new Integer(this.H0);
        }
        throw new IllegalStateException();
    }
    
    public final boolean m(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return this.I0.get(0);
        }
        if (ordinal == 1) {
            return this.I0.get(1);
        }
        if (ordinal == 2) {
            return this.I0.get(2);
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = j98.j("AndroidImageRgb(", "red:");
        j.append(this.F0);
        j.append(", ");
        j.append("green:");
        j.append(this.G0);
        j.append(", ");
        j.append("blue:");
        return ad.y(j, this.H0, ")");
    }
    
    public enum a implements e7s
    {
        H0((short)1, "red"), 
        I0((short)2, "green"), 
        J0((short)3, "blue");
        
        public static final Map<String, a> K0;
        public static final a[] L0;
        public final short F0;
        public final String G0;
        
        static {
            a.K0 = new HashMap();
            for (final a a : EnumSet.allOf(a.class)) {
                a.K0.put(a.G0, a);
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
