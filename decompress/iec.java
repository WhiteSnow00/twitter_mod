import java.util.concurrent.TimeUnit;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iec<OBJECT, ERROR> extends csc<OBJECT, ERROR>
{
    public int d;
    
    public iec() {
        super(jec.a, jec.b);
        this.d = 1;
    }
    
    @Override
    public final long a(final atm<xrc<OBJECT, ERROR>> atm) {
        czd.f((Object)atm, "results");
        return TimeUnit.SECONDS.toMillis((long)Math.pow(3.0, this.d++));
    }
    
    @Override
    public final boolean f(final arc<?, ?> arc, final bsc bsc) {
        return this.d <= 3;
    }
}
