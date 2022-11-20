import android.os.Parcel;
import android.content.res.Resources;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayp extends cxp
{
    public static final Parcelable$Creator<ayp> CREATOR;
    public final long E0;
    public final long F0;
    
    static {
        CREATOR = (Parcelable$Creator)new ayp$a();
    }
    
    public ayp(final long n) {
        this.E0 = n;
        this.F0 = n;
    }
    
    public final Long a() {
        return this.F0;
    }
    
    public final Integer b() {
        return 36;
    }
    
    public final dxp d(final Resources resources) {
        czd.f((Object)resources, "res");
        final String string = resources.getString(2131958990, new Object[] { String.valueOf(this.F0) });
        czd.e((Object)string, "res.getString(R.string.t\u2026hare_link, id.toString())");
        return new dxp(string, string, new wy9("", hmg.h("\n", string)), hmg.h("\n", string));
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ayp && this.E0 == ((ayp)o).E0);
    }
    
    public final int hashCode() {
        final long e0 = this.E0;
        return (int)(e0 ^ e0 >>> 32);
    }
    
    public final String toString() {
        return jg9.s("SharedTopic(_id=", this.E0, ")");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        czd.f((Object)parcel, "out");
        parcel.writeLong(this.E0);
    }
}
