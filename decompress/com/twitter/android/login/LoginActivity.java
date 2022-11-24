// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.login;

import android.content.Context;
import android.app.ProgressDialog;
import java.util.Objects;
import com.twitter.android.login.di.LoginViewObjectGraph;
import android.app.Dialog;

public class LoginActivity extends vnd
{
    public final Dialog onCreateDialog(final int n) {
        final LoginContentViewProvider y0 = ((LoginViewObjectGraph)k5b.f((y2e)this)).Y0();
        Objects.requireNonNull(y0);
        Object o;
        if (n != 1) {
            o = null;
        }
        else {
            o = new ProgressDialog((Context)y0.G0);
            ((ProgressDialog)o).setProgressStyle(0);
            ((ProgressDialog)o).setMessage(y0.J4(2131954848));
            ((ProgressDialog)o).setIndeterminate(true);
            ((Dialog)o).setCancelable(false);
        }
        return (Dialog)o;
    }
}
