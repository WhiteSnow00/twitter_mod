// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.core.permissionstep;

import com.twitter.permissions.PermissionRequestActivity$a;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006" }, d2 = { "Lcom/twitter/android/onboarding/core/permissionstep/OcfLiveSyncPermissionRequestActivity;", "Lcom/twitter/android/onboarding/core/permissionstep/LiveSyncPermissionRequestActivity;", "<init>", "()V", "Companion", "a", "feature.tfa.onboarding.core_release" }, k = 1, mv = { 1, 7, 1 })
public final class OcfLiveSyncPermissionRequestActivity extends LiveSyncPermissionRequestActivity
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    @Override
    public final void n0() {
        cbw.b((elm)super.w1.h("contacts_sync_prompt", "", "impression"));
        super.o1 = PermissionRequestActivity$a.E0;
    }
    
    public static final class a
    {
    }
}
