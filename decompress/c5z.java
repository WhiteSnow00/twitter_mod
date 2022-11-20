import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c5z implements ServiceConnection
{
    public final String D0;
    public final g5z E0;
    
    public c5z(final g5z e0, final String d0) {
        this.E0 = e0;
        this.D0 = d0;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        if (binder != null) {
            try {
                final int a = uly.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                Object o;
                if (queryLocalInterface instanceof xly) {
                    o = queryLocalInterface;
                }
                else {
                    o = new ply(binder);
                }
                if (o == null) {
                    this.E0.a.b().L0.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.E0.a.b().Q0.a("Install Referrer Service connected");
                this.E0.a.a().q(new y4z(this, o, this, 0));
                return;
            }
            catch (final RuntimeException ex) {
                this.E0.a.b().L0.b("Exception occurred while calling Install Referrer API", (Object)ex);
                return;
            }
        }
        this.E0.a.b().L0.a("Install Referrer connection returned with null binder");
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.E0.a.b().Q0.a("Install Referrer Service disconnected");
    }
}
