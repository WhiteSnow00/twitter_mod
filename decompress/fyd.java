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

public final class fyd implements g6s<fyd, fyd.fyd$a>, Serializable, Cloneable
{
    public static final j6s F0;
    public static final Map<fyd.fyd$a, kwa> G0;
    public long D0;
    public final BitSet E0;
    
    static {
        F0 = new j6s("sampleIntervalMillis", (byte)10, (short)1);
        final EnumMap enumMap = new EnumMap((Class<K>)fyd.fyd$a.class);
        enumMap.put(fyd.fyd$a.F0, new kwa());
        kwa.a((Class)fyd.class, G0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public fyd() {
        this.E0 = new BitSet(1);
    }
    
    public final int compareTo(final Object o) {
        final fyd fyd = (fyd)o;
        int n;
        if (!fyd.class.equals(fyd.getClass())) {
            n = fyd.class.getName().compareTo(fyd.class.getName());
        }
        else {
            final fyd.fyd$a f0 = fyd.fyd$a.F0;
            n = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(fyd.g()));
            if (n == 0) {
                if (this.g()) {
                    n = h6s.d(this.D0, fyd.D0);
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
        p6s.m(fyd.F0);
        p6s.p(this.D0);
        ((i6s)p6s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (o instanceof fyd) {
            b2 = (this.D0 == ((fyd)o).D0 || b);
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
            if (d.c != 1) {
                pps.q(p6s, b);
            }
            else if (b == 10) {
                this.D0 = p6s.g();
                this.E0.set(0, true);
            }
            else {
                pps.q(p6s, b);
            }
        }
        final fyd.fyd$a f0 = fyd.fyd$a.F0;
        if (this.g()) {
            return;
        }
        final StringBuilder j = fu8.j("Required field 'sampleIntervalMillis' was not found in serialized data! Struct: ");
        j.append(this.toString());
        throw new TProtocolException(j.toString());
    }
    
    public final boolean g() {
        final fyd.fyd$a f0 = fyd.fyd$a.F0;
        return this.E0.get(0);
    }
    
    @Override
    public final int hashCode() {
        return oqf.k(this.D0, 31);
    }
    
    @Override
    public final String toString() {
        return hmg.i(shc.g("IntervalSampled(", "sampleIntervalMillis:"), this.D0, ")");
    }
}
