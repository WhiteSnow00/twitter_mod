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

public final class wgy implements Iterable, kfy
{
    public final String F0;
    
    public wgy(final String f0) {
        if (f0 != null) {
            this.F0 = f0;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    public final kfy e() {
        return (kfy)new wgy(this.F0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof wgy && this.F0.equals(((wgy)o).F0));
    }
    
    public final Double h() {
        if (this.F0.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.F0);
        }
        catch (final NumberFormatException ex) {
            return Double.NaN;
        }
    }
    
    @Override
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new ngy(this);
    }
    
    public final Boolean j() {
        return this.F0.isEmpty() ^ true;
    }
    
    public final String k() {
        return this.F0;
    }
    
    public final Iterator m() {
        return (Iterator)new dgy(this);
    }
    
    public final kfy o(String s, final y7z y7z, final List list) {
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
                vbz.h("toUpperCase", 0, list);
                o = new wgy(this.F0.trim());
                break;
            }
            case 15: {
                vbz.h("toUpperCase", 0, list);
                o = new wgy(this.F0.toUpperCase(Locale.ENGLISH));
                break;
            }
            case 14: {
                vbz.h("toString", 0, list);
                return (kfy)this;
            }
            case 13: {
                vbz.h("toLowerCase", 0, list);
                o = new wgy(this.F0.toLowerCase(Locale.ENGLISH));
                break;
            }
            case 12: {
                vbz.h("toLocaleLowerCase", 0, list);
                o = new wgy(this.F0.toLowerCase());
                break;
            }
            case 11: {
                vbz.h("toLocaleUpperCase", 0, list);
                o = new wgy(this.F0.toUpperCase());
                break;
            }
            case 10: {
                vbz.j("substring", 2, list);
                s = this.F0;
                final ArrayList list2 = (ArrayList)list;
                int n2;
                if (!list2.isEmpty()) {
                    n2 = (int)vbz.a(y7z.d((kfy)list2.get(0)).h());
                }
                else {
                    n2 = 0;
                }
                int length;
                if (list2.size() > 1) {
                    length = (int)vbz.a(y7z.d((kfy)list2.get(1)).h());
                }
                else {
                    length = s.length();
                }
                final int min = Math.min(Math.max(n2, 0), s.length());
                final int min2 = Math.min(Math.max(length, 0), s.length());
                o = new wgy(s.substring(Math.min(min, min2), Math.max(min, min2)));
                break;
            }
            case 9: {
                vbz.j("split", 2, list);
                final String f0 = this.F0;
                if (f0.length() == 0) {
                    o = new acy((List)Arrays.asList((kfy)this));
                    break;
                }
                final ArrayList<wgy> list3 = new ArrayList<wgy>();
                final ArrayList list4 = (ArrayList)list;
                if (list4.isEmpty()) {
                    list3.add(this);
                }
                else {
                    final String k = y7z.d((kfy)list4.get(0)).k();
                    long d;
                    if (list4.size() > 1) {
                        d = vbz.d(y7z.d((kfy)list4.get(1)).h());
                    }
                    else {
                        d = 2147483647L;
                    }
                    if (d == 0L) {
                        o = new acy();
                        break;
                    }
                    final String[] split = f0.split(Pattern.quote(k), (int)d + 1);
                    final int length2 = split.length;
                    int n4 = 0;
                    int n5 = 0;
                    Label_1232: {
                        if (k.isEmpty() && length2 > 0) {
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
                        list3.add(new wgy(split[i]));
                        ++i;
                    }
                }
                o = new acy((List)list3);
                break;
            }
            case 8: {
                vbz.j("slice", 2, list);
                s = this.F0;
                final ArrayList list5 = (ArrayList)list;
                double doubleValue;
                if (!list5.isEmpty()) {
                    doubleValue = y7z.d((kfy)list5.get(0)).h();
                }
                else {
                    doubleValue = 0.0;
                }
                final double a = vbz.a(doubleValue);
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
                    doubleValue2 = y7z.d((kfy)list5.get(1)).h();
                }
                else {
                    doubleValue2 = s.length();
                }
                final double a2 = vbz.a(doubleValue2);
                double n9;
                if (a2 < 0.0) {
                    n9 = Math.max(s.length() + a2, 0.0);
                }
                else {
                    n9 = Math.min(a2, s.length());
                }
                o = new wgy(s.substring(n8, Math.max(0, (int)n9 - n8) + n8));
                break;
            }
            case 7: {
                vbz.j("search", 1, list);
                final ArrayList list6 = (ArrayList)list;
                if (!list6.isEmpty()) {
                    s = y7z.d((kfy)list6.get(0)).k();
                }
                final Matcher matcher = Pattern.compile(s).matcher(this.F0);
                if (matcher.find()) {
                    o = new ddy((double)matcher.start());
                    break;
                }
                o = new ddy(-1.0);
                break;
            }
            case 6: {
                vbz.j("replace", 2, list);
                final chy x0 = kfy.x0;
                final ArrayList list7 = (ArrayList)list;
                Object d2 = x0;
                if (!list7.isEmpty()) {
                    final String j = y7z.d((kfy)list7.get(0)).k();
                    d2 = x0;
                    s = j;
                    if (list7.size() > 1) {
                        d2 = y7z.d((kfy)list7.get(1));
                        s = j;
                    }
                }
                final String f2 = this.F0;
                final int index = f2.indexOf(s);
                if (index >= 0) {
                    Object a3 = d2;
                    if (d2 instanceof fdy) {
                        a3 = ((fdy)d2).a(y7z, (List)Arrays.asList((kfy)new wgy(s), (kfy)new ddy((double)index), (kfy)this));
                    }
                    o = new wgy(c0e.h(f2.substring(0, index), ((kfy)a3).k(), f2.substring(s.length() + index)));
                    break;
                }
                return (kfy)this;
            }
            case 5: {
                vbz.j("match", 1, list);
                final String f3 = this.F0;
                final ArrayList list8 = (ArrayList)list;
                if (list8.size() <= 0) {
                    s = "";
                }
                else {
                    s = y7z.d((kfy)list8.get(0)).k();
                }
                final Matcher matcher2 = Pattern.compile(s).matcher(f3);
                if (matcher2.find()) {
                    o = new acy((List)Arrays.asList((kfy)new wgy(matcher2.group())));
                    break;
                }
                o = kfy.y0;
                break;
            }
            case 4: {
                vbz.j("lastIndexOf", 2, list);
                final String f4 = this.F0;
                final ArrayList list9 = (ArrayList)list;
                if (list9.size() > 0) {
                    s = y7z.d((kfy)list9.get(0)).k();
                }
                double doubleValue3;
                if (list9.size() < 2) {
                    doubleValue3 = Double.NaN;
                }
                else {
                    doubleValue3 = y7z.d((kfy)list9.get(1)).h();
                }
                double a4;
                if (Double.isNaN(doubleValue3)) {
                    a4 = Double.POSITIVE_INFINITY;
                }
                else {
                    a4 = vbz.a(doubleValue3);
                }
                o = new ddy((double)f4.lastIndexOf(s, (int)a4));
                break;
            }
            case 3: {
                double doubleValue4 = 0.0;
                vbz.j("indexOf", 2, list);
                final String f5 = this.F0;
                final ArrayList list10 = (ArrayList)list;
                if (list10.size() > 0) {
                    s = y7z.d((kfy)list10.get(0)).k();
                }
                if (list10.size() >= 2) {
                    doubleValue4 = y7z.d((kfy)list10.get(1)).h();
                }
                o = new ddy((double)f5.indexOf(s, (int)vbz.a(doubleValue4)));
                break;
            }
            case 2: {
                vbz.h("hasOwnProperty", 1, list);
                s = this.F0;
                final kfy d3 = y7z.d((kfy)((ArrayList)list).get(0));
                if ("length".equals(d3.k())) {
                    o = kfy.C0;
                    break;
                }
                final double doubleValue5 = d3.h();
                if (doubleValue5 == Math.floor(doubleValue5)) {
                    final int n10 = (int)doubleValue5;
                    if (n10 >= 0 && n10 < s.length()) {
                        o = kfy.C0;
                        break;
                    }
                }
                o = kfy.D0;
                break;
            }
            case 1: {
                final ArrayList list11 = (ArrayList)list;
                if (!list11.isEmpty()) {
                    final StringBuilder sb = new StringBuilder(this.F0);
                    for (int l = 0; l < list11.size(); ++l) {
                        sb.append(y7z.d((kfy)list11.get(l)).k());
                    }
                    o = new wgy(sb.toString());
                    break;
                }
                return (kfy)this;
            }
            case 0: {
                vbz.j("charAt", 1, list);
                final ArrayList list12 = (ArrayList)list;
                int n11;
                if (!list12.isEmpty()) {
                    n11 = (int)vbz.a(y7z.d((kfy)list12.get(0)).h());
                }
                else {
                    n11 = 0;
                }
                s = this.F0;
                if (n11 >= 0 && n11 < s.length()) {
                    o = new wgy(String.valueOf(s.charAt(n11)));
                    break;
                }
                o = kfy.E0;
                break;
            }
        }
        return (kfy)o;
        o = this;
        return (kfy)o;
    }
    
    @Override
    public final String toString() {
        return c0e.h("\"", this.F0, "\"");
    }
}
