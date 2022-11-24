// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.verification;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class EmailPinVerificationStepActivity extends vnd
{
    public final void d0(final Intent intent) {
        final vn6 b = k5b.b((y2e)this);
        final int a = o5j.a;
        final z0a z0a = (z0a)((sml)b).R();
        vmw.g((Object)z0a);
        final scs b2 = vcs.b(intent);
        vmw.g((Object)b2);
        z0a.E1(b2);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d0(((Activity)this).getIntent());
    }
    
    public final void onNewIntent(final Intent intent) {
        if (intent.getBooleanExtra("extra_started_from_deeplink", false)) {
            super.onNewIntent(((Activity)this).getIntent());
            final String stringExtra = intent.getStringExtra("extra_email");
            final String stringExtra2 = intent.getStringExtra("extra_pin_code");
            if (flr.g((CharSequence)stringExtra2)) {
                final vn6 b = k5b.b((y2e)this);
                final int a = o5j.a;
                final z0a z0a = (z0a)((sml)b).R();
                vmw.g((Object)z0a);
                z0a.F1(stringExtra2, stringExtra, true);
            }
        }
        else {
            super.onNewIntent(intent);
            if (ita.d().b("growth_acquisition_bug_fixes_impact", true)) {
                this.d0(intent);
            }
        }
    }
}
