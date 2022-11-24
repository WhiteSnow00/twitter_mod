// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.verification;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class PhonePinVerificationStepActivity extends vnd
{
    public final void d0(final Intent intent) {
        final vn6 c = k5b.f((y2e)this).c();
        vmw.g((Object)c);
        final int a = o5j.a;
        final eo6 r = ((sml)c).R();
        vmw.g((Object)r);
        final tck tck = (tck)r;
        final scs b = vcs.b(intent);
        vmw.g((Object)b);
        tck.E1(b);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d0(((Activity)this).getIntent());
    }
    
    public final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.d0(intent);
    }
}
