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

public final class h70 implements a7s<h70, b>, Serializable, Cloneable
{
    public static final d7s I0;
    public static final d7s J0;
    public static final d7s K0;
    public static final Map<b, oxa> L0;
    public static final b M0;
    public static final b N0;
    public static final b O0;
    public b70 F0;
    public b70 G0;
    public k40 H0;
    
    static {
        I0 = new d7s("title", (byte)12, (short)1);
        J0 = new d7s("tweetText", (byte)12, (short)2);
        K0 = new d7s("tweetProfileImage", (byte)12, (short)3);
        final EnumMap enumMap = new EnumMap((Class<K>)b.class);
        final b h0 = b.H0;
        enumMap.put((Object)h0, new oxa());
        final b i0 = b.I0;
        enumMap.put((Object)i0, new oxa());
        final b j0 = b.J0;
        enumMap.put((Object)j0, new oxa());
        oxa.a((Class)h70.class, L0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        M0 = h0;
        N0 = i0;
        O0 = j0;
    }
    
    public h70() {
    }
    
    public h70(final b70 f0, final b70 g0, final k40 h0) {
        if (f0 != null) {
            this.F0 = f0;
        }
        if (g0 != null) {
            this.G0 = g0;
        }
        if (h0 != null) {
            this.H0 = h0;
        }
    }
    
    public final int compareTo(final Object o) {
        final h70 h70 = (h70)o;
        int n;
        if (!h70.class.equals(h70.getClass())) {
            n = h70.class.getName().compareTo(h70.class.getName());
        }
        else {
            final b h71 = b.H0;
            n = Boolean.valueOf(this.j(h71)).compareTo(Boolean.valueOf(h70.j(h71)));
            if (n == 0) {
                Label_0092: {
                    if (!this.j(h71)) {
                        break Label_0092;
                    }
                    n = this.F0.compareTo((Object)h70.F0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final b i0 = b.I0;
                n = Boolean.valueOf(this.j(i0)).compareTo(Boolean.valueOf(h70.j(i0)));
                if (n == 0) {
                    if (this.j(i0)) {
                        n = this.G0.compareTo((Object)h70.G0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final b j0 = b.J0;
                    n = Boolean.valueOf(this.j(j0)).compareTo(Boolean.valueOf(h70.j(j0)));
                    if (n == 0) {
                        if (this.j(j0)) {
                            n = this.H0.compareTo(h70.H0);
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
        if (this.F0 != null && this.j(b.H0)) {
            j7s.m(h70.I0);
            this.F0.e(j7s);
        }
        if (this.G0 != null && this.j(b.I0)) {
            j7s.m(h70.J0);
            this.G0.e(j7s);
        }
        if (this.H0 != null && this.j(b.J0)) {
            j7s.m(h70.K0);
            this.H0.e(j7s);
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
        if (o instanceof h70) {
            final h70 h70 = (h70)o;
            final b h71 = h70.b.H0;
            final boolean j = this.j(h71);
            final boolean i = h70.j(h71);
            if (j || i) {
                b2 = b;
                if (!j) {
                    return b2;
                }
                if (!i) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.g(h70.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            final b i2 = h70.b.I0;
            final boolean k = this.j(i2);
            final boolean l = h70.j(i2);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (!this.G0.g(h70.G0)) {
                    b2 = b;
                    return b2;
                }
            }
            final b j2 = h70.b.J0;
            final boolean m = this.j(j2);
            final boolean j3 = h70.j(j2);
            if (m || j3) {
                b2 = b;
                if (!m) {
                    return b2;
                }
                if (!j3) {
                    b2 = b;
                    return b2;
                }
                if (!this.H0.g(h70.H0)) {
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
                    if (c != 3) {
                        xli.F(j7s, b);
                    }
                    else if (b == 12) {
                        (this.H0 = new k40()).f(j7s);
                    }
                    else {
                        xli.F(j7s, b);
                    }
                }
                else if (b == 12) {
                    (this.G0 = new b70()).f(j7s);
                }
                else {
                    xli.F(j7s, b);
                }
            }
            else if (b == 12) {
                (this.F0 = new b70()).f(j7s);
            }
            else {
                xli.F(j7s, b);
            }
        }
    }
    
    public final <Any> Any g(final b b) {
        final int ordinal = b.ordinal();
        if (ordinal == 0) {
            return (Any)this.i(b);
        }
        if (ordinal == 1) {
            return (Any)this.i(b);
        }
        if (ordinal == 2) {
            return (Any)this.i(b);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.j(b.H0)) {
            n = this.F0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.j(b.I0)) {
            n2 = n * 31 + this.G0.hashCode();
        }
        int n3 = n2;
        if (this.j(b.J0)) {
            n3 = n2 * 31 + this.H0.hashCode();
        }
        return n3;
    }
    
    public final Object i(final b b) {
        final int ordinal = b.ordinal();
        if (ordinal == 0) {
            return this.F0;
        }
        if (ordinal == 1) {
            return this.G0;
        }
        if (ordinal == 2) {
            return this.H0;
        }
        throw new IllegalStateException();
    }
    
    public final boolean j(final b b) {
        final int ordinal = b.ordinal();
        final boolean b2 = true;
        boolean b3 = true;
        final boolean b4 = true;
        if (ordinal == 0) {
            if (this.F0 == null) {
                b3 = false;
            }
            return b3;
        }
        if (ordinal == 1) {
            return this.G0 != null && b2;
        }
        if (ordinal == 2) {
            return this.H0 != null && b4;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("AndroidTweetCollapsedLayout(");
        final boolean j = this.j(b.H0);
        final int n = 0;
        int n2;
        if (j) {
            sb.append("title:");
            final b70 f0 = this.F0;
            if (f0 == null) {
                sb.append("null");
            }
            else {
                sb.append(f0);
            }
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        if (this.j(b.I0)) {
            if (n2 == 0) {
                sb.append(", ");
            }
            sb.append("tweetText:");
            final b70 g0 = this.G0;
            if (g0 == null) {
                sb.append("null");
                n2 = n;
            }
            else {
                sb.append(g0);
                n2 = n;
            }
        }
        if (this.j(b.J0)) {
            if (n2 == 0) {
                sb.append(", ");
            }
            sb.append("tweetProfileImage:");
            final k40 h0 = this.H0;
            if (h0 == null) {
                sb.append("null");
            }
            else {
                sb.append(h0);
            }
        }
        sb.append(")");
        return sb.toString();
    }
    
    public enum b implements e7s
    {
        H0((short)1, "title"), 
        I0((short)2, "tweetText"), 
        J0((short)3, "tweetProfileImage");
        
        public static final Map<String, b> K0;
        public static final b[] L0;
        public final short F0;
        public final String G0;
        
        static {
            b.K0 = new HashMap();
            for (final b b : EnumSet.allOf(b.class)) {
                b.K0.put(b.G0, b);
            }
        }
        
        public b(final short f0, final String g0) {
            this.F0 = f0;
            this.G0 = g0;
        }
        
        public final short b() {
            return this.F0;
        }
    }
}
