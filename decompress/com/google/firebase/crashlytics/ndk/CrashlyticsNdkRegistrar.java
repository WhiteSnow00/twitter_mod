// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics.ndk;

import java.util.Arrays;
import android.content.Context;
import java.util.List;

public class CrashlyticsNdkRegistrar implements l26
{
    public final List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)e07.class);
        a.a(new oo8((Class)Context.class, 1, 0));
        a.e = (e16)new a(this);
        a.c();
        return Arrays.asList(a.b(), w9f.a("fire-cls-ndk", "18.2.11"));
    }
}
