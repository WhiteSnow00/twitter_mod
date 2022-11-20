import bolts.ExecutorException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbs implements ho6<Object, Void>
{
    public final yng a;
    public final ho6 b;
    public final Executor c;
    
    public rbs(final yng a, final ho6 b, final Executor c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final xbs xbs) throws Exception {
        final yng a = this.a;
        final ho6 b = this.b;
        final Executor c = this.c;
        try {
            c.execute((Runnable)new sbs(a, b, xbs));
        }
        catch (final Exception ex) {
            a.g((Exception)new ExecutorException(ex));
        }
    }
}
