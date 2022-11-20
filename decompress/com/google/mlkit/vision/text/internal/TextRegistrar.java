// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mlkit.vision.text.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.List;

public class TextRegistrar implements l26
{
    @RecentlyNonNull
    public final List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)inz.class);
        int i = 0;
        a.a(new oo8((Class)bch.class, 1, 0));
        a.e = (e16)k99.F0;
        final n06 b = a.b();
        final n06$b a2 = n06.a((Class)mkz.class);
        a2.a(new oo8((Class)inz.class, 1, 0));
        a2.a(new oo8((Class)dfa.class, 1, 0));
        a2.e = (e16)chw.W0;
        final n06 b2 = a2.b();
        final uky e0 = dly.E0;
        final Object[] array = { b, b2 };
        while (i < 2) {
            if (array[i] == null) {
                throw new NullPointerException(jxa.p(20, "at index ", i));
            }
            ++i;
        }
        return (List<n06<?>>)new soy(array, 2);
    }
}
