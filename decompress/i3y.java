import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i3y implements View$OnClickListener
{
    public final /* synthetic */ Context C0;
    public final /* synthetic */ Intent D0;
    
    public i3y(final Context c0, final Intent d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void onClick(final View view) {
        try {
            this.C0.startActivity(this.D0);
        }
        catch (final ActivityNotFoundException ex) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", (Throwable)ex);
        }
    }
}
