import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.r$a;
import android.util.Log;
import java.util.List;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e5d implements q9h$b
{
    public static final Parcelable$Creator<e5d> CREATOR;
    public final int F0;
    public final String G0;
    public final String H0;
    public final String I0;
    public final boolean J0;
    public final int K0;
    
    static {
        CREATOR = (Parcelable$Creator)new e5d$a();
    }
    
    public e5d(final int f0, final String g0, final String h0, final String i0, final boolean j0, final int k0) {
        omi.m(k0 == -1 || k0 > 0);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public e5d(final Parcel parcel) {
        this.F0 = parcel.readInt();
        this.G0 = parcel.readString();
        this.H0 = parcel.readString();
        this.I0 = parcel.readString();
        final int a = rnw.a;
        this.J0 = (parcel.readInt() != 0);
        this.K0 = parcel.readInt();
    }
    
    public static e5d a(final Map<String, List<String>> map) {
        final List list = map.get("icy-br");
        int n = -1;
        final int n2 = 1;
        int n3;
        int n4;
        if (list != null) {
            final String s = (String)list.get(0);
            int n5 = 0;
            try {
                n3 = Integer.parseInt(s) * 1000;
                Label_0107: {
                    if (n3 > 0) {
                        n4 = 1;
                        break Label_0107;
                    }
                    try {
                        final String value = String.valueOf(s);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Invalid bitrate: ".concat(value);
                        }
                        else {
                            concat = new String("Invalid bitrate: ");
                        }
                        Log.w("IcyHeaders", concat);
                        n4 = 0;
                        n3 = -1;
                    }
                    catch (final NumberFormatException ex) {
                        n5 = n3;
                    }
                }
            }
            catch (final NumberFormatException ex2) {
                n5 = -1;
            }
            final String value2 = String.valueOf(s);
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Invalid bitrate header: ".concat(value2);
            }
            else {
                concat2 = new String("Invalid bitrate header: ");
            }
            Log.w("IcyHeaders", concat2);
            n3 = n5;
            n4 = 0;
        }
        else {
            n4 = 0;
            n3 = -1;
        }
        final List list2 = map.get("icy-genre");
        final e5d e5d = null;
        String s2;
        if (list2 != null) {
            s2 = (String)list2.get(0);
            n4 = 1;
        }
        else {
            s2 = null;
        }
        final List list3 = map.get("icy-name");
        String s3;
        if (list3 != null) {
            s3 = (String)list3.get(0);
            n4 = 1;
        }
        else {
            s3 = null;
        }
        final List list4 = map.get("icy-url");
        String s4;
        if (list4 != null) {
            s4 = (String)list4.get(0);
            n4 = 1;
        }
        else {
            s4 = null;
        }
        final List list5 = map.get("icy-pub");
        boolean equals;
        if (list5 != null) {
            equals = ((String)list5.get(0)).equals("1");
            n4 = 1;
        }
        else {
            equals = false;
        }
        final List list6 = map.get("icy-metaint");
        int n6 = n4;
        int int1 = n;
        if (list6 != null) {
            final String s5 = (String)list6.get(0);
            try {
                int1 = Integer.parseInt(s5);
                Label_0437: {
                    if (int1 > 0) {
                        n = int1;
                        n4 = n2;
                        break Label_0437;
                    }
                    try {
                        final String value3 = String.valueOf(s5);
                        String concat3;
                        if (value3.length() != 0) {
                            concat3 = "Invalid metadata interval: ".concat(value3);
                        }
                        else {
                            concat3 = new String("Invalid metadata interval: ");
                        }
                        Log.w("IcyHeaders", concat3);
                        n6 = n4;
                        int1 = n;
                    }
                    catch (final NumberFormatException ex3) {
                        n = int1;
                    }
                }
            }
            catch (final NumberFormatException ex4) {}
            final String value4 = String.valueOf(s5);
            String concat4;
            if (value4.length() != 0) {
                concat4 = "Invalid metadata interval: ".concat(value4);
            }
            else {
                concat4 = new String("Invalid metadata interval: ");
            }
            Log.w("IcyHeaders", concat4);
            int1 = n;
            n6 = n4;
        }
        e5d e5d2 = e5d;
        if (n6 != 0) {
            e5d2 = new e5d(n3, s2, s3, s4, equals, int1);
        }
        return e5d2;
    }
    
    public final void P1(final r$a r$a) {
        final String h0 = this.H0;
        if (h0 != null) {
            r$a.E = h0;
        }
        final String g0 = this.G0;
        if (g0 != null) {
            r$a.C = g0;
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
        if (o != null && e5d.class == o.getClass()) {
            final e5d e5d = (e5d)o;
            if (this.F0 != e5d.F0 || !rnw.a((Object)this.G0, (Object)e5d.G0) || !rnw.a((Object)this.H0, (Object)e5d.H0) || !rnw.a((Object)this.I0, (Object)e5d.I0) || this.J0 != e5d.J0 || this.K0 != e5d.K0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int f0 = this.F0;
        final String g0 = this.G0;
        int hashCode = 0;
        int hashCode2;
        if (g0 != null) {
            hashCode2 = g0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h0 = this.H0;
        int hashCode3;
        if (h0 != null) {
            hashCode3 = h0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String i0 = this.I0;
        if (i0 != null) {
            hashCode = i0.hashCode();
        }
        return (((((527 + f0) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + (this.J0 ? 1 : 0)) * 31 + this.K0;
    }
    
    public final n r0() {
        return null;
    }
    
    @Override
    public final String toString() {
        final String h0 = this.H0;
        final String g0 = this.G0;
        final int f0 = this.F0;
        final int k0 = this.K0;
        final StringBuilder i = tf8.k(l58.g(g0, l58.g(h0, 80)), "IcyHeaders: name=\"", h0, "\", genre=\"", g0);
        i.append("\", bitrate=");
        i.append(f0);
        i.append(", metadataInterval=");
        i.append(k0);
        return i.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        parcel.writeInt(this.F0);
        parcel.writeString(this.G0);
        parcel.writeString(this.H0);
        parcel.writeString(this.I0);
        final int j0 = this.J0 ? 1 : 0;
        a = rnw.a;
        parcel.writeInt(j0);
        parcel.writeInt(this.K0);
    }
    
    public final byte[] y3() {
        return null;
    }
}
