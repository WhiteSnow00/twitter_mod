// 
// Decompiled by Procyon v0.6.0
// 

public final class p72 extends ste implements qsb<yk6, fzv>
{
    public final c6m D0;
    public final r7m<m5d> E0;
    public final long F0;
    public final qq4 G0;
    
    public p72(final c6m d0, final r7m<m5d> e0, final long f0, final qq4 g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final yk6 yk6 = (yk6)o;
        czd.f((Object)yk6, "$this$onDrawWithContent");
        yk6.E0();
        final c6m d0 = this.D0;
        final float a = d0.a;
        final float b = d0.b;
        final r7m<m5d> e0 = this.E0;
        final long f0 = this.F0;
        final qq4 g0 = this.G0;
        ((tc9)yk6).u0().a().b(a, b);
        sc9.d((tc9)yk6, (m5d)e0.D0, 0L, f0, 0L, 0L, 0.0f, (nbu)null, g0, 0, 0, 890, (Object)null);
        ((tc9)yk6).u0().a().b(-a, -b);
        return fzv.a;
    }
}
