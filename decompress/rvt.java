import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.UUID;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rvt
{
    public static final c Companion;
    public final ConcurrentHashMap<UUID, d> a;
    
    static {
        Companion = new c();
    }
    
    public rvt(final xq0 xq0, final gwo gwo, final xbm xbm) {
        czd.f((Object)xq0, "appLifecycle");
        czd.f((Object)gwo, "abortScheduler");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = (ConcurrentHashMap<UUID, d>)new ConcurrentHashMap();
        final wc6 wc6 = new wc6();
        wc6.a(xq0.f().observeOn(gwo).subscribe((lj6)new q9a((qsb)new rvt$a(this), 1)));
        wc6.a(xq0.x().n(gwo).q((oj)new pvt((Object)this, 0)));
        xbm.i((oj)new ovt(wc6, 0));
    }
    
    public final void a(final qsb<? super d, Boolean> qsb) {
        final Collection values = this.a.values();
        czd.e((Object)values, "registeredTraces.values");
        final ArrayList list = new ArrayList();
        for (final Object next : values) {
            final d d = (d)next;
            czd.e((Object)d, "it");
            if (qsb.invoke((Object)d)) {
                list.add(next);
            }
        }
        for (final d d2 : list) {
            if (d2.a.a0()) {
                d2.a.U(oir.G0);
            }
        }
    }
    
    public final void b() {
        final Collection values = this.a.values();
        czd.e((Object)values, "registeredTraces.values");
        final ArrayList list = new ArrayList();
        for (final Object next : values) {
            if (m1f.h(((d)next).b)) {
                list.add(next);
            }
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            ((d)iterator2.next()).a.cancel();
        }
    }
    
    public final void c(final z0k z0k, final int n) {
        da8.m(n, "registrationType");
        Objects.requireNonNull(rvt.Companion);
        final y0k y0k = (y0k)z0k;
        if (y0k.W() && n != 1) {
            this.a.put((Object)y0k.R().b, (Object)new d(z0k, n));
        }
    }
    
    public static final class c
    {
    }
    
    public static final class d
    {
        public final z0k a;
        public final int b;
        
        public d(final z0k a, final int b) {
            da8.m(b, "registrationType");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            return ib0.E(this.b) + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final z0k a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("RegisteredTrace(trace=");
            sb.append(a);
            sb.append(", registrationType=");
            sb.append(m1f.q(b));
            sb.append(")");
            return sb.toString();
        }
    }
}
