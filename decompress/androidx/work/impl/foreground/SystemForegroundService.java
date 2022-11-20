// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.foreground;

import android.app.Service;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.UUID;
import android.text.TextUtils;
import java.util.Objects;
import android.content.Intent;
import android.app.Notification;
import android.os.Looper;
import android.app.NotificationManager;
import android.os.Handler;

public class SystemForegroundService extends zaf implements a$a
{
    public static final String I0;
    public Handler E0;
    public boolean F0;
    public a G0;
    public NotificationManager H0;
    
    static {
        I0 = o9g.g("SystemFgService");
    }
    
    public final void a() {
        this.E0 = new Handler(Looper.getMainLooper());
        this.H0 = (NotificationManager)((Context)this).getApplicationContext().getSystemService("notification");
        final a g0 = new a(((Context)this).getApplicationContext());
        this.G0 = g0;
        if (g0.L0 != null) {
            o9g.e().c(a.M0, "A callback already exists.");
        }
        else {
            g0.L0 = (a$a)this;
        }
    }
    
    public final void c(final int n, final int n2, final Notification notification) {
        this.E0.post((Runnable)new SystemForegroundService$a(this, n, notification, n2));
    }
    
    public final void onCreate() {
        super.onCreate();
        this.a();
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.G0.g();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.F0) {
            o9g.e().f(SystemForegroundService.I0, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.G0.g();
            this.a();
            this.F0 = false;
        }
        if (intent != null) {
            final a g0 = this.G0;
            Objects.requireNonNull(g0);
            final String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                final o9g e = o9g.e();
                final String m0 = a.M0;
                final StringBuilder sb = new StringBuilder();
                sb.append("Started foreground service ");
                sb.append(intent);
                e.f(m0, sb.toString());
                ((bsx)g0.E0).a((Runnable)new p5s(g0, intent.getStringExtra("KEY_WORKSPEC_ID")));
                g0.e(intent);
            }
            else if ("ACTION_NOTIFY".equals(action)) {
                g0.e(intent);
            }
            else if ("ACTION_CANCEL_WORK".equals(action)) {
                final o9g e2 = o9g.e();
                final String m2 = a.M0;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Stopping foreground work for ");
                sb2.append(intent);
                e2.f(m2, sb2.toString());
                final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty((CharSequence)stringExtra)) {
                    final zrx d0 = g0.D0;
                    final UUID fromString = UUID.fromString(stringExtra);
                    Objects.requireNonNull(d0);
                    ((bsx)d0.d).a((Runnable)new if3(d0, fromString));
                }
            }
            else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                o9g.e().f(a.M0, "Stopping foreground service");
                final a$a l0 = g0.L0;
                if (l0 != null) {
                    final SystemForegroundService systemForegroundService = (SystemForegroundService)l0;
                    systemForegroundService.F0 = true;
                    o9g.e().a(SystemForegroundService.I0, "All commands completed.");
                    if (Build$VERSION.SDK_INT >= 26) {
                        ((Service)systemForegroundService).stopForeground(true);
                    }
                    ((Service)systemForegroundService).stopSelf();
                }
            }
        }
        return 3;
    }
}
