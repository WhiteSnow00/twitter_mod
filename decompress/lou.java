import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lou implements kou
{
    public final Context a;
    
    public lou(final Context a) {
        e0e.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final bti bti = (bti)o;
        e0e.f((Object)bti, "notificationInfo");
        final t5j fromCallable = t5j.fromCallable((Callable)new uc3((Object)bti, (Object)this, 2));
        e0e.e((Object)fromCallable, "fromCallable {\n         \u2026ficationLayout)\n        }");
        return fromCallable;
    }
}
