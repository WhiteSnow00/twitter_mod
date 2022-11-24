import android.content.Intent;
import java.util.List;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class thy implements obz
{
    public final Context a;
    public final zxy b;
    public final ciy c;
    public final Executor d;
    
    public thy(final Context a, final Executor d, final ciy c, final zxy b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final List<Intent> list, final z2z z2z) {
        if (i3r.e.get() != null) {
            this.d.execute((Runnable)new lhy(this, (List)list, z2z));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
