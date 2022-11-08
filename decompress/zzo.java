import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zzo extends kkg
{
    public static final alp<zzo> b;
    
    static {
        zzo.b = new b();
    }
    
    public zzo() {
        super(1);
    }
    
    public zzo(final zzo$a zzo$a) {
        super(1);
        final wzo a = zzo$a.a;
        if (a != null) {
            this.d(0, (Object)a);
        }
    }
    
    public final String c(final int n) {
        return "media_details";
    }
    
    public static final class b extends js2<zzo, zzo$a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            flp.C(((zzo)o).a.get(0), (alp)wzo.b);
        }
        
        public final h4j g() {
            return (h4j)new zzo$a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final zzo$a zzo$a = (zzo$a)h4j;
            final wzo$b b = wzo.b;
            Objects.requireNonNull(elp);
            zzo$a.a = (wzo)((s4j)b).a(elp);
        }
    }
}
