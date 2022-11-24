import com.twitter.app.dm.request.inbox.actions.QuickActionViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uul extends pue implements stb<zul, zul>
{
    public final QuickActionViewModel F0;
    public final tp7 G0;
    
    public uul(final QuickActionViewModel f0, final tp7 g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zul zul = (zul)o;
        e0e.f((Object)zul, "$this$setState");
        return zul.l(zul, (zul.a)new zul$a$c(this.F0.S0, this.G0));
    }
}
