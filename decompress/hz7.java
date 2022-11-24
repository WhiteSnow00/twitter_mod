// 
// Decompiled by Procyon v0.6.0
// 

public final class hz7 extends pue implements stb<hy7$b$a, vzv>
{
    public final znl<h08> F0;
    
    public hz7(final znl<h08> f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hy7$b$a hy7$b$a = (hy7$b$a)o;
        e0e.f((Object)hy7$b$a, "it");
        this.F0.onNext((Object)new h08.e(hy7$b$a.a));
        return vzv.a;
    }
}
