// 
// Decompiled by Procyon v0.6.0
// 

public final class ty7 extends pue implements stb<hy7, vzv>
{
    public final znl<h08> F0;
    
    public ty7(final znl<h08> f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hy7 hy7 = (hy7)o;
        e0e.f((Object)hy7, "withLink");
        this.F0.onNext((Object)new h08.f((hy7$d)hy7));
        return vzv.a;
    }
}
