import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opf
{
    public static final nmp<opf> k;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final Long h;
    public final Boolean i;
    public final qgv j;
    
    static {
        opf.k = (tx6)rx6.b(new cmp[] { new cmp((Class)opf.class, (nmp)new b()) });
    }
    
    public opf(final opf$a opf$a) {
        this.a = opf$a.a;
        this.b = opf$a.b;
        this.c = opf$a.c;
        this.d = opf$a.d;
        this.e = opf$a.e;
        this.f = opf$a.f;
        this.g = opf$a.g;
        this.h = opf$a.h;
        this.i = opf$a.i;
        this.j = opf$a.j;
    }
    
    public final boolean a() {
        if (Objects.equals(this.c, "ENDED")) {
            final Boolean i = this.i;
            if (i != null && i) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean b() {
        return Objects.equals(this.c, "NOT_STARTED") && this.h != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && opf.class == o.getClass()) {
            final opf opf = (opf)o;
            if (!this.a.equals(opf.a) || !Objects.equals(this.b, opf.b) || !Objects.equals(this.c, opf.c) || !Objects.equals(this.d, opf.d) || !Objects.equals(this.e, opf.e) || !Objects.equals(this.f, opf.f) || !Objects.equals(this.g, opf.g) || !Objects.equals(this.h, opf.h) || !Objects.equals(this.i, opf.i) || !Objects.equals(this.j, opf.j)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.o((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.f, (Object)this.g, (Object)this.h, (Object)this.i, (Object)this.j);
    }
    
    public static final class b extends k5j<opf>
    {
        public final Object d(final rmp rmp, int z) throws IOException, ClassNotFoundException {
            final String c = rmp.C();
            final String i = rmp.I();
            final String j = rmp.I();
            final String k = rmp.I();
            final String l = rmp.I();
            z = rmp.z();
            final int z2 = rmp.z();
            final long a = rmp.A();
            final boolean u = rmp.u();
            final qgv m = (qgv)((k5j)qgv.P1).a(rmp);
            final opf$a opf$a = new opf$a(c);
            opf$a.b = i;
            opf$a.c = j;
            opf$a.d = k;
            opf$a.e = l;
            opf$a.f = z;
            opf$a.g = z2;
            opf$a.h = a;
            opf$a.i = u;
            opf$a.j = m;
            return new opf(opf$a);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final opf opf = (opf)o;
            smp.G(opf.a).G(opf.b).G(opf.c).G(opf.d).G(opf.e).C((Object)opf.j, (nmp)qgv.P1);
            final Integer f = opf.f;
            if (f == null) {
                smp.B();
            }
            else {
                smp.z((int)f);
            }
            final Integer g = opf.g;
            if (g == null) {
                smp.B();
            }
            else {
                smp.z((int)g);
            }
            final Boolean i = opf.i;
            if (i == null) {
                smp.B();
            }
            else {
                smp.t((boolean)i);
            }
            final Long h = opf.h;
            if (h == null) {
                smp.B();
            }
            else {
                smp.A((long)h);
            }
        }
    }
}
