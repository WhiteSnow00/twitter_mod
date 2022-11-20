import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y3y implements View$OnClickListener
{
    public final Context D0;
    public final Intent E0;
    
    public y3y(final Context d0, final Intent e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void onClick(final View view) {
        try {
            this.D0.startActivity(this.E0);
        }
        catch (final ActivityNotFoundException ex) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", (Throwable)ex);
        }
    }
}
