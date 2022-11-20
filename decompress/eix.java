import android.os.PowerManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eix
{
    public boolean a;
    public boolean b;
    
    public eix(final Context context) {
        final PowerManager powerManager = (PowerManager)context.getApplicationContext().getSystemService("power");
    }
    
    public final void a(final boolean b) {
        this.b = b;
    }
}
