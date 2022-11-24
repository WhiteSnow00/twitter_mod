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

public final class g8y extends j8y<Status>
{
    public g8y(final c c) {
        super(c);
    }
    
    public final /* bridge */ etm d(final Status status) {
        return (etm)status;
    }
    
    public final void m(final a.b b) throws RemoteException {
        final r7y r7y = (r7y)b;
        final x8y x8y = (x8y)((gm1)r7y).D();
        final d8y d8y = new d8y(this);
        final GoogleSignInOptions l1 = r7y.l1;
        final Parcel s = x8y.s();
        n7y.c(s, (IInterface)d8y);
        n7y.b(s, (Parcelable)l1);
        x8y.x(103, s);
    }
}
