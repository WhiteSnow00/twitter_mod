import java.util.Arrays;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqs implements Parcelable
{
    public static final Parcelable$Creator<kqs> CREATOR;
    public final fog D0;
    public final fog E0;
    public final int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<kqs>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new kqs(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new kqs[n];
            }
        };
    }
    
    public kqs() {
        this(0, 0, 10, 0);
    }
    
    public kqs(int n, int h0, final int i0, final int f0) {
        this.G0 = n;
        this.H0 = h0;
        this.I0 = i0;
        this.F0 = f0;
        h0 = 12;
        if (n >= 12) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.J0 = n;
        this.D0 = new fog(59);
        n = h0;
        if (f0 == 1) {
            n = 24;
        }
        this.E0 = new fog(n);
    }
    
    public static String a(final Resources resources, final CharSequence charSequence, final String s) {
        return String.format(resources.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence)));
    }
    
    public final int b() {
        if (this.F0 == 1) {
            return this.G0 % 24;
        }
        final int g0 = this.G0;
        if (g0 % 12 == 0) {
            return 12;
        }
        int n = g0;
        if (this.J0 == 1) {
            n = g0 - 12;
        }
        return n;
    }
    
    public final void c(final int g0) {
        if (this.F0 == 1) {
            this.G0 = g0;
            return;
        }
        int n = 12;
        if (this.J0 != 1) {
            n = 0;
        }
        this.G0 = g0 % 12 + n;
    }
    
    public final void d(final int j0) {
        if (j0 != this.J0) {
            this.J0 = j0;
            final int g0 = this.G0;
            if (g0 < 12 && j0 == 1) {
                this.G0 = g0 + 12;
            }
            else if (g0 >= 12 && j0 == 0) {
                this.G0 = g0 - 12;
            }
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof kqs)) {
            return false;
        }
        final kqs kqs = (kqs)o;
        if (this.G0 != kqs.G0 || this.H0 != kqs.H0 || this.F0 != kqs.F0 || this.I0 != kqs.I0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.F0, this.G0, this.H0, this.I0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeInt(this.F0);
    }
}
