import android.os.ParcelFormatException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public class n8a extends ol1 implements Parcelable
{
    public static final Parcelable$Creator<n8a> CREATOR;
    public float H0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<n8a>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new n8a(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new n8a[n];
            }
        };
    }
    
    public n8a() {
        this.H0 = 0.0f;
    }
    
    public n8a(final float h0, final float n) {
        super(n);
        this.H0 = h0;
    }
    
    public n8a(final Parcel parcel) {
        this.H0 = 0.0f;
        this.H0 = parcel.readFloat();
        super.F0 = parcel.readFloat();
        if (parcel.readInt() == 1) {
            super.G0 = parcel.readParcelable(Object.class.getClassLoader());
        }
    }
    
    public float b() {
        return this.H0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("Entry, x: ");
        f.append(this.H0);
        f.append(" y: ");
        f.append(this.a());
        return f.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.H0);
        parcel.writeFloat(this.a());
        final Object g0 = super.G0;
        if (g0 != null) {
            if (!(g0 instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable)super.G0, n);
        }
        else {
            parcel.writeInt(0);
        }
    }
}
