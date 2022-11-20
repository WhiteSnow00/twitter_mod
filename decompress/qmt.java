import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmt
{
    public static final rlp<qmt> f;
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    
    static {
        qmt.f = new b();
    }
    
    public qmt(final a a) {
        final String a2 = a.a;
        jee.l((Object)a2);
        this.a = a2;
        this.b = a.b;
        final String c = a.c;
        jee.l((Object)c);
        this.c = c;
        this.d = a.d;
        this.e = a.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && qmt.class == o.getClass()) {
            final int a = c5j.a;
            final qmt qmt = (qmt)o;
            if (!c5j.a((Object)this.a, (Object)qmt.a) || !c5j.a((Object)this.b, (Object)qmt.b) || !c5j.a((Object)this.c, (Object)qmt.c) || !c5j.a((Object)this.d, (Object)qmt.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.i((Object)this.a, (Object)this.c, (Object)this.b, (Object)this.d);
    }
    
    public static final class a extends n4j<qmt>
    {
        public String a;
        public long b;
        public String c;
        public String d;
        public int e;
        
        public a() {
            this.e = 1;
        }
        
        public final Object i() {
            this.b = c5j.f((Object)this.a);
            return new qmt(this);
        }
        
        public final boolean l() {
            return ikr.g((CharSequence)this.a) && ikr.g((CharSequence)this.c);
        }
    }
    
    public static final class b extends zr2<qmt, a>
    {
        public b() {
            super(1);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final qmt qmt = (qmt)o;
            wlp.E(qmt.a).E(qmt.c).E(qmt.d).x(qmt.e);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            a.a = vlp.A();
            a.c = vlp.A();
            a.d = vlp.G();
            if (n < 1) {
                a.e = 1;
            }
            else {
                a.e = vlp.x();
            }
        }
    }
}
