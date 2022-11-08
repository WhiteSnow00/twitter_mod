import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jna extends fa
{
    public static final Parcelable$Creator<jna> CREATOR;
    public final l7q<String, Bundle> C0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<jna>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new jna(parcel, null);
            }
            
            public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                return new jna(parcel, classLoader);
            }
            
            public final Object[] newArray(final int n) {
                return new jna[n];
            }
        };
    }
    
    public jna(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        final Bundle[] array2 = new Bundle[int1];
        parcel.readTypedArray((Object[])array2, Bundle.CREATOR);
        this.C0 = (l7q<String, Bundle>)new l7q(int1);
        for (int i = 0; i < int1; ++i) {
            this.C0.put((Object)array[i], (Object)array2[i]);
        }
    }
    
    public jna(final Parcelable parcelable) {
        super(parcelable);
        this.C0 = (l7q<String, Bundle>)new l7q();
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ExtendableSavedState{");
        g.append(Integer.toHexString(System.identityHashCode(this)));
        g.append(" states=");
        g.append(this.C0);
        g.append("}");
        return g.toString();
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        final int e0 = this.C0.E0;
        parcel.writeInt(e0);
        final String[] array = new String[e0];
        final Bundle[] array2 = new Bundle[e0];
        for (i = 0; i < e0; ++i) {
            array[i] = (String)this.C0.i(i);
            array2[i] = (Bundle)this.C0.m(i);
        }
        parcel.writeStringArray(array);
        parcel.writeTypedArray((Parcelable[])array2, 0);
    }
}
