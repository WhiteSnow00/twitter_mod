import java.util.Objects;
import com.google.android.exoplayer2.r$a;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gis extends h4d
{
    public static final Parcelable$Creator<gis> CREATOR;
    public final String E0;
    public final String F0;
    
    static {
        CREATOR = (Parcelable$Creator)new gis$a();
    }
    
    public gis(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = cnw.a;
        super(string);
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
    }
    
    public gis(final String s, final String e0, final String f0) {
        super(s);
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public static List<Integer> a(final String s) {
        final ArrayList list = new ArrayList();
        try {
            if (s.length() >= 10) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
                list.add(Integer.parseInt(s.substring(8, 10)));
            }
            else if (s.length() >= 7) {
                list.add(Integer.parseInt(s.substring(0, 4)));
                list.add(Integer.parseInt(s.substring(5, 7)));
            }
            else if (s.length() >= 4) {
                list.add(Integer.parseInt(s.substring(0, 4)));
            }
            return list;
        }
        catch (final NumberFormatException ex) {
            return new ArrayList<Integer>();
        }
    }
    
    public final void O1(final r$a r$a) {
        final String d0 = super.D0;
        Objects.requireNonNull(d0);
        int n = 0;
        Label_0621: {
            switch (d0) {
                case "TYER": {
                    n = 21;
                    break Label_0621;
                }
                case "TRCK": {
                    n = 20;
                    break Label_0621;
                }
                case "TPE3": {
                    n = 19;
                    break Label_0621;
                }
                case "TPE2": {
                    n = 18;
                    break Label_0621;
                }
                case "TPE1": {
                    n = 17;
                    break Label_0621;
                }
                case "TIT2": {
                    n = 16;
                    break Label_0621;
                }
                case "TEXT": {
                    n = 15;
                    break Label_0621;
                }
                case "TDRL": {
                    n = 14;
                    break Label_0621;
                }
                case "TDRC": {
                    n = 13;
                    break Label_0621;
                }
                case "TDAT": {
                    n = 12;
                    break Label_0621;
                }
                case "TCOM": {
                    n = 11;
                    break Label_0621;
                }
                case "TALB": {
                    n = 10;
                    break Label_0621;
                }
                case "TYE": {
                    n = 9;
                    break Label_0621;
                }
                case "TXT": {
                    n = 8;
                    break Label_0621;
                }
                case "TT2": {
                    n = 7;
                    break Label_0621;
                }
                case "TRK": {
                    n = 6;
                    break Label_0621;
                }
                case "TP3": {
                    n = 5;
                    break Label_0621;
                }
                case "TP2": {
                    n = 4;
                    break Label_0621;
                }
                case "TP1": {
                    n = 3;
                    break Label_0621;
                }
                case "TDA": {
                    n = 2;
                    break Label_0621;
                }
                case "TCM": {
                    n = 1;
                    break Label_0621;
                }
                case "TAL": {
                    n = 0;
                    break Label_0621;
                }
                default:
                    break;
            }
            n = -1;
        }
        Label_1070: {
            switch (n) {
                default: {
                    return;
                }
                case 14: {
                    final ArrayList list = (ArrayList)a(this.F0);
                    final int size = list.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            }
                            r$a.w = (Integer)list.get(2);
                        }
                        r$a.v = (Integer)list.get(1);
                    }
                    r$a.u = (Integer)list.get(0);
                    return;
                }
                case 13: {
                    final ArrayList list2 = (ArrayList)a(this.F0);
                    final int size2 = list2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            }
                            r$a.t = (Integer)list2.get(2);
                        }
                        r$a.s = (Integer)list2.get(1);
                    }
                    r$a.r = (Integer)list2.get(0);
                    return;
                }
                case 9:
                case 21: {
                    break Label_1070;
                }
                case 8:
                case 15: {
                    break Label_1070;
                }
                case 7:
                case 16: {
                    break Label_1070;
                }
                case 6:
                case 20: {
                    break Label_1070;
                }
                case 5:
                case 19: {
                    break Label_1070;
                }
                case 4:
                case 18: {
                    break Label_1070;
                }
                case 3:
                case 17: {
                    break Label_1070;
                }
                case 2:
                case 12: {
                    break Label_1070;
                }
                case 1:
                case 11: {
                    break Label_1070;
                }
                case 0:
                case 10: {
                    Label_1081: {
                        break Label_1081;
                        try {
                            r$a.r = Integer.parseInt(this.F0);
                            return;
                            while (true) {
                                final String[] split;
                                Integer value = Integer.parseInt(split[1]);
                                Label_0975: {
                                    break Label_0975;
                                    r$a.a = this.F0;
                                    return;
                                    r$a.b = this.F0;
                                    return;
                                    Label_0972: {
                                        value = null;
                                    }
                                    break Label_0975;
                                    r$a.c = this.F0;
                                    return;
                                    r$a.x = this.F0;
                                    return;
                                    r$a.d = this.F0;
                                    return;
                                }
                                final int int1;
                                r$a.n = int1;
                                r$a.o = value;
                                return;
                                final String f0 = this.F0;
                                final int a = cnw.a;
                                split = f0.split("/", -1);
                                int1 = Integer.parseInt(split[0]);
                                iftrue(Label_0972:)(split.length <= 1);
                                continue;
                            }
                            final int int2 = Integer.parseInt(this.F0.substring(2, 4));
                            final int int3 = Integer.parseInt(this.F0.substring(0, 2));
                            r$a.s = int2;
                            r$a.t = int3;
                            return;
                            r$a.z = this.F0;
                            return;
                            r$a.y = this.F0;
                            return;
                        }
                        catch (final NumberFormatException | StringIndexOutOfBoundsException ex) {
                            return;
                        }
                    }
                    break;
                }
            }
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && gis.class == o.getClass()) {
            final gis gis = (gis)o;
            if (!cnw.a(super.D0, gis.D0) || !cnw.a(this.E0, gis.E0) || !cnw.a(this.F0, gis.F0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int f = hmg.f(super.D0, 527, 31);
        final String e0 = this.E0;
        int hashCode = 0;
        int hashCode2;
        if (e0 != null) {
            hashCode2 = e0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String f2 = this.F0;
        if (f2 != null) {
            hashCode = f2.hashCode();
        }
        return (f + hashCode2) * 31 + hashCode;
    }
    
    public final String toString() {
        final String d0 = super.D0;
        final String e0 = this.E0;
        final String f0 = this.F0;
        final StringBuilder d2 = x70.D(wnj.f(f0, wnj.f(e0, wnj.f(d0, 22))), d0, ": description=", e0, ": value=");
        d2.append(f0);
        return d2.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.F0);
    }
}
