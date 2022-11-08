import org.apache.thrift.protocol.TProtocolException;
import java.util.HashMap;
import org.apache.thrift.TException;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zrk implements n5s<zrk, zrk.zrk$a>, Serializable, Cloneable
{
    public static final q5s E0;
    public static final q5s F0;
    public static final Map<zrk.zrk$a, oxa> G0;
    public String C0;
    public Map<String, String> D0;
    
    static {
        E0 = new q5s("url", (byte)11, (short)1);
        F0 = new q5s("bodyParams", (byte)13, (short)2);
        final EnumMap enumMap = new EnumMap((Class<K>)zrk.zrk$a.class);
        enumMap.put(zrk.zrk$a.E0, new oxa());
        enumMap.put(zrk.zrk$a.F0, new oxa());
        oxa.a((Class)zrk.class, G0 = Collections.unmodifiableMap((Map<?, ?>)enumMap));
    }
    
    public final int compareTo(final Object o) {
        final zrk zrk = (zrk)o;
        int n;
        if (!zrk.class.equals(zrk.getClass())) {
            n = zrk.class.getName().compareTo(zrk.class.getName());
        }
        else {
            final zrk.zrk$a e0 = zrk.zrk$a.E0;
            n = Boolean.valueOf(this.g(e0)).compareTo(Boolean.valueOf(zrk.g(e0)));
            if (n == 0) {
                if (this.g(e0)) {
                    n = this.C0.compareTo(zrk.C0);
                    if (n != 0) {
                        return n;
                    }
                }
                final zrk.zrk$a f0 = zrk.zrk$a.F0;
                n = Boolean.valueOf(this.g(f0)).compareTo(Boolean.valueOf(zrk.g(f0)));
                if (n == 0) {
                    if (this.g(f0)) {
                        n = o5s.g((Map)this.D0, (Map)zrk.D0);
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
    
    public final void e(final w5s w5s) throws TException {
        this.i();
        Objects.requireNonNull(w5s);
        if (this.C0 != null) {
            w5s.m(zrk.E0);
            w5s.q(this.C0);
        }
        if (this.D0 != null && this.g(zrk.zrk$a.F0)) {
            w5s.m(zrk.F0);
            final int size = this.D0.size();
            final p5s p5s = (p5s)w5s;
            p5s.k((byte)11);
            p5s.k((byte)11);
            p5s.o(size);
            for (final Map.Entry<String, V> entry : this.D0.entrySet()) {
                w5s.q((String)entry.getKey());
                w5s.q((String)entry.getValue());
            }
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
        if (o instanceof zrk) {
            final zrk zrk = (zrk)o;
            final zrk.zrk$a e0 = zrk.zrk$a.E0;
            final boolean g = this.g(e0);
            final boolean g2 = zrk.g(e0);
            if (g || g2) {
                b2 = b;
                if (!g) {
                    return b2;
                }
                if (!g2) {
                    b2 = b;
                    return b2;
                }
                if (!this.C0.equals(zrk.C0)) {
                    b2 = b;
                    return b2;
                }
            }
            final zrk.zrk$a f0 = zrk.zrk$a.F0;
            final boolean g3 = this.g(f0);
            final boolean g4 = zrk.g(f0);
            if (g3 || g4) {
                b2 = b;
                if (!g3) {
                    return b2;
                }
                if (!g4) {
                    b2 = b;
                    return b2;
                }
                if (!this.D0.equals(zrk.D0)) {
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
                    mb8.i(w5s, b);
                }
                else if (b == 13) {
                    final u5s i = w5s.i();
                    this.D0 = new HashMap(i.c * 2);
                    for (int j = 0; j < i.c; ++j) {
                        this.D0.put(w5s.j(), w5s.j());
                    }
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
        this.i();
    }
    
    public final boolean g(final zrk.zrk$a zrk$a) {
        final int ordinal = ((Enum)zrk$a).ordinal();
        final boolean b = true;
        boolean b2 = true;
        if (ordinal == 0) {
            return this.C0 != null && b;
        }
        if (ordinal == 1) {
            if (this.D0 == null) {
                b2 = false;
            }
            return b2;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.g(zrk.zrk$a.E0)) {
            n = this.C0.hashCode() + 31;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (this.g(zrk.zrk$a.F0)) {
            n2 = n * 31 + this.D0.hashCode();
        }
        return n2;
    }
    
    public final void i() throws TException {
        if (this.C0 != null) {
            return;
        }
        final StringBuilder g = w48.g("Required field 'url' was not present! Struct: ");
        g.append(this.toString());
        throw new TProtocolException(g.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = dia.t("PostRequest(", "url:");
        final String c0 = this.C0;
        if (c0 == null) {
            t.append("null");
        }
        else {
            t.append(c0);
        }
        if (this.g(zrk.zrk$a.F0)) {
            t.append(", ");
            t.append("bodyParams:");
            final HashMap d0 = this.D0;
            if (d0 == null) {
                t.append("null");
            }
            else {
                t.append(d0);
            }
        }
        t.append(")");
        return t.toString();
    }
}
