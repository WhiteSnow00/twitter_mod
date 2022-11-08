import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import j$.util.DesugarTimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knq
{
    public static final knq a;
    public static final SimpleDateFormat b;
    
    static {
        a = new knq();
        final SimpleDateFormat b2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS", Locale.US);
        b2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        b = b2;
    }
    
    public final CharSequence a(final Context context, final hfv hfv, final List<? extends hfv> list) {
        zzd.f((Object)hfv, "broadcaster");
        zzd.f((Object)list, "guests");
        if (hfv.c() == null) {
            final String string = context.getString(2131952834);
            zzd.e((Object)string, "context.getString(R.stri\u2026fleet_item_space_unknown)");
            return string;
        }
        final ArrayList list2 = new ArrayList();
        for (final hfv next : list) {
            if (true ^ zzd.a((Object)next.J0, (Object)hfv.J0)) {
                list2.add(next);
            }
        }
        final int size = list2.size();
        String s;
        if (size == 0) {
            s = context.getResources().getString(2131952832, new Object[] { hfv.c() });
            zzd.e((Object)s, "{\n            context.re\u2026er.displayName)\n        }");
        }
        else {
            s = context.getResources().getQuantityString(2131820558, size, new Object[] { hfv.c(), size });
            zzd.e((Object)s, "{\n            context.re\u2026s\n            )\n        }");
        }
        return s;
    }
    
    public final CharSequence b(final Context context, final hfv hfv, String s, final lh5 lh5) {
        zzd.f((Object)hfv, "broadcaster");
        if (s == null || ckr.h1((CharSequence)s)) {
            if (lh5 == null || (s = lh5.k) == null) {
                s = hfv.c();
            }
            s = context.getResources().getString(2131954093, new Object[] { s });
            zzd.e((Object)s, "{\n            val name =\u2026untitled, name)\n        }");
        }
        return s;
    }
}
