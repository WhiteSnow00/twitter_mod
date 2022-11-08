import com.google.android.exoplayer2.n;
import java.util.Objects;
import com.google.android.exoplayer2.r$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class sgx implements x8h$b
{
    public static final Parcelable$Creator<sgx> CREATOR;
    public final String C0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new sgx$a();
    }
    
    public sgx(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = imw.a;
        this.C0 = string;
        this.D0 = parcel.readString();
    }
    
    public sgx(final String c0, final String d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void P1(final r$a r$a) {
        final String c0 = this.C0;
        Objects.requireNonNull(c0);
        final int hashCode = c0.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1939198791: {
                if (!c0.equals("ARTIST")) {
                    break;
                }
                n = 4;
                break;
            }
            case 1746739798: {
                if (!c0.equals("ALBUMARTIST")) {
                    break;
                }
                n = 3;
                break;
            }
            case 428414940: {
                if (!c0.equals("DESCRIPTION")) {
                    break;
                }
                n = 2;
                break;
            }
            case 79833656: {
                if (!c0.equals("TITLE")) {
                    break;
                }
                n = 1;
                break;
            }
            case 62359119: {
                if (!c0.equals("ALBUM")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 4: {
                r$a.b = this.D0;
                break;
            }
            case 3: {
                r$a.d = this.D0;
                break;
            }
            case 2: {
                r$a.g = this.D0;
                break;
            }
            case 1: {
                r$a.a = this.D0;
                break;
            }
            case 0: {
                r$a.c = this.D0;
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
            final sgx sgx = (sgx)o;
            if (!this.C0.equals(sgx.C0) || !this.D0.equals(sgx.D0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode() + l7k.a(this.C0, 527, 31);
    }
    
    @Override
    public final String toString() {
        final String c0 = this.C0;
        final String d0 = this.D0;
        final StringBuilder sb = new StringBuilder(dia.o(d0, dia.o(c0, 5)));
        sb.append("VC: ");
        sb.append(c0);
        sb.append("=");
        sb.append(d0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.C0);
        parcel.writeString(this.D0);
    }
}
