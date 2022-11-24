// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.username;

import com.twitter.onboarding.ocf.username.EnterUsernameViewHost;
import android.content.Intent;

public class EnterUsernameActivity extends vnd
{
    public final void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        final vn6 c = k5b.f((y2e)this).c();
        vmw.g((Object)c);
        final int a = o5j.a;
        final EnterUsernameViewHost enterUsernameViewHost = (EnterUsernameViewHost)((sml)c).R();
        final scs b = vcs.b(intent);
        vmw.g((Object)b);
        enterUsernameViewHost.E1(b.f);
    }
}
