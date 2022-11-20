import android.os.Parcelable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iny
{
    public static final int a = 0;
    
    static {
        iny.class.getClassLoader();
    }
    
    public static void a(final Parcel parcel, final IInterface interface1) {
        if (interface1 == null) {
            parcel.writeStrongBinder((IBinder)null);
            return;
        }
        parcel.writeStrongBinder(interface1.asBinder());
    }
    
    public static void b(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
