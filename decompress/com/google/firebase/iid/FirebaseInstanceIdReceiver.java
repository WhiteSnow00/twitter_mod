// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import android.content.Context;

public final class FirebaseInstanceIdReceiver extends lj4
{
    public final int a(final Context ex, final kj4 kj4) {
        try {
            return ucs.a((ubs<Integer>)new ura((Context)ex).b(kj4.D0));
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.e("FirebaseMessaging", "Failed to send message to service.", (Throwable)ex);
        return 500;
    }
    
    public final void b(final Bundle bundle) {
        final Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (q8h.b(putExtras)) {
            q8h.a("_nd", putExtras.getExtras());
        }
    }
}
