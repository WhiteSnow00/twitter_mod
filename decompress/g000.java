import android.os.RemoteException;
import android.os.IBinder;
import com.google.android.gms.common.api.a$b;
import com.google.android.gms.common.api.c;
import android.app.PendingIntent;
import com.google.android.gms.location.LocationRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g000 extends p9y
{
    public final /* synthetic */ LocationRequest q;
    public final /* synthetic */ PendingIntent r;
    
    public g000(final c c, final LocationRequest q, final PendingIntent r) {
        this.q = q;
        this.r = r;
        super(c);
    }
    
    public final void m(final a$b a$b) throws RemoteException {
        final ugy ugy = (ugy)a$b;
        final x9y x9y = new x9y((nm1)this);
        final LocationRequest q = this.q;
        final PendingIntent r = this.r;
        final cfy k1 = ugy.k1;
        k1.a.a();
        ((zdy)k1.a.b()).N1(new jjy(1, new yiy(q, yiy.J0, (String)null, false, false, false, (String)null), null, r, null, (IBinder)x9y));
    }
}
