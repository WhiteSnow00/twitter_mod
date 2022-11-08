import android.content.Context;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class io extends fo<Intent, ao>
{
    public static final io.io$a Companion;
    
    static {
        Companion = new io.io$a();
    }
    
    @Override
    public final Intent a(final Context context, final Object o) {
        final Intent intent = (Intent)o;
        zzd.f((Object)context, "context");
        zzd.f((Object)intent, "input");
        return intent;
    }
    
    @Override
    public final Object c(final int n, final Intent intent) {
        return new ao(n, intent);
    }
}
