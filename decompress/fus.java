import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fus
{
    public static final b d;
    public final int a;
    public final String b;
    public final String c;
    
    static {
        d = new b();
    }
    
    public fus(final fus$a fus$a) {
        this.a = fus$a.a;
        this.b = fus$a.b;
        this.c = fus$a.c;
    }
    
    public static final class b extends zr2<fus, fus$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final fus fus = (fus)o;
            wlp.x(fus.a).E(fus.b).E(fus.c);
        }
        
        public final n4j g() {
            return (n4j)new fus$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final fus$a fus$a = (fus$a)n4j;
            fus$a.a = vlp.x();
            fus$a.b = vlp.G();
            fus$a.c = vlp.G();
        }
    }
}
