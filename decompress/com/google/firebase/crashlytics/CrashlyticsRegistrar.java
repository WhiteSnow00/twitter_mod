// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.crashlytics;

import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements l26
{
    public final List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)FirebaseCrashlytics.class);
        a.a(new oo8((Class)yza.class, 1, 0));
        a.a(new oo8((Class)f0b.class, 1, 0));
        a.a(new oo8((Class)e07.class, 0, 2));
        a.a(new oo8((Class)rz.class, 0, 2));
        a.e = (e16)new h07(this);
        a.c();
        return Arrays.asList(a.b(), w9f.a("fire-cls", "18.2.11"));
    }
}
