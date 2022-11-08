import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxm implements xes
{
    public static final b E0;
    public final String C0;
    public final long D0;
    
    static {
        E0 = new b();
    }
    
    public gxm(final a a) {
        this.C0 = a.a;
        this.D0 = a.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("RichTextMentionEntity{text='");
        jhd.k(g, this.C0, '\'', ", userId=");
        g.append(this.D0);
        g.append('}');
        return g.toString();
    }
    
    public static final class a extends h4j<gxm>
    {
        public String a;
        public long b;
        
        public final Object i() {
            return new gxm(this);
        }
    }
    
    public static final class b extends js2<gxm, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final gxm gxm = (gxm)o;
            flp.G(gxm.C0);
            flp.A(gxm.D0);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            a.a = elp.I();
            a.b = elp.A();
        }
    }
}
