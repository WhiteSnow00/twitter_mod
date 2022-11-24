import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t07 implements lp6<Void, Object>
{
    public final Callable F0;
    
    public t07(final Callable f0) {
        this.F0 = f0;
    }
    
    @Override
    public final Object i(final mcs<Void> mcs) throws Exception {
        return this.F0.call();
    }
}
