// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import androidx.activity.result.ActivityResultRegistry;
import java.io.Serializable;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;

public final class b implements Runnable
{
    public final int F0;
    public final IntentSender$SendIntentException G0;
    public final ComponentActivity$b H0;
    
    public b(final ComponentActivity$b h0, final int f0, final IntentSender$SendIntentException g0) {
        this.H0 = h0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        ((ActivityResultRegistry)this.H0).b(this.F0, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.G0));
    }
}
