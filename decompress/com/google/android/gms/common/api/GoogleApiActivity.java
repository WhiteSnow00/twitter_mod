// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.BaseBundle;
import android.os.Handler;
import java.util.Objects;
import android.content.ActivityNotFoundException;
import android.os.Build;
import android.content.IntentSender$SendIntentException;
import android.util.Log;
import android.os.Bundle;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepName;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface$OnCancelListener
{
    public int D0;
    
    public GoogleApiActivity() {
        this.D0 = 0;
    }
    
    public static Intent a(final Context context, final PendingIntent pendingIntent, final int n, final boolean b) {
        final Intent intent = new Intent(context, (Class)GoogleApiActivity.class);
        intent.putExtra("pending_intent", (Parcelable)pendingIntent);
        intent.putExtra("failing_client_id", n);
        intent.putExtra("notify_manager", b);
        return intent;
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1) {
            final boolean booleanExtra = this.getIntent().getBooleanExtra("notify_manager", true);
            this.D0 = 0;
            this.setResult(n2, intent);
            if (booleanExtra) {
                final r4c h = r4c.h((Context)this);
                if (n2 != -1) {
                    if (n2 == 0) {
                        h.i(new vg6(13, null, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                }
                else {
                    final j5y q0 = h.Q0;
                    ((Handler)q0).sendMessage(((Handler)q0).obtainMessage(3));
                }
            }
        }
        else if (n == 2) {
            this.D0 = 0;
            this.setResult(n2, intent);
        }
        this.finish();
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        this.setResult(this.D0 = 0);
        this.finish();
    }
    
    public final void onCreate(Bundle extras) {
        super.onCreate(extras);
        if (extras != null) {
            this.D0 = ((BaseBundle)extras).getInt("resolution");
        }
        if (this.D0 != 1) {
            extras = this.getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                this.finish();
            }
            else {
                final PendingIntent pendingIntent = (PendingIntent)((BaseBundle)extras).get("pending_intent");
                final Integer n = (Integer)((BaseBundle)extras).get("error_code");
                if (pendingIntent == null && n == null) {
                    Log.e("GoogleApiActivity", "Activity started without resolution");
                    this.finish();
                }
                else if (pendingIntent != null) {
                    try {
                        this.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent)null, 0, 0, 0);
                        this.D0 = 1;
                    }
                    catch (final IntentSender$SendIntentException ex) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)ex);
                        this.finish();
                    }
                    catch (final ActivityNotFoundException ex2) {
                        if (extras.getBoolean("notify_manager", true)) {
                            r4c.h((Context)this).i(new vg6(22, null, null), this.getIntent().getIntExtra("failing_client_id", -1));
                        }
                        else {
                            final String string = pendingIntent.toString();
                            String s = ta0.z(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                s = s.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", s, (Throwable)ex2);
                        }
                        this.D0 = 1;
                        this.finish();
                    }
                }
                else {
                    Objects.requireNonNull(n, "null reference");
                    final int intValue = n;
                    final int c = p4c.c;
                    p4c.e.e((Activity)this, intValue, (DialogInterface$OnCancelListener)this);
                    this.D0 = 1;
                }
            }
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        ((BaseBundle)bundle).putInt("resolution", this.D0);
        super.onSaveInstanceState(bundle);
    }
}
