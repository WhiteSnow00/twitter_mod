import android.os.BaseBundle;
import android.os.Build$VERSION;
import android.net.Uri;
import android.os.Bundle;
import android.content.Context;
import android.app.PendingIntent;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwi implements era<bti, Boolean, Intent, uui, PendingIntent>
{
    public final Context a;
    
    public pwi(final Context a) {
        this.a = a;
    }
    
    public final /* bridge */ Object a(final Object o, final Object o2, final Object o3, final Object o4) {
        return this.b((bti)o, (Boolean)o2, (Intent)o3, (uui)o4);
    }
    
    public final PendingIntent b(final bti bti, final Boolean b, final Intent intent, final uui uui) {
        final Bundle bundle = new Bundle(5);
        ((BaseBundle)bundle).putLong("sb_account_id", bti.B.getId());
        swj.k(bundle, "notification_info", (Object)bti, (nmp)bti.Z);
        final uui$b b2 = uui$b.b;
        swj.k(bundle, "extra_scribe_info", (Object)uui, (nmp)b2);
        swj.k(bundle, "extra_scribe_info_background", (Object)uui, (nmp)b2);
        intent.setData(Uri.withAppendedPath(pgv$l.a, String.valueOf(bti))).putExtras(bundle);
        int n;
        if (Build$VERSION.SDK_INT >= 23) {
            n = 335544320;
        }
        else {
            n = 268435456;
        }
        if (b) {
            final jds jds = new jds(this.a);
            jds.i(intent.getComponent());
            jds.F0.add(intent);
            jds.j(0).putExtra("AbsFragmentActivity_intent_origin", pwi.class.getName());
            swj.m(jds.j(0), "AbsFragmentActivity_account_user_identifier", bti.B);
            return jds.m(0, n);
        }
        return PendingIntent.getActivity(this.a, 0, intent, n);
    }
}
