// 
// Decompiled by Procyon v0.6.0
// 

public final class a50 extends ste implements qsb<wgk$a, fzv>
{
    public final wgk D0;
    public final int E0;
    
    public a50(final wgk d0, final int e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wgk$a wgk$a = (wgk$a)o;
        czd.f((Object)wgk$a, "$this$layout");
        final wgk d0 = this.D0;
        final int n = -this.E0 / 2;
        final int n2 = (d0.D0 - d0.F0()) / 2;
        final int n3 = -this.E0 / 2;
        final wgk d2 = this.D0;
        wgk$a.k(wgk$a, d0, n - n2, n3 - (d2.E0 - d2.A0()) / 2, 0.0f, (qsb)null, 12, (Object)null);
        return fzv.a;
    }
}
