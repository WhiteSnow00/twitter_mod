import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n100 implements dsy<Executor>
{
    public final /* bridge */ Object a() {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor((ThreadFactory)cuz.F0);
        vq9.u((Object)singleThreadExecutor);
        return singleThreadExecutor;
    }
}
