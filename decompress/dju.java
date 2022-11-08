import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dju
{
    public final g6j a;
    public final ldk<Long, a> b;
    public final qvo c;
    
    public dju(final g6j<ciu> a) {
        this.c = xw0.b();
        this.a = a;
        final ldk b = new ldk(64);
        this.b = (ldk<Long, a>)b;
        ((b5j)b.a).subscribe((fk6)new cju((Object)this, 0));
        ((yiu)a).b.subscribe((fk6)new bju(this, 0));
    }
    
    public final void a() {
        Object b = this.b;
        synchronized (b) {
            final List u = ijf.u((Iterable)this.b.b);
            monitorexit(b);
            b = new m5e((Iterable)u, (kub)nr9.D);
            xw0.d(this.c, (rj)new it1((Object)this, b, 7));
        }
    }
    
    public final b5j<ciu> b(final Long n, final ciu ciu) {
        synchronized (this) {
            synchronized (this.b) {
                final a a = (a)this.b.get((Object)n);
                if (a != null) {
                    return a.d;
                }
                final a a2 = new a(n);
                this.b.put((Object)n, (Object)a2);
                xw0.d(this.c, (rj)new l6p((Object)this, (Object)a2, 7));
                b5j b5j;
                if (ciu == null) {
                    b5j = a2.d;
                }
                else {
                    b5j = a2.d.startWith((Object)ciu);
                }
                return (b5j<ciu>)b5j;
            }
        }
    }
    
    public final void c(final ciu ciu) {
        synchronized (this.b) {
            xw0.d(this.c, (rj)new aju(this, (a)this.b.b.e((Object)ciu.C0), ciu));
        }
    }
    
    public final class a
    {
        public final Long a;
        public int b;
        public final rv1<ciu> c;
        public final b5j<ciu> d;
        public final dju$a$c e;
        public ciu$a f;
        public boolean g;
        
        public a(final Long a) {
            final rv1 c = new rv1();
            this.c = (rv1<ciu>)c;
            this.d = (b5j<ciu>)((b5j)c).doOnSubscribe((fk6)new dju$a$b(this)).doOnDispose((rj)new dju$a$a(this));
            this.e = new dju$a$c(this);
            this.a = a;
        }
        
        public final ciu a() {
            final ciu$a f = this.f;
            ciu ciu;
            if (f == null) {
                ciu = null;
            }
            else {
                ciu = (ciu)((h4j)f).e();
            }
            return ciu;
        }
        
        public final void b(final ciu ciu, final b b) {
            final ciu$a f = this.f;
            pf8.r(f);
            boolean b2;
            if (b.d(ciu.D0, f.b)) {
                f.b = ciu.D0;
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b.d(ciu.E0, f.c)) {
                f.c = ciu.E0;
                b2 = true;
            }
            if (b.d(ciu.F0, f.d)) {
                f.d = ciu.F0;
                b2 = true;
            }
            if (b.d(ciu.G0, f.e)) {
                f.e = ciu.G0;
                b2 = true;
            }
            if (b2) {
                this.g = true;
                xw0.d(h6q.C(), (rj)this.e);
            }
        }
    }
    
    public interface b
    {
        boolean d(final int p0, final int p1);
    }
}
