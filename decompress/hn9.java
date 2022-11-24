import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hn9 implements Parcelable
{
    public static final Parcelable$Creator<hn9> CREATOR;
    public final zm9 F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<hn9>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new hn9((zm9)parcel.readParcelable(zm9.class.getClassLoader()), parcel.readString());
            }
            
            public final Object[] newArray(final int n) {
                return new hn9[n];
            }
        };
    }
    
    public hn9(final zm9 f0, final String g0) {
        if (f0 == null && g0 == null) {
            w9.w("Attempting to create DynamicAdInfo with null data");
        }
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o != null && hn9.class == o.getClass()) {
            final hn9 hn9 = (hn9)o;
            final zm9 f0 = this.F0;
            Label_0062: {
                if (f0 != null) {
                    if (f0.equals(hn9.F0)) {
                        break Label_0062;
                    }
                }
                else if (hn9.F0 == null) {
                    break Label_0062;
                }
                return false;
            }
            final String g0 = this.G0;
            if (g0 != null) {
                equals = g0.equals(hn9.G0);
            }
            else if (hn9.G0 != null) {
                equals = false;
            }
            return equals;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final zm9 f0 = this.F0;
        int hashCode = 0;
        int hashCode2;
        if (f0 != null) {
            hashCode2 = f0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String g0 = this.G0;
        if (g0 != null) {
            hashCode = g0.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.F0, n);
        parcel.writeString(this.G0);
    }
}
