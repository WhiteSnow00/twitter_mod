// 
// Decompiled by Procyon v0.6.0
// 

public final class brf
{
    public final iqf a;
    public final w19 b;
    public final w19 c;
    public final gyw d;
    public final od6 e;
    public final gwo f;
    public final gwo g;
    public a h;
    
    public brf(final iqf a, final gyw d, final od6 e, final gwo f, final gwo g) {
        this.b = new w19();
        this.c = new w19();
        this.h = brf.a.P;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public interface a
    {
        public static final brf$a$a P = new a() {
            @Override
            public final void b(final jqf jqf) {
            }
            
            @Override
            public final void e(final bzf bzf) {
            }
            
            @Override
            public final void g(final bzf bzf) {
            }
            
            @Override
            public final void m() {
            }
        };
        
        void b(final jqf p0);
        
        void e(final bzf p0);
        
        void g(final bzf p0);
        
        void m();
    }
}
