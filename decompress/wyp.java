import android.os.Parcel;
import java.util.regex.Pattern;
import java.net.URLEncoder;
import android.content.res.Resources;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wyp extends zxp
{
    public static final Parcelable$Creator<wyp> CREATOR;
    public final String G0;
    public final String H0;
    public final Long I0;
    public final String J0;
    public final int K0;
    public final Long L0;
    
    static {
        CREATOR = (Parcelable$Creator)new wyp$a();
    }
    
    public wyp(final String g0, final String h0, final Long n, final String j0) {
        e0e.f((Object)g0, "query");
        e0e.f((Object)h0, "queryName");
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = n;
        this.J0 = j0;
        int k0;
        if (n != null) {
            k0 = 13;
        }
        else {
            k0 = 12;
        }
        this.K0 = k0;
        this.L0 = n;
    }
    
    public final Long a() {
        return this.L0;
    }
    
    public final Integer b() {
        return this.K0;
    }
    
    public final ayp d(final Resources resources) {
        e0e.f((Object)resources, "res");
        final boolean b = flr.g((CharSequence)this.G0) && this.G0.charAt(0) == '#';
        String s;
        if (b) {
            s = this.G0.substring(1);
            e0e.e((Object)s, "this as java.lang.String).substring(startIndex)");
        }
        else {
            s = this.G0;
        }
        String s2;
        if (b) {
            s2 = resources.getString(2131957466, new Object[] { this.f(s) });
        }
        else if (flr.g((CharSequence)this.J0)) {
            s2 = resources.getString(2131957511, new Object[] { this.f(s), this.f(this.J0) });
        }
        else {
            s2 = resources.getString(2131957493, new Object[] { this.f(s) });
        }
        e0e.e((Object)s2, "when {\n            isHas\u2026)\n            }\n        }");
        final String string = resources.getString(2131957496, new Object[] { this.H0 });
        e0e.e((Object)string, "res.getString(R.string.s\u2026t_long_format, queryName)");
        final String string2 = resources.getString(2131957494, new Object[] { this.H0, s2 });
        e0e.e((Object)string2, "res.getString(R.string.s\u2026mat, queryName, shareUrl)");
        final yz9 yz9 = new yz9(string, string2);
        final String string3 = resources.getString(2131957495, new Object[] { s2 });
        e0e.e((Object)string3, "res.getString(R.string.s\u2026e_short_format, shareUrl)");
        return new ayp(s2, s2, yz9, string3);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wyp)) {
            return false;
        }
        final wyp wyp = (wyp)o;
        return e0e.a((Object)this.G0, (Object)wyp.G0) && e0e.a((Object)this.H0, (Object)wyp.H0) && e0e.a((Object)this.I0, (Object)wyp.I0) && e0e.a((Object)this.J0, (Object)wyp.J0);
    }
    
    public final String f(String replaceAll) {
        final String encode = URLEncoder.encode(replaceAll, "utf-8");
        e0e.e((Object)encode, "encode(param, \"utf-8\")");
        final Pattern compile = Pattern.compile("\\+");
        e0e.e((Object)compile, "compile(pattern)");
        replaceAll = compile.matcher(encode).replaceAll("%20");
        e0e.e((Object)replaceAll, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
        return replaceAll;
    }
    
    public final int hashCode() {
        final int d = brg.d(this.H0, this.G0.hashCode() * 31, 31);
        final Long i0 = this.I0;
        int hashCode = 0;
        int hashCode2;
        if (i0 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = i0.hashCode();
        }
        final String j0 = this.J0;
        if (j0 != null) {
            hashCode = j0.hashCode();
        }
        return (d + hashCode2) * 31 + hashCode;
    }
    
    public final String toString() {
        final String g0 = this.G0;
        final String h0 = this.H0;
        final Long i0 = this.I0;
        final String j0 = this.J0;
        final StringBuilder k = l58.k("SharedSearch(query=", g0, ", queryName=", h0, ", queryId=");
        k.append(i0);
        k.append(", vertical=");
        k.append(j0);
        k.append(")");
        return k.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e0e.f((Object)parcel, "out");
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        final Long i0 = this.I0;
        if (i0 == null) {
            parcel.writeInt(0);
        }
        else {
            parcel.writeInt(1);
            parcel.writeLong((long)i0);
        }
        parcel.writeString(this.J0);
    }
}
