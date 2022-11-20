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

public final class bkg implements ale
{
    public Object D0;
    public boolean E0;
    public final List<bkg.bkg$a> F0;
    
    public bkg() {
        this.F0 = new ArrayList();
    }
    
    public final ale F() {
        this.F0.add(new bkg.bkg$a.b((Map)new LinkedHashMap()));
        return (ale)this;
    }
    
    public final ale H() {
        final ArrayList f0 = this.F0;
        final bkg.bkg$a bkg$a = f0.remove(f0.size() - 1);
        if (bkg$a instanceof bkg.bkg$a.a) {
            this.b(((bkg.bkg$a.a)bkg$a).a);
            return (ale)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final ale I() {
        this.F0.add(new bkg.bkg$a.a((List)new ArrayList()));
        return (ale)this;
    }
    
    public final ale I0(final boolean b) {
        this.b(b);
        return (ale)this;
    }
    
    public final ale P() {
        final ArrayList f0 = this.F0;
        final bkg.bkg$a bkg$a = f0.remove(f0.size() - 1);
        if (bkg$a instanceof bkg.bkg$a.b) {
            this.b(((bkg.bkg$a.b)bkg$a).a);
            return (ale)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final Object a(Object u0, final Object o) {
        if (u0 == null) {
            return o;
        }
        if (o == null) {
            return u0;
        }
        if (u0 instanceof List) {
            if (!(o instanceof List)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot merge ");
                sb.append(u0);
                sb.append(" with ");
                sb.append(o);
                throw new IllegalStateException(sb.toString().toString());
            }
            final List list = (List)u0;
            final int size = list.size();
            final List list2 = (List)o;
            if (size != list2.size()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot merge ");
                sb2.append(u0);
                sb2.append(" with ");
                sb2.append(o);
                throw new IllegalStateException(sb2.toString().toString());
            }
            final itd n = s9i.n((Collection)u0);
            u0 = new ArrayList(iq4.H((Iterable)n, 10));
            final etd j = ((gtd)n).j();
            while (((htd)j).F0) {
                final int a = j.a();
                ((ArrayList<Object>)u0).add(this.a(list.get(a), list2.get(a)));
            }
        }
        else if (u0 instanceof Map) {
            if (!(o instanceof Map)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Cannot merge ");
                sb3.append(u0);
                sb3.append(" with ");
                sb3.append(o);
                throw new IllegalStateException(sb3.toString().toString());
            }
            final Map map = (Map)u0;
            final Map map2 = (Map)o;
            final Set a2 = onp.a1((Set)map.keySet(), (Iterable)map2.keySet());
            final ArrayList list3 = new ArrayList<lvj>(iq4.H((Iterable)a2, 10));
            for (final String s : a2) {
                list3.add(new lvj((Object)s, this.a(map.get(s), map2.get(s))));
            }
            u0 = tkg.u0((Iterable)list3);
        }
        else if (!czd.a(u0, o)) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Cannot merge ");
            sb4.append(u0);
            sb4.append(" with ");
            sb4.append(o);
            throw new IllegalStateException(sb4.toString().toString());
        }
        return u0;
    }
    
    public final <T> bkg b(final T d0) {
        final bkg.bkg$a bkg$a = (bkg.bkg$a)mq4.p0((List)this.F0);
        final boolean b = bkg$a instanceof bkg.bkg$a.b;
        boolean b2 = true;
        if (b) {
            final bkg.bkg$a.b b3 = (bkg.bkg$a.b)bkg$a;
            final String b4 = b3.b;
            if (b4 == null) {
                b2 = false;
            }
            if (!b2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (b3.a.containsKey(b4)) {
                final Map a = b3.a;
                a.put(b4, this.a(a.get(b4), d0));
            }
            else {
                b3.a.put(b4, d0);
            }
            b3.b = null;
        }
        else if (bkg$a instanceof bkg.bkg$a.a) {
            ((bkg.bkg$a.a)bkg$a).a.add(d0);
        }
        else {
            this.D0 = d0;
            this.E0 = true;
        }
        return this;
    }
    
    public final ale b2(final kge kge) {
        czd.f((Object)kge, "value");
        this.b(kge);
        return (ale)this;
    }
    
    public final ale c0(final e4w e4w) {
        czd.f((Object)e4w, "value");
        this.b((Object)null);
        return (ale)this;
    }
    
    public final void close() {
    }
    
    public final ale d0(final long n) {
        this.b(n);
        return (ale)this;
    }
    
    public final ale e0(final int n) {
        this.b(n);
        return (ale)this;
    }
    
    public final ale h2(final String s) {
        czd.f((Object)s, "value");
        this.b(s);
        return (ale)this;
    }
    
    public final ale j0(final double n) {
        this.b(n);
        return (ale)this;
    }
    
    public final ale t3() {
        this.b((Object)null);
        return (ale)this;
    }
    
    public final ale z1(final String b) {
        final bkg.bkg$a bkg$a = (bkg.bkg$a)mq4.o0((List)this.F0);
        if (!(bkg$a instanceof bkg.bkg$a.b)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        final bkg.bkg$a.b b2 = (bkg.bkg$a.b)bkg$a;
        if (b2.b == null) {
            b2.b = b;
            return (ale)this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
