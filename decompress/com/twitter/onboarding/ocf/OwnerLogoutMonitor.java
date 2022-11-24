// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf;

import com.twitter.util.user.UserIdentifier;

@a91
public class OwnerLogoutMonitor
{
    public UserIdentifier a;
    public NavigationHandler b;
    public final boolean c;
    
    public OwnerLogoutMonitor(final k9x k9x, final duo duo, final scs scs) {
        duo.b(this);
        final UserIdentifier a = this.a;
        final UserIdentifier current = UserIdentifier.getCurrent();
        UserIdentifier a2 = a;
        if (a == null) {
            a2 = current;
        }
        this.a = a2;
        this.c = (scs.h instanceof jzj);
        final de6 de6 = new de6();
        de6.d(new b39[] { k9x.d().subscribe((rk6)new g3c((Object)this, 9)), k9x.b().subscribe((rk6)new cbk(de6, 1)) });
    }
}
