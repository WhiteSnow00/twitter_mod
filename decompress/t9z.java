import android.os.Handler;
import android.database.ContentObserver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9z extends ContentObserver
{
    public t9z() {
        super((Handler)null);
    }
    
    public final void onChange(final boolean b) {
        x9z.d.set(true);
    }
}
