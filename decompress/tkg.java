import java.util.Collection;
import java.util.ArrayList;
import com.apollographql.apollo3.exception.JsonDataException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tkg implements kie
{
    public static final a Companion;
    public final Map<String, Object> F0;
    public final List<Object> G0;
    public int H0;
    public Object I0;
    public final Object[] J0;
    public Map<String, Object>[] K0;
    public final Iterator<?>[] L0;
    public final int[] M0;
    public int N0;
    
    static {
        Companion = new a();
    }
    
    public tkg(final Map<String, ?> map, final List<?> g0) {
        e0e.f((Object)g0, "pathRoot");
        this.F0 = (Map<String, Object>)map;
        this.G0 = (List<Object>)g0;
        this.J0 = new Object[256];
        this.K0 = new Map[256];
        this.L0 = new Iterator[256];
        this.M0 = new int[256];
        this.H0 = 3;
        this.I0 = map;
    }
    
    public final kie G() {
        if (this.H0 != 3) {
            final StringBuilder f = ehk.f("Expected BEGIN_OBJECT but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final int n0 = this.N0;
        if (n0 < 256) {
            final int n2 = n0 + 1;
            this.N0 = n2;
            final Map<String, Object>[] k0 = this.K0;
            final Object i0 = this.I0;
            e0e.d(i0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            k0[n2 - 1] = (Map<String, Object>)i0;
            this.H();
            return (kie)this;
        }
        throw new IllegalStateException("Nesting too deep".toString());
    }
    
    public final void H() {
        final Map<String, Object>[] k0 = this.K0;
        final int n0 = this.N0;
        final Map<String, Object> map = k0[n0 - 1];
        this.J0[n0 - 1] = null;
        final Iterator<?>[] l0 = this.L0;
        e0e.c((Object)map);
        l0[n0 - 1] = map.entrySet().iterator();
        this.M0[this.N0 - 1] = 0;
        this.a();
    }
    
    public final kie I() {
        if (this.H0 == 2) {
            final int n0 = this.N0 - 1;
            this.N0 = n0;
            this.L0[n0] = null;
            this.J0[n0] = null;
            this.a();
            return (kie)this;
        }
        final StringBuilder f = ehk.f("Expected END_ARRAY but was ");
        f.append(ix.L(this.H0));
        f.append(" at path ");
        f.append(this.c());
        throw new JsonDataException(f.toString());
    }
    
    public final kie J() {
        if (this.H0 != 1) {
            final StringBuilder f = ehk.f("Expected BEGIN_ARRAY but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        e0e.d(i0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        final List list = (List)i0;
        final int n0 = this.N0;
        if (n0 < 256) {
            final int n2 = n0 + 1;
            this.N0 = n2;
            this.J0[n2 - 1] = -1;
            this.L0[this.N0 - 1] = list.iterator();
            this.a();
            return (kie)this;
        }
        throw new IllegalStateException("Nesting too deep".toString());
    }
    
    public final boolean K1() {
        if (this.H0 == 9) {
            final Object i0 = this.I0;
            e0e.d(i0, "null cannot be cast to non-null type kotlin.Boolean");
            final Boolean b = (Boolean)i0;
            b.booleanValue();
            this.a();
            return b;
        }
        final StringBuilder f = ehk.f("Expected BOOLEAN but was ");
        f.append(ix.L(this.H0));
        f.append(" at path ");
        f.append(this.c());
        throw new JsonDataException(f.toString());
    }
    
    public final void K2() {
        if (this.H0 == 10) {
            this.a();
            return;
        }
        final StringBuilder f = ehk.f("Expected NULL but was ");
        f.append(ix.L(this.H0));
        f.append(" at path ");
        f.append(this.c());
        throw new JsonDataException(f.toString());
    }
    
    public final String N0() {
        if (this.H0 == 5) {
            final Object i0 = this.I0;
            e0e.d(i0, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
            final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)i0;
            this.J0[this.N0 - 1] = entry.getKey();
            this.I0 = entry.getValue();
            this.H0 = this.b(entry.getValue());
            return entry.getKey();
        }
        final StringBuilder f = ehk.f("Expected NAME but was ");
        f.append(ix.L(this.H0));
        f.append(" at path ");
        f.append(this.c());
        throw new JsonDataException(f.toString());
    }
    
    public final kie Q() {
        final int n0 = this.N0 - 1;
        this.N0 = n0;
        this.L0[n0] = null;
        this.J0[n0] = null;
        this.K0[n0] = null;
        this.a();
        return (kie)this;
    }
    
    public final int Q0() {
        final int g = lb0.G(this.H0);
        if (g != 5 && g != 6 && g != 7) {
            final StringBuilder f = ehk.f("Expected an Int but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        int n;
        if (i0 instanceof Integer) {
            n = ((Number)i0).intValue();
        }
        else {
            final boolean b = i0 instanceof Long;
            final int n2 = 1;
            boolean b2 = true;
            if (b) {
                final long longValue = ((Number)i0).longValue();
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
            else if (i0 instanceof Double) {
                final double doubleValue = ((Number)i0).doubleValue();
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
            else if (i0 instanceof String) {
                n = Integer.parseInt((String)i0);
            }
            else {
                if (!(i0 instanceof hhe)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Expected an Int but got ");
                    sb3.append(i0);
                    sb3.append(" instead");
                    throw new IllegalStateException(sb3.toString().toString());
                }
                n = Integer.parseInt(((hhe)i0).a);
            }
        }
        this.a();
        return n;
    }
    
    public final String S1() {
        final int g = lb0.G(this.H0);
        if (g != 5 && g != 6 && g != 7) {
            final StringBuilder f = ehk.f("Expected a String but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        e0e.c(i0);
        final String string = i0.toString();
        this.a();
        return string;
    }
    
    public final int V2() {
        return this.H0;
    }
    
    public final void a() {
        final int n0 = this.N0;
        if (n0 == 0) {
            this.H0 = 11;
            return;
        }
        final Iterator<?> iterator = this.L0[n0 - 1];
        e0e.c((Object)iterator);
        final Object[] j0 = this.J0;
        final int n2 = this.N0 - 1;
        if (j0[n2] instanceof Integer) {
            final Object o = j0[n2];
            e0e.d(o, "null cannot be cast to non-null type kotlin.Int");
            j0[n2] = (int)o + 1;
        }
        if (iterator.hasNext()) {
            final Object next = iterator.next();
            this.I0 = next;
            int b;
            if (next instanceof Map.Entry) {
                b = 5;
            }
            else {
                b = this.b(next);
            }
            this.H0 = b;
        }
        else {
            int h0;
            if (this.J0[this.N0 - 1] instanceof Integer) {
                h0 = 2;
            }
            else {
                h0 = 4;
            }
            this.H0 = h0;
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
                    if (!(o instanceof hhe)) {
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
        return rr4.I1((Iterable)this.s(), (CharSequence)".", (CharSequence)null, (CharSequence)null, (stb)null, 62);
    }
    
    public final void close() {
    }
    
    public final void h0() {
        this.a();
    }
    
    public final boolean hasNext() {
        final int g = lb0.G(this.H0);
        boolean b = true;
        if (g == 1 || g == 3) {
            b = false;
        }
        return b;
    }
    
    public final hhe j3() {
        final int g = lb0.G(this.H0);
        if (g != 5 && g != 6 && g != 7) {
            final StringBuilder f = ehk.f("Expected a Number but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        final boolean b = i0 instanceof Integer;
        final int n = 1;
        int n2;
        if (b || i0 instanceof Long) {
            n2 = n;
        }
        else {
            n2 = ((i0 instanceof Double) ? 1 : 0);
        }
        hhe hhe;
        if (n2 != 0) {
            hhe = new hhe(i0.toString());
        }
        else if (i0 instanceof String) {
            hhe = new hhe((String)i0);
        }
        else {
            if (!(i0 instanceof hhe)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected JsonNumber but got ");
                sb.append(i0);
                sb.append(" instead");
                throw new IllegalStateException(sb.toString().toString());
            }
            hhe = (hhe)i0;
        }
        this.a();
        return hhe;
    }
    
    public final int k3(final List<String> list) {
        e0e.f((Object)list, "names");
        while (this.hasNext()) {
            final String n0 = this.N0();
            int n2 = this.M0[this.N0 - 1];
            if (n2 < list.size() && e0e.a(list.get(n2), (Object)n0)) {
                final int[] m0 = this.M0;
                final int n3 = this.N0 - 1;
                ++m0[n3];
            }
            else {
                final int index = list.indexOf(n0);
                if ((n2 = index) != -1) {
                    this.M0[this.N0 - 1] = index + 1;
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
        final int g = lb0.G(this.H0);
        if (g != 5 && g != 6 && g != 7) {
            final StringBuilder f = ehk.f("Expected a Double but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        double n;
        if (i0 instanceof Integer) {
            n = ((Number)i0).intValue();
        }
        else if (i0 instanceof Long) {
            final long longValue = ((Number)i0).longValue();
            n = (double)longValue;
            if ((long)n != longValue) {
                final StringBuilder sb = new StringBuilder();
                sb.append(longValue);
                sb.append(" cannot be converted to Double");
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        else if (i0 instanceof Double) {
            n = ((Number)i0).doubleValue();
        }
        else if (i0 instanceof String) {
            n = Double.parseDouble((String)i0);
        }
        else {
            if (!(i0 instanceof hhe)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a Double but got ");
                sb2.append(i0);
                sb2.append(" instead");
                throw new IllegalStateException(sb2.toString().toString());
            }
            n = Double.parseDouble(((hhe)i0).a);
        }
        this.a();
        return n;
    }
    
    public final long n3() {
        final int g = lb0.G(this.H0);
        if (g != 5 && g != 6 && g != 7) {
            final StringBuilder f = ehk.f("Expected a Long but was ");
            f.append(ix.L(this.H0));
            f.append(" at path ");
            f.append(this.c());
            throw new JsonDataException(f.toString());
        }
        final Object i0 = this.I0;
        long n;
        if (i0 instanceof Integer) {
            n = ((Number)i0).intValue();
        }
        else if (i0 instanceof Long) {
            n = ((Number)i0).longValue();
        }
        else if (i0 instanceof Double) {
            final double doubleValue = ((Number)i0).doubleValue();
            n = (long)doubleValue;
            if (n != doubleValue) {
                final StringBuilder sb = new StringBuilder();
                sb.append(doubleValue);
                sb.append(" cannot be converted to Long");
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        else if (i0 instanceof String) {
            n = Long.parseLong((String)i0);
        }
        else {
            if (!(i0 instanceof hhe)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected Int but got ");
                sb2.append(i0);
                sb2.append(" instead");
                throw new IllegalStateException(sb2.toString().toString());
            }
            n = Long.parseLong(((hhe)i0).a);
        }
        this.a();
        return n;
    }
    
    public final List<Object> s() {
        final ArrayList list = new ArrayList();
        list.addAll(this.G0);
        for (int n0 = this.N0, i = 0; i < n0; ++i) {
            final Object o = this.J0[i];
            if (o != null) {
                list.add(o);
            }
        }
        return list;
    }
    
    public static final class a
    {
    }
}
