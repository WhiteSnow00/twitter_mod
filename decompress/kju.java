import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kju
{
    public static final kju h;
    public static final js2<kju, a> i;
    public final p7a<w5w> a;
    public final p7a<h4h> b;
    public final p7a<qgc> c;
    public final p7a<gn3> d;
    public final p7a<hvd> e;
    public final fzv f;
    public final pug g;
    
    static {
        h = (kju)new a().e();
        kju.i = new b();
    }
    
    public kju(final a a) {
        this.a = (p7a<w5w>)((h4j)a.a).e();
        this.g = (pug)((h4j)a.b).e();
        this.b = (p7a<h4h>)((h4j)a.c).e();
        this.c = (p7a<qgc>)((h4j)a.d).e();
        this.d = (p7a<gn3>)((h4j)a.e).e();
        this.e = (p7a<hvd>)((h4j)a.f).e();
        this.f = a.g;
    }
    
    public static final Iterable<d7a> c(final kju kju) {
        return (Iterable<d7a>)new o5e(new Iterable[] { (Iterable)kju.a, (Iterable)kju.g, (Iterable)kju.b, (Iterable)kju.c, (Iterable)kju.d, (Iterable)kju.e });
    }
    
    public static int d(final CharSequence charSequence, final kju kju) {
        final int length = charSequence.length();
        final Iterable<d7a> c = c(kju);
        final nmp x = nmp.x();
        final Iterator iterator = ((o5e)c).iterator();
        while (((q5e)iterator).hasNext()) {
            final d7a d7a = (d7a)((bgz)iterator).next();
            x.o((Object)new ewl(d7a.D0, d7a.E0));
        }
        final Iterator iterator2 = ((Set)((h4j)x).e()).iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            final ewl ewl = (ewl)iterator2.next();
            if (ewl.C0 < length) {
                n += Math.max(0, Math.min(length, ewl.D0) - ewl.C0);
            }
        }
        return length - n;
    }
    
    public final boolean a(final kju kju) {
        return this == kju || (kju != null && this.a.equals((Object)kju.a) && ((p7a)this.g).equals((Object)kju.g) && this.b.equals((Object)kju.b) && this.c.equals((Object)kju.c) && this.d.equals((Object)kju.d));
    }
    
    public final Iterable<w5w> b() {
        return (Iterable<w5w>)new n5e((Iterable)this.a, (Iterable)this.g, (Comparator)d7a.G0);
    }
    
    public final h4h e(final long n) {
        for (final h4h h4h : this.b) {
            if (h4h.H0 == n) {
                return h4h;
            }
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kju && this.a((kju)o));
    }
    
    public final p7a<h4h> f() {
        final fzv f = this.f;
        if (f == null) {
            return this.b;
        }
        final p7a<h4h> b = this.b;
        Objects.requireNonNull(f);
        zzd.f((Object)b, "mentions");
        final ArrayList list = new ArrayList();
        for (final Object next : b) {
            if (f.a(((h4h)next).H0) ^ true) {
                list.add(next);
            }
        }
        final p7a e = p7a.e((List)list);
        zzd.e((Object)e, "build(\n            menti\u2026)\n            }\n        )");
        return (p7a<h4h>)e;
    }
    
    public final boolean g() {
        return this.c.isEmpty() ^ true;
    }
    
    public final boolean h() {
        return !this.a.isEmpty() || !((p7a)this.g).isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + (((p7a)this.g).hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(";");
        sb.append(this.g);
        sb.append(";");
        sb.append(this.b);
        sb.append(";");
        sb.append(this.c);
        sb.append(";");
        sb.append(this.d);
        return sb.toString();
    }
    
    public static final class a extends h4j<kju>
    {
        public final p7a$b<w5w> a;
        public final pug$a b;
        public final p7a$b<h4h> c;
        public final p7a$b<qgc> d;
        public final p7a$b<gn3> e;
        public final p7a$b<hvd> f;
        public fzv g;
        
        public a() {
            this.a = (p7a$b<w5w>)new p7a$b();
            this.b = new pug$a();
            this.c = (p7a$b<h4h>)new p7a$b();
            this.d = (p7a$b<qgc>)new p7a$b();
            this.e = (p7a$b<gn3>)new p7a$b();
            this.f = (p7a$b<hvd>)new p7a$b();
        }
        
        public a(final kju kju) {
            this.a = (p7a$b<w5w>)new p7a$b((p7a)kju.a);
            this.b = new pug$a(kju.g);
            this.c = (p7a$b<h4h>)new p7a$b((p7a)kju.b);
            this.d = (p7a$b<qgc>)new p7a$b((p7a)kju.c);
            this.e = (p7a$b<gn3>)new p7a$b((p7a)kju.d);
            this.f = (p7a$b<hvd>)new p7a$b((p7a)kju.e);
            this.g = kju.f;
        }
        
        public final Object i() {
            return new kju(this);
        }
        
        public final a o(final Collection<d7a> collection) {
            for (final d7a d7a : collection) {
                if (d7a instanceof h4h) {
                    ((p7a.a<h4h, p7a, p7a.a>)this.c).p((h4h)d7a);
                }
                else if (d7a instanceof qgc) {
                    this.p((qgc)d7a);
                }
                else if (d7a instanceof gn3) {
                    ((p7a.a<gn3, p7a, p7a.a>)this.e).p((gn3)d7a);
                }
                else if (d7a instanceof dtg) {
                    ((p7a.a<dtg, p7a, p7a.a>)this.b).p((dtg)d7a);
                }
                else {
                    if (!(d7a instanceof w5w)) {
                        continue;
                    }
                    this.q((w5w)d7a);
                }
            }
            return this;
        }
        
        public final a p(final qgc qgc) {
            ((p7a.a<qgc, p7a, p7a.a>)this.d).p(qgc);
            return this;
        }
        
        public final a q(final w5w w5w) {
            ((p7a.a<w5w, p7a, p7a.a>)this.a).p(w5w);
            return this;
        }
        
        public final a r(final w5w w5w) {
            final p7a$b<w5w> a = this.a;
            if (((p7a.a)a).b != null || ((p7a.a)a).a.C0.contains(w5w)) {
                ((p7a.a<d7a, p7a, p7a.a>)a).u().M((Object)w5w);
            }
            final int a2 = w4j.a;
            return this;
        }
        
        public final a s(final p7a<hvd> p7a) {
            ((p7a.a<d7a, p7a<hvd>, p7a.a>)this.f).v(p7a);
            return this;
        }
        
        public final a t(final pug pug) {
            ((p7a.a<d7a, pug, p7a.a>)this.b).v(pug);
            return this;
        }
    }
    
    public static final class b extends js2<kju, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final kju kju = (kju)o;
            ((s4j)w5w.L0).c(flp, (Object)kju.a);
            ((s4j)dtg.p1).c(flp, (Object)kju.g);
            ((s4j)h4h.L0).c(flp, (Object)kju.b);
            ((s4j)qgc.J0).c(flp, (Object)kju.c);
            ((s4j)gn3.J0).c(flp, (Object)kju.d);
            ((s4j)hvd.K0).c(flp, (Object)kju.e);
            ((s4j)fzv.b).c(flp, (Object)kju.f);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            ((p7a.a<d7a, p7a, p7a.a>)a.a).v((p7a)((s4j)w5w.L0).a(elp));
            ((p7a.a<d7a, pug, p7a.a>)a.b).v((pug)((s4j)dtg.p1).a(elp));
            ((p7a.a<d7a, p7a, p7a.a>)a.c).v((p7a)((s4j)h4h.L0).a(elp));
            ((p7a.a<d7a, p7a, p7a.a>)a.d).v((p7a)((s4j)qgc.J0).a(elp));
            ((p7a.a<d7a, p7a, p7a.a>)a.e).v((p7a)((s4j)gn3.J0).a(elp));
            ((p7a.a<d7a, p7a, p7a.a>)a.f).v((p7a)((s4j)hvd.K0).a(elp));
            a.g = (fzv)((s4j)fzv.b).a(elp);
        }
    }
}
