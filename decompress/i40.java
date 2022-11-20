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

public final class i40 implements g6s<i40, a>, Serializable, Cloneable
{
    public static final j6s H0;
    public static final j6s I0;
    public static final j6s J0;
    public static final Map<a, kwa> K0;
    public static final a L0;
    public static final a M0;
    public static final a N0;
    public int D0;
    public int E0;
    public int F0;
    public final BitSet G0;
    
    static {
        H0 = new j6s("red", (byte)8, (short)1);
        I0 = new j6s("green", (byte)8, (short)2);
        J0 = new j6s("blue", (byte)8, (short)3);
        final EnumMap enumMap = new EnumMap((Class<K>)a.class);
        final a f0 = a.F0;
        enumMap.put((Object)f0, new kwa());
        final a g0 = a.G0;
        enumMap.put((Object)g0, new kwa());
        final a h0 = a.H0;
        enumMap.put((Object)h0, new kwa());
        kwa.a((Class)i40.class, K0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        L0 = f0;
        M0 = g0;
        N0 = h0;
    }
    
    public i40() {
        this.G0 = new BitSet(3);
    }
    
    public final int compareTo(final Object o) {
        final i40 i40 = (i40)o;
        int n;
        if (!i40.class.equals(i40.getClass())) {
            n = i40.class.getName().compareTo(i40.class.getName());
        }
        else {
            final a f0 = a.F0;
            n = Boolean.valueOf(this.m(f0)).compareTo(Boolean.valueOf(i40.m(f0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.m(f0)) {
                        break Label_0092;
                    }
                    n = h6s.c(this.D0, i40.D0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final a g0 = a.G0;
                n = Boolean.valueOf(this.m(g0)).compareTo(Boolean.valueOf(i40.m(g0)));
                if (n == 0) {
                    if (this.m(g0)) {
                        n = h6s.c(this.E0, i40.E0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final a h0 = a.H0;
                    n = Boolean.valueOf(this.m(h0)).compareTo(Boolean.valueOf(i40.m(h0)));
                    if (n == 0) {
                        if (this.m(h0)) {
                            n = h6s.c(this.F0, i40.F0);
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
        p6s.m(i40.H0);
        p6s.o(this.D0);
        p6s.m(i40.I0);
        p6s.o(this.E0);
        p6s.m(i40.J0);
        p6s.o(this.F0);
        ((i6s)p6s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof i40 && this.g((i40)o);
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
                    else if (b == 8) {
                        this.F0 = p6s.f();
                        this.G0.set(2, true);
                    }
                    else {
                        pps.q(p6s, b);
                    }
                }
                else if (b == 8) {
                    this.E0 = p6s.f();
                    this.G0.set(1, true);
                }
                else {
                    pps.q(p6s, b);
                }
            }
            else if (b == 8) {
                this.D0 = p6s.f();
                this.G0.set(0, true);
            }
            else {
                pps.q(p6s, b);
            }
        }
        if (!this.m(a.F0)) {
            final StringBuilder j = fu8.j("Required field 'red' was not found in serialized data! Struct: ");
            j.append(this.toString());
            throw new TProtocolException(j.toString());
        }
        if (!this.m(a.G0)) {
            final StringBuilder i = fu8.j("Required field 'green' was not found in serialized data! Struct: ");
            i.append(this.toString());
            throw new TProtocolException(i.toString());
        }
        if (this.m(a.H0)) {
            return;
        }
        final StringBuilder k = fu8.j("Required field 'blue' was not found in serialized data! Struct: ");
        k.append(this.toString());
        throw new TProtocolException(k.toString());
    }
    
    public final boolean g(final i40 i40) {
        return i40 != null && this.D0 == i40.D0 && this.E0 == i40.E0 && this.F0 == i40.F0;
    }
    
    @Override
    public final int hashCode() {
        return fu8.h(this.F0, (Integer.valueOf(this.E0).hashCode() + (Integer.valueOf(this.D0).hashCode() + 31) * 31) * 31);
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
            return new Integer(this.D0);
        }
        if (ordinal == 1) {
            return new Integer(this.E0);
        }
        if (ordinal == 2) {
            return new Integer(this.F0);
        }
        throw new IllegalStateException();
    }
    
    public final boolean m(final a a) {
        final int ordinal = a.ordinal();
        if (ordinal == 0) {
            return this.G0.get(0);
        }
        if (ordinal == 1) {
            return this.G0.get(1);
        }
        if (ordinal == 2) {
            return this.G0.get(2);
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = shc.g("AndroidImageRgb(", "red:");
        g.append(this.D0);
        g.append(", ");
        g.append("green:");
        g.append(this.E0);
        g.append(", ");
        g.append("blue:");
        return wc0.A(g, this.F0, ")");
    }
    
    public enum a implements k6s
    {
        F0((short)1, "red"), 
        G0((short)2, "green"), 
        H0((short)3, "blue");
        
        public static final Map<String, a> I0;
        public static final a[] J0;
        public final short D0;
        public final String E0;
        
        static {
            a.I0 = new HashMap();
            for (final a a : EnumSet.allOf(a.class)) {
                a.I0.put(a.E0, a);
            }
        }
        
        public a(final short d0, final String e0) {
            this.D0 = d0;
            this.E0 = e0;
        }
        
        public final short b() {
            return this.D0;
        }
    }
}
