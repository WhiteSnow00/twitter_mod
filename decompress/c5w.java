import java.util.Iterator;
import android.net.Uri$Builder;
import java.util.Map;
import android.net.Uri;
import java.util.Objects;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5w
{
    public static final a Companion;
    public final Activity a;
    public final UserIdentifier b;
    public final c7f c;
    
    static {
        Companion = new a();
    }
    
    public c5w(final Activity activity, final UserIdentifier userIdentifier) {
        zzd.f((Object)activity, "activity");
        zzd.f((Object)userIdentifier, "userId");
        this(activity, userIdentifier, c7f.Companion.a());
    }
    
    public c5w(final Activity a, final UserIdentifier b, final c7f c) {
        zzd.f((Object)a, "activity");
        zzd.f((Object)b, "userId");
        zzd.f((Object)c, "legacyUriNavigator");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final zdf zdf) {
        zzd.f((Object)zdf, "sourceLink");
        this.c.c((Context)this.a, c5w.a.a(c5w.Companion, zdf), null, this.b, null);
    }
    
    public final void b(final qp2 qp2, final w5w w5w, final String s, final String s2, final jev jev, final String s3) {
        zzd.f((Object)w5w, "url");
        this.c.b((Context)this.a, qp2, w5w, this.b, s, s2, jev, s3);
    }
    
    public final void c(final String s) {
        zzd.f((Object)s, "sourceUrl");
        this.c.c((Context)this.a, s, null, this.b, null);
    }
    
    public static final class a
    {
        public static final String a(final a a, final zdf zdf) {
            Objects.requireNonNull(a);
            final fov c = zdf.c;
            final String b = zdf.b;
            zzd.e((Object)b, "link.url");
            String string;
            if (c != null) {
                final Uri$Builder buildUpon = Uri.parse(b).buildUpon();
                final Map a2 = c.b.a;
                zzd.e((Object)a2, "it.requestParams.requestParamsMap");
                for (final Map.Entry<String, V> entry : a2.entrySet()) {
                    final String s = entry.getKey();
                    final String s2 = (String)entry.getValue();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append(",");
                    sb.append(s2);
                    buildUpon.appendQueryParameter("lrp", sb.toString());
                }
                string = buildUpon.build().toString();
            }
            else {
                string = null;
            }
            if (string == null) {
                string = b;
            }
            return string;
        }
    }
}
