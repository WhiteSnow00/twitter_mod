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

public final class bgy implements Iterable, pey
{
    public final String D0;
    
    public bgy(final String d0) {
        if (d0 != null) {
            this.D0 = d0;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    public final pey e() {
        return (pey)new bgy(this.D0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof bgy && this.D0.equals(((bgy)o).D0));
    }
    
    public final Double h() {
        if (this.D0.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.D0);
        }
        catch (final NumberFormatException ex) {
            return Double.NaN;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    public final Boolean i() {
        return this.D0.isEmpty() ^ true;
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new sfy(this);
    }
    
    public final String j() {
        return this.D0;
    }
    
    public final Iterator l() {
        return new ify(this);
    }
    
    public final pey o(String s, final z6z z6z, final List list) {
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
                waz.h("toUpperCase", 0, list);
                o = new bgy(this.D0.trim());
                break;
            }
            case 15: {
                waz.h("toUpperCase", 0, list);
                o = new bgy(this.D0.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                waz.h("toString", 0, list);
                return (pey)this;
            }
            case 13: {
                waz.h("toLowerCase", 0, list);
                o = new bgy(this.D0.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                waz.h("toLocaleLowerCase", 0, list);
                o = new bgy(this.D0.toLowerCase());
                break;
            }
            case 11: {
                waz.h("toLocaleUpperCase", 0, list);
                o = new bgy(this.D0.toUpperCase());
                break;
            }
            case 10: {
                waz.j("substring", 2, list);
                s = this.D0;
                final ArrayList list2 = (ArrayList)list;
                int n2;
                if (!list2.isEmpty()) {
                    n2 = (int)waz.a((double)z6z.d((pey)list2.get(0)).h());
                }
                else {
                    n2 = 0;
                }
                int length;
                if (list2.size() > 1) {
                    length = (int)waz.a((double)z6z.d((pey)list2.get(1)).h());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(n2, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new bgy(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                waz.j("split", 2, list);
                final String d0 = this.D0;
                if (d0.length() == 0) {
                    o = new gby((List)Arrays.asList((pey)this));
                    break;
                }
                final ArrayList<bgy> list3 = new ArrayList<bgy>();
                final ArrayList list4 = (ArrayList)list;
                if (list4.isEmpty()) {
                    list3.add(this);
                }
                else {
                    final String j = z6z.d((pey)list4.get(0)).j();
                    long d2;
                    if (list4.size() > 1) {
                        d2 = waz.d((double)z6z.d((pey)list4.get(1)).h());
                    }
                    else {
                        d2 = 2147483647L;
                    }
                    if (d2 == 0L) {
                        o = new gby();
                        break;
                    }
                    final String[] split = d0.split(Pattern.quote(j), (int)d2 + 1);
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
                    if (length2 > d2) {
                        n6 = n5 - 1;
                        i = n4;
                    }
                    while (i < n6) {
                        list3.add(new bgy(split[i]));
                        ++i;
                    }
                }
                o = new gby((List)list3);
                break;
            }
            case 8: {
                waz.j("slice", 2, list);
                s = this.D0;
                final ArrayList list5 = (ArrayList)list;
                double doubleValue;
                if (!list5.isEmpty()) {
                    doubleValue = z6z.d((pey)list5.get(0)).h();
                }
                else {
                    doubleValue = 0.0;
                }
                final double a = waz.a(doubleValue);
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
                    doubleValue2 = z6z.d((pey)list5.get(1)).h();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double a2 = waz.a(doubleValue2);
                double n9;
                if (a2 < 0.0) {
                    n9 = Math.max(s.length() + a2, 0.0);
                }
                else {
                    n9 = Math.min(a2, s.length());
                }
                o = new bgy(s.substring(n8, Math.max(0, (int)n9 - n8) + n8));
                break;
            }
            case 7: {
                waz.j("search", 1, list);
                final ArrayList list6 = (ArrayList)list;
                if (!list6.isEmpty()) {
                    s = z6z.d((pey)list6.get(0)).j();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.D0);
                if (matcher.find()) {
                    o = new jcy(Double.valueOf(matcher.start()));
                    break;
                }
                o = new jcy(Double.valueOf(-1.0));
                break;
            }
            case 6: {
                waz.j("replace", 2, list);
                final hgy v0 = pey.v0;
                final ArrayList list7 = (ArrayList)list;
                Object d3 = v0;
                if (!list7.isEmpty()) {
                    final String k = z6z.d((pey)list7.get(0)).j();
                    d3 = v0;
                    s = k;
                    if (list7.size() > 1) {
                        d3 = z6z.d((pey)list7.get(1));
                        s = k;
                    }
                }
                final String d4 = this.D0;
                final int index = d4.indexOf(s);
                if (index >= 0) {
                    Object a3 = d3;
                    if (d3 instanceof lcy) {
                        a3 = ((lcy)d3).a(z6z, (List)Arrays.asList((pey)new bgy(s), (pey)new jcy(Double.valueOf(index)), (pey)this));
                    }
                    o = new bgy(da8.j(d4.substring(0, index), ((pey)a3).j(), d4.substring(s.length() + index)));
                    break;
                }
                return (pey)this;
            }
            case 5: {
                waz.j("match", 1, list);
                final String d5 = this.D0;
                final ArrayList list8 = (ArrayList)list;
                if (list8.size() <= 0) {
                    s = "";
                }
                else {
                    s = z6z.d((pey)list8.get(0)).j();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(d5);
                if (matcher2.find()) {
                    o = new gby((List)Arrays.asList((pey)new bgy(matcher2.group())));
                    break;
                }
                o = pey.w0;
                break;
            }
            case 4: {
                waz.j("lastIndexOf", 2, list);
                final String d6 = this.D0;
                final ArrayList list9 = (ArrayList)list;
                if (list9.size() > 0) {
                    s = z6z.d((pey)list9.get(0)).j();
                }
                double doubleValue3;
                if (list9.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = z6z.d((pey)list9.get(1)).h();
                }
                double a4;
                if (Double.isNaN(doubleValue3)) {
                    a4 = Double.POSITIVE_INFINITY;
                }
                else {
                    a4 = waz.a(doubleValue3);
                }
                o = new jcy(Double.valueOf(d6.lastIndexOf(s, (int)a4)));
                break;
            }
            case 3: {
                double doubleValue4 = 0.0;
                waz.j("indexOf", 2, list);
                final String d7 = this.D0;
                final ArrayList list10 = (ArrayList)list;
                if (list10.size() > 0) {
                    s = z6z.d((pey)list10.get(0)).j();
                }
                if (list10.size() >= 2) {
                    doubleValue4 = z6z.d((pey)list10.get(1)).h();
                }
                o = new jcy(Double.valueOf(d7.indexOf(s, (int)waz.a(doubleValue4))));
                break;
            }
            case 2: {
                waz.h("hasOwnProperty", 1, list);
                s = this.D0;
                final pey d8 = z6z.d((pey)((ArrayList)list).get(0));
                if ("length".equals(d8.j())) {
                    o = pey.A0;
                    break;
                }
                final double doubleValue5 = d8.h();
                if (doubleValue5 == Math.floor(doubleValue5)) {
                    final int n10 = (int)doubleValue5;
                    if (n10 >= 0 && n10 < s.length()) {
                        o = pey.A0;
                        break;
                    }
                }
                o = pey.B0;
                break;
            }
            case 1: {
                final ArrayList list11 = (ArrayList)list;
                if (!list11.isEmpty()) {
                    final StringBuilder sb = new StringBuilder(this.D0);
                    for (int l = 0; l < list11.size(); ++l) {
                        sb.append(z6z.d((pey)list11.get(l)).j());
                    }
                    o = new bgy(sb.toString());
                    break;
                }
                return (pey)this;
            }
            case 0: {
                waz.j("charAt", 1, list);
                final ArrayList list12 = (ArrayList)list;
                int n11;
                if (!list12.isEmpty()) {
                    n11 = (int)waz.a((double)z6z.d((pey)list12.get(0)).h());
                }
                else {
                    n11 = 0;
                }
                s = this.D0;
                if (n11 >= 0 && n11 < s.length()) {
                    o = new bgy(String.valueOf(s.charAt(n11)));
                    break;
                }
                o = pey.C0;
                break;
            }
        }
        return (pey)o;
        o = this;
        return (pey)o;
    }
    
    @Override
    public final String toString() {
        return da8.j("\"", this.D0, "\"");
    }
}
