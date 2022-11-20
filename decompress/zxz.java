import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxz extends rd
{
    public static final Parcelable$Creator<zxz> CREATOR;
    public final String D0;
    public final hez E0;
    public final boolean F0;
    public final boolean G0;
    
    static {
        CREATOR = (Parcelable$Creator)new nyz();
    }
    
    public zxz(final String d0, final IBinder binder, final boolean f0, final boolean g0) {
        this.D0 = d0;
        final hez hez = null;
        Object e0;
        if (binder == null) {
            e0 = hez;
        }
        else {
            try {
                final int a = y000.a;
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                Object o;
                if (queryLocalInterface instanceof z000) {
                    o = queryLocalInterface;
                }
                else {
                    o = new h000(binder);
                }
                final l2d e2 = ((z000)o).e();
                byte[] array;
                if (e2 == null) {
                    array = null;
                }
                else {
                    array = (byte[])d5j.U0(e2);
                }
                if (array != null) {
                    e0 = new lhz(array);
                }
                else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    e0 = hez;
                }
            }
            catch (final RemoteException ex) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
                e0 = hez;
            }
        }
        this.E0 = (hez)e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public zxz(final String d0, final hez e0, final boolean f0, final boolean g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void writeToParcel(final Parcel parcel, int d1) {
        d1 = fli.d1(parcel, 20293);
        fli.Y0(parcel, 1, this.D0);
        Object e0;
        if ((e0 = this.E0) == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            e0 = null;
        }
        fli.S0(parcel, 2, (IBinder)e0);
        fli.K0(parcel, 3, this.F0);
        fli.K0(parcel, 4, this.G0);
        fli.g1(parcel, d1);
    }
}
