// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.common;

import android.os.BaseBundle;
import android.os.Parcelable;
import android.content.IntentSender$SendIntentException;
import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Intent;
import android.os.ResultReceiver;
import android.app.Activity;

public class PlayCoreDialogWrapperActivity extends Activity
{
    public ResultReceiver C0;
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 0) {
            final ResultReceiver c0 = this.C0;
            if (c0 != null) {
                if (n2 == -1) {
                    c0.send(1, new Bundle());
                }
                else if (n2 == 0) {
                    c0.send(2, new Bundle());
                }
            }
        }
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        final int intExtra = this.getIntent().getIntExtra("window_flags", 0);
        Intent intent;
        if (intExtra != 0) {
            this.getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        }
        else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.C0 = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            final PendingIntent pendingIntent = (PendingIntent)((BaseBundle)this.getIntent().getExtras()).get("confirmation_intent");
            try {
                this.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
                return;
            }
            catch (final IntentSender$SendIntentException ex) {
                final ResultReceiver c0 = this.C0;
                if (c0 != null) {
                    c0.send(3, new Bundle());
                }
                this.finish();
                return;
            }
        }
        this.C0 = (ResultReceiver)bundle.getParcelable("result_receiver");
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        bundle.putParcelable("result_receiver", (Parcelable)this.C0);
    }
}
