import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mp4 extends pue implements stb<j2f, vzv>
{
    public final hed<qgv> F0;
    public final stb<qgv, vzv> G0;
    public final stb<qgv, vzv> H0;
    public final int I0;
    
    public mp4(final hed<? extends qgv> f0, final stb<? super qgv, vzv> g0, final stb<? super qgv, vzv> h0, final int i0) {
        this.F0 = (hed<qgv>)f0;
        this.G0 = (stb<qgv, vzv>)g0;
        this.H0 = (stb<qgv, vzv>)h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j2f j2f = (j2f)o;
        e0e.f((Object)j2f, "$this$LazyColumn");
        final hed<qgv> f0 = this.F0;
        j2f.a(((List)f0).size(), (stb)null, (stb)new kp4((stb)jp4.F0, (List)f0), (mub)w9y.j(-632812321, true, new lp4((List)f0, (stb)this.G0, (stb)this.H0, this.I0)));
        return vzv.a;
    }
}
