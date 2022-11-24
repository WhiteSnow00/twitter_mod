import java.util.Objects;
import android.net.Uri;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5g
{
    public a a;
    public final e39 b;
    public final Context c;
    
    public a5g(final Context c) {
        this.a = null;
        this.b = new e39();
        this.c = c;
    }
    
    public static Context a(final WeakReference<Activity> weakReference) {
        final Activity activity = weakReference.get();
        if (activity != null && !activity.isDestroyed() && !activity.isFinishing()) {
            return ((Context)activity).getApplicationContext();
        }
        return null;
    }
    
    public static gcu c(final UserIdentifier userIdentifier) {
        final StringBuilder sb = new StringBuilder();
        sb.append("profile");
        sb.append(userIdentifier);
        return fcu.f(sb.toString());
    }
    
    public static void e(final UserIdentifier userIdentifier) {
        c(userIdentifier).i().a("ht").e();
    }
    
    public static void f(final UserIdentifier userIdentifier) {
        final gcu$c i = c(userIdentifier).i();
        final g5s a = nq1.a;
        i.c("ht", System.currentTimeMillis()).e();
    }
    
    public final String b(final qgv qgv) {
        if (qgv != null && !this.d(qgv)) {
            return Uri.fromFile(qds.o(this.c, qgv.f())).toString();
        }
        return null;
    }
    
    public final boolean d(final qgv qgv) {
        final long d = c(qgv.f()).d("ht", 0L);
        int n = 1;
        int n2 = 1;
        if (d != 0L) {
            final g5s a = nq1.a;
            if (d + 600000L >= System.currentTimeMillis()) {
                n2 = 0;
            }
            n = n2;
            if (n2 != 0) {
                e(qgv.f());
                final bw0 a2 = bw0.a();
                final a5g.a5g$b a5g$b = new a5g.a5g$b(this.c, qgv.f());
                Objects.requireNonNull(a2);
                a2.d(((gj1)a5g$b).c());
                n = n2;
            }
        }
        return n != 0;
    }
    
    public interface a
    {
    }
}
