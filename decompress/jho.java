import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jho extends ste implements qsb<pho, pho>
{
    public final List<cgo> D0;
    
    public jho(final List<cgo> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pho pho = (pho)o;
        czd.f((Object)pho, "$this$setState");
        return pho.l((List)this.D0);
    }
}
