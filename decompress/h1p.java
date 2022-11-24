import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1p extends blg
{
    public static final nmp<h1p> b;
    
    static {
        h1p.b = new b();
    }
    
    public h1p() {
        super(1);
    }
    
    public h1p(final h1p$a h1p$a) {
        super(1);
        this.d(0, (Object)h1p$a.a);
    }
    
    public final String c(final int n) {
        return "photo_count";
    }
    
    public static final class b extends ss2<h1p, h1p$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            smp.z((int)((h1p)o).a.get(0));
        }
        
        public final z4j g() {
            return (z4j)new h1p$a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) throws IOException, ClassNotFoundException {
            ((h1p$a)z4j).a = rmp.z();
        }
    }
}
