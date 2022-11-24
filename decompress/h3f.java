// 
// Decompiled by Procyon v0.6.0
// 

public final class h3f implements a1f
{
    public final boolean a;
    public final p2f b;
    public final q0f c;
    public final boolean d;
    
    public h3f(final boolean a, final p2f b, final q0f c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final rq4 a() {
        rq4 rq4;
        if (this.d) {
            rq4 = new rq4(-1, 1);
        }
        else {
            rq4 = new rq4(1, -1);
        }
        return rq4;
    }
    
    public final Object b(final int n, final mp6<? super vzv> mp6) {
        final Object i = p2f.i(this.b, n, (mp6)mp6);
        if (i == jz6.F0) {
            return i;
        }
        return vzv.a;
    }
    
    public final m3p c() {
        return new m3p((ptb<Float>)new h3f$a(this.b), (ptb<Float>)new h3f$b(this.b, this.c), this.a);
    }
    
    public final Object d(final float n, final mp6<? super vzv> mp6) {
        final Object b = u3p.b((a5p)this.b, n, (mp6)mp6);
        if (b == jz6.F0) {
            return b;
        }
        return vzv.a;
    }
}
