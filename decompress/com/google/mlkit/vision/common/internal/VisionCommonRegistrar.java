// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mlkit.vision.common.internal;

import androidx.annotation.RecentlyNonNull;
import java.util.List;

public class VisionCommonRegistrar implements l26
{
    @RecentlyNonNull
    public final List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)a.class);
        int i = 0;
        a.a(new oo8((Class)a$a.class, 2, 0));
        a.e = (e16)zyz.F0;
        final n06 b = a.b();
        final mqz e0 = otz.E0;
        final Object[] array = { b };
        while (i <= 0) {
            if (array[i] == null) {
                throw new NullPointerException(jxa.p(20, "at index ", i));
            }
            ++i;
        }
        return (List<n06<?>>)new dvz(array, 1);
    }
}
