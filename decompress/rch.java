import java.util.List;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.ArrayList;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rch
{
    public static final AtomicReference<rch> b;
    public t36 a;
    
    static {
        b = new AtomicReference<rch>();
    }
    
    @RecentlyNonNull
    public static rch c() {
        final rch rch = rch.b.get();
        iuk.H(rch != null, (Object)"MlKitContext has not been initialized");
        return rch;
    }
    
    @RecentlyNonNull
    public static rch d(@RecentlyNonNull Context context) {
        final rch rch = new rch();
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        final List a = new i26((Object)context, (i26$c)new i26$b((Class)MlKitComponentDiscoveryService.class, (i26$a)null)).a();
        final i000 a2 = ads.a;
        final ArrayList list = new ArrayList();
        final ArrayList<t16> list2 = new ArrayList<t16>();
        list.addAll(a);
        boolean b = false;
        list2.add(t16.d((Object)context, (Class)Context.class, new Class[0]));
        list2.add(t16.d((Object)rch, (Class)rch.class, new Class[0]));
        (rch.a = new t36((Executor)a2, (Iterable)list, (Collection)list2, (t36$a)null)).u0(true);
        if (rch.b.getAndSet(rch) == null) {
            b = true;
        }
        iuk.H(b, (Object)"MlKitContext is already initialized");
        return rch;
    }
    
    @RecentlyNonNull
    public final <T> T a(@RecentlyNonNull final Class<T> clazz) {
        iuk.H(rch.b.get() == this, (Object)"MlKitContext has been deleted");
        iuk.C((Object)this.a);
        return (T)((eb)this.a).f(clazz);
    }
    
    @RecentlyNonNull
    public final Context b() {
        return this.a(Context.class);
    }
}
