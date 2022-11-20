import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vr4 extends h4d
{
    public static final Parcelable$Creator<vr4> CREATOR;
    public final String E0;
    public final String F0;
    public final String G0;
    
    static {
        CREATOR = (Parcelable$Creator)new vr4$a();
    }
    
    public vr4(final Parcel parcel) {
        super("COMM");
        final String string = parcel.readString();
        final int a = cnw.a;
        this.E0 = string;
        this.F0 = parcel.readString();
        this.G0 = parcel.readString();
    }
    
    public vr4(final String e0, final String f0, final String g0) {
        super("COMM");
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && vr4.class == o.getClass()) {
            final vr4 vr4 = (vr4)o;
            if (!cnw.a(this.F0, vr4.F0) || !cnw.a(this.E0, vr4.E0) || !cnw.a(this.G0, vr4.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final String e0 = this.E0;
        int hashCode = 0;
        int hashCode2;
        if (e0 != null) {
            hashCode2 = e0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String f0 = this.F0;
        int hashCode3;
        if (f0 != null) {
            hashCode3 = f0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String g0 = this.G0;
        if (g0 != null) {
            hashCode = g0.hashCode();
        }
        return ((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final String toString() {
        final String d0 = super.D0;
        final String e0 = this.E0;
        final String f0 = this.F0;
        final StringBuilder d2 = x70.D(wnj.f(f0, wnj.f(e0, wnj.f(d0, 25))), d0, ": language=", e0, ", description=");
        d2.append(f0);
        return d2.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.G0);
    }
}
