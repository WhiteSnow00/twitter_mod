import android.os.Build$VERSION;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efa implements bra<Intent, ComponentName[]>
{
    public final Context a;
    
    public efa(final Context a) {
        zzd.f((Object)a, "context");
        this.a = a;
    }
    
    public final Object a(final Object o) {
        final Intent intent = (Intent)o;
        zzd.f((Object)intent, "intent");
        ComponentName[] h;
        if (Build$VERSION.SDK_INT >= 29) {
            h = new ComponentName[0];
        }
        else {
            h = p70.a.h(this.a, intent);
        }
        return h;
    }
}
