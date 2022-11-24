import android.content.Intent;
import android.annotation.TargetApi;
import android.app.Activity;
import java.util.Objects;
import android.os.Handler;
import android.os.Looper;
import android.view.View$OnClickListener;
import android.content.Context;
import android.os.Build$VERSION;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cyi implements eo6
{
    public static final cyi.cyi$b Companion;
    public final dob F0;
    public final NavigationHandler G0;
    public final u7k H0;
    public final k9x I0;
    public final fda<l7k> J0;
    public final str K0;
    public final ayi L0;
    
    static {
        Companion = new cyi.cyi$b();
    }
    
    public cyi(final dob f0, final bur bur, final NavigationHandler g0, final byi byi, final u7k h0, final pev pev, final k9x i0, final fda<l7k> j0, final str k0) {
        e0e.f((Object)bur, "subtaskProperties");
        e0e.f((Object)g0, "navigationHandler");
        e0e.f((Object)byi, "notificationsPermissionPromptViewHolder");
        e0e.f((Object)pev, "notificationManager");
        e0e.f((Object)i0, "viewLifecycle");
        e0e.f((Object)j0, "permissionResultObservable");
        e0e.f((Object)k0, "subtaskContentViewProvider");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        final ayi l0 = (ayi)bur;
        this.L0 = l0;
        final int p9 = l0.p;
        final boolean b = p9 == 2 || (Build$VERSION.SDK_INT < 26 && p9 == 0);
        if (pev.l()) {
            this.d("auto_navigate");
        }
        else if (b) {
            this.b("auto_navigate");
        }
        else {
            if (zjl.J0 == l0.o) {
                if (Build$VERSION.SDK_INT >= 33 && h0.f((Context)f0, "android.permission.POST_NOTIFICATIONS") != 3) {
                    this.e();
                }
                else {
                    this.f();
                }
            }
            String c;
            if ((c = l0.k.c) == null) {
                c = "";
            }
            final fsf fsf = new fsf((Object)this, 18);
            ((rrt)byi.H0).o0((CharSequence)c);
            ((rrt)byi.H0).n0((View$OnClickListener)fsf);
            final String c2 = l0.l.c;
            final zdp zdp = new zdp((Object)this, 1);
            byi.H0.r0((CharSequence)c2);
            byi.H0.q0((View$OnClickListener)zdp);
            this.a("", "impression");
            new Handler(Looper.getMainLooper()).post((Runnable)new htl((Object)this, (Object)pev, 7));
        }
        n7k.c((fda)j0, new int[] { 1981 }, (stb)new cyi$a(this));
        final gcu$c m = gcu.Companion.a().i();
        ((gcu$d)m).f("notification_permission_checked", true);
        m.e();
    }
    
    public final void a(final String s, final String s2) {
        sbw.b((tlm)new fg4(new String[] { "notification_prompt", "", "", s, s2 }));
    }
    
    public final void b(final String s) {
        final NavigationHandler g0 = this.G0;
        final cyi.cyi$b companion = cyi.Companion;
        final ayi l0 = this.L0;
        final dtv n = l0.n;
        final dtv i = l0.l;
        Objects.requireNonNull(companion);
        dtv dtv = n;
        if (n == null) {
            dtv = i;
        }
        g0.e(dtv);
        this.a(s, "denied_link");
    }
    
    public final vn6 c() {
        return (vn6)this.K0.K0;
    }
    
    public final void d(final String s) {
        final NavigationHandler g0 = this.G0;
        final cyi.cyi$b companion = cyi.Companion;
        final ayi l0 = this.L0;
        final dtv m = l0.m;
        final dtv k = l0.k;
        Objects.requireNonNull(companion);
        dtv dtv = m;
        if (m == null) {
            dtv = k;
        }
        g0.e(dtv);
        this.a(s, "granted_link");
    }
    
    @TargetApi(33)
    public final void e() {
        this.H0.i(1981, (Activity)this.F0, new String[] { "android.permission.POST_NOTIFICATIONS" });
        this.a("navigate", "system_permission");
    }
    
    @TargetApi(26)
    public final void f() {
        ((Context)this.F0).startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").setFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", ((Context)this.F0).getApplicationInfo().packageName));
        this.a("navigate", "system_settings");
    }
}
