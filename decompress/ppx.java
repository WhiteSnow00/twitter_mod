import android.view.View;
import android.net.Uri;
import android.content.ContentResolver;
import java.util.Objects;
import android.os.Looper;
import android.provider.Settings$Global;
import java.util.LinkedHashMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppx
{
    public static final Map<Context, r7r<Float>> a;
    
    static {
        ppx.a = new LinkedHashMap();
    }
    
    public static final r7r a(final Context context) {
        final LinkedHashMap a = ppx.a;
        synchronized (a) {
            Object o;
            if ((o = a.get(context)) == null) {
                final ContentResolver contentResolver = context.getContentResolver();
                final Uri uri = Settings$Global.getUriFor("animator_duration_scale");
                final pp3 e = asy.e(-1, (er2)null, 6);
                final roo roo = new roo((gub)new npx(contentResolver, uri, new opx(e, dcc.a(Looper.getMainLooper())), e, context, (ap6)null));
                final zz5 p = ukg.p();
                final zj8 a2 = r19.a;
                final mo6 mo6 = new mo6(oy6$a$a.c((oy6$a)p, (oy6)rhg.a));
                Objects.requireNonNull(pxp.Companion);
                o = goz.R((g8b)roo, (yy6)mo6, (pxp)new i7r(0L, Long.MAX_VALUE), (Object)Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                a.put(context, o);
            }
            return (r7r)o;
        }
    }
    
    public static final le6 b(final View view) {
        zzd.f((Object)view, "<this>");
        final Object tag = view.getTag(2131427595);
        le6 le6;
        if (tag instanceof le6) {
            le6 = (le6)tag;
        }
        else {
            le6 = null;
        }
        return le6;
    }
    
    public static final void c(final View view, final le6 le6) {
        zzd.f((Object)view, "<this>");
        view.setTag(2131427595, (Object)le6);
    }
}
