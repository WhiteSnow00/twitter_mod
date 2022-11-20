import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xju
{
    public final m6j a;
    public final rdk<Long, a> b;
    public final gwo c;
    
    public xju(final m6j<wiu> a) {
        this.c = rw0.b();
        this.a = a;
        final rdk b = new rdk(64);
        this.b = (rdk<Long, a>)b;
        ((h5j)b.a).subscribe((lj6)new rb2((Object)this, 25));
        ((uju)a).b.subscribe((lj6)new wju(this, 0));
    }
    
    public final void a() {
        Object b = this.b;
        synchronized (b) {
            final List u = rif.u((Iterable)this.b.b);
            monitorexit(b);
            b = new s4e((Iterable)u, (jtb)ofe.g);
            rw0.d(this.c, (oj)new vs2((Object)this, b, 7));
        }
    }
    
    public final h5j<wiu> b(final Long n, final wiu wiu) {
        synchronized (this) {
            synchronized (this.b) {
                final a a = (a)this.b.get((Object)n);
                if (a != null) {
                    return a.d;
                }
                final a a2 = new a(n);
                this.b.put((Object)n, (Object)a2);
                rw0.d(this.c, (oj)new coa((Object)this, (Object)a2, 9));
                h5j h5j;
                if (wiu == null) {
                    h5j = a2.d;
                }
                else {
                    h5j = a2.d.startWith((Object)wiu);
                }
                return (h5j<wiu>)h5j;
            }
        }
    }
    
    public final void c(final wiu wiu) {
        synchronized (this.b) {
            rw0.d(this.c, (oj)new s4g((Object)this, (Object)this.b.b.e((Object)wiu.D0), (Object)wiu, 3));
        }
    }
    
    public final class a
    {
        public final Long a;
        public int b;
        public final mv1<wiu> c;
        public final h5j<wiu> d;
        public final xju$a$c e;
        public wiu$a f;
        public boolean g;
        public final xju h;
        
        public a(final xju h, final Long a) {
            this.h = h;
            final mv1 c = new mv1();
            this.c = (mv1<wiu>)c;
            this.d = (h5j<wiu>)((h5j)c).doOnSubscribe((lj6)new xju$a$b(this)).doOnDispose((oj)new xju$a$a(this));
            this.e = new xju$a$c(this);
            this.a = a;
        }
        
        public final wiu a() {
            final wiu$a f = this.f;
            wiu wiu;
            if (f == null) {
                wiu = null;
            }
            else {
                wiu = (wiu)((n4j)f).e();
            }
            return wiu;
        }
        
        public final void b(final wiu wiu, final b b) {
            final wiu$a f = this.f;
            jee.l((Object)f);
            boolean b2;
            if (b.h(wiu.E0, f.b)) {
                f.b = wiu.E0;
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b.h(wiu.F0, f.c)) {
                f.c = wiu.F0;
                b2 = true;
            }
            if (b.h(wiu.G0, f.d)) {
                f.d = wiu.G0;
                b2 = true;
            }
            if (b.h(wiu.H0, f.e)) {
                f.e = wiu.H0;
                b2 = true;
            }
            if (b2) {
                this.g = true;
                rw0.d(gmw.x(), (oj)this.e);
            }
        }
    }
    
    public interface b
    {
        boolean h(final int p0, final int p1);
    }
}
