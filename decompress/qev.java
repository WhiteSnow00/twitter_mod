import java.io.IOException;
import java.util.Objects;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qev
{
    public static final zr2<qev, a> m;
    public final String a;
    public final b b;
    public final String c;
    public final pqw d;
    public final String e;
    public final ya2 f;
    public final dv6 g;
    public final String h;
    public final String i;
    public final qev j;
    public final String k;
    public final String l;
    
    static {
        qev.m = new c();
    }
    
    public qev(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        this.h = a.h;
        this.i = a.i;
        this.j = a.j;
        this.k = a.k;
        this.l = a.l;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qev)) {
            return false;
        }
        final qev qev = (qev)o;
        final String a = this.a;
        final String a2 = qev.a;
        final Pattern a3 = ikr.a;
        return czd.a((Object)a, (Object)a2);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TwitterPlace { id: ");
        j.append(this.a);
        j.append(", fullname: ");
        return ed.B(j, this.c, " }");
    }
    
    public static final class a extends n4j<qev>
    {
        public String a;
        public b b;
        public String c;
        public pqw d;
        public String e;
        public ya2 f;
        public dv6 g;
        public String h;
        public String i;
        public qev j;
        public String k;
        public String l;
        
        public a() {
            this.a = "";
            this.b = b.F0;
            this.c = "";
            this.d = pqw.d;
        }
        
        public final Object i() {
            return new qev(this);
        }
    }
    
    public enum b
    {
        E0("poi"), 
        F0("unknown");
        
        public static final b[] G0;
        public final String D0;
        
        public b(final String d0) {
            this.D0 = d0;
        }
        
        @Override
        public final String toString() {
            return this.D0;
        }
    }
    
    public static final class c extends zr2<qev, a>
    {
        public c() {
            super(0);
        }
        
        public final void f(wlp wlp, final Object o) throws IOException {
            final qev qev = (qev)o;
            final wlp e = wlp.E(qev.a);
            final b b = qev.b;
            final lw6$h a = lw6.a;
            final mw6 mw6 = new mw6((Class)b.class);
            Objects.requireNonNull(e);
            ((y4j)mw6).c(e, (Object)b);
            final int a2 = c5j.a;
            wlp = e.E(qev.c).E(qev.e);
            final ya2 f = qev.f;
            final ya2$a b2 = ya2.b;
            Objects.requireNonNull(wlp);
            ((y4j)b2).c(wlp, (Object)f);
            ((y4j)dv6.c).c(wlp, (Object)qev.g);
            final wlp e2 = wlp.E(qev.h).E(qev.i);
            final qev j = qev.j;
            final c m = qev.m;
            Objects.requireNonNull(e2);
            ((y4j)m).c(e2, (Object)j);
            wlp = e2.E(qev.k).E(qev.l);
            final pqw d = qev.d;
            final pqw.b c = pqw.c;
            Objects.requireNonNull(wlp);
            c.c(wlp, (Object)d);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            final String g = vlp.G();
            final String a2 = a.a;
            String a3 = g;
            if (g == null) {
                a3 = a2;
            }
            a.a = a3;
            final lw6$h a4 = lw6.a;
            final b b = (b)((rlp)new mw6((Class)b.class)).b(vlp);
            final b b2 = a.b;
            b b3;
            if ((b3 = b) == null) {
                b3 = b2;
            }
            a.b = b3;
            final String g2 = vlp.G();
            final String c = a.c;
            String c2;
            if ((c2 = g2) == null) {
                c2 = c;
            }
            a.c = c2;
            a.e = vlp.G();
            a.f = (ya2)((y4j)ya2.b).a(vlp);
            a.g = (dv6)((y4j)dv6.c).a(vlp);
            a.h = vlp.G();
            a.i = vlp.G();
            a.j = (qev)((y4j)qev.m).a(vlp);
            a.k = vlp.G();
            a.l = vlp.G();
            final pqw pqw = (pqw)pqw.c.a(vlp);
            final pqw d = a.d;
            pqw d2;
            if ((d2 = pqw) == null) {
                d2 = d;
            }
            a.d = d2;
        }
    }
}
