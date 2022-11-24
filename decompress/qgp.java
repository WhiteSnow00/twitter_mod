import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qgp implements ogp
{
    public boolean a;
    public final List<xep> b;
    public final Map<Long, xep> c;
    public AtomicLong d;
    public stb<? super Long, vzv> e;
    public kub<? super bwe, ? super kgj, ? super jfp, vzv> f;
    public stb<? super Long, vzv> g;
    public oub<? super bwe, ? super kgj, ? super kgj, ? super Boolean, ? super jfp, Boolean> h;
    public ptb<vzv> i;
    public stb<? super Long, vzv> j;
    public stb<? super Long, vzv> k;
    public final wwj l;
    
    public qgp() {
        this.b = new ArrayList();
        this.c = new LinkedHashMap();
        this.d = new AtomicLong(1L);
        this.l = (wwj)zzz.W((Object)m3a.F0);
    }
    
    @Override
    public final long a() {
        long n;
        for (n = this.d.getAndIncrement(); n == 0L; n = this.d.getAndIncrement()) {}
        return n;
    }
    
    @Override
    public final void b(final bwe bwe, final long n) {
        final jfp$a$e d = jfp.a.d;
        final kub<? super bwe, ? super kgj, ? super jfp, vzv> f = this.f;
        if (f != null) {
            f.h0((Object)bwe, (Object)new kgj(n), (Object)d);
        }
    }
    
    @Override
    public final Map<Long, hfp> c() {
        return ((cjq<Map<Long, hfp>>)this.l).getValue();
    }
    
    @Override
    public final void d(final long n) {
        this.a = false;
        final stb<? super Long, vzv> e = this.e;
        if (e != null) {
            e.invoke((Object)n);
        }
    }
    
    @Override
    public final void e(final xep xep) {
        if (!this.c.containsKey(xep.f())) {
            return;
        }
        this.b.remove(xep);
        this.c.remove(xep.f());
        final stb<? super Long, vzv> k = this.k;
        if (k != null) {
            k.invoke((Object)xep.f());
        }
    }
    
    @Override
    public final boolean f(final bwe bwe, final long n, final long n2) {
        final jfp$a$b f = jfp.a.f;
        final oub<? super bwe, ? super kgj, ? super kgj, ? super Boolean, ? super jfp, Boolean> h = this.h;
        return h == null || (boolean)h.y0((Object)bwe, (Object)new kgj(n), (Object)new kgj(n2), (Object)Boolean.FALSE, (Object)f);
    }
    
    @Override
    public final void g(final long n) {
        final stb<? super Long, vzv> j = this.j;
        if (j != null) {
            j.invoke((Object)n);
        }
    }
    
    @Override
    public final xep h(final xep xep) {
        final lth lth = (lth)xep;
        final long a = lth.a;
        if (a == 0L) {
            final StringBuilder f = ehk.f("The selectable contains an invalid id: ");
            f.append(lth.a);
            throw new IllegalArgumentException(f.toString().toString());
        }
        if (this.c.containsKey(a) ^ true) {
            this.c.put(lth.a, xep);
            this.b.add(xep);
            this.a = false;
            return xep;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another selectable with the id: ");
        sb.append(xep);
        sb.append(".selectableId has already subscribed.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public final void i(final long n) {
        final stb<? super Long, vzv> g = this.g;
        if (g != null) {
            g.invoke((Object)n);
        }
    }
    
    @Override
    public final void j() {
        final ptb<vzv> i = this.i;
        if (i != null) {
            i.invoke();
        }
    }
    
    public final void k(final Map<Long, hfp> value) {
        ((cjq<Map<Long, hfp>>)this.l).setValue(value);
    }
    
    public final List<xep> l(final bwe bwe) {
        if (!this.a) {
            or4.g1((List)this.b, (Comparator)new pgp(bwe));
            this.a = true;
        }
        return this.b;
    }
}
