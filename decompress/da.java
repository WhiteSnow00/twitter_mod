import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "BanParcelableUsage" })
public abstract class da implements Parcelable
{
    public static final Parcelable$Creator<da> CREATOR;
    public static final da EMPTY_STATE;
    private final Parcelable mSuperState;
    
    static {
        EMPTY_STATE = (da)new da$a();
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<da>() {
            public final Object createFromParcel(final Parcel parcel) {
                if (parcel.readParcelable((ClassLoader)null) == null) {
                    return da.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return da.EMPTY_STATE;
                }
                throw new IllegalStateException("superState must be null");
            }
            
            public final Object[] newArray(final int n) {
                return new da[n];
            }
        };
    }
    
    private da() {
        this.mSuperState = null;
    }
    
    public da(final Parcel parcel) {
        this(parcel, null);
    }
    
    public da(final Parcel parcel, final ClassLoader classLoader) {
        Object mSuperState = parcel.readParcelable(classLoader);
        if (mSuperState == null) {
            mSuperState = da.EMPTY_STATE;
        }
        this.mSuperState = (Parcelable)mSuperState;
    }
    
    public da(Parcelable mSuperState) {
        if (mSuperState != null) {
            if (mSuperState == da.EMPTY_STATE) {
                mSuperState = null;
            }
            this.mSuperState = mSuperState;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public da(final da$a da$a) {
        this();
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
