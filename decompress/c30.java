import android.content.ComponentCallbacks;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c30 implements o29
{
    public final /* synthetic */ Context a;
    public final /* synthetic */ e30 b;
    
    public c30(final Context a, final e30 b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        this.a.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)this.b);
    }
}
