import android.os.IBinder;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lt2
{
    public static final void a(final Bundle bundle, final String s, final IBinder binder) {
        e0e.f((Object)bundle, "bundle");
        e0e.f((Object)s, "key");
        bundle.putBinder(s, binder);
    }
}
