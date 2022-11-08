// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver$PendingResult;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver
{
    public static final String a;
    
    static {
        a = y9g.g("ConstrntProxyUpdtRecvr");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        }
        else {
            action = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            final y9g e = y9g.e();
            final String a = ConstraintProxyUpdateReceiver.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Ignoring unknown action ");
            sb.append(action);
            e.a(a, sb.toString());
        }
        else {
            ((krx)irx.i(context).d).a((Runnable)new Runnable() {
                public final /* synthetic */ BroadcastReceiver$PendingResult E0 = this.goAsync();
                
                @Override
                public final void run() {
                    try {
                        final boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                        final boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                        final boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                        final boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Updating proxies: (BatteryNotLowProxy (");
                        sb.append(booleanExtra);
                        sb.append("), BatteryChargingProxy (");
                        sb.append(booleanExtra2);
                        sb.append("), StorageNotLowProxy (");
                        sb.append(booleanExtra3);
                        sb.append("), NetworkStateProxy (");
                        sb.append(booleanExtra4);
                        sb.append("), ");
                        y9g.e().a(ConstraintProxyUpdateReceiver.a, sb.toString());
                        hrj.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                        hrj.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                        hrj.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                        hrj.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    }
                    finally {
                        this.E0.finish();
                    }
                }
            });
        }
    }
}
