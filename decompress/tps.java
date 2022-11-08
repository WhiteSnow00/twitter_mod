import java.util.Arrays;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tps implements Parcelable
{
    public static final Parcelable$Creator<tps> CREATOR;
    public final gog C0;
    public final gog D0;
    public final int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<tps>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new tps(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }
            
            public final Object[] newArray(final int n) {
                return new tps[n];
            }
        };
    }
    
    public tps() {
        this(0, 0, 10, 0);
    }
    
    public tps(int n, int g0, final int h0, final int e0) {
        this.F0 = n;
        this.G0 = g0;
        this.H0 = h0;
        this.E0 = e0;
        g0 = 12;
        if (n >= 12) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.I0 = n;
        this.C0 = new gog(59);
        n = g0;
        if (e0 == 1) {
            n = 24;
        }
        this.D0 = new gog(n);
    }
    
    public static String a(final Resources resources, final CharSequence charSequence, final String s) {
        return String.format(resources.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence)));
    }
    
    public final int b() {
        if (this.E0 == 1) {
            return this.F0 % 24;
        }
        final int f0 = this.F0;
        if (f0 % 12 == 0) {
            return 12;
        }
        int n = f0;
        if (this.I0 == 1) {
            n = f0 - 12;
        }
        return n;
    }
    
    public final void c(final int f0) {
        if (this.E0 == 1) {
            this.F0 = f0;
            return;
        }
        int n = 12;
        if (this.I0 != 1) {
            n = 0;
        }
        this.F0 = f0 % 12 + n;
    }
    
    public final void d(final int i0) {
        if (i0 != this.I0) {
            this.I0 = i0;
            final int f0 = this.F0;
            if (f0 < 12 && i0 == 1) {
                this.F0 = f0 + 12;
            }
            else if (f0 >= 12 && i0 == 0) {
                this.F0 = f0 - 12;
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
        if (!(o instanceof tps)) {
            return false;
        }
        final tps tps = (tps)o;
        if (this.F0 != tps.F0 || this.G0 != tps.G0 || this.E0 != tps.E0 || this.H0 != tps.H0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.E0, this.F0, this.G0, this.H0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        parcel.writeInt(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.E0);
    }
}
