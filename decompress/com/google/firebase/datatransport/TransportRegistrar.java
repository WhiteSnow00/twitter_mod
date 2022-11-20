// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.datatransport;

import java.util.Arrays;
import java.util.List;
import android.content.Context;
import androidx.annotation.Keep;

@Keep
public class TransportRegistrar implements l26
{
    public static h1u a(final y06 y06) {
        return lambda$getComponents$0(y06);
    }
    
    private static h1u lambda$getComponents$0(final y06 y06) {
        m1u.b((Context)y06.f((Class)Context.class));
        return m1u.a().c((i3a)p63.f);
    }
    
    public List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)h1u.class);
        a.a(new oo8((Class)Context.class, 1, 0));
        a.e = (e16)l1u.E0;
        return Arrays.asList(a.b(), w9f.a("fire-transport", "18.1.4"));
    }
}
