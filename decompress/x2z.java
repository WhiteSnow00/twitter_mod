import com.google.android.play.core.install.InstallException;
import android.content.IntentSender$SendIntentException;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.os.Looper;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x2z implements sp0
{
    public final hxz a;
    public final Context b;
    
    public x2z(final hxz a, final Context b) {
        new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a(final qp0 qp0, final Activity activity) throws IntentSender$SendIntentException {
        final tp0 c = tp0.c();
        final boolean b = false;
        if (activity == null) {
            return false;
        }
        final boolean b2 = qp0.a(c) != null;
        boolean b3 = b;
        if (b2) {
            if (qp0.h) {
                b3 = b;
            }
            else {
                qp0.h = true;
                activity.startIntentSenderForResult(qp0.a(c).getIntentSender(), 1337, (Intent)null, 0, 0, 0, (Bundle)null);
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final crz b() {
        final hxz a = this.a;
        final String packageName = this.b.getPackageName();
        crz crz;
        if (a.a == null) {
            hxz.e.j("onError(%d)", -9);
            crz = llg.h((Exception)new InstallException(-9));
        }
        else {
            hxz.e.l("requestUpdateInfo(%s)", packageName);
            final ffz ffz = new ffz();
            a.a.b((cdy)new coz((Object)a, ffz, (Object)packageName, ffz, 0), ffz);
            crz = ffz.a;
        }
        return crz;
    }
}
