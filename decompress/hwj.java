import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public final class hwj<T> extends giq<T> implements Parcelable
{
    public static final Parcelable$Creator<hwj<Object>> CREATOR;
    public static final hwj.hwj$b Companion;
    
    static {
        Companion = new hwj.hwj$b();
        CREATOR = (Parcelable$Creator)new hwj$a();
    }
    
    public hwj(final T t, final hiq<T> hiq) {
        czd.f((Object)hiq, "policy");
        super((Object)t, (hiq)hiq);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        czd.f((Object)parcel, "parcel");
        parcel.writeValue(this.getValue());
        final hiq d0 = super.D0;
        if (czd.a((Object)d0, (Object)dei.a)) {
            n = 0;
        }
        else if (czd.a((Object)d0, (Object)mlr.a)) {
            n = 1;
        }
        else {
            if (!czd.a((Object)d0, (Object)e8m.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            n = 2;
        }
        parcel.writeInt(n);
    }
}
