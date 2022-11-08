import java.util.Collection;
import java.util.ArrayList;
import com.apollographql.apollo3.exception.JsonDataException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckg implements eie
{
    public static final ckg.ckg$a Companion;
    public final Map<String, Object> C0;
    public final List<Object> D0;
    public int E0;
    public Object F0;
    public final Object[] G0;
    public Map<String, Object>[] H0;
    public final Iterator<?>[] I0;
    public final int[] J0;
    public int K0;
    
    static {
        Companion = new ckg.ckg$a();
    }
    
    public ckg(final Map<String, ?> map, final List<?> d0) {
        zzd.f((Object)d0, "pathRoot");
        this.C0 = (Map<String, Object>)map;
        this.D0 = (List<Object>)d0;
        this.G0 = new Object[256];
        this.H0 = new Map[256];
        this.I0 = new Iterator[256];
        this.J0 = new int[256];
        this.E0 = 3;
        this.F0 = map;
    }
    
    public final eie G() {
        if (this.E0 != 3) {
            final StringBuilder g = w48.g("Expected BEGIN_OBJECT but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final int k0 = this.K0;
        if (k0 < 256) {
            final int k2 = k0 + 1;
            this.K0 = k2;
            final Map<String, Object>[] h0 = this.H0;
            final Object f0 = this.F0;
            zzd.d(f0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            h0[k2 - 1] = (Map<String, Object>)f0;
            this.H();
            return (eie)this;
        }
        throw new IllegalStateException("Nesting too deep".toString());
    }
    
    public final void H() {
        final Map<String, Object>[] h0 = this.H0;
        final int k0 = this.K0;
        final Map<String, Object> map = h0[k0 - 1];
        this.G0[k0 - 1] = null;
        final Iterator<?>[] i0 = this.I0;
        zzd.c((Object)map);
        i0[k0 - 1] = map.entrySet().iterator();
        this.J0[this.K0 - 1] = 0;
        this.a();
    }
    
    public final eie I() {
        if (this.E0 == 2) {
            final int k0 = this.K0 - 1;
            this.K0 = k0;
            this.I0[k0] = null;
            this.G0[k0] = null;
            this.a();
            return (eie)this;
        }
        final StringBuilder g = w48.g("Expected END_ARRAY but was ");
        g.append(lux.k(this.E0));
        g.append(" at path ");
        g.append(this.c());
        throw new JsonDataException(g.toString());
    }
    
    public final eie J() {
        if (this.E0 != 1) {
            final StringBuilder g = w48.g("Expected BEGIN_ARRAY but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        zzd.d(f0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        final List list = (List)f0;
        final int k0 = this.K0;
        if (k0 < 256) {
            final int k2 = k0 + 1;
            this.K0 = k2;
            this.G0[k2 - 1] = -1;
            this.I0[this.K0 - 1] = list.iterator();
            this.a();
            return (eie)this;
        }
        throw new IllegalStateException("Nesting too deep".toString());
    }
    
    public final boolean K1() {
        if (this.E0 == 9) {
            final Object f0 = this.F0;
            zzd.d(f0, "null cannot be cast to non-null type kotlin.Boolean");
            final Boolean b = (Boolean)f0;
            b.booleanValue();
            this.a();
            return b;
        }
        final StringBuilder g = w48.g("Expected BOOLEAN but was ");
        g.append(lux.k(this.E0));
        g.append(" at path ");
        g.append(this.c());
        throw new JsonDataException(g.toString());
    }
    
    public final void K2() {
        if (this.E0 == 10) {
            this.a();
            return;
        }
        final StringBuilder g = w48.g("Expected NULL but was ");
        g.append(lux.k(this.E0));
        g.append(" at path ");
        g.append(this.c());
        throw new JsonDataException(g.toString());
    }
    
    public final String N0() {
        if (this.E0 == 5) {
            final Object f0 = this.F0;
            zzd.d(f0, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)f0;
            this.G0[this.K0 - 1] = entry.getKey();
            this.F0 = entry.getValue();
            this.E0 = this.b(entry.getValue());
            return entry.getKey();
        }
        final StringBuilder g = w48.g("Expected NAME but was ");
        g.append(lux.k(this.E0));
        g.append(" at path ");
        g.append(this.c());
        throw new JsonDataException(g.toString());
    }
    
    public final eie Q() {
        final int k0 = this.K0 - 1;
        this.K0 = k0;
        this.I0[k0] = null;
        this.G0[k0] = null;
        this.H0[k0] = null;
        this.a();
        return (eie)this;
    }
    
    public final int Q0() {
        final int d = nb0.D(this.E0);
        if (d != 5 && d != 6 && d != 7) {
            final StringBuilder g = w48.g("Expected an Int but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        int n;
        if (f0 instanceof Integer) {
            n = ((Number)f0).intValue();
        }
        else {
            final boolean b = f0 instanceof Long;
            final int n2 = 1;
            boolean b2 = true;
            if (b) {
                final long longValue = ((Number)f0).longValue();
                final int n3 = (int)longValue;
                if (n3 != longValue) {
                    b2 = false;
                }
                if (!b2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(longValue);
                    sb.append(" cannot be converted to Int");
                    throw new IllegalStateException(sb.toString().toString());
                }
                n = n3;
            }
            else if (f0 instanceof Double) {
                final double doubleValue = ((Number)f0).doubleValue();
                final int n4 = (int)doubleValue;
                int n5;
                if (n4 == doubleValue) {
                    n5 = n2;
                }
                else {
                    n5 = 0;
                }
                if (n5 == 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(doubleValue);
                    sb2.append(" cannot be converted to Int");
                    throw new IllegalStateException(sb2.toString().toString());
                }
                n = n4;
            }
            else if (f0 instanceof String) {
                n = Integer.parseInt((String)f0);
            }
            else {
                if (!(f0 instanceof bhe)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Expected an Int but got ");
                    sb3.append(f0);
                    sb3.append(" instead");
                    throw new IllegalStateException(sb3.toString().toString());
                }
                n = Integer.parseInt(((bhe)f0).a);
            }
        }
        this.a();
        return n;
    }
    
    public final String S1() {
        final int d = nb0.D(this.E0);
        if (d != 5 && d != 6 && d != 7) {
            final StringBuilder g = w48.g("Expected a String but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        zzd.c(f0);
        final String string = f0.toString();
        this.a();
        return string;
    }
    
    public final int V2() {
        return this.E0;
    }
    
    public final void a() {
        final int k0 = this.K0;
        if (k0 == 0) {
            this.E0 = 11;
            return;
        }
        final Iterator<?> iterator = this.I0[k0 - 1];
        zzd.c((Object)iterator);
        final Object[] g0 = this.G0;
        final int n = this.K0 - 1;
        if (g0[n] instanceof Integer) {
            final Object o = g0[n];
            zzd.d(o, "null cannot be cast to non-null type kotlin.Int");
            g0[n] = (int)o + 1;
        }
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            this.F0 = next;
            int b;
            if (next instanceof Map.Entry) {
                b = 5;
            }
            else {
                b = this.b(next);
            }
            this.E0 = b;
        }
        else {
            int e0;
            if (this.G0[this.K0 - 1] instanceof Integer) {
                e0 = 2;
            }
            else {
                e0 = 4;
            }
            this.E0 = e0;
        }
    }
    
    public final int b(final Object o) {
        int n;
        if (o == null) {
            n = 10;
        }
        else if (o instanceof List) {
            n = 1;
        }
        else if (o instanceof Map) {
            n = 3;
        }
        else {
            if (!(o instanceof Integer)) {
                if (o instanceof Long) {
                    n = 8;
                    return n;
                }
                if (!(o instanceof Double)) {
                    if (!(o instanceof bhe)) {
                        if (o instanceof String) {
                            n = 6;
                            return n;
                        }
                        if (o instanceof Boolean) {
                            n = 9;
                            return n;
                        }
                        n = 12;
                        return n;
                    }
                }
            }
            n = 7;
        }
        return n;
    }
    
    public final String c() {
        return or4.M1((Iterable)this.r(), (CharSequence)".", (CharSequence)null, (CharSequence)null, (rtb)null, 62);
    }
    
    public final void close() {
    }
    
    public final void h0() {
        this.a();
    }
    
    public final boolean hasNext() {
        final int d = nb0.D(this.E0);
        boolean b = true;
        if (d == 1 || d == 3) {
            b = false;
        }
        return b;
    }
    
    public final bhe j3() {
        final int d = nb0.D(this.E0);
        if (d != 5 && d != 6 && d != 7) {
            final StringBuilder g = w48.g("Expected a Number but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        final boolean b = f0 instanceof Integer;
        final int n = 1;
        int n2;
        if (b || f0 instanceof Long) {
            n2 = n;
        }
        else {
            n2 = ((f0 instanceof Double) ? 1 : 0);
        }
        bhe bhe;
        if (n2 != 0) {
            bhe = new bhe(f0.toString());
        }
        else if (f0 instanceof String) {
            bhe = new bhe((String)f0);
        }
        else {
            if (!(f0 instanceof bhe)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected JsonNumber but got ");
                sb.append(f0);
                sb.append(" instead");
                throw new IllegalStateException(sb.toString().toString());
            }
            bhe = (bhe)f0;
        }
        this.a();
        return bhe;
    }
    
    public final int k3(final List<String> list) {
        zzd.f((Object)list, "names");
        while (this.hasNext()) {
            final String n0 = this.N0();
            int n2 = this.J0[this.K0 - 1];
            if (n2 < list.size() && zzd.a(list.get(n2), (Object)n0)) {
                final int[] j0 = this.J0;
                final int n3 = this.K0 - 1;
                ++j0[n3];
            }
            else {
                final int index = list.indexOf(n0);
                if ((n2 = index) != -1) {
                    this.J0[this.K0 - 1] = index + 1;
                    n2 = index;
                }
            }
            if (n2 != -1) {
                return n2;
            }
            this.a();
        }
        return -1;
    }
    
    public final double n2() {
        final int d = nb0.D(this.E0);
        if (d != 5 && d != 6 && d != 7) {
            final StringBuilder g = w48.g("Expected a Double but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        double n;
        if (f0 instanceof Integer) {
            n = ((Number)f0).intValue();
        }
        else if (f0 instanceof Long) {
            final long longValue = ((Number)f0).longValue();
            n = (double)longValue;
            if ((long)n != longValue) {
                final StringBuilder sb = new StringBuilder();
                sb.append(longValue);
                sb.append(" cannot be converted to Double");
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        else if (f0 instanceof Double) {
            n = ((Number)f0).doubleValue();
        }
        else if (f0 instanceof String) {
            n = Double.parseDouble((String)f0);
        }
        else {
            if (!(f0 instanceof bhe)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a Double but got ");
                sb2.append(f0);
                sb2.append(" instead");
                throw new IllegalStateException(sb2.toString().toString());
            }
            n = Double.parseDouble(((bhe)f0).a);
        }
        this.a();
        return n;
    }
    
    public final long n3() {
        final int d = nb0.D(this.E0);
        if (d != 5 && d != 6 && d != 7) {
            final StringBuilder g = w48.g("Expected a Long but was ");
            g.append(lux.k(this.E0));
            g.append(" at path ");
            g.append(this.c());
            throw new JsonDataException(g.toString());
        }
        final Object f0 = this.F0;
        long n;
        if (f0 instanceof Integer) {
            n = ((Number)f0).intValue();
        }
        else if (f0 instanceof Long) {
            n = ((Number)f0).longValue();
        }
        else if (f0 instanceof Double) {
            final double doubleValue = ((Number)f0).doubleValue();
            n = (long)doubleValue;
            if (n != doubleValue) {
                final StringBuilder sb = new StringBuilder();
                sb.append(doubleValue);
                sb.append(" cannot be converted to Long");
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        else if (f0 instanceof String) {
            n = Long.parseLong((String)f0);
        }
        else {
            if (!(f0 instanceof bhe)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected Int but got ");
                sb2.append(f0);
                sb2.append(" instead");
                throw new IllegalStateException(sb2.toString().toString());
            }
            n = Long.parseLong(((bhe)f0).a);
        }
        this.a();
        return n;
    }
    
    public final List<Object> r() {
        final ArrayList list = new ArrayList();
        list.addAll(this.D0);
        for (int k0 = this.K0, i = 0; i < k0; ++i) {
            final Object o = this.G0[i];
            if (o != null) {
                list.add(o);
            }
        }
        return list;
    }
}
