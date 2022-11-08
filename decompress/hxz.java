import android.os.RemoteException;
import android.os.Looper;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hxz extends p9y
{
    public final /* synthetic */ LocationRequest q;
    public final /* synthetic */ f6g r;
    
    public hxz(final c c, final LocationRequest q, final f6g r) {
        this.q = q;
        this.r = r;
        super(c);
    }
    
    public final void m(final a$b a$b) throws RemoteException {
        final ugy ugy = (ugy)a$b;
        final x9y x9y = new x9y((nm1)this);
        final LocationRequest q = this.q;
        final f6g r = this.r;
        xd.w(Looper.myLooper() != null, (Object)"Can't create handler inside thread that has not called Looper.prepare()");
        final Looper myLooper = Looper.myLooper();
        final String simpleName = f6g.class.getSimpleName();
        xd.u((Object)r, (Object)"Listener must not be null");
        xd.u((Object)myLooper, (Object)"Looper must not be null");
        final inf inf = new inf(myLooper, (Object)r, simpleName);
        synchronized (ugy.k1) {
            ugy.k1.b(q, inf, (jcy)x9y);
        }
    }
}
