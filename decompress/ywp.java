import android.os.Parcel;
import android.content.res.Resources;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ywp extends cxp
{
    public static final Parcelable$Creator<ywp> CREATOR;
    public static final ywp.ywp$b Companion;
    public final cof E0;
    public final int F0;
    public final Long G0;
    
    static {
        Companion = new ywp.ywp$b();
        CREATOR = (Parcelable$Creator)new ywp$a();
    }
    
    public ywp(final cof e0) {
        czd.f((Object)e0, "event");
        this.E0 = e0;
        this.F0 = 16;
        final String a = e0.a;
        czd.e((Object)a, "event.id");
        this.G0 = ukr.Q(a);
    }
    
    public final Long a() {
        return this.G0;
    }
    
    public final Integer b() {
        return this.F0;
    }
    
    public final dxp d(final Resources resources) {
        czd.f((Object)resources, "res");
        final String b = this.E0.b();
        czd.e((Object)b, "event.shareableUrl");
        final String j = ikr.j((CharSequence)" ", (Object[])new String[] { ywp.Companion.a(resources, this.E0), b });
        return new dxp(b, j, new wy9("", j), j);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ywp && czd.a((Object)this.E0, (Object)((ywp)o).E0));
    }
    
    public final int hashCode() {
        return this.E0.hashCode();
    }
    
    public final String toString() {
        final cof e0 = this.E0;
        final StringBuilder sb = new StringBuilder();
        sb.append("SharedEvent(event=");
        sb.append(e0);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        czd.f((Object)parcel, "parcel");
        final byte[] e = klp.e((Object)this.E0, (rlp)cof.n);
        parcel.writeInt(e.length);
        parcel.writeByteArray(e);
    }
}
