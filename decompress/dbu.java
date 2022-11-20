import java.util.ArrayList;
import java.util.ArrayDeque;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Set;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import java.util.Objects;
import android.text.Layout$Alignment;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbu extends s9q
{
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final b u;
    public static final a v;
    public final XmlPullParserFactory m;
    
    static {
        n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
        o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
        p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
        q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
        r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
        s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
        t = Pattern.compile("^(\\d+) (\\d+)$");
        u = new b(30.0f, 1, 1);
        v = new a(15);
    }
    
    public dbu() {
        try {
            (this.m = XmlPullParserFactory.newInstance()).setNamespaceAware(true);
        }
        catch (final XmlPullParserException ex) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", (Throwable)ex);
        }
    }
    
    public static gbu k(final gbu gbu) {
        gbu gbu2 = gbu;
        if (gbu == null) {
            gbu2 = new gbu();
        }
        return gbu2;
    }
    
    public static boolean l(final String s) {
        return s.equals("tt") || s.equals("head") || s.equals("body") || s.equals("div") || s.equals("p") || s.equals("span") || s.equals("br") || s.equals("style") || s.equals("styling") || s.equals("layout") || s.equals("region") || s.equals("metadata") || s.equals("image") || s.equals("data") || s.equals("information");
    }
    
    public static Layout$Alignment m(String s) {
        s = mru.s(s);
        Objects.requireNonNull(s);
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 109757538: {
                if (!s.equals("start")) {
                    break;
                }
                n = 4;
                break;
            }
            case 108511772: {
                if (!s.equals("right")) {
                    break;
                }
                n = 3;
                break;
            }
            case 3317767: {
                if (!s.equals("left")) {
                    break;
                }
                n = 2;
                break;
            }
            case 100571: {
                if (!s.equals("end")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1364013995: {
                if (!s.equals("center")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 2:
            case 4: {
                return Layout$Alignment.ALIGN_NORMAL;
            }
            case 1:
            case 3: {
                return Layout$Alignment.ALIGN_OPPOSITE;
            }
            case 0: {
                return Layout$Alignment.ALIGN_CENTER;
            }
        }
    }
    
    public static a n(XmlPullParser attributeValue, final a a) throws SubtitleDecoderException {
        attributeValue = (XmlPullParser)attributeValue.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return a;
        }
        final Matcher matcher = dbu.t.matcher((CharSequence)attributeValue);
        if (!matcher.matches()) {
            String concat;
            if (((String)attributeValue).length() != 0) {
                concat = "Ignoring malformed cell resolution: ".concat((String)attributeValue);
            }
            else {
                concat = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", concat);
            return a;
        }
        try {
            final String group = matcher.group(1);
            Objects.requireNonNull(group);
            final int int1 = Integer.parseInt(group);
            final String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            final int int2 = Integer.parseInt(group2);
            if (int1 != 0 && int2 != 0) {
                return new a(int2);
            }
            final StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(int1);
            sb.append(" ");
            sb.append(int2);
            throw new SubtitleDecoderException(sb.toString());
        }
        catch (final NumberFormatException ex) {
            String concat2;
            if (((String)attributeValue).length() != 0) {
                concat2 = "Ignoring malformed cell resolution: ".concat((String)attributeValue);
            }
            else {
                concat2 = new String("Ignoring malformed cell resolution: ");
            }
            Log.w("TtmlDecoder", concat2);
            return a;
        }
    }
    
    public static void o(String s, final gbu gbu) throws SubtitleDecoderException {
        final int a = cnw.a;
        int n = -1;
        final String[] split = s.split("\\s+", -1);
        Matcher matcher;
        if (split.length == 1) {
            matcher = dbu.p.matcher(s);
        }
        else {
            if (split.length != 2) {
                final int length = split.length;
                final StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new SubtitleDecoderException(sb.toString());
            }
            matcher = dbu.p.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (matcher.matches()) {
            s = matcher.group(3);
            Objects.requireNonNull(s);
            switch (s) {
                case "px": {
                    n = 2;
                    break;
                }
                case "em": {
                    n = 1;
                    break;
                }
                case "%": {
                    n = 0;
                    break;
                }
                default:
                    break;
            }
            switch (n) {
                default: {
                    final StringBuilder sb2 = new StringBuilder(s.length() + 30);
                    sb2.append("Invalid unit for fontSize: '");
                    sb2.append(s);
                    sb2.append("'.");
                    throw new SubtitleDecoderException(sb2.toString());
                }
                case 2: {
                    gbu.j = 1;
                    break;
                }
                case 1: {
                    gbu.j = 2;
                    break;
                }
                case 0: {
                    gbu.j = 3;
                    break;
                }
            }
            s = matcher.group(1);
            Objects.requireNonNull(s);
            gbu.k = Float.parseFloat(s);
            return;
        }
        final StringBuilder sb3 = new StringBuilder(s.length() + 36);
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(s);
        sb3.append("'.");
        throw new SubtitleDecoderException(sb3.toString());
    }
    
    public static b p(final XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        final String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int int1;
        if (attributeValue != null) {
            int1 = Integer.parseInt(attributeValue);
        }
        else {
            int1 = 30;
        }
        float n = 1.0f;
        final String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            final int a = cnw.a;
            final String[] split = attributeValue2.split(" ", -1);
            if (split.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            n = Integer.parseInt(split[0]) / (float)Integer.parseInt(split[1]);
        }
        final b u = dbu.u;
        int n2 = u.b;
        final String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            n2 = Integer.parseInt(attributeValue3);
        }
        int n3 = u.c;
        final String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            n3 = Integer.parseInt(attributeValue4);
        }
        return new b(int1 * n, n2, n3);
    }
    
    public static Map<String, gbu> q(final XmlPullParser xmlPullParser, final Map<String, gbu> map, final a a, final c c, final Map<String, fbu> map2, final Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (uoz.L(xmlPullParser, "style")) {
                final String a2 = uoz.A(xmlPullParser, "style");
                final gbu s = s(xmlPullParser, new gbu());
                if (a2 != null) {
                    final String[] t = t(a2);
                    for (int length = t.length, i = 0; i < length; ++i) {
                        s.a((gbu)map.get(t[i]));
                    }
                }
                final String l = s.l;
                if (l == null) {
                    continue;
                }
                map.put(l, s);
            }
            else if (uoz.L(xmlPullParser, "region")) {
                final String a3 = uoz.A(xmlPullParser, "id");
                Object o = null;
                Label_1177: {
                    Label_1174: {
                        if (a3 != null) {
                            o = uoz.A(xmlPullParser, "origin");
                            if (o != null) {
                                final Pattern r = dbu.r;
                                final Matcher matcher = r.matcher((CharSequence)o);
                                final Pattern s2 = dbu.s;
                                final Matcher matcher2 = s2.matcher((CharSequence)o);
                                Label_0423: {
                                    if (matcher.matches()) {
                                        try {
                                            final String group = matcher.group(1);
                                            Objects.requireNonNull(group);
                                            final float n = Float.parseFloat(group) / 100.0f;
                                            final String group2 = matcher.group(2);
                                            Objects.requireNonNull(group2);
                                            final float n2 = Float.parseFloat(group2) / 100.0f;
                                            break Label_0423;
                                        }
                                        catch (final NumberFormatException ex) {
                                            String concat;
                                            if (((String)o).length() != 0) {
                                                concat = "Ignoring region with malformed origin: ".concat((String)o);
                                            }
                                            else {
                                                concat = new String("Ignoring region with malformed origin: ");
                                            }
                                            Log.w("TtmlDecoder", concat);
                                            break Label_1174;
                                        }
                                    }
                                    if (!matcher2.matches()) {
                                        String concat2;
                                        if (((String)o).length() != 0) {
                                            concat2 = "Ignoring region with unsupported origin: ".concat((String)o);
                                        }
                                        else {
                                            concat2 = new String("Ignoring region with unsupported origin: ");
                                        }
                                        Log.w("TtmlDecoder", concat2);
                                        break Label_1174;
                                    }
                                    if (c == null) {
                                        String concat3;
                                        if (((String)o).length() != 0) {
                                            concat3 = "Ignoring region with missing tts:extent: ".concat((String)o);
                                        }
                                        else {
                                            concat3 = new String("Ignoring region with missing tts:extent: ");
                                        }
                                        Log.w("TtmlDecoder", concat3);
                                        break Label_1174;
                                    }
                                    try {
                                        final String group3 = matcher2.group(1);
                                        Objects.requireNonNull(group3);
                                        final int int1 = Integer.parseInt(group3);
                                        final String group4 = matcher2.group(2);
                                        Objects.requireNonNull(group4);
                                        final int int2 = Integer.parseInt(group4);
                                        final float n = int1 / (float)c.a;
                                        float n2 = int2 / (float)c.b;
                                        final String a4 = uoz.A(xmlPullParser, "extent");
                                        if (a4 != null) {
                                            final Matcher matcher3 = r.matcher(a4);
                                            final Matcher matcher4 = s2.matcher(a4);
                                            Label_0694: {
                                                if (matcher3.matches()) {
                                                    try {
                                                        final String group5 = matcher3.group(1);
                                                        Objects.requireNonNull(group5);
                                                        final float n3 = Float.parseFloat(group5) / 100.0f;
                                                        final String group6 = matcher3.group(2);
                                                        Objects.requireNonNull(group6);
                                                        final float n4 = Float.parseFloat(group6) / 100.0f;
                                                        break Label_0694;
                                                    }
                                                    catch (final NumberFormatException ex2) {
                                                        if (((String)o).length() != 0) {
                                                            o = "Ignoring region with malformed extent: ".concat((String)o);
                                                        }
                                                        else {
                                                            o = new String("Ignoring region with malformed extent: ");
                                                        }
                                                        Log.w("TtmlDecoder", (String)o);
                                                        break Label_1174;
                                                    }
                                                }
                                                if (!matcher4.matches()) {
                                                    break Label_0694;
                                                }
                                                if (c == null) {
                                                    if (((String)o).length() != 0) {
                                                        o = "Ignoring region with missing tts:extent: ".concat((String)o);
                                                    }
                                                    else {
                                                        o = new String("Ignoring region with missing tts:extent: ");
                                                    }
                                                    Log.w("TtmlDecoder", (String)o);
                                                    break Label_1174;
                                                }
                                                try {
                                                    final String group7 = matcher4.group(1);
                                                    Objects.requireNonNull(group7);
                                                    final int int3 = Integer.parseInt(group7);
                                                    final String group8 = matcher4.group(2);
                                                    Objects.requireNonNull(group8);
                                                    final int int4 = Integer.parseInt(group8);
                                                    final float n3 = int3 / (float)c.a;
                                                    final float n4 = int4 / (float)c.b;
                                                    o = uoz.A(xmlPullParser, "displayAlign");
                                                    int n5 = 0;
                                                    Label_0776: {
                                                        if (o != null) {
                                                            o = mru.s((String)o);
                                                            Objects.requireNonNull(o);
                                                            if (((String)o).equals("center")) {
                                                                n2 += n4 / 2.0f;
                                                                n5 = 1;
                                                                break Label_0776;
                                                            }
                                                            if (((String)o).equals("after")) {
                                                                n2 += n4;
                                                                n5 = 2;
                                                                break Label_0776;
                                                            }
                                                        }
                                                        n5 = 0;
                                                    }
                                                    final float n6 = 1.0f / a.a;
                                                    o = uoz.A(xmlPullParser, "writingMode");
                                                    int n8 = 0;
                                                    Label_0943: {
                                                        if (o != null) {
                                                            o = mru.s((String)o);
                                                            Objects.requireNonNull(o);
                                                            final int hashCode = ((String)o).hashCode();
                                                            int n7 = 0;
                                                            Label_0906: {
                                                                if (hashCode != 3694) {
                                                                    if (hashCode != 3553396) {
                                                                        if (hashCode == 3553576) {
                                                                            if (((String)o).equals("tbrl")) {
                                                                                n7 = 2;
                                                                                break Label_0906;
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (((String)o).equals("tblr")) {
                                                                        n7 = 1;
                                                                        break Label_0906;
                                                                    }
                                                                }
                                                                else if (((String)o).equals("tb")) {
                                                                    n7 = 0;
                                                                    break Label_0906;
                                                                }
                                                                n7 = -1;
                                                            }
                                                            if (n7 == 0 || n7 == 1) {
                                                                n8 = 2;
                                                                break Label_0943;
                                                            }
                                                            if (n7 == 2) {
                                                                n8 = 1;
                                                                break Label_0943;
                                                            }
                                                        }
                                                        n8 = Integer.MIN_VALUE;
                                                    }
                                                    o = new fbu(a3, n, n2, 0, n5, n3, n4, 1, n6, n8);
                                                    break Label_1177;
                                                }
                                                catch (final NumberFormatException ex3) {
                                                    if (((String)o).length() != 0) {
                                                        o = "Ignoring region with malformed extent: ".concat((String)o);
                                                    }
                                                    else {
                                                        o = new String("Ignoring region with malformed extent: ");
                                                    }
                                                    Log.w("TtmlDecoder", (String)o);
                                                    break Label_1174;
                                                }
                                            }
                                            if (((String)o).length() != 0) {
                                                o = "Ignoring region with unsupported extent: ".concat((String)o);
                                            }
                                            else {
                                                o = new String("Ignoring region with unsupported extent: ");
                                            }
                                            Log.w("TtmlDecoder", (String)o);
                                        }
                                        else {
                                            Log.w("TtmlDecoder", "Ignoring region without an extent");
                                        }
                                    }
                                    catch (final NumberFormatException ex4) {
                                        String concat4;
                                        if (((String)o).length() != 0) {
                                            concat4 = "Ignoring region with malformed origin: ".concat((String)o);
                                        }
                                        else {
                                            concat4 = new String("Ignoring region with malformed origin: ");
                                        }
                                        Log.w("TtmlDecoder", concat4);
                                    }
                                }
                            }
                            else {
                                Log.w("TtmlDecoder", "Ignoring region without an origin");
                            }
                        }
                    }
                    o = null;
                }
                if (o == null) {
                    continue;
                }
                map2.put(((fbu)o).a, (fbu)o);
            }
            else {
                if (!uoz.L(xmlPullParser, "metadata")) {
                    continue;
                }
                do {
                    xmlPullParser.next();
                    if (uoz.L(xmlPullParser, "image")) {
                        final String a5 = uoz.A(xmlPullParser, "id");
                        if (a5 == null) {
                            continue;
                        }
                        map3.put(a5, xmlPullParser.nextText());
                    }
                } while (!uoz.I(xmlPullParser, "metadata"));
            }
        } while (!uoz.I(xmlPullParser, "head"));
        return map;
    }
    
    public static ebu r(final XmlPullParser xmlPullParser, final ebu ebu, final Map<String, fbu> map, final b b) throws SubtitleDecoderException {
        final int attributeCount = xmlPullParser.getAttributeCount();
        final gbu s = s(xmlPullParser, null);
        String s2 = null;
        String s3 = "";
        long n = -9223372036854775807L;
        long n2 = -9223372036854775807L;
        long n3 = -9223372036854775807L;
        String[] array = null;
        String[] array2;
        String substring;
        long u;
        long u2;
        long u3;
        for (int i = 0; i < attributeCount; ++i, array = array2, s2 = substring, n = u, n2 = u2, n3 = u3) {
            final String attributeName = xmlPullParser.getAttributeName(i);
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            Objects.requireNonNull(attributeName);
            int n4 = 0;
            Label_0263: {
                switch (attributeName) {
                    case "backgroundImage": {
                        n4 = 5;
                        break Label_0263;
                    }
                    case "style": {
                        n4 = 4;
                        break Label_0263;
                    }
                    case "begin": {
                        n4 = 3;
                        break Label_0263;
                    }
                    case "end": {
                        n4 = 2;
                        break Label_0263;
                    }
                    case "dur": {
                        n4 = 1;
                        break Label_0263;
                    }
                    case "region": {
                        n4 = 0;
                        break Label_0263;
                    }
                    default:
                        break;
                }
                n4 = -1;
            }
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 != 3) {
                            if (n4 != 4) {
                                if (n4 != 5) {
                                    array2 = array;
                                    substring = s2;
                                    u = n;
                                    u2 = n2;
                                    u3 = n3;
                                }
                                else {
                                    array2 = array;
                                    substring = s2;
                                    u = n;
                                    u2 = n2;
                                    u3 = n3;
                                    if (attributeValue.startsWith("#")) {
                                        substring = attributeValue.substring(1);
                                        array2 = array;
                                        u = n;
                                        u2 = n2;
                                        u3 = n3;
                                    }
                                }
                            }
                            else {
                                final String[] t = t(attributeValue);
                                array2 = array;
                                substring = s2;
                                u = n;
                                u2 = n2;
                                u3 = n3;
                                if (t.length > 0) {
                                    array2 = t;
                                    substring = s2;
                                    u = n;
                                    u2 = n2;
                                    u3 = n3;
                                }
                            }
                        }
                        else {
                            u = u(attributeValue, b);
                            array2 = array;
                            substring = s2;
                            u2 = n2;
                            u3 = n3;
                        }
                    }
                    else {
                        u2 = u(attributeValue, b);
                        array2 = array;
                        substring = s2;
                        u = n;
                        u3 = n3;
                    }
                }
                else {
                    u3 = u(attributeValue, b);
                    u2 = n2;
                    u = n;
                    substring = s2;
                    array2 = array;
                }
            }
            else {
                array2 = array;
                substring = s2;
                u = n;
                u2 = n2;
                u3 = n3;
                if (map.containsKey(attributeValue)) {
                    s3 = attributeValue;
                    u3 = n3;
                    u2 = n2;
                    u = n;
                    substring = s2;
                    array2 = array;
                }
            }
        }
        long n5;
        long n6;
        if (ebu != null) {
            final long d = ebu.d;
            n5 = n;
            n6 = n2;
            if (d != -9223372036854775807L) {
                long n7 = n;
                if (n != -9223372036854775807L) {
                    n7 = n + d;
                }
                n5 = n7;
                n6 = n2;
                if (n2 != -9223372036854775807L) {
                    n6 = n2 + d;
                    n5 = n7;
                }
            }
        }
        else {
            n6 = n2;
            n5 = n;
        }
        if (n6 == -9223372036854775807L) {
            if (n3 != -9223372036854775807L) {
                final long e = n5 + n3;
                return new ebu(xmlPullParser.getName(), (String)null, n5, e, s, array, s3, s2, ebu);
            }
            if (ebu != null) {
                final long e = ebu.e;
                if (e != -9223372036854775807L) {
                    return new ebu(xmlPullParser.getName(), (String)null, n5, e, s, array, s3, s2, ebu);
                }
            }
        }
        final long e = n6;
        return new ebu(xmlPullParser.getName(), (String)null, n5, e, s, array, s3, s2, ebu);
    }
    
    public static gbu s(final XmlPullParser xmlPullParser, gbu gbu) {
        final int attributeCount = xmlPullParser.getAttributeCount();
        int i = 0;
        gbu gbu2 = gbu;
        while (i < attributeCount) {
            final String attributeValue = xmlPullParser.getAttributeValue(i);
            final String attributeName = xmlPullParser.getAttributeName(i);
            Objects.requireNonNull(attributeName);
            final int hashCode = attributeName.hashCode();
            int n = -1;
            int n2 = 1;
            int n3 = 0;
            Label_0488: {
                switch (hashCode) {
                    case 1754920356: {
                        if (!attributeName.equals("multiRowAlign")) {
                            break;
                        }
                        n3 = 14;
                        break Label_0488;
                    }
                    case 1287124693: {
                        if (!attributeName.equals("backgroundColor")) {
                            break;
                        }
                        n3 = 13;
                        break Label_0488;
                    }
                    case 1115953443: {
                        if (!attributeName.equals("rubyPosition")) {
                            break;
                        }
                        n3 = 12;
                        break Label_0488;
                    }
                    case 921125321: {
                        if (!attributeName.equals("textEmphasis")) {
                            break;
                        }
                        n3 = 11;
                        break Label_0488;
                    }
                    case 365601008: {
                        if (!attributeName.equals("fontSize")) {
                            break;
                        }
                        n3 = 10;
                        break Label_0488;
                    }
                    case 110138194: {
                        if (!attributeName.equals("textCombine")) {
                            break;
                        }
                        n3 = 9;
                        break Label_0488;
                    }
                    case 109403361: {
                        if (!attributeName.equals("shear")) {
                            break;
                        }
                        n3 = 8;
                        break Label_0488;
                    }
                    case 94842723: {
                        if (!attributeName.equals("color")) {
                            break;
                        }
                        n3 = 7;
                        break Label_0488;
                    }
                    case 3511770: {
                        if (!attributeName.equals("ruby")) {
                            break;
                        }
                        n3 = 6;
                        break Label_0488;
                    }
                    case 3355: {
                        if (!attributeName.equals("id")) {
                            break;
                        }
                        n3 = 5;
                        break Label_0488;
                    }
                    case -734428249: {
                        if (!attributeName.equals("fontWeight")) {
                            break;
                        }
                        n3 = 4;
                        break Label_0488;
                    }
                    case -879295043: {
                        if (!attributeName.equals("textDecoration")) {
                            break;
                        }
                        n3 = 3;
                        break Label_0488;
                    }
                    case -1065511464: {
                        if (!attributeName.equals("textAlign")) {
                            break;
                        }
                        n3 = 2;
                        break Label_0488;
                    }
                    case -1224696685: {
                        if (!attributeName.equals("fontFamily")) {
                            break;
                        }
                        n3 = 1;
                        break Label_0488;
                    }
                    case -1550943582: {
                        if (!attributeName.equals("fontStyle")) {
                            break;
                        }
                        n3 = 0;
                        break Label_0488;
                    }
                }
                n3 = -1;
            }
            switch (n3) {
                default: {
                    gbu = gbu2;
                    break;
                }
                case 14: {
                    gbu = k(gbu2);
                    gbu.p = m(attributeValue);
                    break;
                }
                case 13: {
                    final gbu k = k(gbu2);
                    try {
                        k.d = vq4.a(attributeValue, false);
                        k.e = true;
                        gbu = k;
                    }
                    catch (final IllegalArgumentException ex) {
                        final String value = String.valueOf(attributeValue);
                        String concat;
                        if (value.length() != 0) {
                            concat = "Failed parsing background value: ".concat(value);
                        }
                        else {
                            concat = new String("Failed parsing background value: ");
                        }
                        Log.w("TtmlDecoder", concat);
                        gbu = k;
                    }
                    break;
                }
                case 12: {
                    final String s = mru.s(attributeValue);
                    Objects.requireNonNull(s);
                    if (s.equals("before")) {
                        gbu = k(gbu2);
                        gbu.n = 1;
                        break;
                    }
                    if (!s.equals("after")) {
                        gbu = gbu2;
                        break;
                    }
                    gbu = k(gbu2);
                    gbu.n = 2;
                    break;
                }
                case 11: {
                    final gbu j = k(gbu2);
                    final Pattern d = qfs.d;
                    qfs r = null;
                    if (attributeValue != null) {
                        final String s2 = mru.s(attributeValue.trim());
                        if (!s2.isEmpty()) {
                            final String[] split = TextUtils.split(s2, qfs.d);
                            final int length = split.length;
                            Object o;
                            if (length != 0) {
                                if (length != 1) {
                                    o = pdd.q(split.length, (Object[])split.clone());
                                }
                                else {
                                    o = new bdq((Object)split[0]);
                                }
                            }
                            else {
                                o = cbm.M0;
                            }
                            final String s3 = (String)rp9.W((Iterable)nnp.d((Set)qfs.h, (Set)o), "outside");
                            final int hashCode2 = s3.hashCode();
                            int n4 = 0;
                            Label_0938: {
                                if (hashCode2 != -1392885889) {
                                    if (hashCode2 != -1106037339) {
                                        if (hashCode2 == 92734940) {
                                            if (s3.equals("after")) {
                                                n4 = 0;
                                                break Label_0938;
                                            }
                                        }
                                    }
                                    else if (s3.equals("outside")) {
                                        n4 = 1;
                                        break Label_0938;
                                    }
                                }
                                else if (s3.equals("before")) {
                                    n4 = 2;
                                    break Label_0938;
                                }
                                n4 = -1;
                            }
                            int n5;
                            if (n4 != 0) {
                                if (n4 != 1) {
                                    n5 = 1;
                                }
                                else {
                                    n5 = -2;
                                }
                            }
                            else {
                                n5 = 2;
                            }
                            final nnp$a nnp$a = (nnp$a)nnp.d((Set)qfs.e, (Set)o);
                            if (!nnp$a.isEmpty()) {
                                final String s4 = (String)new mnp(nnp$a).next();
                                final int hashCode3 = s4.hashCode();
                                Label_1058: {
                                    if (hashCode3 != 3005871) {
                                        if (hashCode3 == 3387192) {
                                            if (s4.equals("none")) {
                                                n2 = 0;
                                                break Label_1058;
                                            }
                                        }
                                    }
                                    else if (s4.equals("auto")) {
                                        break Label_1058;
                                    }
                                    n2 = -1;
                                }
                                if (n2 == 0) {
                                    n = 0;
                                }
                                r = new qfs(n, 0, n5);
                            }
                            else {
                                final nnp$e d2 = nnp.d((Set)qfs.g, (Set)o);
                                final nnp$e d3 = nnp.d((Set)qfs.f, (Set)o);
                                if (((nnp$a)d2).isEmpty() && ((nnp$a)d3).isEmpty()) {
                                    r = new qfs(-1, 0, n5);
                                }
                                else {
                                    final String s5 = (String)rp9.W((Iterable)d2, "filled");
                                    final int hashCode4 = s5.hashCode();
                                    int n6 = 0;
                                    Label_1214: {
                                        if (hashCode4 != -1274499742) {
                                            if (hashCode4 == 3417674) {
                                                if (s5.equals("open")) {
                                                    n6 = 0;
                                                    break Label_1214;
                                                }
                                            }
                                        }
                                        else if (s5.equals("filled")) {
                                            n6 = 1;
                                            break Label_1214;
                                        }
                                        n6 = -1;
                                    }
                                    int n7;
                                    if (n6 != 0) {
                                        n7 = 1;
                                    }
                                    else {
                                        n7 = 2;
                                    }
                                    final String s6 = (String)rp9.W((Iterable)d3, "circle");
                                    final int hashCode5 = s6.hashCode();
                                    if (hashCode5 != -1360216880) {
                                        if (hashCode5 != -905816648) {
                                            if (hashCode5 == 99657) {
                                                if (s6.equals("dot")) {
                                                    n = 0;
                                                }
                                            }
                                        }
                                        else if (s6.equals("sesame")) {
                                            n = 1;
                                        }
                                    }
                                    else if (s6.equals("circle")) {
                                        n = 2;
                                    }
                                    int n8;
                                    if (n != 0) {
                                        if (n != 1) {
                                            n8 = 1;
                                        }
                                        else {
                                            n8 = 3;
                                        }
                                    }
                                    else {
                                        n8 = 2;
                                    }
                                    r = new qfs(n8, n7, n5);
                                }
                            }
                        }
                    }
                    j.r = r;
                    gbu = j;
                    break;
                }
                case 10: {
                    gbu = gbu2;
                    try {
                        final gbu gbu3 = gbu = k(gbu2);
                        o(attributeValue, gbu3);
                        gbu = gbu3;
                    }
                    catch (final SubtitleDecoderException ex2) {
                        final String value2 = String.valueOf(attributeValue);
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "Failed parsing fontSize value: ".concat(value2);
                        }
                        else {
                            concat2 = new String("Failed parsing fontSize value: ");
                        }
                        Log.w("TtmlDecoder", concat2);
                    }
                    break;
                }
                case 9: {
                    final String s7 = mru.s(attributeValue);
                    Objects.requireNonNull(s7);
                    if (s7.equals("all")) {
                        gbu = k(gbu2);
                        gbu.q = 1;
                        break;
                    }
                    if (!s7.equals("none")) {
                        gbu = gbu2;
                        break;
                    }
                    gbu = k(gbu2);
                    gbu.q = 0;
                    break;
                }
                case 8: {
                    final gbu l = k(gbu2);
                    final Matcher matcher = dbu.q.matcher(attributeValue);
                    final boolean matches = matcher.matches();
                    final float n9 = Float.MAX_VALUE;
                    float min;
                    if (!matches) {
                        final String value3 = String.valueOf(attributeValue);
                        String concat3;
                        if (value3.length() != 0) {
                            concat3 = "Invalid value for shear: ".concat(value3);
                        }
                        else {
                            concat3 = new String("Invalid value for shear: ");
                        }
                        Log.w("TtmlDecoder", concat3);
                        min = n9;
                    }
                    else {
                        try {
                            final String group = matcher.group(1);
                            Objects.requireNonNull(group);
                            min = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        }
                        catch (final NumberFormatException ex3) {
                            final String value4 = String.valueOf(attributeValue);
                            String concat4;
                            if (value4.length() != 0) {
                                concat4 = "Failed to parse shear: ".concat(value4);
                            }
                            else {
                                concat4 = new String("Failed to parse shear: ");
                            }
                            g63.f0("TtmlDecoder", concat4, (Throwable)ex3);
                            min = n9;
                        }
                    }
                    l.s = min;
                    gbu = l;
                    break;
                }
                case 7: {
                    final gbu m = k(gbu2);
                    try {
                        m.b = vq4.a(attributeValue, false);
                        m.c = true;
                        gbu = m;
                    }
                    catch (final IllegalArgumentException ex4) {
                        final String value5 = String.valueOf(attributeValue);
                        String concat5;
                        if (value5.length() != 0) {
                            concat5 = "Failed parsing color value: ".concat(value5);
                        }
                        else {
                            concat5 = new String("Failed parsing color value: ");
                        }
                        Log.w("TtmlDecoder", concat5);
                        gbu = m;
                    }
                    break;
                }
                case 6: {
                    final String s8 = mru.s(attributeValue);
                    Objects.requireNonNull(s8);
                    int n10 = 0;
                    switch (s8.hashCode()) {
                        default: {
                            n10 = n;
                            break;
                        }
                        case 3556653: {
                            if (!s8.equals("text")) {
                                n10 = n;
                                break;
                            }
                            n10 = 5;
                            break;
                        }
                        case 3016401: {
                            if (!s8.equals("base")) {
                                n10 = n;
                                break;
                            }
                            n10 = 4;
                            break;
                        }
                        case -136074796: {
                            if (!s8.equals("textContainer")) {
                                n10 = n;
                                break;
                            }
                            n10 = 3;
                            break;
                        }
                        case -250518009: {
                            if (!s8.equals("delimiter")) {
                                n10 = n;
                                break;
                            }
                            n10 = 2;
                            break;
                        }
                        case -410956671: {
                            if (!s8.equals("container")) {
                                n10 = n;
                                break;
                            }
                            n10 = 1;
                            break;
                        }
                        case -618561360: {
                            if (!s8.equals("baseContainer")) {
                                n10 = n;
                                break;
                            }
                            n10 = 0;
                            break;
                        }
                    }
                    Label_2061: {
                        if (n10 != 0) {
                            if (n10 == 1) {
                                gbu = k(gbu2);
                                gbu.m = 1;
                                break;
                            }
                            if (n10 != 2) {
                                if (n10 != 3) {
                                    if (n10 == 4) {
                                        break Label_2061;
                                    }
                                    if (n10 != 5) {
                                        gbu = gbu2;
                                        break;
                                    }
                                }
                                gbu = k(gbu2);
                                gbu.m = 3;
                                break;
                            }
                            gbu = k(gbu2);
                            gbu.m = 4;
                            break;
                        }
                    }
                    gbu = k(gbu2);
                    gbu.m = 2;
                    break;
                }
                case 5: {
                    gbu = gbu2;
                    if ("style".equals(xmlPullParser.getName())) {
                        gbu = k(gbu2);
                        gbu.l = attributeValue;
                        break;
                    }
                    break;
                }
                case 4: {
                    gbu = k(gbu2);
                    gbu.h = ("bold".equalsIgnoreCase(attributeValue) ? 1 : 0);
                    break;
                }
                case 3: {
                    final String s9 = mru.s(attributeValue);
                    Objects.requireNonNull(s9);
                    int n11 = 0;
                    switch (s9.hashCode()) {
                        default: {
                            n11 = n;
                            break;
                        }
                        case 1679736913: {
                            if (!s9.equals("linethrough")) {
                                n11 = n;
                                break;
                            }
                            n11 = 3;
                            break;
                        }
                        case 913457136: {
                            if (!s9.equals("nolinethrough")) {
                                n11 = n;
                                break;
                            }
                            n11 = 2;
                            break;
                        }
                        case -1026963764: {
                            if (!s9.equals("underline")) {
                                n11 = n;
                                break;
                            }
                            n11 = 1;
                            break;
                        }
                        case -1461280213: {
                            if (!s9.equals("nounderline")) {
                                n11 = n;
                                break;
                            }
                            n11 = 0;
                            break;
                        }
                    }
                    if (n11 == 0) {
                        gbu = k(gbu2);
                        gbu.g = 0;
                        break;
                    }
                    if (n11 == 1) {
                        gbu = k(gbu2);
                        gbu.g = 1;
                        break;
                    }
                    if (n11 == 2) {
                        gbu = k(gbu2);
                        gbu.f = 0;
                        break;
                    }
                    if (n11 != 3) {
                        gbu = gbu2;
                        break;
                    }
                    gbu = k(gbu2);
                    gbu.f = 1;
                    break;
                }
                case 2: {
                    gbu = k(gbu2);
                    gbu.o = m(attributeValue);
                    break;
                }
                case 1: {
                    gbu = k(gbu2);
                    gbu.a = attributeValue;
                    break;
                }
                case 0: {
                    gbu = k(gbu2);
                    gbu.i = ("italic".equalsIgnoreCase(attributeValue) ? 1 : 0);
                    break;
                }
            }
            ++i;
            gbu2 = gbu;
        }
        return gbu2;
    }
    
    public static String[] t(String trim) {
        trim = trim.trim();
        String[] split;
        if (trim.isEmpty()) {
            split = new String[0];
        }
        else {
            final int a = cnw.a;
            split = trim.split("\\s+", -1);
        }
        return split;
    }
    
    public static long u(String s, final b b) throws SubtitleDecoderException {
        final Matcher matcher = dbu.n.matcher(s);
        final boolean matches = matcher.matches();
        int n = 4;
        if (matches) {
            s = matcher.group(1);
            Objects.requireNonNull(s);
            final double n2 = (double)(Long.parseLong(s) * 3600L);
            s = matcher.group(2);
            Objects.requireNonNull(s);
            final double n3 = (double)(Long.parseLong(s) * 60L);
            s = matcher.group(3);
            Objects.requireNonNull(s);
            final double n4 = (double)Long.parseLong(s);
            s = matcher.group(4);
            double n5 = 0.0;
            double double1;
            if (s != null) {
                double1 = Double.parseDouble(s);
            }
            else {
                double1 = 0.0;
            }
            s = matcher.group(5);
            double n6;
            if (s != null) {
                n6 = Long.parseLong(s) / b.a;
            }
            else {
                n6 = 0.0;
            }
            s = matcher.group(6);
            if (s != null) {
                n5 = Long.parseLong(s) / (double)b.b / b.a;
            }
            return (long)((n2 + n3 + n4 + double1 + n6 + n5) * 1000000.0);
        }
        final Matcher matcher2 = dbu.o.matcher(s);
        if (matcher2.matches()) {
            s = matcher2.group(1);
            Objects.requireNonNull(s);
            final double double2 = Double.parseDouble(s);
            s = matcher2.group(2);
            Objects.requireNonNull(s);
            Label_0388: {
                switch (s) {
                    case "ms": {
                        break Label_0388;
                    }
                    case "t": {
                        n = 3;
                        break Label_0388;
                    }
                    case "m": {
                        n = 2;
                        break Label_0388;
                    }
                    case "h": {
                        n = 1;
                        break Label_0388;
                    }
                    case "f": {
                        n = 0;
                        break Label_0388;
                    }
                    default:
                        break;
                }
                n = -1;
            }
            double n9 = 0.0;
            Label_0462: {
                double n8 = 0.0;
                switch (n) {
                    default: {
                        final double n7 = double2;
                        return (long)(n7 * 1000000.0);
                    }
                    case 4: {
                        n8 = 1000.0;
                        break;
                    }
                    case 3: {
                        n8 = b.c;
                        break;
                    }
                    case 2: {
                        n9 = 60.0;
                        break Label_0462;
                    }
                    case 1: {
                        n9 = 3600.0;
                        break Label_0462;
                    }
                    case 0: {
                        n8 = b.a;
                        break;
                    }
                }
                final double n7 = double2 / n8;
                return (long)(n7 * 1000000.0);
            }
            final double n7 = double2 * n9;
            return (long)(n7 * 1000000.0);
        }
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = "Malformed time expression: ".concat(s);
        }
        else {
            s = new String("Malformed time expression: ");
        }
        throw new SubtitleDecoderException(s);
    }
    
    public static c v(XmlPullParser a) {
        a = (XmlPullParser)uoz.A(a, "extent");
        if (a == null) {
            return null;
        }
        final Matcher matcher = dbu.s.matcher((CharSequence)a);
        if (!matcher.matches()) {
            String concat;
            if (((String)a).length() != 0) {
                concat = "Ignoring non-pixel tts extent: ".concat((String)a);
            }
            else {
                concat = new String("Ignoring non-pixel tts extent: ");
            }
            Log.w("TtmlDecoder", concat);
            return null;
        }
        try {
            final String group = matcher.group(1);
            Objects.requireNonNull(group);
            final int int1 = Integer.parseInt(group);
            final String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            return new c(int1, Integer.parseInt(group2));
        }
        catch (final NumberFormatException ex) {
            String concat2;
            if (((String)a).length() != 0) {
                concat2 = "Ignoring malformed tts extent: ".concat((String)a);
            }
            else {
                concat2 = new String("Ignoring malformed tts extent: ");
            }
            Log.w("TtmlDecoder", concat2);
            return null;
        }
    }
    
    public final htr j(byte[] array, int n, final boolean b) throws SubtitleDecoderException {
        try {
            final XmlPullParser pullParser = this.m.newPullParser();
            final HashMap<String, gbu> hashMap = new HashMap<String, gbu>();
            final HashMap<String, fbu> hashMap2 = new HashMap<String, fbu>();
            final HashMap hashMap3 = new HashMap();
            hashMap2.put("", new fbu("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array, 0, n);
            c v = null;
            pullParser.setInput((InputStream)byteArrayInputStream, (String)null);
            final ArrayDeque<ebu> arrayDeque = new ArrayDeque<ebu>();
            int i = pullParser.getEventType();
            b b2 = dbu.u;
            a a = dbu.v;
            array = null;
            int n2 = 0;
            while (i != 1) {
                final ebu ebu = arrayDeque.peek();
                c c;
                b b3;
                a a2;
                byte[] array2;
                if (n2 == 0) {
                    final String name = pullParser.getName();
                    if (i == 2) {
                        if ("tt".equals(name)) {
                            b2 = p(pullParser);
                            a = n(pullParser, dbu.v);
                            v = v(pullParser);
                        }
                        if (!l(name)) {
                            final String value = String.valueOf(pullParser.getName());
                            String concat;
                            if (value.length() != 0) {
                                concat = "Ignoring unsupported tag: ".concat(value);
                            }
                            else {
                                concat = new String("Ignoring unsupported tag: ");
                            }
                            Log.i("TtmlDecoder", concat);
                            n = n2 + 1;
                        }
                        else if ("head".equals(name)) {
                            q(pullParser, hashMap, a, v, hashMap2, hashMap3);
                            n = n2;
                        }
                        else {
                            try {
                                final ebu r = r(pullParser, ebu, hashMap2, b2);
                                arrayDeque.push(r);
                                n = n2;
                                if (ebu != null) {
                                    ebu.a(r);
                                    n = n2;
                                }
                            }
                            catch (final SubtitleDecoderException ex) {
                                g63.f0("TtmlDecoder", "Suppressing parser error", (Throwable)ex);
                                n = n2 + 1;
                            }
                        }
                        c = v;
                        b3 = b2;
                        a2 = a;
                        array2 = array;
                    }
                    else if (i == 4) {
                        Objects.requireNonNull(ebu);
                        final ebu b4 = ebu.b(pullParser.getText());
                        if (ebu.m == null) {
                            ebu.m = new ArrayList();
                        }
                        ebu.m.add(b4);
                        c = v;
                        b3 = b2;
                        a2 = a;
                        n = n2;
                        array2 = array;
                    }
                    else {
                        c = v;
                        b3 = b2;
                        a2 = a;
                        n = n2;
                        array2 = array;
                        if (i == 3) {
                            if (pullParser.getName().equals("tt")) {
                                array = new(hbu.class)();
                                final ebu ebu2 = arrayDeque.peek();
                                Objects.requireNonNull(ebu2);
                                new hbu(ebu2, (Map)hashMap, (Map)hashMap2, (Map)hashMap3);
                            }
                            arrayDeque.pop();
                            c = v;
                            b3 = b2;
                            a2 = a;
                            n = n2;
                            array2 = array;
                        }
                    }
                }
                else if (i == 2) {
                    n = n2 + 1;
                    c = v;
                    b3 = b2;
                    a2 = a;
                    array2 = array;
                }
                else {
                    c = v;
                    b3 = b2;
                    a2 = a;
                    n = n2;
                    array2 = array;
                    if (i == 3) {
                        n = n2 - 1;
                        array2 = array;
                        a2 = a;
                        b3 = b2;
                        c = v;
                    }
                }
                pullParser.next();
                i = pullParser.getEventType();
                v = c;
                b2 = b3;
                a = a2;
                n2 = n;
                array = array2;
            }
            if (array != null) {
                return (htr)(Object)array;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        }
        catch (final IOException ex2) {
            throw new IllegalStateException("Unexpected error when reading input.", ex2);
        }
        catch (final XmlPullParserException ex3) {
            throw new SubtitleDecoderException("Unable to decode source", (Throwable)ex3);
        }
    }
    
    public static final class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final float a;
        public final int b;
        public final int c;
        
        public b(final float a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
