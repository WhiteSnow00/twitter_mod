import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qfl
{
    public static final qfl a;
    public static final AtomicInteger b;
    public static final HashMap<UserIdentifier, v1k> c;
    
    static {
        a = new qfl();
        b = new AtomicInteger();
        c = new HashMap<UserIdentifier, v1k>(2);
    }
    
    public static final void a(final Context context, final ocw ocw, final v1k v1k) {
        zzd.f((Object)context, "context");
        zzd.f((Object)ocw, "userInfo");
        zzd.f((Object)v1k, "pendingProfile");
        final aav d2 = aav.d2(ocw.k());
        zzd.e((Object)d2, "get(userInfo.userIdentifier)");
        b(context, ocw, v1k, null, "edit_profile", d2);
    }
    
    public static final void b(Context applicationContext, ocw ocw, v1k b1, final a a, final String s, final aav aav) {
        zzd.f((Object)applicationContext, "context");
        zzd.f((Object)ocw, "userInfo");
        zzd.f((Object)b1, "pendingProfile");
        zzd.f((Object)aav, "twDatabaseHelper");
        final b4w b4w = new b4w(applicationContext, ocw.k(), ocw.getUser(), s, aav);
        ((kcl)b4w).b1 = b1;
        ((kcl)b4w).e1 = qfl.b.incrementAndGet();
        ((g4w)b4w).Y0 = 1;
        final int a2 = w4j.a;
        final UserIdentifier k = ocw.k();
        zzd.e((Object)k, "userInfo.userIdentifier");
        b1.m = ((kcl)b4w).e1;
        ocw = (ocw)qfl.c;
        synchronized (ocw) {
            b1 = ((HashMap<UserIdentifier, v1k>)ocw).put(k, b1);
            monitorexit(ocw);
            ocw = (ocw)psc.c();
            applicationContext = applicationContext.getApplicationContext();
            zzd.e((Object)applicationContext, "context.applicationContext");
            ((kmm)b4w).U((cw0$b)new qfl.qfl$b(applicationContext, a));
            ((psc)ocw).f((ksc)b4w);
        }
    }
    
    public interface a
    {
    }
}
