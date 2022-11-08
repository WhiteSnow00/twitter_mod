// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public abstract class ConstraintProxy extends BroadcastReceiver
{
    public static final String a;
    
    static {
        a = y9g.g("ConstraintProxy");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final y9g e = y9g.e();
        final String a = ConstraintProxy.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("onReceive : ");
        sb.append(intent);
        e.a(a, sb.toString());
        context.startService(androidx.work.impl.background.systemalarm.a.a(context));
    }
}
