import java.util.Objects;
import com.google.android.exoplayer2.r$a;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhs extends c5d
{
    public static final Parcelable$Creator<lhs> CREATOR;
    public final String D0;
    public final String E0;
    
    static {
        CREATOR = (Parcelable$Creator)new lhs$a();
    }
    
    public lhs(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = imw.a;
        super(string);
        this.D0 = parcel.readString();
        this.E0 = parcel.readString();
    }
    
    public lhs(final String s, final String d0, final String e0) {
        super(s);
        this.D0 = d0;
        this.E0 = e0;
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
    
    @Override
    public final void P1(final r$a r$a) {
        final String c0 = super.C0;
        Objects.requireNonNull(c0);
        int n = 0;
        Label_0595: {
            switch (c0) {
                case "TYER": {
                    n = 21;
                    break Label_0595;
                }
                case "TRCK": {
                    n = 20;
                    break Label_0595;
                }
                case "TPE3": {
                    n = 19;
                    break Label_0595;
                }
                case "TPE2": {
                    n = 18;
                    break Label_0595;
                }
                case "TPE1": {
                    n = 17;
                    break Label_0595;
                }
                case "TIT2": {
                    n = 16;
                    break Label_0595;
                }
                case "TEXT": {
                    n = 15;
                    break Label_0595;
                }
                case "TDRL": {
                    n = 14;
                    break Label_0595;
                }
                case "TDRC": {
                    n = 13;
                    break Label_0595;
                }
                case "TDAT": {
                    n = 12;
                    break Label_0595;
                }
                case "TCOM": {
                    n = 11;
                    break Label_0595;
                }
                case "TALB": {
                    n = 10;
                    break Label_0595;
                }
                case "TYE": {
                    n = 9;
                    break Label_0595;
                }
                case "TXT": {
                    n = 8;
                    break Label_0595;
                }
                case "TT2": {
                    n = 7;
                    break Label_0595;
                }
                case "TRK": {
                    n = 6;
                    break Label_0595;
                }
                case "TP3": {
                    n = 5;
                    break Label_0595;
                }
                case "TP2": {
                    n = 4;
                    break Label_0595;
                }
                case "TP1": {
                    n = 3;
                    break Label_0595;
                }
                case "TDA": {
                    n = 2;
                    break Label_0595;
                }
                case "TCM": {
                    n = 1;
                    break Label_0595;
                }
                case "TAL": {
                    n = 0;
                    break Label_0595;
                }
                default:
                    break;
            }
            n = -1;
        }
        Label_1029: {
            switch (n) {
                default: {
                    return;
                }
                case 14: {
                    final ArrayList list = (ArrayList)a(this.E0);
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
                    final ArrayList list2 = (ArrayList)a(this.E0);
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
                    break Label_1029;
                }
                case 8:
                case 15: {
                    break Label_1029;
                }
                case 7:
                case 16: {
                    break Label_1029;
                }
                case 6:
                case 20: {
                    break Label_1029;
                }
                case 5:
                case 19: {
                    break Label_1029;
                }
                case 4:
                case 18: {
                    break Label_1029;
                }
                case 3:
                case 17: {
                    break Label_1029;
                }
                case 2:
                case 12: {
                    break Label_1029;
                }
                case 1:
                case 11: {
                    break Label_1029;
                }
                case 0:
                case 10: {
                    Label_1040: {
                        break Label_1040;
                        try {
                            r$a.r = Integer.parseInt(this.E0);
                            return;
                        Label_0933:
                            while (true) {
                                while (true) {
                                    final String[] split;
                                    final Integer value = Integer.parseInt(split[1]);
                                    break Label_0933;
                                    final String e0 = this.E0;
                                    final int a = imw.a;
                                    split = e0.split("/", -1);
                                    final int int1 = Integer.parseInt(split[0]);
                                    iftrue(Label_0931:)(split.length <= 1);
                                    continue;
                                }
                                r$a.a = this.E0;
                                return;
                                r$a.d = this.E0;
                                return;
                                r$a.x = this.E0;
                                return;
                                r$a.z = this.E0;
                                return;
                                int int1 = 0;
                                r$a.n = int1;
                                Integer value = null;
                                r$a.o = value;
                                return;
                                r$a.y = this.E0;
                                return;
                                Label_0931: {
                                    value = null;
                                }
                                continue Label_0933;
                            }
                            r$a.b = this.E0;
                            return;
                            final int int2 = Integer.parseInt(this.E0.substring(2, 4));
                            final int int3 = Integer.parseInt(this.E0.substring(0, 2));
                            r$a.s = int2;
                            r$a.t = int3;
                            return;
                            r$a.c = this.E0;
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
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && lhs.class == o.getClass()) {
            final lhs lhs = (lhs)o;
            if (!imw.a((Object)super.C0, (Object)lhs.C0) || !imw.a((Object)this.D0, (Object)lhs.D0) || !imw.a((Object)this.E0, (Object)lhs.E0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(super.C0, 527, 31);
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
        if (e0 != null) {
            hashCode = e0.hashCode();
        }
        return (a + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String c0 = super.C0;
        final String d0 = this.D0;
        final String e0 = this.E0;
        final StringBuilder n = xpa.n(dia.o(e0, dia.o(d0, dia.o(c0, 22))), c0, ": description=", d0, ": value=");
        n.append(e0);
        return n.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.C0);
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
    }
}
