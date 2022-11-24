import android.os.Parcel;
import java.util.Objects;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mty implements Parcelable
{
    public static final Parcelable$Creator<mty> CREATOR;
    public Messenger F0;
    
    static {
        CREATOR = (Parcelable$Creator)new ejy();
    }
    
    public mty(final IBinder binder) {
        this.F0 = new Messenger(binder);
    }
    
    public final IBinder a() {
        final Messenger f0 = this.F0;
        Objects.requireNonNull(f0);
        return f0.getBinder();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        try {
            return this.a().equals(((mty)o).a());
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final Messenger f0 = this.F0;
        Objects.requireNonNull(f0);
        parcel.writeStrongBinder(f0.getBinder());
    }
}
