import android.content.Intent;
import android.content.Context;
import android.app.Activity;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dn implements cn
{
    public final Map<Class<? extends zm>, qll<Class<? extends Activity>>> a;
    
    public dn(final Map<Class<? extends zm>, ? extends qll<Class<? extends Activity>>> a) {
        this.a = (Map<Class<? extends zm>, qll<Class<? extends Activity>>>)a;
    }
    
    public final <T extends zm> Intent a(final Context context, final T t) {
        zzd.f((Object)context, "context");
        zzd.f((Object)t, "args");
        final Class<? extends zm> class1 = t.getClass();
        final qll qll = this.a.get(class1);
        if (qll != null) {
            final Intent intent = t.toIntent(context, (Class<? extends Activity>)qll.get());
            zzd.e((Object)intent, "args.toIntent(context, a\u2026ivityClassProvider.get())");
            return intent;
        }
        throw new IllegalArgumentException(l7k.c("Missing Args to Activity class mapping for ", class1.getCanonicalName()));
    }
}
