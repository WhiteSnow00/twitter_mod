import java.util.concurrent.TimeUnit;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfc<OBJECT, ERROR> extends ctc<OBJECT, ERROR>
{
    public int d;
    
    public kfc() {
        super((Collection)lfc.a, (Collection)lfc.b);
        this.d = 1;
    }
    
    public final long a(final ptm<xsc<OBJECT, ERROR>> ptm) {
        e0e.f((Object)ptm, "results");
        return TimeUnit.SECONDS.toMillis((long)Math.pow(3.0, this.d++));
    }
    
    public final boolean f(final asc<?, ?> asc, final btc btc) {
        return this.d <= 3;
    }
}
