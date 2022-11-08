import android.os.Bundle;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public class gsm implements Parcelable
{
    public static final Parcelable$Creator<gsm> CREATOR;
    public s3d C0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<gsm>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new gsm(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new gsm[n];
            }
        };
    }
    
    public gsm(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        final int a = s3d$a.a;
        Object c0;
        if (strongBinder == null) {
            c0 = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof s3d) {
                c0 = queryLocalInterface;
            }
            else {
                c0 = new s3d$a$a(strongBinder);
            }
        }
        this.C0 = (s3d)c0;
    }
    
    public void a(final int n, final Bundle bundle) {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.C0 == null) {
                this.C0 = (s3d)new gsm.gsm$b(this);
            }
            parcel.writeStrongBinder(((IInterface)this.C0).asBinder());
        }
    }
}
