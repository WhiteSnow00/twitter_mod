// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.List;
import androidx.annotation.Keep;

@Keep
public class FirebaseMessagingRegistrar implements l26
{
    public static FirebaseMessaging a(final y06 y06) {
        return lambda$getComponents$0(y06);
    }
    
    private static FirebaseMessaging lambda$getComponents$0(final y06 y06) {
        return new FirebaseMessaging((yza)y06.f((Class)yza.class), (g0b)y06.f((Class)g0b.class), y06.I((Class)q8w.class), y06.I((Class)gic.class), (f0b)y06.f((Class)f0b.class), (h1u)y06.f((Class)h1u.class), (xmr)y06.f((Class)xmr.class));
    }
    
    @Keep
    public List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)FirebaseMessaging.class);
        a.a(new oo8((Class)yza.class, 1, 0));
        a.a(new oo8((Class)g0b.class, 0, 0));
        a.a(new oo8((Class)q8w.class, 0, 1));
        a.a(new oo8((Class)gic.class, 0, 1));
        a.a(new oo8((Class)h1u.class, 0, 0));
        a.a(new oo8((Class)f0b.class, 1, 0));
        a.a(new oo8((Class)xmr.class, 1, 0));
        a.e = (e16)l1u.F0;
        if (a.c == 0) {
            a.c = 1;
            return Arrays.asList(a.b(), w9f.a("fire-fcm", "23.0.5"));
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
