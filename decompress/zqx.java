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

public final class zqx
{
    public static final Map<Context, m9r<Float>> a;
    
    static {
        zqx.a = new LinkedHashMap();
    }
    
    public static final m9r a(final Context context) {
        final LinkedHashMap a = zqx.a;
        synchronized (a) {
            Object o;
            if ((o = a.get(context)) == null) {
                final ContentResolver contentResolver = context.getContentResolver();
                final Uri uri = Settings$Global.getUriFor("animator_duration_scale");
                final xp3 b = eg8.b(-1, null, 6);
                final cqo cqo = new cqo((hub)new xqx(contentResolver, uri, new yqx(b, fcc.a(Looper.getMainLooper())), b, context, (mp6)null));
                final p06 w = jb2.w();
                final nk8 a2 = j29.a;
                final yo6 yo6 = new yo6(yy6$a$a.c((yy6$a)w, (yy6)aig.a));
                Objects.requireNonNull(czp.Companion);
                o = ac8.F((e8b)cqo, (iz6)yo6, (czp)new c9r(0L, Long.MAX_VALUE), (Object)Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                a.put(context, o);
            }
            return (m9r)o;
        }
    }
    
    public static final xe6 b(final View view) {
        e0e.f((Object)view, "<this>");
        final Object tag = view.getTag(2131427595);
        xe6 xe6;
        if (tag instanceof xe6) {
            xe6 = (xe6)tag;
        }
        else {
            xe6 = null;
        }
        return xe6;
    }
    
    public static final void c(final View view, final xe6 xe6) {
        e0e.f((Object)view, "<this>");
        view.setTag(2131427595, (Object)xe6);
    }
}
