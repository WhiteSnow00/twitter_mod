// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.installations;

import java.util.Arrays;
import java.util.List;
import androidx.annotation.Keep;

@Keep
public class FirebaseInstallationsRegistrar implements l26
{
    public static f0b a(final y06 y06) {
        return lambda$getComponents$0(y06);
    }
    
    private static f0b lambda$getComponents$0(final y06 y06) {
        return new e0b((yza)y06.f((Class)yza.class), y06.I((Class)fic.class));
    }
    
    public List<n06<?>> getComponents() {
        final n06$b a = n06.a((Class)f0b.class);
        a.a(new oo8((Class)yza.class, 1, 0));
        a.a(new oo8((Class)fic.class, 0, 1));
        a.e = (e16)zc.D0;
        final n06 b = a.b();
        final ycs ycs = new ycs();
        final n06$b b2 = n06.b((Class)eic.class);
        b2.e = (e16)new m06((Object)ycs);
        return Arrays.asList(b, b2.b(), w9f.a("fire-installations", "17.0.1"));
    }
}
