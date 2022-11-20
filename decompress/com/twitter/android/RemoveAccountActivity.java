// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import android.app.Activity;
import android.content.Intent;
import com.twitter.account.api.RemoveAccountDialogContentViewArgs;
import com.twitter.account.api.RemoveAccountDialogSuccess;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;

public class RemoveAccountActivity extends ba
{
    public static final int Z0 = 0;
    public boolean Y0;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = ((Activity)this).getIntent();
        this.Y0 = false;
        final long longExtra = intent.getLongExtra("RemoveAccountActivity_account_id", -1L);
        final String stringExtra = intent.getStringExtra("RemoveAccountActivity_account_name");
        ((Activity)this).setTitle((CharSequence)stringExtra);
        if (intent.hasExtra("authenticator_response")) {
            ((qo1)this).d(tqf.i().r().subscribe((lj6)new ydm((Object)intent.getParcelableExtra("authenticator_response"), 0)));
        }
        if (intent.hasExtra("from_system_settings")) {
            this.Y0 = intent.getBooleanExtra("from_system_settings", false);
        }
        final dn6 a = ((zmd)this).v0().h().a((Class)RemoveAccountDialogSuccess.class);
        f.i(a.a(), (n93)new dn((Object)this, 2));
        a.d((Object)new RemoveAccountDialogContentViewArgs(longExtra, stringExtra));
    }
}
