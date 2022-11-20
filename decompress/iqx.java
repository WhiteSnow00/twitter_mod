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

public final class iqx
{
    public static final Map<Context, n8r<Float>> a;
    
    static {
        iqx.a = new LinkedHashMap();
    }
    
    public static final n8r a(final Context context) {
        final LinkedHashMap a = iqx.a;
        synchronized (a) {
            Object o;
            if ((o = a.get(context)) == null) {
                final ContentResolver contentResolver = context.getContentResolver();
                final Uri uri = Settings$Global.getUriFor("animator_duration_scale");
                final yo3 e = g97.e(-1, (vq2)null, 6);
                final jpo jpo = new jpo((ftb)new gqx(contentResolver, uri, new hqx(e, dbc.a(Looper.getMainLooper())), (yo3<fzv>)e, context, null));
                final jz5 f = g97.f();
                final ij8 a2 = b19.a;
                final sn6 sn6 = new sn6(sx6$a$a.c((sx6$a)f, (sx6)hhg.a));
                Objects.requireNonNull(fyp.Companion);
                o = blz.Z((d7b)jpo, (cy6)sn6, (fyp)new e8r(0L, Long.MAX_VALUE), Settings$Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                a.put(context, o);
            }
            return (n8r)o;
        }
    }
    
    public static final qd6 b(final View view) {
        czd.f((Object)view, "<this>");
        final Object tag = view.getTag(2131427595);
        qd6 qd6;
        if (tag instanceof qd6) {
            qd6 = (qd6)tag;
        }
        else {
            qd6 = null;
        }
        return qd6;
    }
    
    public static final void c(final View view, final qd6 qd6) {
        czd.f((Object)view, "<this>");
        view.setTag(2131427595, (Object)qd6);
    }
}
