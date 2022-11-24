// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.auth.api.signin.internal;

import android.os.BaseBundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.util.Log;
import java.util.Objects;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.os.Bundle;
import android.content.Context;
import com.google.android.gms.auth.api.signin.SignInAccount;
import androidx.annotation.RecentlyNonNull;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class SignInHubActivity extends dob
{
    public static boolean c1;
    public boolean X0;
    public SignInConfiguration Y0;
    public boolean Z0;
    public int a1;
    public Intent b1;
    
    public SignInHubActivity() {
        this.X0 = false;
    }
    
    public final void S(final int n) {
        final Status status = new Status(n, (String)null);
        final Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable)status);
        ((Activity)this).setResult(0, intent);
        ((Activity)this).finish();
        SignInHubActivity.c1 = false;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(@RecentlyNonNull final AccessibilityEvent accessibilityEvent) {
        return true;
    }
    
    @Override
    public final void onActivityResult(int n, int intExtra, final Intent b1) {
        if (this.X0) {
            return;
        }
        ((Activity)this).setResult(0);
        if (n != 40962) {
            return;
        }
        if (b1 != null) {
            final SignInAccount signInAccount = (SignInAccount)b1.getParcelableExtra("signInAccount");
            if (signInAccount != null) {
                final GoogleSignInAccount g0 = signInAccount.G0;
                if (g0 != null) {
                    final p8y a = p8y.a((Context)this);
                    final GoogleSignInOptions g2 = this.Y0.G0;
                    synchronized (a) {
                        a.a.d(g0, g2);
                        monitorexit(a);
                        b1.removeExtra("signInAccount");
                        b1.putExtra("googleSignInAccount", (Parcelable)g0);
                        this.Z0 = true;
                        this.a1 = intExtra;
                        this.b1 = b1;
                        o3g.b((tbf)this).d(0, (Bundle)null, (o3g$a)new e9y(this));
                        SignInHubActivity.c1 = false;
                        return;
                    }
                }
            }
            if (b1.hasExtra("errorCode")) {
                intExtra = b1.getIntExtra("errorCode", 8);
                if ((n = intExtra) == 13) {
                    n = 12501;
                }
                this.S(n);
                return;
            }
        }
        this.S(8);
    }
    
    @Override
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = ((Activity)this).getIntent();
        final String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            this.S(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            final String value = String.valueOf(intent.getAction());
            String concat;
            if (value.length() != 0) {
                concat = "Unknown action: ".concat(value);
            }
            else {
                concat = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", concat);
            ((Activity)this).finish();
            return;
        }
        final Bundle bundleExtra = intent.getBundleExtra("config");
        Objects.requireNonNull(bundleExtra);
        final SignInConfiguration y0 = (SignInConfiguration)bundleExtra.getParcelable("config");
        if (y0 == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            ((Activity)this).setResult(0);
            ((Activity)this).finish();
            return;
        }
        this.Y0 = y0;
        if (bundle != null) {
            final boolean boolean1 = bundle.getBoolean("signingInGoogleApiClients");
            this.Z0 = boolean1;
            if (boolean1) {
                this.a1 = ((BaseBundle)bundle).getInt("signInResultCode");
                final Intent b1 = (Intent)bundle.getParcelable("signInResultData");
                Objects.requireNonNull(b1);
                this.b1 = b1;
                o3g.b((tbf)this).d(0, (Bundle)null, (o3g$a)new e9y(this));
                SignInHubActivity.c1 = false;
            }
            return;
        }
        if (SignInHubActivity.c1) {
            ((Activity)this).setResult(0);
            this.S(12502);
            return;
        }
        SignInHubActivity.c1 = true;
        final Intent intent2 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent2.setPackage("com.google.android.gms");
        }
        else {
            intent2.setPackage(((Context)this).getPackageName());
        }
        intent2.putExtra("config", (Parcelable)this.Y0);
        try {
            this.startActivityForResult(intent2, 40962);
        }
        catch (final ActivityNotFoundException ex) {
            this.X0 = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            this.S(17);
        }
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        SignInHubActivity.c1 = false;
    }
    
    public final void onSaveInstanceState(@RecentlyNonNull final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.Z0);
        if (this.Z0) {
            ((BaseBundle)bundle).putInt("signInResultCode", this.a1);
            bundle.putParcelable("signInResultData", (Parcelable)this.b1);
        }
    }
}
