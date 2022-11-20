// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import android.content.Context;

public class FirebaseCommonRegistrar implements l26
{
    public static String a(final Context context) {
        final ApplicationInfo applicationInfo = context.getApplicationInfo();
        String value;
        if (applicationInfo != null && Build$VERSION.SDK_INT >= 24) {
            value = String.valueOf(applicationInfo.minSdkVersion);
        }
        else {
            value = "";
        }
        return value;
    }
    
    public static String b(final String s) {
        return s.replace(' ', '_').replace('/', '_');
    }
    
    public final List<n06<?>> getComponents() {
        final ArrayList list = new ArrayList();
        final n06$b a = n06.a((Class)q8w.class);
        a.a(new oo8((Class)t9f.class, 2, 0));
        a.e = (e16)zh8.D0;
        list.add(a.b());
        final int f = eh8.f;
        String string = null;
        final n06$b n06$b = new n06$b((Class)eh8.class, new Class[] { fic.class, gic.class }, (n06$a)null);
        n06$b.a(new oo8((Class)Context.class, 1, 0));
        n06$b.a(new oo8((Class)yza.class, 1, 0));
        n06$b.a(new oo8((Class)eic.class, 2, 0));
        n06$b.a(new oo8((Class)q8w.class, 1, 1));
        n06$b.e = (e16)ho0.G0;
        list.add(n06$b.b());
        list.add(w9f.a("fire-android", String.valueOf(Build$VERSION.SDK_INT)));
        list.add(w9f.a("fire-core", "20.1.1"));
        list.add(w9f.a("device-name", b(Build.PRODUCT)));
        list.add(w9f.a("device-model", b(Build.DEVICE)));
        list.add(w9f.a("device-brand", b(Build.BRAND)));
        list.add(w9f.b("android-target-sdk", (w9f$a)soo.N0));
        list.add(w9f.b("android-min-sdk", (w9f$a)f71.N0));
        list.add(w9f.b("android-platform", (w9f$a)noo.G0));
        list.add(w9f.b("android-installer", (w9f$a)c71.L0));
        while (true) {
            try {
                string = ise.H0.toString();
                if (string != null) {
                    list.add(w9f.a("kotlin", string));
                }
                return list;
            }
            catch (final NoClassDefFoundError noClassDefFoundError) {
                continue;
            }
            break;
        }
    }
}
