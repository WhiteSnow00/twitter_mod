import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vpw
{
    public static final alp<vpw> c;
    public static final vpw d;
    public final vpw$a a;
    public final c b;
    
    static {
        vpw.c = new b();
        d = new vpw(null, null);
    }
    
    public vpw(final vpw$a a, final c b) {
        if (a != null && b != null) {
            throw new IllegalArgumentException("Cannot have vendor info from 2 vendors");
        }
        this.a = a;
        this.b = b;
    }
    
    public static final class b extends s4j<vpw>
    {
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            final vpw$a.a b = vpw$a.b;
            Objects.requireNonNull(elp);
            return new vpw((vpw$a)b.a(elp), (c)vpw.c.f.a(elp));
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final vpw vpw = (vpw)o;
            final vpw$a a = vpw.a;
            final vpw$a.a b = vpw$a.b;
            Objects.requireNonNull(flp);
            b.c(flp, (Object)a);
            final int a2 = w4j.a;
            vpw.c.f.c(flp, (Object)vpw.b);
        }
    }
    
    public static final class c
    {
        public static final alp<c> f;
        public final String a;
        public final String b;
        public final String c;
        public final vpw$c$b d;
        public final int e;
        
        static {
            c.f = new a();
        }
        
        public c(final String a, final String b, final String c, final vpw$c$b d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public static final class a extends s4j<c>
        {
            public final Object d(final elp elp, int z) throws IOException, ClassNotFoundException {
                final String i = elp.I();
                String j = elp.I();
                final String k = elp.I();
                final hx6$h a = hx6.a;
                Object o = ((s4j)new ix6((Class)vpw$c$b.class)).a(elp);
                z = elp.z();
                String s = i;
                if (i == null) {
                    s = "";
                }
                if (j == null) {
                    j = "";
                }
                final vpw$c$b d0 = vpw$c$b.D0;
                if (o == null) {
                    o = d0;
                }
                return new c(s, j, k, (vpw$c$b)o, z);
            }
            
            public final void f(final flp flp, final Object o) throws IOException {
                final c c = (c)o;
                final flp g = flp.G(c.a).G(c.b).G(c.c);
                final vpw$c$b d = c.d;
                final hx6$h a = hx6.a;
                final ix6 ix6 = new ix6((Class)vpw$c$b.class);
                Objects.requireNonNull(g);
                ((s4j)ix6).c(g, (Object)d);
                final int a2 = w4j.a;
                g.z(c.e);
            }
        }
    }
}
