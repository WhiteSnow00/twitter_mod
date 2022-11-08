import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tbp
{
    public static final b2r d;
    public static final b2r e;
    public final List<a> a;
    public int b;
    public int c;
    
    static {
        d = new b2r((b2r$b)new a2r((st3)new st3$b(':')));
        e = new b2r((b2r$b)new a2r((st3)new st3$b('*')));
    }
    
    public tbp() {
        this.a = new ArrayList();
        this.b = 0;
    }
    
    public static final class a
    {
        public final long a;
        public final int b;
        
        public a(final long a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
