import android.os.Handler;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsy extends u9y
{
    public fm1 a;
    public final int b;
    
    public jsy(final fm1 a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void x(final int n, final IBinder binder, final Bundle bundle) {
        xd.u((Object)this.a, (Object)"onPostInitComplete can be called only once per call to getRemoteService");
        final fm1 a = this.a;
        final int b = this.b;
        final diy m0 = a.M0;
        ((Handler)m0).sendMessage(((Handler)m0).obtainMessage(1, b, -1, (Object)new q1z(a, n, binder, bundle)));
        this.a = null;
    }
}
