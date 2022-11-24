import android.os.IInterface;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n7y
{
    static {
        n7y.class.getClassLoader();
    }
    
    public static <T extends Parcelable> T a(final Parcel parcel, final Parcelable$Creator<T> parcelable$Creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)parcelable$Creator.createFromParcel(parcel);
    }
    
    public static void b(final Parcel parcel, final Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
    
    public static void c(final Parcel parcel, final IInterface interface1) {
        parcel.writeStrongBinder(interface1.asBinder());
    }
}
