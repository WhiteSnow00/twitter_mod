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
public final class sf1 implements Parcelable
{
    public static final Parcelable$Creator<sf1> CREATOR;
    public final List<String> F0;
    public final List<b> G0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<sf1>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new sf1(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new sf1[n];
            }
        };
    }
    
    public sf1(final Parcel parcel) {
        this.F0 = parcel.createStringArrayList();
        this.G0 = parcel.createTypedArrayList(b.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList((List)this.F0);
        parcel.writeTypedList((List)this.G0);
    }
}
