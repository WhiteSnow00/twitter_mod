import android.content.ComponentCallbacks;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b30 implements y19
{
    public final Context a;
    public final d30 b;
    
    public b30(final Context a, final d30 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)this.b);
    }
}
