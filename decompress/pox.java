import android.view.View;
import android.view.WindowId;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pox implements qox
{
    public final WindowId a;
    
    public pox(final View view) {
        this.a = view.getWindowId();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof pox && ((pox)o).a.equals((Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
