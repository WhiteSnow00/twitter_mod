import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public interface pnf<V> extends Future<V>
{
    void e(final Runnable p0, final Executor p1);
}
