// 
// Decompiled by Procyon v0.6.0
// 

public final class fib implements zwv
{
    public static final fib.fib$b Companion;
    public final qgv b;
    public final ls8 c;
    public final mba d;
    
    static {
        Companion = new fib.fib$b();
    }
    
    public fib(final qgv b, final ls8 c) {
        final mba p2 = mba.P0;
        this.b = b;
        this.c = c;
        this.d = p2;
    }
    
    public final ls8 a() {
        return this.c;
    }
    
    public final mba getName() {
        return this.d;
    }
    
    public static final class a extends zwv$a<fib, a>
    {
        public qgv b;
        
        public a() {
            this(null, 1, null);
        }
        
        public a(final qgv qgv, final int n, final wg8 wg8) {
            super((ls8)null, 1, (wg8)null);
            this.b = null;
        }
        
        public final Object i() {
            final qgv b = this.b;
            e0e.c((Object)b);
            return new fib(b, super.a);
        }
        
        public final boolean k() {
            return this.b != null;
        }
    }
}
