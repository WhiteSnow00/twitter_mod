import java.util.List;
import android.content.DialogInterface;
import java.util.concurrent.Executor;
import j$.util.concurrent.ConcurrentHashMap;
import com.twitter.util.user.UserIdentifier;
import com.twitter.onboarding.ocf.NavigationHandler;
import android.util.Printer;
import android.os.Build$VERSION;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oty implements wqy, ax8
{
    public final Object C0 = c0;
    public final Object D0 = d0;
    public Object E0 = e0;
    public final Object F0 = f0;
    
    public final void b(final DialogInterface dialogInterface, final int n) {
        zzd.f((Object)dialogInterface, "dialog");
        xrv xrv;
        if (!pjr.e((CharSequence)((List)this.F0).get(0).a.toString())) {
            xrv = ((List)this.F0).get(0).a;
        }
        else {
            xrv = ((lsr)this.C0).a;
            zzd.c((Object)xrv);
        }
        xrv xrv2;
        if (!pjr.e((CharSequence)((List)this.F0).get(1).a.toString())) {
            xrv2 = ((List)this.F0).get(1).a;
        }
        else {
            xrv2 = ((lsr)this.C0).b;
            zzd.c((Object)xrv2);
        }
        if (n != -2) {
            if (n != -1) {
                ((NavigationHandler)this.D0).e(xrv2);
            }
            else {
                ((NavigationHandler)this.D0).e(xrv);
            }
        }
        else {
            ((NavigationHandler)this.D0).e(xrv2);
        }
    }
    
    public final vbc$a d(final int n) {
        String i = ((List)this.F0).get(0).c;
        if (i == null) {
            i = ((List)this.F0).get(0).a.c;
        }
        String k = ((List)this.F0).get(1).c;
        if (k == null) {
            k = ((List)this.F0).get(1).a.c;
        }
        final ybc$a ybc$a = new ybc$a();
        ybc$a.m = null;
        ybc$a.o = 2;
        final iej f = ((lsr)this.C0).f;
        ybc$a.h = (xwm)f.a;
        ybc$a.j = (xwm)f.b;
        ybc$a.i = i;
        ybc$a.k = k;
        ybc$a.l = true;
        final ybc ybc = (ybc)((h4j)ybc$a).e();
        final vbc$a vbc$a = new vbc$a(n);
        ((clp$a)vbc$a).z((Object)ybc);
        return vbc$a;
    }
    
    public final void k(final DialogInterface dialogInterface, final int n) {
        zzd.f((Object)dialogInterface, "dialog");
        ((NavigationHandler)this.D0).b();
    }
}
