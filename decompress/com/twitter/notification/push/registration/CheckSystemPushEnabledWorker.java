// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notification.push.registration;

import java.util.Iterator;
import android.content.pm.PackageManager;
import androidx.work.c$a$c;
import com.twitter.util.user.UserIdentifier;
import android.content.ServiceConnection;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.Worker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b" }, d2 = { "Lcom/twitter/notification/push/registration/CheckSystemPushEnabledWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "b", "subsystem.tfa.notifications.push.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class CheckSystemPushEnabledWorker extends Worker
{
    public static final CheckSystemPushEnabledWorker.CheckSystemPushEnabledWorker$a Companion;
    public static final dda L0;
    public final Context K0;
    
    static {
        Companion = new CheckSystemPushEnabledWorker.CheckSystemPushEnabledWorker$a();
        L0 = new dda("jobs", "", "workmanager", "notifications", "check_system_push");
    }
    
    public CheckSystemPushEnabledWorker(final Context k0, final WorkerParameters workerParameters) {
        e0e.f((Object)k0, "context");
        e0e.f((Object)workerParameters, "workerParams");
        super(k0, workerParameters);
        this.K0 = k0;
    }
    
    public final c$a g() {
        sbw.b((tlm)new fg4(CheckSystemPushEnabledWorker.L0));
        final Context k0 = this.K0;
        final erm<Integer> g0 = new erm<Integer>();
        if (!lfw.a(k0)) {
            g0.n(0);
            Log.e("PackageManagerCompat", "User is in locked direct boot mode");
        }
        else {
            final PackageManager packageManager = k0.getPackageManager();
            final int sdk_INT = Build$VERSION.SDK_INT;
            final boolean b = sdk_INT >= 30;
            final boolean b2 = sdk_INT >= 23 && sdk_INT < 30;
            final boolean b3 = asj.a(packageManager) != null;
            if (!b && (!b2 || !b3)) {
                g0.n(1);
            }
            else {
                final int targetSdkVersion = k0.getApplicationInfo().targetSdkVersion;
                if (targetSdkVersion < 30) {
                    g0.n(0);
                    Log.e("PackageManagerCompat", "Target SDK version below API 30");
                }
                else {
                    int n = 4;
                    if (sdk_INT >= 31) {
                        if (asj$a.a(k0)) {
                            if (targetSdkVersion >= 31) {
                                n = 5;
                            }
                            g0.n(n);
                        }
                        else {
                            g0.n(2);
                        }
                    }
                    else if (sdk_INT == 30) {
                        if (!asj$a.a(k0)) {
                            n = 2;
                        }
                        g0.n(n);
                    }
                    else {
                        final n2w n2w = new n2w(k0);
                        g0.e((Runnable)new r20((Object)n2w, 1), (Executor)Executors.newSingleThreadExecutor());
                        if (n2w.I0) {
                            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
                        }
                        n2w.I0 = true;
                        n2w.G0 = g0;
                        k0.bindService(new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(asj.a(k0.getPackageManager())), (ServiceConnection)n2w, 1);
                    }
                }
            }
        }
        final pev r1 = m58.m().R1();
        e0e.e((Object)r1, "get().twitterNotificationManager");
        final boolean l = r1.l();
        final Iterator iterator = UserIdentifier.Companion.b().iterator();
        while (iterator.hasNext()) {
            lai.r(l, (UserIdentifier)iterator.next());
        }
        final UserIdentifier c = UserIdentifier.Companion.c();
        if (c.isRegularUser()) {
            lai.q((pnf)g0, c);
        }
        if (c.isLoggedOutUser()) {
            final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
            lai.r(l, logged_OUT);
            lai.q((pnf)g0, logged_OUT);
        }
        return (c$a)new c$a$c();
    }
}
