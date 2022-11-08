import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import org.apache.thrift.TException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h40 extends z5s<h40, a>
{
    public static final wa8 F0;
    public static final q5s G0;
    public static final q5s H0;
    public static final Map<a, oxa> I0;
    public static final a J0;
    
    static {
        F0 = new wa8("AndroidImage", (w48)null);
        G0 = new q5s("uri", (byte)12, (short)1);
        H0 = new q5s("rgb", (byte)12, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)a.class);
        final a e0 = a.E0;
        enumMap.put((Object)e0, new oxa());
        enumMap.put((Object)a.F0, new oxa());
        oxa.a((Class)h40.class, I0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        J0 = e0;
    }
    
    public h40() {
    }
    
    public h40(final a a, final Object o) {
        super((r5s)a, o);
    }
    
    public final void b(final r5s r5s, final Object o) throws ClassCastException {
        final a a = (a)r5s;
        final int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
            if (!(o instanceof k40)) {
                throw new ClassCastException(gd.x(o, w48.g("Was expecting value of type AndroidImageRgb for field 'rgb', but got ")));
            }
        }
        else if (!(o instanceof m40)) {
            throw new ClassCastException(gd.x(o, w48.g("Was expecting value of type AndroidImageUri for field 'uri', but got ")));
        }
    }
    
    public final int compareTo(final Object o) {
        final h40 h40 = (h40)o;
        int n;
        if ((n = ((Comparable)super.D0).compareTo(h40.D0)) == 0) {
            n = o5s.e(super.C0, h40.C0);
        }
        return n;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof h40 && this.u((h40)o);
    }
    
    public final r5s g(final short n) {
        final a e0 = a.E0;
        Object o;
        if (n != 1) {
            if (n != 2) {
                o = null;
            }
            else {
                o = a.F0;
            }
        }
        else {
            o = a.E0;
        }
        if (o != null) {
            return (r5s)o;
        }
        throw new IllegalArgumentException(ffa.k("Field ", (int)n, " doesn't exist!"));
    }
    
    public final int hashCode() {
        final int hashCode = h40.class.getName().hashCode();
        final r5s d0 = super.D0;
        int n = hashCode;
        if (d0 != null) {
            final short b = d0.b();
            int n3;
            final int n2 = n3 = hashCode * 31 + b;
            if (b != 0) {
                n3 = n2;
                if (this.m((r5s)a.E0)) {
                    n3 = ((m40)super.C0).hashCode() + n2 * 31;
                }
            }
            n = n3;
            if (2 == b) {
                n = n3;
                if (this.m((r5s)a.F0)) {
                    n = n3 * 31 + ((k40)super.C0).hashCode();
                }
            }
        }
        return n;
    }
    
    public final q5s i(final r5s r5s) {
        final a a = (a)r5s;
        final int ordinal = a.ordinal();
        q5s q5s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown field id ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
            q5s = h40.H0;
        }
        else {
            q5s = h40.G0;
        }
        return q5s;
    }
    
    public final wa8 j() {
        return h40.F0;
    }
    
    public final Object q(final w5s w5s, final q5s q5s) throws TException {
        final short c = q5s.c;
        final a e0 = a.E0;
        Enum enum1;
        if (c != 1) {
            if (c != 2) {
                enum1 = null;
            }
            else {
                enum1 = a.F0;
            }
        }
        else {
            enum1 = a.E0;
        }
        if (enum1 == null) {
            mb8.i(w5s, q5s.b);
            return null;
        }
        final int ordinal = enum1.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
            final byte b = q5s.b;
            if (b == 12) {
                final k40 k40 = new k40();
                k40.f(w5s);
                return k40;
            }
            mb8.i(w5s, b);
            return null;
        }
        else {
            final byte b2 = q5s.b;
            if (b2 == 12) {
                final m40 m40 = new m40();
                m40.f(w5s);
                return m40;
            }
            mb8.i(w5s, b2);
            return null;
        }
    }
    
    public final void r(final w5s w5s) throws TException {
        final int ordinal = ((a)super.D0).ordinal();
        if (ordinal == 0) {
            ((m40)super.C0).e(w5s);
            return;
        }
        if (ordinal == 1) {
            ((k40)super.C0).e(w5s);
            return;
        }
        final StringBuilder g = w48.g("Cannot write union with unknown field ");
        g.append(super.D0);
        throw new IllegalStateException(g.toString());
    }
    
    public final Object s() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final void t() throws TException {
        throw new UnsupportedOperationException("tuple scheme not implemented");
    }
    
    public final boolean u(final h40 h40) {
        return h40 != null && super.D0 == h40.D0 && super.C0.equals(h40.C0);
    }
    
    public enum a implements r5s
    {
        E0((short)1, "uri"), 
        F0((short)2, "rgb");
        
        public static final Map<String, a> G0;
        public final short C0;
        public final String D0;
        
        static {
            a.G0 = new HashMap();
            for (final a a : EnumSet.allOf(a.class)) {
                a.G0.put(a.D0, a);
            }
        }
        
        public a(final short n2, final String d0) {
            this.C0 = n2;
            this.D0 = d0;
        }
        
        public final short b() {
            return this.C0;
        }
    }
}
