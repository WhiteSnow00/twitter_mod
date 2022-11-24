import android.os.Parcel;
import android.content.res.Resources;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pyp extends zxp
{
    public static final Parcelable$Creator<pyp> CREATOR;
    public final String G0;
    public final String H0;
    public final long I0;
    public final String J0;
    public final String K0;
    public final int L0;
    public final long M0;
    
    static {
        CREATOR = (Parcelable$Creator)new pyp$a();
    }
    
    public pyp(final String g0, final String h0, final long n, final String j0, final String k0) {
        jba.r(g0, "userFullName", h0, "username", j0, "listName");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = n;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = 11;
        this.M0 = n;
    }
    
    public final Long a() {
        return this.M0;
    }
    
    public final Integer b() {
        return this.L0;
    }
    
    public final ayp d(final Resources resources) {
        e0e.f((Object)resources, "res");
        final String string = resources.getString(2131954707, new Object[] { String.valueOf(this.M0) });
        e0e.e((Object)string, "res.getString(R.string.l\u2026hare_link, id.toString())");
        final String string2 = resources.getString(2131954710, new Object[] { this.J0, this.H0 });
        e0e.e((Object)string2, "res.getString(R.string.l\u2026rmat, listName, username)");
        final String j0 = this.J0;
        String g0 = this.G0;
        if (slr.k1((CharSequence)g0)) {
            g0 = null;
        }
        String h0 = g0;
        if (g0 == null) {
            h0 = this.H0;
        }
        String k0;
        if ((k0 = this.K0) == null) {
            k0 = "";
        }
        final String string3 = resources.getString(2131954708, new Object[] { j0, h0, k0, string });
        e0e.e((Object)string3, "res.getString(\n         \u2026hareUrl\n                )");
        final yz9 yz9 = new yz9(string2, string3);
        final String string4 = resources.getString(2131954709, new Object[] { this.J0, this.H0, string });
        e0e.e((Object)string4, "res.getString(R.string.l\u2026Name, username, shareUrl)");
        return new ayp(string, string, yz9, string4);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pyp)) {
            return false;
        }
        final pyp pyp = (pyp)o;
        return e0e.a((Object)this.G0, (Object)pyp.G0) && e0e.a((Object)this.H0, (Object)pyp.H0) && this.I0 == pyp.I0 && e0e.a((Object)this.J0, (Object)pyp.J0) && e0e.a((Object)this.K0, (Object)pyp.K0);
    }
    
    public final int hashCode() {
        final int d = brg.d(this.H0, this.G0.hashCode() * 31, 31);
        final long i0 = this.I0;
        final int d2 = brg.d(this.J0, (d + (int)(i0 ^ i0 >>> 32)) * 31, 31);
        final String k0 = this.K0;
        int hashCode;
        if (k0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = k0.hashCode();
        }
        return d2 + hashCode;
    }
    
    public final String toString() {
        final String g0 = this.G0;
        final String h0 = this.H0;
        final long i0 = this.I0;
        final String j0 = this.J0;
        final String k0 = this.K0;
        final StringBuilder l = l58.k("SharedList(userFullName=", g0, ", username=", h0, ", listId=");
        po.D(l, i0, ", listName=", j0);
        return wa0.y(l, ", description=", k0, ")");
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e0e.f((Object)parcel, "out");
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        parcel.writeLong(this.I0);
        parcel.writeString(this.J0);
        parcel.writeString(this.K0);
    }
}
