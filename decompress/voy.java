import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class voy extends kky implements fpy
{
    public voy(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }
    
    public final void E(final String s, final String s2, final Bundle bundle, final long n) throws RemoteException {
        final Parcel s3 = this.s();
        s3.writeString(s);
        s3.writeString(s2);
        uky.c(s3, (Parcelable)bundle);
        s3.writeLong(n);
        this.U0(1, s3);
    }
    
    public final int e() throws RemoteException {
        final Parcel x = this.x(2, this.s());
        final int int1 = x.readInt();
        x.recycle();
        return int1;
    }
}
