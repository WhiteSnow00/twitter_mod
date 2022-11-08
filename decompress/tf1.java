import android.os.Parcel;
import androidx.fragment.app.b;
import java.util.List;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public final class tf1 implements Parcelable
{
    public static final Parcelable$Creator<tf1> CREATOR;
    public final List<String> C0;
    public final List<b> D0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<tf1>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new tf1(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new tf1[n];
            }
        };
    }
    
    public tf1(final Parcel parcel) {
        this.C0 = parcel.createStringArrayList();
        this.D0 = parcel.createTypedArrayList((Parcelable$Creator)b.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.C0);
        parcel.writeTypedList((List)this.D0);
    }
}
