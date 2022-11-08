import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gt6
{
    public final String a;
    public final int b;
    public final long c;
    public final Collection<zwj> d;
    public final String e;
    public final moj f;
    public final boolean g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final List<fu6> t;
    public final zq6 u;
    
    public gt6(final a a) {
        final String a2 = a.a;
        pf8.q(a2);
        this.a = a2;
        this.e = a.e;
        this.b = a.b;
        this.c = a.c;
        this.g = a.g;
        this.h = a.h;
        this.i = a.i;
        this.j = a.j;
        this.k = a.k;
        this.l = a.l;
        this.m = a.m;
        this.n = a.n;
        this.f = a.f;
        this.d = nmp.r((Iterable)a.d);
        this.o = a.o;
        this.p = a.p;
        this.s = a.s;
        Object t;
        if ((t = a.t) == null) {
            t = v2a.C0;
        }
        this.t = (List<fu6>)t;
        this.q = a.q;
        this.r = a.r;
        this.u = a.u;
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
    
    public static final class a extends h4j<gt6>
    {
        public String a;
        public int b;
        public long c;
        public Collection<zwj> d;
        public String e;
        public moj f;
        public boolean g;
        public long h;
        public long i;
        public long j;
        public long k;
        public long l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public int s;
        public List<fu6> t;
        public zq6 u;
        
        public a() {
            this.b = -1;
            this.s = 0;
        }
        
        public a(final gt6 gt6) {
            this.b = -1;
            this.s = 0;
            this.a = gt6.a;
            this.b = gt6.b;
            this.c = gt6.c;
            this.d = gt6.d;
            this.e = gt6.e;
            this.f = gt6.f;
            this.g = gt6.g;
            this.h = gt6.h;
            this.i = gt6.i;
            this.j = gt6.j;
            this.k = gt6.k;
            this.l = gt6.l;
            this.m = gt6.m;
            this.o = gt6.o;
            this.p = gt6.p;
            this.s = gt6.s;
            this.q = gt6.q;
            this.r = gt6.r;
            this.u = gt6.u;
        }
        
        public final Object i() {
            return new gt6(this);
        }
        
        public final boolean l() {
            final boolean g = pjr.g((CharSequence)this.a);
            final boolean b = true;
            if (g) {
                final int b2 = this.b;
                boolean b3 = b;
                if (b2 == 0) {
                    return b3;
                }
                if (b2 == 1) {
                    b3 = b;
                    return b3;
                }
            }
            return false;
        }
        
        public final void m() {
            if (this.k <= 0L) {
                this.k = -1L;
            }
            final List<fu6> t = this.t;
            if (t != null) {
                this.t = hr4.e((Iterable)t, (otk)gj.f);
            }
        }
    }
}
