import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gk1
{
    public static final alp<gk1> f;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    
    static {
        gk1.f = (jx6)hx6.b(new pkp[] { new pkp((Class)jr7.class, (alp)new jr7$b()), new pkp((Class)a48.class, (alp)new a48$b()), new pkp((Class)ho7.class, (alp)new ho7$b()), new pkp((Class)bo7.class, (alp)new bo7$b()), new pkp((Class)g48.class, (alp)new g48$b()), new pkp((Class)ps7.class, (alp)new ps7$b()), new pkp((Class)s28.class, (alp)new s28$b()), new pkp((Class)jo7.class, (alp)new jo7$b()) });
    }
    
    public gk1(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
    }
    
    public abstract ig7 a();
    
    public boolean b() {
        return this.d != this.e;
    }
    
    public final boolean c() {
        return pjr.g((CharSequence)this.a) && pjr.g((CharSequence)this.b) && pjr.g((CharSequence)this.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof gk1)) {
                return b2;
            }
            final gk1 gk1 = (gk1)o;
            final boolean b3 = w4j.a((Object)this.a, (Object)gk1.a) && w4j.a((Object)this.b, (Object)gk1.b) && w4j.a((Object)this.c, (Object)gk1.c) && this.d == gk1.d && this.e == gk1.e;
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return w4j.j((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e);
    }
    
    public abstract static class a<E extends gk1, B extends a<E, B>> extends h4j<E>
    {
        public String a;
        public String b;
        public String c;
        public int d;
        public int e;
        
        public a() {
            this.d = -1;
            this.e = -1;
        }
    }
    
    public abstract static class b<E extends gk1, B extends a<E, B>> extends js2<E, B>
    {
        public b() {
            super(0);
        }
        
        public void i(final elp elp, final B b, int a) throws IOException, ClassNotFoundException {
            b.a = elp.I();
            a = w4j.a;
            b.b = elp.I();
            b.c = elp.I();
            b.d = elp.z();
            b.e = elp.z();
        }
        
        public void j(final flp flp, final E e) throws IOException {
            flp.G(e.a).G(e.b).G(e.c).z(e.d).z(e.e);
        }
    }
}
