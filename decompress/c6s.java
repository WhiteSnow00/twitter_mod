import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c6s implements cxo
{
    public static final String G0;
    public final Context F0;
    
    static {
        G0 = jag.g("SystemAlarmScheduler");
    }
    
    public c6s(final Context context) {
        this.F0 = context.getApplicationContext();
    }
    
    public final void c(final String s) {
        final Context f0 = this.F0;
        final String j0 = a.J0;
        final Intent intent = new Intent(f0, (Class)SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", s);
        this.F0.startService(intent);
    }
    
    public final void d(final ktx... array) {
        for (final ktx ktx : array) {
            final jag e = jag.e();
            final String g0 = c6s.G0;
            final StringBuilder f = ehk.f("Scheduling work with workSpecId ");
            f.append(ktx.a);
            e.a(g0, f.toString());
            this.F0.startService(a.d(this.F0, eg8.O(ktx)));
        }
    }
    
    public final boolean e() {
        return true;
    }
}
