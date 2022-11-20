import org.apache.thrift.TException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class prc extends s6s<prc, prc.prc$a>
{
    public static final mcg G0;
    public static final j6s H0;
    public static final j6s I0;
    public static final Map<prc.prc$a, kwa> J0;
    
    static {
        G0 = new mcg((Object)"HttpRequest");
        H0 = new j6s("getRequest", (byte)12, (short)1);
        I0 = new j6s("postRequest", (byte)12, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)prc.prc$a.class);
        enumMap.put(prc.prc$a.F0, new kwa());
        enumMap.put(prc.prc$a.G0, new kwa());
        kwa.a((Class)prc.class, J0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final void b(final k6s k6s, final Object o) throws ClassCastException {
        final prc.prc$a prc$a = (prc.prc$a)k6s;
        final int ordinal = ((Enum)prc$a).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(prc$a);
                throw new IllegalArgumentException(sb.toString());
            }
            if (!(o instanceof isk)) {
                throw new ClassCastException(i81.t(o, fu8.j("Was expecting value of type PostRequest for field 'postRequest', but got ")));
            }
        }
        else if (!(o instanceof u1c)) {
            throw new ClassCastException(i81.t(o, fu8.j("Was expecting value of type GetRequest for field 'getRequest', but got ")));
        }
    }
    
    public final int compareTo(final Object o) {
        final prc prc = (prc)o;
        int n;
        if ((n = ((Comparable)super.E0).compareTo(prc.E0)) == 0) {
            n = h6s.e(super.D0, prc.D0);
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof prc && this.u((prc)o);
    }
    
    public final k6s g(final short n) {
        final prc.prc$a f0 = prc.prc$a.F0;
        Object o;
        if (n != 1) {
            if (n != 2) {
                o = null;
            }
            else {
                o = prc.prc$a.G0;
            }
        }
        else {
            o = prc.prc$a.F0;
        }
        if (o != null) {
            return (k6s)o;
        }
        throw new IllegalArgumentException(ze.G("Field ", (int)n, " doesn't exist!"));
    }
    
    public final int hashCode() {
        final int hashCode = prc.class.getName().hashCode();
        final k6s e0 = super.E0;
        int n = hashCode;
        if (e0 != null) {
            final short b = e0.b();
            int n3;
            final int n2 = n3 = hashCode * 31 + b;
            if (b != 0) {
                n3 = n2;
                if (this.m((k6s)prc.prc$a.F0)) {
                    n3 = ((u1c)super.D0).hashCode() + n2 * 31;
                }
            }
            n = n3;
            if (2 == b) {
                n = n3;
                if (this.m((k6s)prc.prc$a.G0)) {
                    n = n3 * 31 + ((isk)super.D0).hashCode();
                }
            }
        }
        return n;
    }
    
    public final j6s i(final k6s k6s) {
        final prc.prc$a prc$a = (prc.prc$a)k6s;
        final int ordinal = ((Enum)prc$a).ordinal();
        j6s j6s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(prc$a);
                throw new IllegalArgumentException(sb.toString());
            }
            j6s = prc.I0;
        }
        else {
            j6s = prc.H0;
        }
        return j6s;
    }
    
    public final mcg j() {
        return prc.G0;
    }
    
    public final Object q(final p6s p6s, final j6s j6s) throws TException {
        final short c = j6s.c;
        final prc.prc$a f0 = prc.prc$a.F0;
        Object o;
        if (c != 1) {
            if (c != 2) {
                o = null;
            }
            else {
                o = prc.prc$a.G0;
            }
        }
        else {
            o = prc.prc$a.F0;
        }
        if (o == null) {
            pps.q(p6s, j6s.b);
            return null;
        }
        final int ordinal = ((Enum)o).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
            final byte b = j6s.b;
            if (b == 12) {
                final isk isk = new isk();
                isk.f(p6s);
                return isk;
            }
            pps.q(p6s, b);
            return null;
        }
        else {
            final byte b2 = j6s.b;
            if (b2 == 12) {
                final u1c u1c = new u1c();
                u1c.f(p6s);
                return u1c;
            }
            pps.q(p6s, b2);
            return null;
        }
    }
    
    public final void r(final p6s p6s) throws TException {
        final int ordinal = ((Enum)super.E0).ordinal();
        if (ordinal == 0) {
            ((u1c)super.D0).e(p6s);
            return;
        }
        if (ordinal == 1) {
            ((isk)super.D0).e(p6s);
            return;
        }
        final StringBuilder j = fu8.j("Cannot write union with unknown field ");
        j.append(super.E0);
        throw new IllegalStateException(j.toString());
    }
    
    public final Object s() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final void t() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final boolean u(final prc prc) {
        return prc != null && super.E0 == prc.E0 && super.D0.equals(prc.D0);
    }
}
