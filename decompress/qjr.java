import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qjr extends ll2<Boolean>
{
    public qjr(final Context context, final ycs ycs) {
        super(context, ycs);
    }
    
    public final Object a() {
        final Context b = super.b;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        final Intent registerReceiver = b.registerReceiver((BroadcastReceiver)null, intentFilter);
        final boolean b2 = false;
        if (registerReceiver != null) {
            if (registerReceiver.getAction() != null) {
                final String action = registerReceiver.getAction();
                boolean b3 = b2;
                if (action == null) {
                    return b3;
                }
                final int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                    b3 = b2;
                    return b3;
                }
                if (hashCode != -730838620) {
                    b3 = b2;
                    return b3;
                }
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    b3 = b2;
                    return b3;
                }
            }
        }
        return true;
    }
    
    @Override
    public final IntentFilter f() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
    
    @Override
    public final void g(final Intent intent) {
        e0e.f((Object)intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        final jag e = jag.e();
        final String a = rjr.a;
        final StringBuilder f = ehk.f("Received ");
        f.append(intent.getAction());
        e.a(a, f.toString());
        final String action = intent.getAction();
        if (action != null) {
            final int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        this.c((Object)Boolean.TRUE);
                    }
                }
            }
            else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                this.c((Object)Boolean.FALSE);
            }
        }
    }
}
