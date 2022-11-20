import android.os.Parcel;
import android.util.SparseArray;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qmb implements Parcelable
{
    public static final Parcelable$Creator<qmb> CREATOR;
    public static final rlp<qmb> G0;
    public final String D0;
    public final String E0;
    public final SparseArray<mmb> F0;
    
    static {
        qmb.G0 = new qmb.qmb$b();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<qmb>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new qmb(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new qmb[n];
            }
        };
    }
    
    public qmb(final Parcel parcel) {
        this.D0 = parcel.readString();
        this.E0 = parcel.readString();
        final mmb$b h0 = mmb.H0;
        final int int1 = parcel.readInt();
        final ClassLoader classLoader = mmb.class.getClassLoader();
        final SparseArray f0 = new SparseArray(int1);
        for (int i = 0; i < int1; ++i) {
            final mmb mmb = (mmb)parcel.readParcelable(classLoader);
            f0.put(mmb.E0.a, (Object)mmb);
        }
        this.F0 = (SparseArray<mmb>)f0;
    }
    
    public qmb(final String d0, final String e0, final SparseArray<mmb> f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        final SparseArray<mmb> f0 = this.F0;
        final mmb$b h0 = mmb.H0;
        final int size = f0.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; ++i) {
            parcel.writeParcelable((Parcelable)f0.valueAt(i), n);
        }
    }
}
