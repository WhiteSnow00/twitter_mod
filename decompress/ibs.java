import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibs
{
    public static fbs a(final Intent intent) {
        final fbs b = b(intent);
        pf8.r(b);
        return b;
    }
    
    public static fbs b(final Intent intent) {
        if (intent.getExtras() != null) {
            return (fbs)yvj.f(intent.getExtras(), "extra_task_context", (alp)fbs.j);
        }
        return null;
    }
}
