import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gan extends gue implements rtb<List<? extends hfv>, oyv>
{
    public final /* synthetic */ dan C0;
    
    public gan(final dan c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List h = (List)o;
        final dan c0 = this.C0;
        zzd.e((Object)h, "it");
        c0.H = h;
        final lxn w = this.C0.w;
        Objects.requireNonNull(w);
        w.b.onNext((Object)h);
        return oyv.a;
    }
}
