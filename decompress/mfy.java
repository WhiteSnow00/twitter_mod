import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mfy implements Iterable, aey
{
    public final String C0;
    
    public mfy(final String c0) {
        if (c0 != null) {
            this.C0 = c0;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    public final aey e() {
        return (aey)new mfy(this.C0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mfy && this.C0.equals(((mfy)o).C0));
    }
    
    public final Double h() {
        if (this.C0.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.C0);
        }
        catch (final NumberFormatException ex) {
            return Double.NaN;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public final Boolean i() {
        return this.C0.isEmpty() ^ true;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new dfy(this);
    }
    
    public final String j() {
        return this.C0;
    }
    
    public final Iterator l() {
        return new tey(this);
    }
    
    public final aey o(String s, final k6z k6z, final List list) {
        if (!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", s));
        }
        int n = 0;
        Label_0603: {
            Label_0582: {
                Label_0532: {
                    switch (s.hashCode()) {
                        case 1943291465: {
                            if (s.equals("indexOf")) {
                                n = 3;
                                break Label_0532;
                            }
                            break;
                        }
                        case 1094496948: {
                            if (s.equals("replace")) {
                                n = 6;
                                break Label_0532;
                            }
                            break;
                        }
                        case 530542161: {
                            if (s.equals("substring")) {
                                n = 10;
                                break Label_0532;
                            }
                            break;
                        }
                        case 109648666: {
                            if (s.equals("split")) {
                                n = 9;
                                break Label_0532;
                            }
                            break;
                        }
                        case 109526418: {
                            if (s.equals("slice")) {
                                n = 8;
                                break Label_0532;
                            }
                            break;
                        }
                        case 103668165: {
                            if (s.equals("match")) {
                                n = 5;
                                break Label_0532;
                            }
                            break;
                        }
                        case 3568674: {
                            if (s.equals("trim")) {
                                n = 16;
                                break Label_0532;
                            }
                            break;
                        }
                        case -399551817: {
                            if (s.equals("toUpperCase")) {
                                n = 15;
                                break Label_0532;
                            }
                            break;
                        }
                        case -467511597: {
                            if (s.equals("lastIndexOf")) {
                                n = 4;
                                break Label_0532;
                            }
                            break;
                        }
                        case -726908483: {
                            if (s.equals("toLocaleUpperCase")) {
                                n = 11;
                                break Label_0532;
                            }
                            break;
                        }
                        case -906336856: {
                            if (s.equals("search")) {
                                n = 7;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1137582698: {
                            if (s.equals("toLowerCase")) {
                                n = 13;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1354795244: {
                            if (s.equals("concat")) {
                                n = 1;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1361633751: {
                            if (s.equals("charAt")) {
                                n = 0;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1464939364: {
                            if (s.equals("toLocaleLowerCase")) {
                                n = 12;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1776922004: {
                            if (s.equals("toString")) {
                                n = 14;
                                break Label_0532;
                            }
                            break;
                        }
                        case -1789698943: {
                            if (s.equals("hasOwnProperty")) {
                                n = 2;
                                break Label_0603;
                            }
                            break;
                        }
                    }
                    break Label_0582;
                }
                break Label_0603;
            }
            n = -1;
        }
        s = "undefined";
        Object o = null;
        switch (n) {
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
            case 16: {
                haz.h("toUpperCase", 0, list);
                o = new mfy(this.C0.trim());
                break;
            }
            case 15: {
                haz.h("toUpperCase", 0, list);
                o = new mfy(this.C0.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                haz.h("toString", 0, list);
                return (aey)this;
            }
            case 13: {
                haz.h("toLowerCase", 0, list);
                o = new mfy(this.C0.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                haz.h("toLocaleLowerCase", 0, list);
                o = new mfy(this.C0.toLowerCase());
                break;
            }
            case 11: {
                haz.h("toLocaleUpperCase", 0, list);
                o = new mfy(this.C0.toUpperCase());
                break;
            }
            case 10: {
                haz.j("substring", 2, list);
                s = this.C0;
                final ArrayList list2 = (ArrayList)list;
                int n2;
                if (!list2.isEmpty()) {
                    n2 = (int)haz.a(k6z.b((aey)list2.get(0)).h());
                }
                else {
                    n2 = 0;
                }
                int length;
                if (list2.size() > 1) {
                    length = (int)haz.a(k6z.b((aey)list2.get(1)).h());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(n2, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new mfy(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                haz.j("split", 2, list);
                final String c0 = this.C0;
                if (c0.length() == 0) {
                    o = new qay((List)Arrays.asList((aey)this));
                    break;
                }
                final ArrayList<mfy> list3 = new ArrayList<mfy>();
                final ArrayList list4 = (ArrayList)list;
                if (list4.isEmpty()) {
                    list3.add(this);
                }
                else {
                    final String j = k6z.b((aey)list4.get(0)).j();
                    long d;
                    if (list4.size() > 1) {
                        d = haz.d(k6z.b((aey)list4.get(1)).h());
                    }
                    else {
                        d = 2147483647L;
                    }
                    if (d == 0L) {
                        o = new qay();
                        break;
                    }
                    final String[] split = c0.split(Pattern.quote(j), (int)d + 1);
                    final int length2 = split.length;
                    int n4 = 0;
                    int n5 = 0;
                    Label_1232: {
                        if (j.isEmpty() && length2 > 0) {
                            final boolean empty = split[0].isEmpty();
                            final int n3 = length2 - 1;
                            n4 = (empty ? 1 : 0);
                            n5 = n3;
                            if (split[n3].isEmpty()) {
                                break Label_1232;
                            }
                            n4 = (empty ? 1 : 0);
                        }
                        else {
                            n4 = 0;
                        }
                        n5 = length2;
                    }
                    int i = n4;
                    int n6 = n5;
                    if (length2 > d) {
                        n6 = n5 - 1;
                        i = n4;
                    }
                    while (i < n6) {
                        list3.add(new mfy(split[i]));
                        ++i;
                    }
                }
                o = new qay((List)list3);
                break;
            }
            case 8: {
                haz.j("slice", 2, list);
                s = this.C0;
                final ArrayList list5 = (ArrayList)list;
                double doubleValue;
                if (!list5.isEmpty()) {
                    doubleValue = k6z.b((aey)list5.get(0)).h();
                }
                else {
                    doubleValue = 0.0;
                }
                final double a = haz.a(doubleValue);
                double n7;
                if (a < 0.0) {
                    n7 = Math.max(s.length() + a, 0.0);
                }
                else {
                    n7 = Math.min(a, s.length());
                }
                final int n8 = (int)n7;
                double doubleValue2;
                if (list5.size() > 1) {
                    doubleValue2 = k6z.b((aey)list5.get(1)).h();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double a2 = haz.a(doubleValue2);
                double n9;
                if (a2 < 0.0) {
                    n9 = Math.max(s.length() + a2, 0.0);
                }
                else {
                    n9 = Math.min(a2, s.length());
                }
                o = new mfy(s.substring(n8, Math.max(0, (int)n9 - n8) + n8));
                break;
            }
            case 7: {
                haz.j("search", 1, list);
                final ArrayList list6 = (ArrayList)list;
                if (!list6.isEmpty()) {
                    s = k6z.b((aey)list6.get(0)).j();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.C0);
                if (matcher.find()) {
                    o = new tby(Double.valueOf(matcher.start()));
                    break;
                }
                o = new tby(Double.valueOf(-1.0));
                break;
            }
            case 6: {
                haz.j("replace", 2, list);
                final sfy u0 = aey.u0;
                final ArrayList list7 = (ArrayList)list;
                Object b = u0;
                if (!list7.isEmpty()) {
                    final String k = k6z.b((aey)list7.get(0)).j();
                    b = u0;
                    s = k;
                    if (list7.size() > 1) {
                        b = k6z.b((aey)list7.get(1));
                        s = k;
                    }
                }
                final String c2 = this.C0;
                final int index = c2.indexOf(s);
                if (index >= 0) {
                    Object a3 = b;
                    if (b instanceof vby) {
                        a3 = ((vby)b).a(k6z, (List)Arrays.asList((aey)new mfy(s), (aey)new tby(Double.valueOf(index)), (aey)this));
                    }
                    o = new mfy(zi.y(c2.substring(0, index), ((aey)a3).j(), c2.substring(s.length() + index)));
                    break;
                }
                return (aey)this;
            }
            case 5: {
                haz.j("match", 1, list);
                final String c3 = this.C0;
                final ArrayList list8 = (ArrayList)list;
                if (list8.size() <= 0) {
                    s = "";
                }
                else {
                    s = k6z.b((aey)list8.get(0)).j();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(c3);
                if (matcher2.find()) {
                    o = new qay((List)Arrays.asList((aey)new mfy(matcher2.group())));
                    break;
                }
                o = aey.v0;
                break;
            }
            case 4: {
                haz.j("lastIndexOf", 2, list);
                final String c4 = this.C0;
                final ArrayList list9 = (ArrayList)list;
                if (list9.size() > 0) {
                    s = k6z.b((aey)list9.get(0)).j();
                }
                double doubleValue3;
                if (list9.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = k6z.b((aey)list9.get(1)).h();
                }
                double a4;
                if (Double.isNaN(doubleValue3)) {
                    a4 = Double.POSITIVE_INFINITY;
                }
                else {
                    a4 = haz.a(doubleValue3);
                }
                o = new tby(Double.valueOf(c4.lastIndexOf(s, (int)a4)));
                break;
            }
            case 3: {
                double doubleValue4 = 0.0;
                haz.j("indexOf", 2, list);
                final String c5 = this.C0;
                final ArrayList list10 = (ArrayList)list;
                if (list10.size() > 0) {
                    s = k6z.b((aey)list10.get(0)).j();
                }
                if (list10.size() >= 2) {
                    doubleValue4 = k6z.b((aey)list10.get(1)).h();
                }
                o = new tby(Double.valueOf(c5.indexOf(s, (int)haz.a(doubleValue4))));
                break;
            }
            case 2: {
                haz.h("hasOwnProperty", 1, list);
                s = this.C0;
                final aey b2 = k6z.b((aey)((ArrayList)list).get(0));
                if ("length".equals(b2.j())) {
                    o = aey.z0;
                    break;
                }
                final double doubleValue5 = b2.h();
                if (doubleValue5 == Math.floor(doubleValue5)) {
                    final int n10 = (int)doubleValue5;
                    if (n10 >= 0 && n10 < s.length()) {
                        o = aey.z0;
                        break;
                    }
                }
                o = aey.A0;
                break;
            }
            case 1: {
                final ArrayList list11 = (ArrayList)list;
                if (!list11.isEmpty()) {
                    final StringBuilder sb = new StringBuilder(this.C0);
                    for (int l = 0; l < list11.size(); ++l) {
                        sb.append(k6z.b((aey)list11.get(l)).j());
                    }
                    o = new mfy(sb.toString());
                    break;
                }
                return (aey)this;
            }
            case 0: {
                haz.j("charAt", 1, list);
                final ArrayList list12 = (ArrayList)list;
                int n11;
                if (!list12.isEmpty()) {
                    n11 = (int)haz.a(k6z.b((aey)list12.get(0)).h());
                }
                else {
                    n11 = 0;
                }
                s = this.C0;
                if (n11 >= 0 && n11 < s.length()) {
                    o = new mfy(String.valueOf(s.charAt(n11)));
                    break;
                }
                o = aey.B0;
                break;
            }
        }
        return (aey)o;
        o = this;
        return (aey)o;
    }
    
    @Override
    public final String toString() {
        return zi.y("\"", this.C0, "\"");
    }
}
