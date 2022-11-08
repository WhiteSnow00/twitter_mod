import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.UUID;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvt
{
    public static final c Companion;
    public final ConcurrentHashMap<UUID, d> a;
    
    static {
        Companion = new c();
    }
    
    public bvt(final er0 er0, final qvo qvo, final ibm ibm) {
        zzd.f((Object)er0, "appLifecycle");
        zzd.f((Object)qvo, "abortScheduler");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = (ConcurrentHashMap<UUID, d>)new ConcurrentHashMap();
        final rd6 rd6 = new rd6();
        rd6.a(er0.f().observeOn(qvo).subscribe((fk6)new iaa((rtb)new bvt$a(this), 1)));
        rd6.a(er0.x().n(qvo).q((rj)new zut((Object)this, 0)));
        ibm.i((rj)new yut(rd6, 0));
    }
    
    public final void a(final rtb<? super d, Boolean> rtb) {
        final Collection values = this.a.values();
        zzd.e((Object)values, "registeredTraces.values");
        final ArrayList list = new ArrayList();
        for (final Object next : values) {
            final d d = (d)next;
            zzd.e((Object)d, "it");
            if (rtb.invoke((Object)d)) {
                list.add(next);
            }
        }
        for (final d d2 : list) {
            if (d2.a.a0()) {
                d2.a.U(uhr.F0);
            }
        }
    }
    
    public final void b() {
        final Collection values = this.a.values();
        zzd.e((Object)values, "registeredTraces.values");
        final ArrayList list = new ArrayList();
        for (final Object next : values) {
            if (xpa.f(((d)next).b)) {
                list.add(next);
            }
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            ((d)iterator2.next()).a.cancel();
        }
    }
    
    public final void c(final v0k v0k, final int n) {
        k1b.i(n, "registrationType");
        Objects.requireNonNull(bvt.Companion);
        final u0k u0k = (u0k)v0k;
        if (u0k.W() && n != 1) {
            this.a.put((Object)u0k.R().b, (Object)new d(v0k, n));
        }
    }
    
    public static final class c
    {
    }
    
    public static final class d
    {
        public final v0k a;
        public final int b;
        
        public d(final v0k a, final int b) {
            k1b.i(b, "registrationType");
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
            return zzd.a((Object)this.a, (Object)d.a) && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            return nb0.D(this.b) + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final v0k a = this.a;
            final int b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("RegisteredTrace(trace=");
            sb.append(a);
            sb.append(", registrationType=");
            sb.append(xpa.u(b));
            sb.append(")");
            return sb.toString();
        }
    }
}
