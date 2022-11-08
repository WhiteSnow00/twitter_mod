// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.content.pm.ProviderInfo;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.Context;

public final class a
{
    public static f a(final Context context) {
        Object o;
        if (Build$VERSION.SDK_INT >= 28) {
            o = new a$c();
        }
        else {
            o = new b();
        }
        final PackageManager packageManager = context.getPackageManager();
        ri4.r((Object)packageManager, (Object)"Package manager required to locate emoji font provider");
        final Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        final int n = 0;
        final Iterator iterator = packageManager.queryIntentContentProviders(intent, 0).iterator();
        while (true) {
            boolean b;
            do {
                final boolean hasNext = iterator.hasNext();
                final f f = null;
                if (!hasNext) {
                    final ProviderInfo providerInfo = null;
                    dlb dlb = null;
                    Label_0237: {
                        if (providerInfo != null) {
                            try {
                                final String authority = providerInfo.authority;
                                final String packageName = providerInfo.packageName;
                                final Signature[] a = ((a)o).a(packageManager, packageName);
                                final ArrayList<byte[]> list = new ArrayList<byte[]>();
                                for (int length = a.length, i = n; i < length; ++i) {
                                    list.add(a[i].toByteArray());
                                }
                                dlb = new dlb(authority, packageName, "emojicompat-emoji-font", (List)Collections.singletonList(list));
                                break Label_0237;
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                Log.wtf("emoji2.text.DefaultEmojiConfig", (Throwable)ex);
                            }
                        }
                        dlb = null;
                    }
                    f f2;
                    if (dlb == null) {
                        f2 = f;
                    }
                    else {
                        f2 = new f(context, dlb);
                    }
                    return f2;
                }
                final ProviderInfo providerInfo = ((ResolveInfo)iterator.next()).providerInfo;
                b = true;
                if (providerInfo != null) {
                    final ApplicationInfo applicationInfo = providerInfo.applicationInfo;
                    if (applicationInfo != null && (applicationInfo.flags & 0x1) == 0x1) {
                        continue;
                    }
                }
                b = false;
            } while (!b);
            continue;
        }
    }
    
    public static class a
    {
        public Signature[] a(final PackageManager packageManager, final String s) throws PackageManager$NameNotFoundException {
            return packageManager.getPackageInfo(s, 64).signatures;
        }
    }
    
    public static class b extends a
    {
    }
}
