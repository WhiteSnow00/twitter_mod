// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import android.os.Bundle;
import java.util.Objects;
import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class AnalyticsConnectorRegistrar implements l26
{
    public static rz lambda$getComponents$0(final y06 y06) {
        final yza yza = (yza)y06.f((Class)yza.class);
        final Context context = (Context)y06.f((Class)Context.class);
        final xmr xmr = (xmr)y06.f((Class)xmr.class);
        Objects.requireNonNull(yza, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(xmr, "null reference");
        eli.q(context.getApplicationContext());
        if (sz.c == null) {
            synchronized (sz.class) {
                if (sz.c == null) {
                    final Bundle bundle = new Bundle(1);
                    if (yza.h()) {
                        xmr.b((Executor)n9y.D0, (gba)oiy.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", yza.g());
                    }
                    sz.c = new sz(kyy.c(context, bundle).b);
                }
            }
        }
        return (rz)sz.c;
    }
    
    @SuppressLint({ "MissingPermission" })
    @Keep
    public List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)rz.class);
        a.a(new oo8((Class)yza.class, 1, 0));
        a.a(new oo8((Class)Context.class, 1, 0));
        a.a(new oo8((Class)xmr.class, 1, 0));
        a.e = (e16)ii8.L0;
        a.c();
        return Arrays.asList(a.b(), w9f.a("fire-analytics", "21.0.0"));
    }
}
