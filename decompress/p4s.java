import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p4s implements rvo
{
    public static final String D0;
    public final Context C0;
    
    static {
        D0 = y9g.g("SystemAlarmScheduler");
    }
    
    public p4s(final Context context) {
        this.C0 = context.getApplicationContext();
    }
    
    public final void c(final String s) {
        final Context c0 = this.C0;
        final String g0 = a.G0;
        final Intent intent = new Intent(c0, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        this.C0.startService(intent);
    }
    
    public final void d(final bsx... array) {
        for (final bsx bsx : array) {
            final y9g e = y9g.e();
            final String d0 = p4s.D0;
            final StringBuilder g = w48.g("Scheduling work with workSpecId ");
            g.append(bsx.a);
            e.a(d0, g.toString());
            this.C0.startService(a.d(this.C0, lr0.u(bsx)));
        }
    }
    
    public final boolean e() {
        return true;
    }
}
