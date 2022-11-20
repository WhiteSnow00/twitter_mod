import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import com.twitter.analytics.tracking.a;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s07 implements szd<r07>
{
    public final Activity a;
    public final NavigationHandler b;
    public final hag c;
    public final com.twitter.analytics.tracking.a d;
    public final h7k e;
    
    public s07(final Activity a, final NavigationHandler b, final hag c, final com.twitter.analytics.tracking.a d, final h7k e) {
        czd.f((Object)a, "hostingActivity");
        czd.f((Object)b, "navigationHandler");
        czd.f((Object)c, "loginController");
        czd.f((Object)d, "appEventTracker");
        czd.f((Object)e, "permissionsController");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final ssr ssr) {
        final dtr b = ((ssr)ssr).b;
        czd.e((Object)b, "subtask.properties");
        final t07 t07 = (t07)b;
        final adw f = this.c.f(t07.j, new hev(t07.k, t07.l), t07.m);
        if (f != null) {
            final int n = t07.n;
            int n2 = 3;
            if (n != 3) {
                n2 = 4;
            }
            this.d.h(n2);
            final UserIdentifier k = f.k();
            czd.e((Object)k, "userInfo.userIdentifier");
            final int size = UserIdentifier.Companion.b().size();
            boolean b2 = true;
            if (size <= 1) {
                b2 = false;
            }
            final Context applicationContext = ((Context)this.a).getApplicationContext();
            final af4 af4 = new af4(k);
            ((u0p)af4).T = vba.Companion.e("signup", "", "", "", "success").toString();
            final int a = c5j.a;
            this.e.a(af4);
            this.d.a(af4);
            if (b2) {
                ((u0p)af4).B = "sso_sdk";
            }
            cbw.b((elm)af4);
            nza.P1(applicationContext, k, "signup:form:::success", false);
            nza.P1(applicationContext, k, "signup::::success", false);
        }
        final NavigationHandler b3 = this.b;
        final ssv a2 = ((dtr)t07).a;
        czd.c((Object)a2);
        b3.e(a2);
    }
    
    public static final class a extends szd$a<r07>
    {
        public a() {
            super((Class)r07.class);
        }
    }
    
    public static final class b extends szd$b<r07>
    {
        public b(final a a, final pwe<s07> pwe) {
            czd.f((Object)a, "matcher");
            czd.f((Object)pwe, "handler");
            super((szd$a)a, (pwe)pwe);
        }
    }
}
