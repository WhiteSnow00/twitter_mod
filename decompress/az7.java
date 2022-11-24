// 
// Decompiled by Procyon v0.6.0
// 

public final class az7 extends pue implements stb<hy7$g, vzv>
{
    public final znl<h08> F0;
    
    public az7(final znl<h08> f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hy7$g hy7$g = (hy7$g)o;
        e0e.f((Object)hy7$g, "person");
        this.F0.onNext((Object)new h08.j((hy7$e$b)hy7$g));
        return vzv.a;
    }
}
