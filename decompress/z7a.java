import android.os.ParcelFormatException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public class z7a extends ol1 implements Parcelable
{
    public static final Parcelable$Creator<z7a> CREATOR;
    public float E0;
    
    static {
        CREATOR = (Parcelable$Creator)new z7a$a();
    }
    
    public z7a() {
        this.E0 = 0.0f;
    }
    
    public z7a(final float e0, final float n) {
        super(n);
        this.E0 = e0;
    }
    
    public z7a(final Parcel parcel) {
        this.E0 = 0.0f;
        this.E0 = parcel.readFloat();
        super.C0 = parcel.readFloat();
        if (parcel.readInt() == 1) {
            super.D0 = parcel.readParcelable(Object.class.getClassLoader());
        }
    }
    
    public float b() {
        return this.E0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Entry, x: ");
        g.append(this.E0);
        g.append(" y: ");
        g.append(this.a());
        return g.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.E0);
        parcel.writeFloat(this.a());
        final Object d0 = super.D0;
        if (d0 != null) {
            if (!(d0 instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable)super.D0, n);
        }
        else {
            parcel.writeInt(0);
        }
    }
}
