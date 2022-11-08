import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public abstract class fa implements Parcelable
{
    public static final Parcelable$Creator<fa> CREATOR;
    public static final fa EMPTY_STATE;
    private final Parcelable mSuperState;
    
    static {
        EMPTY_STATE = (fa)new fa$a();
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<fa>() {
            public final Object createFromParcel(final Parcel parcel) {
                if (parcel.readParcelable((ClassLoader)null) == null) {
                    return fa.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return fa.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object[] newArray(final int n) {
                return new fa[n];
            }
        };
    }
    
    private fa() {
        this.mSuperState = null;
    }
    
    public fa(final Parcel parcel) {
        this(parcel, null);
    }
    
    public fa(final Parcel parcel, final ClassLoader classLoader) {
        Object mSuperState = parcel.readParcelable(classLoader);
        if (mSuperState == null) {
            mSuperState = fa.EMPTY_STATE;
        }
        this.mSuperState = (Parcelable)mSuperState;
    }
    
    public fa(Parcelable mSuperState) {
        if (mSuperState != null) {
            if (mSuperState == fa.EMPTY_STATE) {
                mSuperState = null;
            }
            this.mSuperState = mSuperState;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.mSuperState, n);
    }
}
