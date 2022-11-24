// 
// Decompiled by Procyon v0.6.0
// 

public final class uy7 extends pue implements stb<hy7$d, vzv>
{
    public final znl<h08> F0;
    
    public uy7(final znl<h08> f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hy7$d hy7$d = (hy7$d)o;
        e0e.f((Object)hy7$d, "messageResult");
        this.F0.onNext((Object)new h08.f(hy7$d));
        return vzv.a;
    }
}
