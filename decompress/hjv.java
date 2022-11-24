import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjv extends pue implements stb<awj<Object, ? extends List<zep>>, vzv>
{
    public final mjv<Object, zep> F0;
    
    public hjv(final mjv<Object, zep> f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        this.F0.f.onNext((Object)o);
        return vzv.a;
    }
}
