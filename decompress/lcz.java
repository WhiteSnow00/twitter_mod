import android.util.Log;
import java.util.Map;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Collections;
import com.twitter.util.user.UserIdentifier;
import android.view.WindowManager;
import android.util.DisplayMetrics;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcz implements edz, h6, srg
{
    public final Object F0;
    
    public lcz() {
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager)q10.a().S3().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.F0 = beq.g(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
    
    public lcz(final UserIdentifier f0, final kcm kcm, final h5c h5c, final tfx tfx) {
        e0e.f((Object)f0, "currentUserIdentifier");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)h5c, "globalUriNavigator");
        e0e.f((Object)tfx, "visitedUrlRepository");
        this.F0 = f0;
        final rmv b = ita.b();
        boolean b2 = false;
        final boolean b3 = b.b("nudges_android_article_enable_visited_url_tracking", false);
        if (f0.getId() > 0L) {
            b2 = true;
        }
        if (b2 && b3) {
            final sfx sfx = new sfx(this, tfx);
            if (!h5c.e.contains(sfx)) {
                h5c.e.add(sfx);
            }
            kcm.i((sj)new iei((Object)h5c, (Object)sfx, 8));
        }
    }
    
    public lcz(final Object f0) {
        this.F0 = f0;
    }
    
    public lcz(final m9z f0) {
        this.F0 = f0;
    }
    
    public final Object a() {
        final scz scz = (scz)this.F0;
        final Cursor query = scz.a.query(scz.b, scz.h, (String)null, (String[])null, (String)null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            final int count = query.getCount();
            Map<Object, Object> map;
            if (count == 0) {
                map = Collections.emptyMap();
                query.close();
            }
            else {
                if (count <= 256) {
                    map = (Map<Object, Object>)new ws0<String, String>(count);
                }
                else {
                    map = (Map<Object, Object>)new HashMap<String, String>(count, 1.0f);
                }
                while (query.moveToNext()) {
                    map.put(query.getString(0), query.getString(1));
                }
            }
            return map;
        }
        finally {
            query.close();
        }
    }
    
    public final long b() {
        return ((dwg)this.F0).a.length();
    }
    
    public final int c() {
        return -1;
    }
    
    public final String d() {
        return c0h.a((hp6)this.F0);
    }
    
    public final boolean e() {
        return ((m9z)this.F0).i() && Log.isLoggable(((m9z)this.F0).b().v(), 3);
    }
    
    public final c3 g() {
        if (c0h.c((hp6)this.F0) != -1L) {
            return (c3)new cev(c0h.c((hp6)this.F0));
        }
        return (c3)c3.b;
    }
}
