// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.app.Service;
import java.util.Iterator;
import android.content.Intent;
import java.util.Objects;
import android.os.PowerManager$WakeLock;
import java.util.Map;
import java.util.LinkedHashMap;
import android.content.Context;

public class SystemAlarmService extends zaf implements d$c
{
    public static final String G0;
    public d E0;
    public boolean F0;
    
    static {
        G0 = o9g.g("SystemAlarmService");
    }
    
    public final void a() {
        final d e0 = new d((Context)this);
        this.E0 = e0;
        if (e0.L0 != null) {
            o9g.e().c(d.N0, "A completion listener for SystemAlarmDispatcher already exists.");
        }
        else {
            e0.L0 = (d$c)this;
        }
    }
    
    public final void c() {
        this.F0 = true;
        o9g.e().a(SystemAlarmService.G0, "All commands completed in dispatcher");
        final String a = gix.a;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object o = hix.a;
        synchronized (o) {
            linkedHashMap.putAll(hix.b);
            monitorexit(o);
            o = linkedHashMap.entrySet().iterator();
            while (((Iterator)o).hasNext()) {
                final Map.Entry<PowerManager$WakeLock, V> entry = (Map.Entry<PowerManager$WakeLock, V>)((Iterator)o).next();
                final PowerManager$WakeLock powerManager$WakeLock = entry.getKey();
                final String s = (String)entry.getValue();
                if (powerManager$WakeLock != null && powerManager$WakeLock.isHeld()) {
                    final o9g e = o9g.e();
                    final String a2 = gix.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("WakeLock held for ");
                    sb.append(s);
                    e.h(a2, sb.toString());
                }
            }
            ((Service)this).stopSelf();
        }
    }
    
    public final void onCreate() {
        super.onCreate();
        this.a();
        this.F0 = false;
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.F0 = true;
        final d e0 = this.E0;
        Objects.requireNonNull(e0);
        o9g.e().a(d.N0, "Destroying SystemAlarmDispatcher");
        e0.G0.e((yea)e0);
        e0.L0 = null;
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        super.onStartCommand(intent, n, n2);
        if (this.F0) {
            o9g.e().f(SystemAlarmService.G0, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            final d e0 = this.E0;
            Objects.requireNonNull(e0);
            o9g.e().a(d.N0, "Destroying SystemAlarmDispatcher");
            e0.G0.e((yea)e0);
            e0.L0 = null;
            this.a();
            this.F0 = false;
        }
        if (intent != null) {
            this.E0.a(intent, n2);
        }
        return 3;
    }
}
