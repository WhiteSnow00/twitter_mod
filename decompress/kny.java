import android.os.IInterface;
import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kny
{
    static {
        kny.class.getClassLoader();
    }
    
    public static void a(final Parcel parcel, final IInterface interface1) {
        parcel.writeStrongBinder(interface1.asBinder());
    }
}
