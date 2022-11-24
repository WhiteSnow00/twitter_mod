import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ukg implements yle
{
    public Object F0;
    public boolean G0;
    public final List<ukg.ukg$a> H0;
    
    public ukg() {
        this.H0 = new ArrayList();
    }
    
    public final yle A1(final String b) {
        final ukg.ukg$a ukg$a = (ukg.ukg$a)rr4.K1((List)this.H0);
        if (!(ukg$a instanceof ukg.ukg$a.b)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final ukg.ukg$a.b b2 = (ukg.ukg$a.b)ukg$a;
        if (b2.b == null) {
            b2.b = b;
            return (yle)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final yle G() {
        this.H0.add(new ukg.ukg$a.b((Map)new LinkedHashMap()));
        return (yle)this;
    }
    
    public final yle I() {
        final ArrayList h0 = this.H0;
        final ukg.ukg$a ukg$a = h0.remove(h0.size() - 1);
        if (ukg$a instanceof ukg.ukg$a.a) {
            this.b(((ukg.ukg$a.a)ukg$a).a);
            return (yle)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final yle J() {
        this.H0.add(new ukg.ukg$a.a((List)new ArrayList()));
        return (yle)this;
    }
    
    public final yle J0(final boolean b) {
        this.b(b);
        return (yle)this;
    }
    
    public final yle Q() {
        final ArrayList h0 = this.H0;
        final ukg.ukg$a ukg$a = h0.remove(h0.size() - 1);
        if (ukg$a instanceof ukg.ukg$a.b) {
            this.b(((ukg.ukg$a.b)ukg$a).a);
            return (yle)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final Object a(Object z, final Object o) {
        if (z == null) {
            return o;
        }
        if (o == null) {
            return z;
        }
        if (z instanceof List) {
            if (!(o instanceof List)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot merge ");
                sb.append(z);
                sb.append(" with ");
                sb.append(o);
                throw new IllegalStateException(sb.toString().toString());
            }
            final List list = (List)z;
            final int size = list.size();
            final List list2 = (List)o;
            if (size != list2.size()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot merge ");
                sb2.append(z);
                sb2.append(" with ");
                sb2.append(o);
                throw new IllegalStateException(sb2.toString().toString());
            }
            final kud c = shw.C((Collection)z);
            z = new ArrayList(nr4.d1((Iterable)c, 10));
            final gud j = ((iud)c).j();
            while (((jud)j).H0) {
                final int a = j.a();
                ((ArrayList<Object>)z).add(this.a(list.get(a), list2.get(a)));
            }
        }
        else if (z instanceof Map) {
            if (!(o instanceof Map)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Cannot merge ");
                sb3.append(z);
                sb3.append(" with ");
                sb3.append(o);
                throw new IllegalStateException(sb3.toString().toString());
            }
            final Map map = (Map)z;
            final Map map2 = (Map)o;
            final Set t0 = lop.t0((Set)map.keySet(), (Iterable)map2.keySet());
            final ArrayList list3 = new ArrayList<awj>(nr4.d1((Iterable)t0, 10));
            for (final String s : t0) {
                list3.add(new awj((Object)s, this.a(map.get(s), map2.get(s))));
            }
            z = mlg.Z((Iterable)list3);
        }
        else if (!e0e.a(z, o)) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot merge ");
            sb4.append(z);
            sb4.append(" with ");
            sb4.append(o);
            throw new IllegalStateException(sb4.toString().toString());
        }
        return z;
    }
    
    public final <T> ukg b(final T f0) {
        final ukg.ukg$a ukg$a = (ukg.ukg$a)rr4.L1((List)this.H0);
        final boolean b = ukg$a instanceof ukg.ukg$a.b;
        boolean b2 = true;
        if (b) {
            final ukg.ukg$a.b b3 = (ukg.ukg$a.b)ukg$a;
            final String b4 = b3.b;
            if (b4 == null) {
                b2 = false;
            }
            if (!b2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (b3.a.containsKey(b4)) {
                final Map a = b3.a;
                a.put(b4, this.a(a.get(b4), f0));
            }
            else {
                b3.a.put(b4, f0);
            }
            b3.b = null;
        }
        else if (ukg$a instanceof ukg.ukg$a.a) {
            ((ukg.ukg$a.a)ukg$a).a.add(f0);
        }
        else {
            this.F0 = f0;
            this.G0 = true;
        }
        return this;
    }
    
    public final yle c2(final hhe hhe) {
        e0e.f((Object)hhe, "value");
        this.b(hhe);
        return (yle)this;
    }
    
    public final void close() {
    }
    
    public final yle d0(final t4w t4w) {
        e0e.f((Object)t4w, "value");
        this.b((Object)null);
        return (yle)this;
    }
    
    public final yle e0(final long n) {
        this.b(n);
        return (yle)this;
    }
    
    public final yle f0(final int n) {
        this.b(n);
        return (yle)this;
    }
    
    public final yle i2(final String s) {
        e0e.f((Object)s, "value");
        this.b(s);
        return (yle)this;
    }
    
    public final yle k0(final double n) {
        this.b(n);
        return (yle)this;
    }
    
    public final yle u3() {
        this.b((Object)null);
        return (yle)this;
    }
}
