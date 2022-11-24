import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tlw implements rbq<String, wow>
{
    public final qdw F0;
    public final bmw G0;
    
    public tlw(final qdw f0, final bmw g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final mpg F(final stb stb) {
        return qee.e((rbq)this, stb);
    }
    
    @Override
    public final bbq S(final Object o) {
        final String s = (String)o;
        bbq bbq;
        if (o5j.a((Object)s, (Object)this.F0.getUser().M0)) {
            bbq = bbq.v((Object)new wow(0, (String)null));
        }
        else {
            bbq = this.G0.a(s);
        }
        return bbq;
    }
    
    public final void close() {
        j2e.a((Closeable)this.G0);
    }
    
    @Override
    public final mpg n1(final k9x k9x) {
        return qee.h((rbq)this, k9x);
    }
    
    @Override
    public final rbq o(final j5s j5s) {
        return qee.p((rbq)this, j5s);
    }
    
    @Override
    public final rbq p(final stb stb) {
        return qee.m((rbq)this, stb);
    }
    
    @Override
    public final x6j y0(final x6j x6j, final bx0 bx0) {
        return qee.n((rbq)this, x6j, bx0);
    }
}
