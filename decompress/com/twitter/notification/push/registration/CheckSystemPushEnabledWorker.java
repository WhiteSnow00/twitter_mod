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
    public static final vba J0;
    public final Context I0;
    
    static {
        Companion = new CheckSystemPushEnabledWorker.CheckSystemPushEnabledWorker$a();
        J0 = new vba("jobs", "", "workmanager", "notifications", "check_system_push");
    }
    
    public CheckSystemPushEnabledWorker(final Context i0, final WorkerParameters workerParameters) {
        czd.f((Object)i0, "context");
        czd.f((Object)workerParameters, "workerParams");
        super(i0, workerParameters);
        this.I0 = i0;
    }
    
    public final c$a g() {
        cbw.b((elm)new af4(CheckSystemPushEnabledWorker.J0));
        final Context i0 = this.I0;
        final qqm e0 = new qqm();
        if (!vew.a(i0)) {
            e0.n((Object)0);
            Log.e("PackageManagerCompat", "User is in locked direct boot mode");
        }
        else {
            final PackageManager packageManager = i0.getPackageManager();
            final int sdk_INT = Build$VERSION.SDK_INT;
            final boolean b = sdk_INT >= 30;
            final boolean b2 = sdk_INT >= 23 && sdk_INT < 30;
            final boolean b3 = lrj.a(packageManager) != null;
            if (!b && (!b2 || !b3)) {
                e0.n((Object)1);
            }
            else {
                final int targetSdkVersion = i0.getApplicationInfo().targetSdkVersion;
                if (targetSdkVersion < 30) {
                    e0.n((Object)0);
                    Log.e("PackageManagerCompat", "Target SDK version below API 30");
                }
                else {
                    int n = 4;
                    if (sdk_INT >= 31) {
                        if (lrj$a.a(i0)) {
                            if (targetSdkVersion >= 31) {
                                n = 5;
                            }
                            e0.n((Object)n);
                        }
                        else {
                            e0.n((Object)2);
                        }
                    }
                    else if (sdk_INT == 30) {
                        if (!lrj$a.a(i0)) {
                            n = 2;
                        }
                        e0.n((Object)n);
                    }
                    else {
                        final y1w y1w = new y1w(i0);
                        ((qd)e0).e((Runnable)new r20((Object)y1w, 1), (Executor)Executors.newSingleThreadExecutor());
                        if (y1w.G0) {
                            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
                        }
                        y1w.G0 = true;
                        y1w.E0 = (qqm<Integer>)e0;
                        i0.bindService(new Intent("android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService").setPackage(lrj.a(i0.getPackageManager())), (ServiceConnection)y1w, 1);
                    }
                }
            }
        }
        final bev r1 = m1f.d().R1();
        czd.e((Object)r1, "get().twitterNotificationManager");
        final boolean l = r1.l();
        final Iterator iterator = UserIdentifier.Companion.b().iterator();
        while (iterator.hasNext()) {
            w9i.W(l, (UserIdentifier)iterator.next());
        }
        final UserIdentifier c = UserIdentifier.Companion.c();
        if (c.isRegularUser()) {
            w9i.V((smf)e0, c);
        }
        if (c.isLoggedOutUser()) {
            final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
            w9i.W(l, logged_OUT);
            w9i.V((smf)e0, logged_OUT);
        }
        return (c$a)new c$a$c();
    }
}
