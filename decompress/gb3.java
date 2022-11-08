import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gb3
{
    public static final alp<gb3> g;
    public final yb3 a;
    public final jev b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    
    static {
        gb3.g = new b();
    }
    
    public gb3(final a a) {
        final yb3 a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        final jev b = a.b;
        pf8.r(b);
        this.b = b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
    }
    
    public static final class a extends h4j<gb3>
    {
        public yb3 a;
        public jev b;
        public boolean c;
        public boolean d;
        public boolean e;
        public boolean f;
        
        public a() {
            final yb3$a yb3$a = new yb3$a();
            yb3$a.a = (uvw)uvw$d.h;
            yb3$a.b = (hof)hof$d.g;
            this.a = (yb3)((h4j)yb3$a).e();
            this.c = false;
            this.d = true;
            this.e = true;
            this.f = true;
        }
        
        public final Object i() {
            return new gb3(this);
        }
        
        public final boolean l() {
            return this.b != null;
        }
    }
    
    public static final class b extends js2<gb3, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final gb3 gb3 = (gb3)o;
            flp.C((Object)gb3.a, (alp)yb3.g);
            flp.C((Object)gb3.b, (alp)jev.i);
            flp.t(gb3.c);
            flp.t(gb3.d);
            flp.t(gb3.e);
            flp.t(gb3.f);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            a.a = (yb3)elp.B((alp)yb3.g);
            a.b = (jev)elp.B((alp)jev.i);
            a.c = elp.u();
            a.d = elp.u();
            a.e = elp.u();
            a.f = elp.u();
        }
    }
}
