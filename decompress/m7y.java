import android.os.RemoteException;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcelable;
import android.os.IInterface;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m7y extends p7y<Status>
{
    public m7y(final c c) {
        super(c);
    }
    
    public final /* bridge */ psm d(final Status status) {
        return (psm)status;
    }
    
    public final void m(final a.b b) throws RemoteException {
        final x6y x6y = (x6y)b;
        final d8y d8y = (d8y)((bm1)x6y).D();
        final j7y j7y = new j7y(this);
        final GoogleSignInOptions j1 = x6y.j1;
        final Parcel s = ((w5y)d8y).s();
        t6y.c(s, (IInterface)j7y);
        t6y.b(s, (Parcelable)j1);
        ((w5y)d8y).x(103, s);
    }
}
