import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zs1 extends vk2<Boolean>
{
    public zs1(final Context context, final gcs gcs) {
        super(context, gcs);
    }
    
    @Override
    public final Object a() {
        final Intent registerReceiver = super.b.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        Boolean b;
        if (registerReceiver == null) {
            o9g.e().c(at1.a, "getInitialState - null intent received");
            b = Boolean.FALSE;
        }
        else {
            final int intExtra = registerReceiver.getIntExtra("status", -1);
            final float n = registerReceiver.getIntExtra("level", -1) / (float)registerReceiver.getIntExtra("scale", -1);
            boolean b2 = true;
            if (intExtra != 1) {
                b2 = (n > 0.15f && b2);
            }
            b = b2;
        }
        return b;
    }
    
    @Override
    public final IntentFilter f() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
    
    @Override
    public final void g(final Intent intent) {
        czd.f((Object)intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        final o9g e = o9g.e();
        final String a = at1.a;
        final StringBuilder j = fu8.j("Received ");
        j.append(intent.getAction());
        e.a(a, j.toString());
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653) {
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        this.c(Boolean.FALSE);
                    }
                }
            }
            else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                this.c(Boolean.TRUE);
            }
        }
    }
}
