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

public final class j1z implements wp0
{
    public final vvz a;
    public final Context b;
    
    public j1z(final vvz a, final Context b) {
        new Handler(Looper.getMainLooper());
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final up0 up0, final Activity activity) throws IntentSender$SendIntentException {
        final xp0 c = xp0.c();
        final boolean b = false;
        if (activity == null) {
            return false;
        }
        final boolean b2 = up0.a(c) != null;
        boolean b3 = b;
        if (b2) {
            if (up0.h) {
                b3 = b;
            }
            else {
                up0.h = true;
                activity.startIntentSenderForResult(up0.a(c).getIntentSender(), 1337, (Intent)null, 0, 0, 0, (Bundle)null);
                b3 = true;
            }
        }
        return b3;
    }
    
    public final ppz b() {
        final vvz a = this.a;
        final String packageName = this.b.getPackageName();
        ppz ppz;
        if (a.a == null) {
            vvz.e.k("onError(%d)", new Object[] { -9 });
            ppz = m0n.T0((Exception)new InstallException(-9));
        }
        else {
            vvz.e.n("requestUpdateInfo(%s)", new Object[] { packageName });
            final sdz sdz = new sdz();
            a.a.b(new pmz(a, sdz, packageName, sdz, 0), sdz);
            ppz = sdz.a;
        }
        return ppz;
    }
}
