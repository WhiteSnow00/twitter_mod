import android.content.Intent;
import java.util.List;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jgy implements aaz
{
    public final Context a;
    public final owy b;
    public final sgy c;
    public final Executor d;
    
    public jgy(final Context a, final Executor d, final sgy c, final owy b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final List<Intent> list, final l1z l1z) {
        if (q1r.e.get() != null) {
            this.d.execute((Runnable)new bgy(this, (List)list, l1z));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
