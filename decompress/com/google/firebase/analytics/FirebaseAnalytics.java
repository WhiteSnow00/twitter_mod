// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.analytics;

import android.app.Activity;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import androidx.annotation.Keep;
import android.os.Bundle;
import android.content.Context;
import java.util.Objects;

public final class FirebaseAnalytics
{
    public static volatile FirebaseAnalytics b;
    public final wxy a;
    
    public FirebaseAnalytics(final wxy a) {
        Objects.requireNonNull(a, "null reference");
        this.a = a;
    }
    
    @Keep
    public static FirebaseAnalytics getInstance(final Context context) {
        if (FirebaseAnalytics.b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (FirebaseAnalytics.b == null) {
                    FirebaseAnalytics.b = new FirebaseAnalytics(wxy.c(context, (Bundle)null));
                }
            }
        }
        return FirebaseAnalytics.b;
    }
    
    @Keep
    public static qfz getScionFrontendApiImplementation(final Context context, final Bundle bundle) {
        final wxy c = wxy.c(context, bundle);
        if (c == null) {
            return null;
        }
        return (qfz)new eny(c);
    }
    
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String)zbs.b(i1b.e().getId(), 30000L, TimeUnit.MILLISECONDS);
        }
        catch (final InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
        catch (final TimeoutException ex2) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        catch (final ExecutionException ex3) {
            throw new IllegalStateException(ex3.getCause());
        }
    }
    
    @Deprecated
    @Keep
    public void setCurrentScreen(final Activity activity, final String s, final String s2) {
        final wxy a = this.a;
        Objects.requireNonNull(a);
        a.b((jvy)new sqy(a, activity, s, s2));
    }
}
