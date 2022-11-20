import java.util.concurrent.Callable;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class znu implements ynu
{
    public final Context a;
    
    public znu(final Context a) {
        czd.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final lsi lsi = (lsi)o;
        czd.f((Object)lsi, "notificationInfo");
        final h5j fromCallable = h5j.fromCallable((Callable)new sra(lsi, this, 3));
        czd.e((Object)fromCallable, "fromCallable {\n         \u2026ficationLayout)\n        }");
        return fromCallable;
    }
}
