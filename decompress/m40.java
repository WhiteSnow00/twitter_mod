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

public final class m40 implements n5s<m40, m40$b>, Serializable, Cloneable
{
    public static final q5s H0;
    public static final q5s I0;
    public static final q5s J0;
    public static final q5s K0;
    public static final Map<m40$b, oxa> L0;
    public static final m40$b M0;
    public static final m40$b N0;
    public static final m40$b O0;
    public static final m40$b P0;
    public String C0;
    public boolean D0;
    public l40 E0;
    public n40 F0;
    public final BitSet G0;
    
    static {
        H0 = new q5s("uri", (byte)11, (short)1);
        I0 = new q5s("circleCrop", (byte)2, (short)2);
        J0 = new q5s("size", (byte)8, (short)3);
        K0 = new q5s("defaultImage", (byte)12, (short)4);
        final EnumMap enumMap = new EnumMap((Class<K>)m40$b.class);
        final m40$b e0 = m40$b.E0;
        enumMap.put(e0, new oxa());
        final m40$b f0 = m40$b.F0;
        enumMap.put(f0, new oxa());
        final m40$b g0 = m40$b.G0;
        enumMap.put(g0, new oxa());
        final m40$b h0 = m40$b.H0;
        enumMap.put(h0, new oxa());
        oxa.a((Class)m40.class, L0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        M0 = e0;
        N0 = f0;
        O0 = g0;
        P0 = h0;
    }
    
    public m40() {
        this.G0 = new BitSet(1);
    }
    
    public final int compareTo(final Object o) {
        final m40 m40 = (m40)o;
        int n;
        if (!m40.class.equals(m40.getClass())) {
            n = m40.class.getName().compareTo(m40.class.getName());
        }
        else {
            final m40$b e0 = m40$b.E0;
            n = Boolean.valueOf(this.j(e0)).compareTo(Boolean.valueOf(m40.j(e0)));
            if (n == 0) {
                Label_0092: {
                    if (!this.j(e0)) {
                        break Label_0092;
                    }
                    n = this.C0.compareTo(m40.C0);
                    if (n == 0) {
                        break Label_0092;
                    }
                    return n;
                }
                final m40$b f0 = m40$b.F0;
                n = Boolean.valueOf(this.j(f0)).compareTo(Boolean.valueOf(m40.j(f0)));
                if (n == 0) {
                    if (this.j(f0)) {
                        n = o5s.j(this.D0, m40.D0);
                        if (n != 0) {
                            return n;
                        }
                    }
                    final m40$b g0 = m40$b.G0;
                    n = Boolean.valueOf(this.j(g0)).compareTo(Boolean.valueOf(m40.j(g0)));
                    if (n == 0) {
                        if (this.j(g0)) {
                            n = ((Enum)this.E0).compareTo((Object)m40.E0);
                            if (n != 0) {
                                return n;
                            }
                        }
                        final m40$b h0 = m40$b.H0;
                        n = Boolean.valueOf(this.j(h0)).compareTo(Boolean.valueOf(m40.j(h0)));
                        if (n == 0) {
                            if (this.j(h0)) {
                                n = this.F0.compareTo((Object)m40.F0);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            n = 0;
                        }
                    }
                }
            }
        }
        return n;
    }
    
    public final void e(final w5s w5s) throws TException {
        this.m();
        Objects.requireNonNull(w5s);
        if (this.C0 != null) {
            w5s.m(m40.H0);
            w5s.q(this.C0);
        }
        if (this.j(m40$b.F0)) {
            w5s.m(m40.I0);
            ((p5s)w5s).k((byte)(byte)(this.D0 ? 1 : 0));
        }
        if (this.E0 != null && this.j(m40$b.G0)) {
            w5s.m(m40.J0);
            w5s.o(this.E0.C0);
        }
        if (this.F0 != null && this.j(m40$b.H0)) {
            w5s.m(m40.K0);
            this.F0.e(w5s);
        }
        ((p5s)w5s).k((byte)0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (o instanceof m40) {
            final m40 m40 = (m40)o;
            final m40$b e0 = m40$b.E0;
            final boolean j = this.j(e0);
            final boolean i = m40.j(e0);
            if (j || i) {
                b2 = b;
                if (!j) {
                    return b2;
                }
                if (!i) {
                    b2 = b;
                    return b2;
                }
                if (!this.C0.equals(m40.C0)) {
                    b2 = b;
                    return b2;
                }
            }
            final m40$b f0 = m40$b.F0;
            final boolean k = this.j(f0);
            final boolean l = m40.j(f0);
            if (k || l) {
                b2 = b;
                if (!k) {
                    return b2;
                }
                if (!l) {
                    b2 = b;
                    return b2;
                }
                if (this.D0 != m40.D0) {
                    b2 = b;
                    return b2;
                }
            }
            final m40$b g0 = m40$b.G0;
            final boolean j2 = this.j(g0);
            final boolean j3 = m40.j(g0);
            if (j2 || j3) {
                b2 = b;
                if (!j2) {
                    return b2;
                }
                if (!j3) {
                    b2 = b;
                    return b2;
                }
                if (!this.E0.equals(m40.E0)) {
                    b2 = b;
                    return b2;
                }
            }
            final m40$b h0 = m40$b.H0;
            final boolean j4 = this.j(h0);
            final boolean j5 = m40.j(h0);
            if (j4 || j5) {
                b2 = b;
                if (!j4) {
                    return b2;
                }
                if (!j5) {
                    b2 = b;
                    return b2;
                }
                if (!this.F0.g(m40.F0)) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void f(final w5s w5s) throws TException {
        Objects.requireNonNull(w5s);
        while (true) {
            final q5s d = w5s.d();
            final byte b = d.b;
            if (b == 0) {
                break;
            }
            final short c = d.c;
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            mb8.i(w5s, b);
                        }
                        else if (b == 12) {
                            (this.F0 = new n40()).f(w5s);
                        }
                        else {
                            mb8.i(w5s, b);
                        }
                    }
                    else if (b == 8) {
                        final int f = w5s.f();
                        l40 e0;
                        if (f != 0) {
                            if (f != 1) {
                                if (f != 2) {
                                    if (f != 3) {
                                        if (f != 4) {
                                            e0 = null;
                                        }
                                        else {
                                            e0 = l40.H0;
                                        }
                                    }
                                    else {
                                        e0 = l40.G0;
                                    }
                                }
                                else {
                                    e0 = l40.F0;
                                }
                            }
                            else {
                                e0 = l40.E0;
                            }
                        }
                        else {
                            e0 = l40.D0;
                        }
                        this.E0 = e0;
                    }
                    else {
                        mb8.i(w5s, b);
                    }
                }
                else if (b == 2) {
                    this.D0 = w5s.a();
                    this.G0.set(0, true);
                }
                else {
                    mb8.i(w5s, b);
                }
            }
            else if (b == 11) {
                this.C0 = w5s.j();
            }
            else {
                mb8.i(w5s, b);
            }
        }
        this.m();
    }
    
    public final <Any> Any g(final m40$b m40$b) {
        final int ordinal = ((Enum)m40$b).ordinal();
        if (ordinal == 0) {
            return (Any)this.i(m40$b);
        }
        if (ordinal == 1) {
            return (Any)this.i(m40$b);
        }
        if (ordinal == 2) {
            return (Any)this.i(m40$b);
        }
        if (ordinal == 3) {
            return (Any)this.i(m40$b);
        }
        throw new IllegalStateException("Invalid field type");
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.j(m40$b.E0)) {
            n = this.C0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int i = n;
        if (this.j(m40$b.F0)) {
            i = mag.i(this.D0, n * 31);
        }
        int n2 = i;
        if (this.j(m40$b.G0)) {
            n2 = i * 31 + this.E0.hashCode();
        }
        int n3 = n2;
        if (this.j(m40$b.H0)) {
            n3 = n2 * 31 + this.F0.hashCode();
        }
        return n3;
    }
    
    public final Object i(final m40$b m40$b) {
        final int ordinal = ((Enum)m40$b).ordinal();
        if (ordinal == 0) {
            return this.C0;
        }
        if (ordinal == 1) {
            return new Boolean(this.D0);
        }
        if (ordinal == 2) {
            return this.E0;
        }
        if (ordinal == 3) {
            return this.F0;
        }
        throw new IllegalStateException();
    }
    
    public final boolean j(final m40$b m40$b) {
        final int ordinal = ((Enum)m40$b).ordinal();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (ordinal == 0) {
            return this.C0 != null && b2;
        }
        if (ordinal == 1) {
            return this.G0.get(0);
        }
        if (ordinal == 2) {
            return this.E0 != null && b;
        }
        if (ordinal == 3) {
            if (this.F0 == null) {
                b3 = false;
            }
            return b3;
        }
        throw new IllegalStateException();
    }
    
    public final void m() throws TException {
        if (this.C0 != null) {
            return;
        }
        final StringBuilder g = w48.g("Required field 'uri' was not present! Struct: ");
        g.append(this.toString());
        throw new TProtocolException(g.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = dia.t("AndroidImageUri(", "uri:");
        final String c0 = this.C0;
        if (c0 == null) {
            t.append("null");
        }
        else {
            t.append(c0);
        }
        if (this.j(m40$b.F0)) {
            t.append(", ");
            t.append("circleCrop:");
            t.append(this.D0);
        }
        if (this.j(m40$b.G0)) {
            t.append(", ");
            t.append("size:");
            final l40 e0 = this.E0;
            if (e0 == null) {
                t.append("null");
            }
            else {
                t.append(e0);
            }
        }
        if (this.j(m40$b.H0)) {
            t.append(", ");
            t.append("defaultImage:");
            final n40 f0 = this.F0;
            if (f0 == null) {
                t.append("null");
            }
            else {
                t.append(f0);
            }
        }
        t.append(")");
        return t.toString();
    }
    
    public static final class a
    {
        public String a;
        public Boolean b;
        public l40 c;
        public n40 d;
        
        public final m40 a() {
            if (this.a != null) {
                final String a = this.a;
                final Boolean b = this.b;
                final l40 c = this.c;
                final n40 d = this.d;
                final m40 m40 = new m40();
                if (a != null) {
                    m40.C0 = a;
                }
                if (b != null) {
                    m40.D0 = b;
                    m40.G0.set(0, true);
                }
                if (c != null) {
                    m40.E0 = c;
                }
                if (d != null) {
                    m40.F0 = d;
                }
                return m40;
            }
            final StringBuilder g = w48.g("Required field 'uri' was not present! Struct: ");
            g.append(this.toString());
            throw new IllegalArgumentException(g.toString());
        }
        
        public final a b(final m40$b m40$b, final Object o) {
            final int ordinal = ((Enum)m40$b).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (o != null) {
                                this.d = (n40)o;
                            }
                        }
                    }
                    else if (o != null) {
                        this.c = (l40)o;
                    }
                }
                else if (o != null) {
                    this.b = (Boolean)o;
                }
            }
            else if (o != null) {
                this.a = (String)o;
            }
            return this;
        }
    }
}
