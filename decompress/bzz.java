import android.os.RemoteException;
import android.os.Parcel;
import android.accounts.Account;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzz extends z7y implements l2d
{
    public bzz(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account c() throws RemoteException {
        final Parcel s = this.s(2, this.x());
        final Account account = (Account)qmy.a(s, Account.CREATOR);
        s.recycle();
        return account;
    }
}
