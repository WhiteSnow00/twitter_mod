import android.text.Layout$Alignment;
import java.util.HashSet;
import java.util.ArrayDeque;
import android.text.SpannedString;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.Set;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collection;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StrikethroughSpan;
import android.text.Spannable;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.Objects;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.util.Collections;
import android.graphics.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jox
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Map<String, Integer> c;
    public static final Map<String, Integer> d;
    
    static {
        a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
        b = Pattern.compile("(\\S+?):(\\S+)");
        final HashMap hashMap = new HashMap();
        hashMap.put("white", Color.rgb(255, 255, 255));
        hashMap.put("lime", Color.rgb(0, 255, 0));
        hashMap.put("cyan", Color.rgb(0, 255, 255));
        hashMap.put("red", Color.rgb(255, 0, 0));
        hashMap.put("yellow", Color.rgb(255, 255, 0));
        hashMap.put("magenta", Color.rgb(255, 0, 255));
        hashMap.put("blue", Color.rgb(0, 0, 255));
        hashMap.put("black", Color.rgb(0, 0, 0));
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Color.rgb(255, 255, 255));
        hashMap2.put("bg_lime", Color.rgb(0, 255, 0));
        hashMap2.put("bg_cyan", Color.rgb(0, 255, 255));
        hashMap2.put("bg_red", Color.rgb(255, 0, 0));
        hashMap2.put("bg_yellow", Color.rgb(255, 255, 0));
        hashMap2.put("bg_magenta", Color.rgb(255, 0, 255));
        hashMap2.put("bg_blue", Color.rgb(0, 0, 255));
        hashMap2.put("bg_black", Color.rgb(0, 0, 0));
        d = Collections.unmodifiableMap((Map<?, ?>)hashMap2);
    }
    
    public static void a(final String s, final b b, final List<a> list, final SpannableStringBuilder spannableStringBuilder, final List<gox> list2) {
        final int b2 = b.b;
        final int length = spannableStringBuilder.length();
        final String a = b.a;
        Objects.requireNonNull(a);
        final int hashCode = a.hashCode();
        int n = 0;
        Label_0242: {
            if (hashCode != 0) {
                if (hashCode != 105) {
                    if (hashCode != 3314158) {
                        if (hashCode != 3511770) {
                            if (hashCode != 98) {
                                if (hashCode != 99) {
                                    if (hashCode != 117) {
                                        if (hashCode == 118) {
                                            if (a.equals("v")) {
                                                n = 5;
                                                break Label_0242;
                                            }
                                        }
                                    }
                                    else if (a.equals("u")) {
                                        n = 4;
                                        break Label_0242;
                                    }
                                }
                                else if (a.equals("c")) {
                                    n = 2;
                                    break Label_0242;
                                }
                            }
                            else if (a.equals("b")) {
                                n = 1;
                                break Label_0242;
                            }
                        }
                        else if (a.equals("ruby")) {
                            n = 7;
                            break Label_0242;
                        }
                    }
                    else if (a.equals("lang")) {
                        n = 6;
                        break Label_0242;
                    }
                }
                else if (a.equals("i")) {
                    n = 3;
                    break Label_0242;
                }
            }
            else if (a.equals("")) {
                n = 0;
                break Label_0242;
            }
            n = -1;
        }
        while (true) {
            switch (n) {
                default: {
                    return;
                }
                case 0:
                case 5:
                case 6: {
                    final List<c> b3 = b(list2, s, b);
                    int n2 = 0;
                    while (true) {
                        final ArrayList list3 = (ArrayList)b3;
                        if (n2 >= list3.size()) {
                            return;
                        }
                        final gox g0 = list3.get(n2).G0;
                        if (g0 != null) {
                            if (g0.a() != -1) {
                                iuk.e((Spannable)spannableStringBuilder, (Object)new StyleSpan(g0.a()), b2, length);
                            }
                            if (g0.j == 1) {
                                spannableStringBuilder.setSpan((Object)new StrikethroughSpan(), b2, length, 33);
                            }
                            if (g0.k == 1) {
                                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), b2, length, 33);
                            }
                            if (g0.g) {
                                if (!g0.g) {
                                    throw new IllegalStateException("Font color not defined");
                                }
                                iuk.e((Spannable)spannableStringBuilder, (Object)new ForegroundColorSpan(g0.f), b2, length);
                            }
                            if (g0.i) {
                                if (!g0.i) {
                                    throw new IllegalStateException("Background color not defined.");
                                }
                                iuk.e((Spannable)spannableStringBuilder, (Object)new BackgroundColorSpan(g0.h), b2, length);
                            }
                            if (g0.e != null) {
                                iuk.e((Spannable)spannableStringBuilder, (Object)new TypefaceSpan(g0.e), b2, length);
                            }
                            final int n3 = g0.n;
                            if (n3 != 1) {
                                if (n3 != 2) {
                                    if (n3 == 3) {
                                        iuk.e((Spannable)spannableStringBuilder, (Object)new RelativeSizeSpan(g0.o / 100.0f), b2, length);
                                    }
                                }
                                else {
                                    iuk.e((Spannable)spannableStringBuilder, (Object)new RelativeSizeSpan(g0.o), b2, length);
                                }
                            }
                            else {
                                iuk.e((Spannable)spannableStringBuilder, (Object)new AbsoluteSizeSpan((int)g0.o, true), b2, length);
                            }
                            if (g0.q) {
                                spannableStringBuilder.setSpan((Object)new wqc(), b2, length, 33);
                            }
                        }
                        ++n2;
                    }
                    break;
                }
                case 7: {
                    final int c = c(list2, s, b);
                    final ArrayList list4 = new ArrayList(list.size());
                    list4.addAll(list);
                    Collections.sort((List<Object>)list4, (Comparator<? super Object>)iox.G0);
                    int b4 = b.b;
                    int i = 0;
                    int n4 = 0;
                    while (i < list4.size()) {
                        if ("rt".equals(((a)list4.get(i)).a.a)) {
                            final a a2 = (a)list4.get(i);
                            int c2 = c(list2, s, a2.a);
                            if (c2 == -1) {
                                if (c != -1) {
                                    c2 = c;
                                }
                                else {
                                    c2 = 1;
                                }
                            }
                            final int n5 = a2.a.b - n4;
                            final int n6 = a2.b - n4;
                            final CharSequence subSequence = spannableStringBuilder.subSequence(n5, n6);
                            spannableStringBuilder.delete(n5, n6);
                            spannableStringBuilder.setSpan((Object)new ymo(subSequence.toString(), c2), b4, n5, 33);
                            n4 += subSequence.length();
                            b4 = n5;
                        }
                        ++i;
                    }
                    continue;
                }
                case 4: {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), b2, length, 33);
                    continue;
                }
                case 3: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), b2, length, 33);
                    continue;
                }
                case 2: {
                    for (final String s2 : b.d) {
                        final Map<String, Integer> c3 = jox.c;
                        if (c3.containsKey(s2)) {
                            spannableStringBuilder.setSpan((Object)new ForegroundColorSpan((int)c3.get(s2)), b2, length, 33);
                        }
                        else {
                            final Map<String, Integer> d = jox.d;
                            if (!d.containsKey(s2)) {
                                continue;
                            }
                            spannableStringBuilder.setSpan((Object)new BackgroundColorSpan((int)d.get(s2)), b2, length, 33);
                        }
                    }
                    continue;
                }
                case 1: {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(1), b2, length, 33);
                    continue;
                }
            }
            break;
        }
    }
    
    public static List<c> b(final List<gox> list, final String s, final b b) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final gox gox = list.get(i);
            final String a = b.a;
            final Set<String> d = b.d;
            final String c = b.c;
            int empty;
            if (gox.a.isEmpty() && gox.b.isEmpty() && gox.c.isEmpty() && gox.d.isEmpty()) {
                empty = (TextUtils.isEmpty((CharSequence)a) ? 1 : 0);
            }
            else {
                final int b2 = gox.b(gox.b(gox.b(0, gox.a, s, 1073741824), gox.b, a, 2), gox.d, c, 4);
                if (b2 != -1 && d.containsAll(gox.c)) {
                    empty = b2 + gox.c.size() * 4;
                }
                else {
                    empty = 0;
                }
            }
            if (empty > 0) {
                list2.add(new c(empty, gox));
            }
        }
        Collections.sort((List<Comparable>)list2);
        return list2;
    }
    
    public static int c(final List<gox> list, final String s, final b b) {
        final List<c> b2 = b(list, s, b);
        int n = 0;
        while (true) {
            final ArrayList list2 = (ArrayList)b2;
            if (n >= list2.size()) {
                return -1;
            }
            final int p3 = list2.get(n).G0.p;
            if (p3 != -1) {
                return p3;
            }
            ++n;
        }
    }
    
    public static hox d(String s, Matcher matcher, final gxj gxj, final List<gox> list) {
        final d d = new d();
        try {
            final String group = matcher.group(1);
            Objects.requireNonNull(group);
            d.a = mox.c(group);
            final String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            d.b = mox.c(group2);
            matcher = (Matcher)matcher.group(3);
            Objects.requireNonNull(matcher);
            e((String)matcher, d);
            final StringBuilder sb = new StringBuilder();
            for (matcher = (Matcher)gxj.f(); !TextUtils.isEmpty((CharSequence)matcher); matcher = (Matcher)gxj.f()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(((String)matcher).trim());
            }
            d.c = (CharSequence)f(s, sb.toString(), list);
            return new hox(d.a().a(), d.a, d.b);
        }
        catch (final NumberFormatException ex) {
            s = String.valueOf(matcher.group());
            if (s.length() != 0) {
                s = "Skipping cue with bad header: ".concat(s);
            }
            else {
                s = new String("Skipping cue with bad header: ");
            }
            Log.w("WebvttCueParser", s);
            return null;
        }
    }
    
    public static void e(String s, final d d) {
        final Matcher matcher = jox.b.matcher(s);
    Label_0349_Outer:
        while (matcher.find()) {
            int k = 1;
            int d2 = 1;
            final String group = matcher.group(1);
            Objects.requireNonNull(group);
            s = matcher.group(2);
            Objects.requireNonNull(s);
            try {
                if ("line".equals(group)) {
                    g(s, d);
                }
                else if ("align".equals(group)) {
                    int n = -1;
                    switch (s) {
                        case "start": {
                            n = 5;
                            break;
                        }
                        case "right": {
                            n = 4;
                            break;
                        }
                        case "left": {
                            n = 3;
                            break;
                        }
                        case "end": {
                            n = 2;
                            break;
                        }
                        case "middle": {
                            n = 1;
                            break;
                        }
                        case "center": {
                            n = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    while (true) {
                        switch (n) {
                            case 5: {
                                d.d = d2;
                                continue Label_0349_Outer;
                            }
                            case 4: {
                                d2 = 5;
                                continue;
                            }
                            case 3: {
                                d2 = 4;
                                continue;
                            }
                            case 2: {
                                d2 = 3;
                                continue;
                            }
                            default: {
                                if (s.length() != 0) {
                                    s = "Invalid alignment value: ".concat(s);
                                }
                                else {
                                    s = new String("Invalid alignment value: ");
                                }
                                Log.w("WebvttCueParser", s);
                            }
                            case 0:
                            case 1: {
                                d2 = 2;
                                continue;
                            }
                        }
                        break;
                    }
                }
                else if ("position".equals(group)) {
                    h(s, d);
                }
                else if ("size".equals(group)) {
                    d.j = mox.b(s);
                }
                else if ("vertical".equals(group)) {
                    if (!s.equals("lr")) {
                        if (!s.equals("rl")) {
                            if (s.length() != 0) {
                                s = "Invalid 'vertical' value: ".concat(s);
                            }
                            else {
                                s = new String("Invalid 'vertical' value: ");
                            }
                            Log.w("WebvttCueParser", s);
                            k = Integer.MIN_VALUE;
                        }
                    }
                    else {
                        k = 2;
                    }
                    d.k = k;
                }
                else {
                    final StringBuilder sb = new StringBuilder(group.length() + 21 + s.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(s);
                    Log.w("WebvttCueParser", sb.toString());
                }
            }
            catch (final NumberFormatException ex) {
                s = String.valueOf(matcher.group());
                if (s.length() != 0) {
                    s = "Skipping bad cue setting: ".concat(s);
                }
                else {
                    s = new String("Skipping bad cue setting: ");
                }
                Log.w("WebvttCueParser", s);
            }
        }
    }
    
    public static SpannedString f(final String s, final String s2, final List<gox> list) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final ArrayDeque arrayDeque = new ArrayDeque();
        final ArrayList list2 = new ArrayList();
        int n = 0;
        while (true) {
            final int length = s2.length();
            String trim = "";
            if (n >= length) {
                break;
            }
            final char char1 = s2.charAt(n);
            if (char1 != '&') {
                if (char1 != '<') {
                    spannableStringBuilder.append(char1);
                    ++n;
                }
                else {
                    final int n2 = n + 1;
                    if (n2 >= s2.length()) {
                        n = n2;
                    }
                    else {
                        final boolean b = s2.charAt(n2) == '/';
                        int n3 = s2.indexOf(62, n2);
                        if (n3 == -1) {
                            n3 = s2.length();
                        }
                        else {
                            ++n3;
                        }
                        int n4 = n3 - 2;
                        final boolean b2 = s2.charAt(n4) == '/';
                        int n5;
                        if (b) {
                            n5 = 2;
                        }
                        else {
                            n5 = 1;
                        }
                        if (!b2) {
                            n4 = n3 - 1;
                        }
                        final String substring = s2.substring(n + n5, n4);
                        if (!substring.trim().isEmpty()) {
                            final String trim2 = substring.trim();
                            omi.m(trim2.isEmpty() ^ true);
                            final int a = rnw.a;
                            final String s3 = trim2.split("[ \\.]", 2)[0];
                            Objects.requireNonNull(s3);
                            final int hashCode = s3.hashCode();
                            int n6 = 0;
                            Label_0492: {
                                if (hashCode != 98) {
                                    if (hashCode != 99) {
                                        if (hashCode != 105) {
                                            if (hashCode != 3650) {
                                                if (hashCode != 3314158) {
                                                    if (hashCode != 3511770) {
                                                        if (hashCode != 117) {
                                                            if (hashCode == 118) {
                                                                if (s3.equals("v")) {
                                                                    n6 = 4;
                                                                    break Label_0492;
                                                                }
                                                            }
                                                        }
                                                        else if (s3.equals("u")) {
                                                            n6 = 3;
                                                            break Label_0492;
                                                        }
                                                    }
                                                    else if (s3.equals("ruby")) {
                                                        n6 = 7;
                                                        break Label_0492;
                                                    }
                                                }
                                                else if (s3.equals("lang")) {
                                                    n6 = 6;
                                                    break Label_0492;
                                                }
                                            }
                                            else if (s3.equals("rt")) {
                                                n6 = 5;
                                                break Label_0492;
                                            }
                                        }
                                        else if (s3.equals("i")) {
                                            n6 = 2;
                                            break Label_0492;
                                        }
                                    }
                                    else if (s3.equals("c")) {
                                        n6 = 1;
                                        break Label_0492;
                                    }
                                }
                                else if (s3.equals("b")) {
                                    n6 = 0;
                                    break Label_0492;
                                }
                                n6 = -1;
                            }
                            boolean b3 = false;
                            switch (n6) {
                                default: {
                                    b3 = false;
                                    break;
                                }
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7: {
                                    b3 = true;
                                    break;
                                }
                            }
                            if (b3) {
                                if (b) {
                                    while (!arrayDeque.isEmpty()) {
                                        final b b4 = arrayDeque.pop();
                                        a(s, b4, list2, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            list2.add(new a(b4, spannableStringBuilder.length()));
                                        }
                                        else {
                                            list2.clear();
                                        }
                                        if (b4.a.equals(s3)) {
                                            n = n3;
                                            continue Label_0810;
                                        }
                                    }
                                    n = n3;
                                    continue;
                                }
                                n = n3;
                                if (!b2) {
                                    final int length2 = spannableStringBuilder.length();
                                    String s4 = substring.trim();
                                    omi.m(s4.isEmpty() ^ true);
                                    final int index = s4.indexOf(" ");
                                    if (index != -1) {
                                        trim = s4.substring(index).trim();
                                        s4 = s4.substring(0, index);
                                    }
                                    final String[] split = s4.split("\\.", -1);
                                    final String s5 = split[0];
                                    final HashSet<String> set = new HashSet<String>();
                                    for (int i = 1; i < split.length; ++i) {
                                        set.add(split[i]);
                                    }
                                    arrayDeque.push(new b(s5, length2, trim, set));
                                    n = n3;
                                    continue;
                                }
                                continue;
                            }
                        }
                        n = n3;
                    }
                    Label_0810:;
                }
            }
            else {
                final int n7 = n + 1;
                int n8 = s2.indexOf(59, n7);
                final int index2 = s2.indexOf(32, n7);
                int n9 = -1;
                if (n8 == -1) {
                    n8 = index2;
                }
                else if (index2 != -1) {
                    n8 = Math.min(n8, index2);
                }
                if (n8 != -1) {
                    final String substring2 = s2.substring(n7, n8);
                    Objects.requireNonNull(substring2);
                    switch (substring2) {
                        case "nbsp": {
                            n9 = 3;
                            break;
                        }
                        case "amp": {
                            n9 = 2;
                            break;
                        }
                        case "lt": {
                            n9 = 1;
                            break;
                        }
                        case "gt": {
                            n9 = 0;
                            break;
                        }
                        default:
                            break;
                    }
                    switch (n9) {
                        default: {
                            final StringBuilder sb = new StringBuilder(substring2.length() + 33);
                            sb.append("ignoring unsupported entity: '&");
                            sb.append(substring2);
                            sb.append(";'");
                            Log.w("WebvttCueParser", sb.toString());
                            break;
                        }
                        case 3: {
                            spannableStringBuilder.append(' ');
                            break;
                        }
                        case 2: {
                            spannableStringBuilder.append('&');
                            break;
                        }
                        case 1: {
                            spannableStringBuilder.append('<');
                            break;
                        }
                        case 0: {
                            spannableStringBuilder.append('>');
                            break;
                        }
                    }
                    if (n8 == index2) {
                        spannableStringBuilder.append((CharSequence)" ");
                    }
                    n = n8 + 1;
                }
                else {
                    spannableStringBuilder.append(char1);
                    n = n7;
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(s, arrayDeque.pop(), list2, spannableStringBuilder, list);
        }
        a(s, new b("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf((CharSequence)spannableStringBuilder);
    }
    
    public static void g(final String s, final d d) {
        final int index = s.indexOf(44);
        int n = -1;
        String substring = s;
        if (index != -1) {
            final String substring2 = s.substring(index + 1);
            Objects.requireNonNull(substring2);
            final int hashCode = substring2.hashCode();
            int g = 2;
            switch (hashCode) {
                case 109757538: {
                    if (!substring2.equals("start")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 100571: {
                    if (!substring2.equals("end")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1074341483: {
                    if (!substring2.equals("middle")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1364013995: {
                    if (!substring2.equals("center")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        String concat;
                        if (substring2.length() != 0) {
                            concat = "Invalid anchor value: ".concat(substring2);
                        }
                        else {
                            concat = new String("Invalid anchor value: ");
                        }
                        Log.w("WebvttCueParser", concat);
                        g = Integer.MIN_VALUE;
                    }
                    case 2: {
                        d.g = g;
                        substring = s.substring(0, index);
                        break;
                    }
                    case 3: {
                        g = 0;
                        continue;
                    }
                    case 0:
                    case 1: {
                        g = 1;
                        continue;
                    }
                }
                break;
            }
        }
        if (substring.endsWith("%")) {
            d.e = mox.b(substring);
            d.f = 0;
        }
        else {
            d.e = (float)Integer.parseInt(substring);
            d.f = 1;
        }
    }
    
    public static void h(final String s, final d d) {
        final int index = s.indexOf(44);
        int n = -1;
        String substring = s;
        if (index != -1) {
            final String substring2 = s.substring(index + 1);
            Objects.requireNonNull(substring2);
            final int hashCode = substring2.hashCode();
            int i = 2;
            switch (hashCode) {
                case 109757538: {
                    if (!substring2.equals("start")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 100571: {
                    if (!substring2.equals("end")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1074341483: {
                    if (!substring2.equals("middle")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1276788989: {
                    if (!substring2.equals("line-right")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1364013995: {
                    if (!substring2.equals("center")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1842484672: {
                    if (!substring2.equals("line-left")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            while (true) {
                switch (n) {
                    default: {
                        String concat;
                        if (substring2.length() != 0) {
                            concat = "Invalid anchor value: ".concat(substring2);
                        }
                        else {
                            concat = new String("Invalid anchor value: ");
                        }
                        Log.w("WebvttCueParser", concat);
                        i = Integer.MIN_VALUE;
                    }
                    case 2:
                    case 4: {
                        d.i = i;
                        substring = s.substring(0, index);
                        break;
                    }
                    case 1:
                    case 3: {
                        i = 1;
                        continue;
                    }
                    case 0:
                    case 5: {
                        i = 0;
                        continue;
                    }
                }
                break;
            }
        }
        d.h = mox.b(substring);
    }
    
    public static final class a
    {
        public final b a;
        public final int b;
        
        public a(final b a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;
        
        public b(final String a, final int b, final String c, final Set<String> d) {
            this.b = b;
            this.a = a;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class c implements Comparable<c>
    {
        public final int F0;
        public final gox G0;
        
        public c(final int f0, final gox g0) {
            this.F0 = f0;
            this.G0 = g0;
        }
        
        @Override
        public final int compareTo(final Object o) {
            return Integer.compare(this.F0, ((c)o).F0);
        }
    }
    
    public static final class d
    {
        public long a;
        public long b;
        public CharSequence c;
        public int d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;
        
        public d() {
            this.a = 0L;
            this.b = 0L;
            this.d = 2;
            this.e = -3.4028235E38f;
            this.f = 1;
            this.g = 0;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = 1.0f;
            this.k = Integer.MIN_VALUE;
        }
        
        public final v87.a a() {
            float h = this.h;
            float e = -3.4028235E38f;
            if (h == -3.4028235E38f) {
                final int d = this.d;
                if (d != 4) {
                    if (d != 5) {
                        h = 0.5f;
                    }
                    else {
                        h = 1.0f;
                    }
                }
                else {
                    h = 0.0f;
                }
            }
            int i = this.i;
            Label_0110: {
                if (i == Integer.MIN_VALUE) {
                    final int d2 = this.d;
                    Label_0107: {
                        if (d2 != 1) {
                            if (d2 != 3) {
                                if (d2 == 4) {
                                    break Label_0107;
                                }
                                if (d2 != 5) {
                                    i = 1;
                                    break Label_0110;
                                }
                            }
                            i = 2;
                            break Label_0110;
                        }
                    }
                    i = 0;
                }
            }
            final v87.a a = new v87.a();
            final int d3 = this.d;
            Layout$Alignment c = null;
            Label_0193: {
                Label_0188: {
                    if (d3 != 1) {
                        if (d3 != 2) {
                            if (d3 != 3) {
                                if (d3 == 4) {
                                    break Label_0188;
                                }
                                if (d3 != 5) {
                                    d10.F(34, "Unknown textAlignment: ", d3, "WebvttCueParser");
                                    c = null;
                                    break Label_0193;
                                }
                            }
                            c = Layout$Alignment.ALIGN_OPPOSITE;
                            break Label_0193;
                        }
                        c = Layout$Alignment.ALIGN_CENTER;
                        break Label_0193;
                    }
                }
                c = Layout$Alignment.ALIGN_NORMAL;
            }
            a.c = c;
            final float e2 = this.e;
            final int f = this.f;
            final float n = fcmpl(e2, -3.4028235E38f);
            Label_0259: {
                Label_0257: {
                    if (n != 0 && f == 0) {
                        if (e2 < 0.0f) {
                            break Label_0257;
                        }
                        if (e2 > 1.0f) {
                            break Label_0257;
                        }
                    }
                    if (n != 0) {
                        e = e2;
                        break Label_0259;
                    }
                    if (f != 0) {
                        break Label_0259;
                    }
                }
                e = 1.0f;
            }
            a.e = e;
            a.f = f;
            a.g = this.g;
            a.h = h;
            a.i = i;
            final float j = this.j;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException(String.valueOf(i));
                    }
                }
                else if (h <= 0.5f) {
                    h *= 2.0f;
                }
                else {
                    h = (1.0f - h) * 2.0f;
                }
            }
            else {
                h = 1.0f - h;
            }
            a.l = Math.min(j, h);
            a.p = this.k;
            final CharSequence c2 = this.c;
            if (c2 != null) {
                a.a = c2;
            }
            return a;
        }
    }
}
