import android.os.RemoteException;
import android.os.Parcel;
import android.accounts.Account;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m000 extends j9y implements q2d
{
    public m000(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account c() throws RemoteException {
        final Parcel s = this.s(2, this.x());
        final Account account = (Account)aoy.a(s, Account.CREATOR);
        s.recycle();
        return account;
    }
}
