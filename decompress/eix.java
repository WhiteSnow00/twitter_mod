import com.google.android.exoplayer2.n;
import java.util.Objects;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class eix implements q9h$b
{
    public static final Parcelable$Creator<eix> CREATOR;
    public final String F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new eix$a();
    }
    
    public eix(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = rnw.a;
        this.F0 = string;
        this.G0 = parcel.readString();
    }
    
    public eix(final String f0, final String g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void P1(final r$a r$a) {
        final String f0 = this.F0;
        Objects.requireNonNull(f0);
        final int hashCode = f0.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1939198791: {
                if (!f0.equals("ARTIST")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1746739798: {
                if (!f0.equals("ALBUMARTIST")) {
                    break;
                }
                n = 3;
                break;
            }
            case 428414940: {
                if (!f0.equals("DESCRIPTION")) {
                    break;
                }
                n = 2;
                break;
            }
            case 79833656: {
                if (!f0.equals("TITLE")) {
                    break;
                }
                n = 1;
                break;
            }
            case 62359119: {
                if (!f0.equals("ALBUM")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 4: {
                r$a.b = this.G0;
                break;
            }
            case 3: {
                r$a.d = this.G0;
                break;
            }
            case 2: {
                r$a.g = this.G0;
                break;
            }
            case 1: {
                r$a.a = this.G0;
                break;
            }
            case 0: {
                r$a.c = this.G0;
                break;
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
        if (o != null && this.getClass() == o.getClass()) {
            final eix eix = (eix)o;
            if (!this.F0.equals(eix.F0) || !this.G0.equals(eix.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.G0.hashCode() + brg.d(this.F0, 527, 31);
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String f0 = this.F0;
        final String g0 = this.G0;
        final StringBuilder sb = new StringBuilder(l58.g(g0, l58.g(f0, 5)));
        sb.append("VC: ");
        sb.append(f0);
        sb.append("=");
        sb.append(g0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
