import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcs
{
    public static acs a(final Intent intent) {
        final acs b = b(intent);
        jee.l((Object)b);
        return b;
    }
    
    public static acs b(final Intent intent) {
        if (intent.getExtras() != null) {
            return (acs)dwj.f(intent.getExtras(), "extra_task_context", (rlp)acs.j);
        }
        return null;
    }
}
