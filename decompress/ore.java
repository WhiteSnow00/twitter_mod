// 
// Decompiled by Procyon v0.6.0
// 

public final class ore
{
    public static final a Companion;
    public static final ore g;
    public final stb<nre, vzv> a;
    public final stb<nre, vzv> b;
    public final stb<nre, vzv> c;
    public final stb<nre, vzv> d;
    public final stb<nre, vzv> e;
    public final stb<nre, vzv> f;
    
    static {
        Companion = new a();
        g = new ore(null, null, 63);
    }
    
    public ore(stb a, stb e, final int n) {
        if ((n & 0x1) != 0x0) {
            a = null;
        }
        if ((n & 0x10) != 0x0) {
            e = null;
        }
        this.a = (stb<nre, vzv>)a;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = (stb<nre, vzv>)e;
        this.f = null;
    }
    
    public ore(final stb<? super nre, vzv> a, final stb<? super nre, vzv> b, final stb<? super nre, vzv> c, final stb<? super nre, vzv> d, final stb<? super nre, vzv> e, final stb<? super nre, vzv> f) {
        this.a = (stb<nre, vzv>)a;
        this.b = (stb<nre, vzv>)b;
        this.c = (stb<nre, vzv>)c;
        this.d = (stb<nre, vzv>)d;
        this.e = (stb<nre, vzv>)e;
        this.f = (stb<nre, vzv>)f;
    }
    
    public static final class a
    {
    }
}
