import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dm9
{
    public dm9(final Resources resources) {
        po.b().m();
    }
    
    public static String a() {
        return fcu.c().j("extra_dtab", "").trim();
    }
    
    public static boolean b() {
        final boolean d = xes.d;
        boolean b = false;
        if (!d) {
            po.b().t();
        }
        else if (fcu.c().e("extra_dtab_enabled", false)) {
            b = true;
        }
        return b;
    }
}
