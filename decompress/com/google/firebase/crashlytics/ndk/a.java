// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import java.util.Objects;

public final class a implements e16
{
    public final CrashlyticsNdkRegistrar D0;
    
    public a(final CrashlyticsNdkRegistrar d0) {
        this.D0 = d0;
    }
    
    public final Object r(final y06 y06) {
        Objects.requireNonNull(this.D0);
        final Context context = (Context)((ism)y06).f((Class)Context.class);
        return new a0b(new q07(context, (k9i)new JniNativeApi(context), new nxa(context)), yw4.g(context, "com.google.firebase.crashlytics.unity_version", "string") != 0 ^ true);
    }
}
