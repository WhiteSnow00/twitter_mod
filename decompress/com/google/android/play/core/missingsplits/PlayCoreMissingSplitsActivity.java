// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.missingsplits;

import android.app.Dialog;
import android.content.pm.PackageItemInfo;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.os.Process;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface$OnClickListener
{
    public final void onClick(final DialogInterface dialogInterface, int myUid) {
        if (myUid == -1) {
            final String packageName = ((Context)this).getPackageName();
            final Intent setPackage = new Intent("android.intent.action.VIEW").setData(Uri.parse(xa0.B(new StringBuilder(String.valueOf(packageName).length() + 66), "market://details?id=", packageName, "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending");
            try {
                ((Context)this).startActivity(setPackage);
            }
            catch (final ActivityNotFoundException ex) {
                final String name = this.getClass().getName();
                myUid = Process.myUid();
                final int myPid = Process.myPid();
                final StringBuilder sb = new StringBuilder(39);
                sb.append("UID: [");
                sb.append(myUid);
                sb.append("]  PID: [");
                sb.append(myPid);
                sb.append("] ");
                final String value = String.valueOf(sb.toString());
                String concat;
                if (name.length() != 0) {
                    concat = value.concat(name);
                }
                else {
                    concat = new String(value);
                }
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", v3a.p(concat, "Couldn't start missing splits activity for %s", new Object[] { packageName }), (Throwable)ex);
                }
            }
        }
        this.finish();
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final AlertDialog$Builder setNeutralButton = new AlertDialog$Builder((Context)this).setTitle((CharSequence)"Installation failed").setCancelable(false).setNeutralButton((CharSequence)"Close", (DialogInterface$OnClickListener)this);
        if (apy.b((Context)this)) {
            final String string = ((PackageItemInfo)((Context)this).getApplicationInfo()).loadLabel(((Context)this).getPackageManager()).toString();
            final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 91);
            sb.append("The app ");
            sb.append(string);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            setNeutralButton.setMessage((CharSequence)sb.toString()).setPositiveButton((CharSequence)"Reinstall", (DialogInterface$OnClickListener)this);
        }
        else {
            final String string2 = ((PackageItemInfo)((Context)this).getApplicationInfo()).loadLabel(((Context)this).getPackageManager()).toString();
            final StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 87);
            sb2.append("The app ");
            sb2.append(string2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            setNeutralButton.setMessage((CharSequence)sb2.toString());
        }
        ((Dialog)setNeutralButton.create()).show();
    }
}
