import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qna extends da
{
    public static final Parcelable$Creator<qna> CREATOR;
    public final z8q<String, Bundle> F0;
    
    static {
        CREATOR = (Parcelable$Creator)new qna$a();
    }
    
    public qna(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        final String[] array = new String[int1];
        parcel.readStringArray(array);
        final Bundle[] array2 = new Bundle[int1];
        parcel.readTypedArray((Object[])array2, Bundle.CREATOR);
        this.F0 = (z8q<String, Bundle>)new z8q(int1);
        for (int i = 0; i < int1; ++i) {
            this.F0.put((Object)array[i], (Object)array2[i]);
        }
    }
    
    public qna(final Parcelable parcelable) {
        super(parcelable);
        this.F0 = (z8q<String, Bundle>)new z8q();
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("ExtendableSavedState{");
        f.append(Integer.toHexString(System.identityHashCode(this)));
        f.append(" states=");
        f.append(this.F0);
        f.append("}");
        return f.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        final int h0 = this.F0.H0;
        parcel.writeInt(h0);
        final String[] array = new String[h0];
        final Bundle[] array2 = new Bundle[h0];
        for (i = 0; i < h0; ++i) {
            array[i] = (String)this.F0.i(i);
            array2[i] = (Bundle)this.F0.n(i);
        }
        parcel.writeStringArray(array);
        parcel.writeTypedArray((Parcelable[])array2, 0);
    }
}
