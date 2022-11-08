import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfp implements afp
{
    public boolean a;
    public final List<jdp> b;
    public final Map<Long, jdp> c;
    public AtomicLong d;
    public rtb<? super Long, oyv> e;
    public jub<? super sve, ? super qfj, ? super vdp, oyv> f;
    public rtb<? super Long, oyv> g;
    public nub<? super sve, ? super qfj, ? super qfj, ? super Boolean, ? super vdp, Boolean> h;
    public otb<oyv> i;
    public rtb<? super Long, oyv> j;
    public rtb<? super Long, oyv> k;
    public final cwj l;
    
    public cfp() {
        this.b = new ArrayList();
        this.c = new LinkedHashMap();
        this.d = new AtomicLong(1L);
        this.l = (cwj)nkz.r((Object)a3a.C0);
    }
    
    public final long a() {
        long n;
        for (n = this.d.getAndIncrement(); n == 0L; n = this.d.getAndIncrement()) {}
        return n;
    }
    
    public final void b(final sve sve, final long n) {
        final vdp$a$e d = vdp.a.d;
        final jub<? super sve, ? super qfj, ? super vdp, oyv> f = this.f;
        if (f != null) {
            f.h0((Object)sve, (Object)new qfj(n), (Object)d);
        }
    }
    
    public final Map<Long, tdp> c() {
        return (Map)((nhq)this.l).getValue();
    }
    
    public final void d(final long n) {
        this.a = false;
        final rtb<? super Long, oyv> e = this.e;
        if (e != null) {
            e.invoke((Object)n);
        }
    }
    
    public final void e(final jdp jdp) {
        if (!this.c.containsKey(jdp.f())) {
            return;
        }
        this.b.remove(jdp);
        this.c.remove(jdp.f());
        final rtb<? super Long, oyv> k = this.k;
        if (k != null) {
            k.invoke((Object)jdp.f());
        }
    }
    
    public final boolean f(final sve sve, final long n, final long n2) {
        final vdp$a$b f = vdp.a.f;
        final nub<? super sve, ? super qfj, ? super qfj, ? super Boolean, ? super vdp, Boolean> h = this.h;
        return h == null || (boolean)h.y0((Object)sve, (Object)new qfj(n), (Object)new qfj(n2), (Object)Boolean.FALSE, (Object)f);
    }
    
    public final void g(final long n) {
        final rtb<? super Long, oyv> j = this.j;
        if (j != null) {
            j.invoke((Object)n);
        }
    }
    
    public final jdp h(final jdp jdp) {
        final rsh rsh = (rsh)jdp;
        final long a = rsh.a;
        if (a == 0L) {
            final StringBuilder g = w48.g("The selectable contains an invalid id: ");
            g.append(rsh.a);
            throw new IllegalArgumentException(g.toString().toString());
        }
        if (this.c.containsKey(a) ^ true) {
            this.c.put(rsh.a, jdp);
            this.b.add(jdp);
            this.a = false;
            return jdp;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Another selectable with the id: ");
        sb.append(jdp);
        sb.append(".selectableId has already subscribed.");
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void i(final long n) {
        final rtb<? super Long, oyv> g = this.g;
        if (g != null) {
            g.invoke((Object)n);
        }
    }
    
    public final void j() {
        final otb<oyv> i = this.i;
        if (i != null) {
            i.invoke();
        }
    }
    
    public final void k(final Map<Long, tdp> value) {
        ((nhq)this.l).setValue((Object)value);
    }
    
    public final List<jdp> l(final sve sve) {
        if (!this.a) {
            lr4.k1((List)this.b, (Comparator)new bfp(sve));
            this.a = true;
        }
        return this.b;
    }
}
