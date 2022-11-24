import org.apache.thrift.TException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e40 extends m7s<e40, e40.e40$a>
{
    public static final sog I0;
    public static final d7s J0;
    public static final d7s K0;
    public static final Map<e40.e40$a, oxa> L0;
    public static final e40.e40$a M0;
    
    static {
        I0 = new sog("AndroidImage");
        J0 = new d7s("uri", (byte)12, (short)1);
        K0 = new d7s("rgb", (byte)12, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)e40.e40$a.class);
        final e40.e40$a h0 = e40.e40$a.H0;
        enumMap.put(h0, new oxa());
        enumMap.put(e40.e40$a.I0, new oxa());
        oxa.a((Class)e40.class, L0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        M0 = h0;
    }
    
    public e40() {
    }
    
    public e40(final e40.e40$a e40$a, final Object o) {
        super((e7s)e40$a, o);
    }
    
    public final void b(final e7s e7s, final Object o) throws ClassCastException {
        final e40.e40$a e40$a = (e40.e40$a)e7s;
        final int ordinal = ((Enum)e40$a).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(e40$a);
                throw new IllegalArgumentException(sb.toString());
            }
            if (!(o instanceof h40)) {
                throw new ClassCastException(zk.y(o, ehk.f("Was expecting value of type AndroidImageRgb for field 'rgb', but got ")));
            }
        }
        else if (!(o instanceof j40)) {
            throw new ClassCastException(zk.y(o, ehk.f("Was expecting value of type AndroidImageUri for field 'uri', but got ")));
        }
    }
    
    public final int compareTo(final Object o) {
        final e40 e40 = (e40)o;
        int n;
        if ((n = ((Comparable)super.G0).compareTo(e40.G0)) == 0) {
            n = b7s.e(super.F0, e40.F0);
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof e40 && this.u((e40)o);
    }
    
    public final e7s g(final short n) {
        final e40.e40$a h0 = e40.e40$a.H0;
        Object o;
        if (n != 1) {
            if (n != 2) {
                o = null;
            }
            else {
                o = e40.e40$a.I0;
            }
        }
        else {
            o = e40.e40$a.H0;
        }
        if (o != null) {
            return (e7s)o;
        }
        throw new IllegalArgumentException(ffe.m("Field ", n, " doesn't exist!"));
    }
    
    public final int hashCode() {
        final int hashCode = e40.class.getName().hashCode();
        final e7s g0 = super.G0;
        int n = hashCode;
        if (g0 != null) {
            final short b = g0.b();
            int n3;
            final int n2 = n3 = hashCode * 31 + b;
            if (b != 0) {
                n3 = n2;
                if (this.m((e7s)e40.e40$a.H0)) {
                    n3 = ((j40)super.F0).hashCode() + n2 * 31;
                }
            }
            n = n3;
            if (2 == b) {
                n = n3;
                if (this.m((e7s)e40.e40$a.I0)) {
                    n = n3 * 31 + ((h40)super.F0).hashCode();
                }
            }
        }
        return n;
    }
    
    public final d7s i(final e7s e7s) {
        final e40.e40$a e40$a = (e40.e40$a)e7s;
        final int ordinal = ((Enum)e40$a).ordinal();
        d7s d7s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(e40$a);
                throw new IllegalArgumentException(sb.toString());
            }
            d7s = e40.K0;
        }
        else {
            d7s = e40.J0;
        }
        return d7s;
    }
    
    public final sog j() {
        return e40.I0;
    }
    
    public final Object q(final j7s j7s, final d7s d7s) throws TException {
        final short c = d7s.c;
        final e40.e40$a h0 = e40.e40$a.H0;
        Object o;
        if (c != 1) {
            if (c != 2) {
                o = null;
            }
            else {
                o = e40.e40$a.I0;
            }
        }
        else {
            o = e40.e40$a.H0;
        }
        if (o == null) {
            xli.F(j7s, d7s.b);
            return null;
        }
        final int ordinal = ((Enum)o).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
            final byte b = d7s.b;
            if (b == 12) {
                final h40 h2 = new h40();
                h2.f(j7s);
                return h2;
            }
            xli.F(j7s, b);
            return null;
        }
        else {
            final byte b2 = d7s.b;
            if (b2 == 12) {
                final j40 j40 = new j40();
                j40.f(j7s);
                return j40;
            }
            xli.F(j7s, b2);
            return null;
        }
    }
    
    public final void r(final j7s j7s) throws TException {
        final int ordinal = ((Enum)super.G0).ordinal();
        if (ordinal == 0) {
            ((j40)super.F0).e(j7s);
            return;
        }
        if (ordinal == 1) {
            ((h40)super.F0).e(j7s);
            return;
        }
        final StringBuilder f = ehk.f("Cannot write union with unknown field ");
        f.append(super.G0);
        throw new IllegalStateException(f.toString());
    }
    
    public final Object s() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final void t() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final boolean u(final e40 e40) {
        return e40 != null && super.G0 == e40.G0 && super.F0.equals(e40.F0);
    }
}
