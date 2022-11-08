import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g94 implements prd
{
    public final List<String> b;
    public final String c;
    
    public g94(final a a) {
        this.b = a.a;
        this.c = a.b;
    }
    
    public static final class a extends h4j<g94>
    {
        public List<String> a;
        public String b;
        
        public final Object i() {
            return new g94(this);
        }
    }
    
    public static final class b extends js2<g94, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final g94 g94 = (g94)o;
            final List<String> b = g94.b;
            final xq4$a xq4$a = new xq4$a((alp)hx6.f);
            Objects.requireNonNull(flp);
            ((s4j)xq4$a).c(flp, (Object)b);
            final int a = w4j.a;
            flp.G(g94.c);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            final xq4$a xq4$a = new xq4$a((alp)hx6.f);
            Objects.requireNonNull(elp);
            a.a = (List)((s4j)xq4$a).a(elp);
            a.b = elp.I();
        }
    }
}
