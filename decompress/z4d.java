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

public final class z4d implements x8h$b
{
    public static final Parcelable$Creator<z4d> CREATOR;
    public final int C0;
    public final String D0;
    public final String E0;
    public final String F0;
    public final boolean G0;
    public final int H0;
    
    static {
        CREATOR = (Parcelable$Creator)new z4d$a();
    }
    
    public z4d(final int c0, final String d0, final String e0, final String f0, final boolean g0, final int h0) {
        ri4.k(h0 == -1 || h0 > 0);
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public z4d(final Parcel parcel) {
        this.C0 = parcel.readInt();
        this.D0 = parcel.readString();
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
        final int a = imw.a;
        this.G0 = (parcel.readInt() != 0);
        this.H0 = parcel.readInt();
    }
    
    public static z4d a(final Map<String, List<String>> map) {
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
                Label_0104: {
                    if (n3 > 0) {
                        n4 = 1;
                        break Label_0104;
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
        final z4d z4d = null;
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
                Label_0434: {
                    if (int1 > 0) {
                        n = int1;
                        n4 = n2;
                        break Label_0434;
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
        z4d z4d2 = z4d;
        if (n6 != 0) {
            z4d2 = new z4d(n3, s2, s3, s4, equals, int1);
        }
        return z4d2;
    }
    
    public final void P1(final r$a r$a) {
        final String e0 = this.E0;
        if (e0 != null) {
            r$a.E = e0;
        }
        final String d0 = this.D0;
        if (d0 != null) {
            r$a.C = d0;
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
        if (o != null && z4d.class == o.getClass()) {
            final z4d z4d = (z4d)o;
            if (this.C0 != z4d.C0 || !imw.a((Object)this.D0, (Object)z4d.D0) || !imw.a((Object)this.E0, (Object)z4d.E0) || !imw.a((Object)this.F0, (Object)z4d.F0) || this.G0 != z4d.G0 || this.H0 != z4d.H0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int c0 = this.C0;
        final String d0 = this.D0;
        int hashCode = 0;
        int hashCode2;
        if (d0 != null) {
            hashCode2 = d0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String e0 = this.E0;
        int hashCode3;
        if (e0 != null) {
            hashCode3 = e0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String f0 = this.F0;
        if (f0 != null) {
            hashCode = f0.hashCode();
        }
        return (((((527 + c0) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + (this.G0 ? 1 : 0)) * 31 + this.H0;
    }
    
    @Override
    public final String toString() {
        final String e0 = this.E0;
        final String d0 = this.D0;
        final int c0 = this.C0;
        final int h0 = this.H0;
        final StringBuilder n = xpa.n(dia.o(d0, dia.o(e0, 80)), "IcyHeaders: name=\"", e0, "\", genre=\"", d0);
        n.append("\", bitrate=");
        n.append(c0);
        n.append(", metadataInterval=");
        n.append(h0);
        return n.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        parcel.writeInt(this.C0);
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.F0);
        final int g0 = this.G0 ? 1 : 0;
        a = imw.a;
        parcel.writeInt(g0);
        parcel.writeInt(this.H0);
    }
}
