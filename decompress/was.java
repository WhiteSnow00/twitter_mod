import bolts.ExecutorException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class was implements bp6<Object, Void>
{
    public final /* synthetic */ zng a;
    public final /* synthetic */ bp6 b;
    public final /* synthetic */ Executor c;
    
    public was(final zng a, final bp6 b, final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final cbs cbs) throws Exception {
        final zng a = this.a;
        final bp6 b = this.b;
        final Executor c = this.c;
        try {
            c.execute((Runnable)new xas(a, b, cbs));
        }
        catch (final Exception ex) {
            a.k((Exception)new ExecutorException(ex));
        }
    }
}
