import com.facebook.imagepipeline.request.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g8d extends lp1
{
    public final zph a;
    public final h8d b;
    
    public g8d(final zph a, final h8d b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final a c, final Object d, final String b, final boolean r) {
        this.b.n = this.a.now();
        final h8d b2 = this.b;
        b2.c = c;
        b2.d = d;
        b2.b = b;
        b2.r = r;
    }
    
    @Override
    public final void c(final a c, final String b, final boolean r) {
        this.b.o = this.a.now();
        final h8d b2 = this.b;
        b2.c = c;
        b2.b = b;
        b2.r = r;
    }
    
    @Override
    public final void j(final a c, final String b, final Throwable t, final boolean r) {
        this.b.o = this.a.now();
        final h8d b2 = this.b;
        b2.c = c;
        b2.b = b;
        b2.r = r;
    }
    
    @Override
    public final void k(final String b) {
        this.b.o = this.a.now();
        this.b.b = b;
    }
}
