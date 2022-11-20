import android.os.Handler;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vsy extends kay
{
    public bm1 a;
    public final int b;
    
    public vsy(final bm1 a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void x(final int n, final IBinder binder, final Bundle bundle) {
        eli.r(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        final bm1 a = this.a;
        final int b = this.b;
        final uiy n2 = a.N0;
        ((Handler)n2).sendMessage(((Handler)n2).obtainMessage(1, b, -1, (Object)new f2z(a, n, binder, bundle)));
        this.a = null;
    }
}
