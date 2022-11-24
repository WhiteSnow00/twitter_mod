import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbh
{
    public static final ArrayList<a> a;
    public static final Pattern b;
    
    static {
        a = new ArrayList<a>();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }
    
    public static boolean a(final String s, final String s2) {
        final boolean b = false;
        if (s == null) {
            return false;
        }
        int n = -1;
        switch (s) {
            case "audio/g711-mlaw": {
                n = 10;
                break;
            }
            case "audio/g711-alaw": {
                n = 9;
                break;
            }
            case "audio/mpeg": {
                n = 8;
                break;
            }
            case "audio/flac": {
                n = 7;
                break;
            }
            case "audio/eac3": {
                n = 6;
                break;
            }
            case "audio/raw": {
                n = 5;
                break;
            }
            case "audio/ac3": {
                n = 4;
                break;
            }
            case "audio/mp4a-latm": {
                n = 3;
                break;
            }
            case "audio/mpeg-L2": {
                n = 2;
                break;
            }
            case "audio/mpeg-L1": {
                n = 1;
                break;
            }
            case "audio/eac3-joc": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return false;
            }
            case 3: {
                if (s2 == null) {
                    return false;
                }
                final b f = f(s2);
                if (f == null) {
                    return false;
                }
                final int a = f.a();
                boolean b2 = b;
                if (a != 0) {
                    b2 = b;
                    if (a != 16) {
                        b2 = true;
                    }
                }
                return b2;
            }
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return true;
            }
        }
    }
    
    public static String b(final String s, final String s2) {
        String string;
        final String s3 = string = null;
        if (s != null) {
            if (s2 == null) {
                string = s3;
            }
            else {
                final String[] p2 = rnw.P(s);
                final StringBuilder sb = new StringBuilder();
                for (final String s4 : p2) {
                    if (s2.equals(d(s4))) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(s4);
                    }
                }
                string = s3;
                if (sb.length() > 0) {
                    string = sb.toString();
                }
            }
        }
        return string;
    }
    
    public static int c(final String s, final String s2) {
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1556697186: {
                if (!s.equals("audio/true-hd")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1505942594: {
                if (!s.equals("audio/vnd.dts.hd")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1504831518: {
                if (!s.equals("audio/mpeg")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1504578661: {
                if (!s.equals("audio/eac3")) {
                    break;
                }
                n = 5;
                break;
            }
            case 187078297: {
                if (!s.equals("audio/ac4")) {
                    break;
                }
                n = 4;
                break;
            }
            case 187078296: {
                if (!s.equals("audio/ac3")) {
                    break;
                }
                n = 3;
                break;
            }
            case -53558318: {
                if (!s.equals("audio/mp4a-latm")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1095064472: {
                if (!s.equals("audio/vnd.dts")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2123537834: {
                if (!s.equals("audio/eac3-joc")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 14;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 9;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 17;
            }
            case 3: {
                return 5;
            }
            case 2: {
                if (s2 == null) {
                    return 0;
                }
                final b f = f(s2);
                if (f == null) {
                    return 0;
                }
                return f.a();
            }
            case 1: {
                return 7;
            }
            case 0: {
                return 18;
            }
        }
    }
    
    public static String d(String e) {
        final String s = null;
        if (e == null) {
            return null;
        }
        final String o = ak1.O(e.trim());
        if (o.startsWith("avc1") || o.startsWith("avc3")) {
            return "video/avc";
        }
        if (o.startsWith("hev1") || o.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (o.startsWith("dvav") || o.startsWith("dva1") || o.startsWith("dvhe") || o.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (o.startsWith("av01")) {
            return "video/av01";
        }
        if (o.startsWith("vp9") || o.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (o.startsWith("vp8") || o.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (o.startsWith("mp4a")) {
            e = s;
            if (o.startsWith("mp4a.")) {
                final b f = f(o);
                e = s;
                if (f != null) {
                    e = e(f.a);
                }
            }
            String s2;
            if ((s2 = e) == null) {
                s2 = "audio/mp4a-latm";
            }
            return s2;
        }
        if (o.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (o.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (o.startsWith("ac-3") || o.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (o.startsWith("ec-3") || o.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (o.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (o.startsWith("ac-4") || o.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (o.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (o.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (o.startsWith("dtsh") || o.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (o.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (o.startsWith("opus")) {
            return "audio/opus";
        }
        if (o.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (o.startsWith("flac")) {
            return "audio/flac";
        }
        if (o.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (o.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (o.contains("cea708")) {
            return "application/cea-708";
        }
        if (!o.contains("eia608") && !o.contains("cea608")) {
            for (int size = rbh.a.size(), i = 0; i < size; ++i) {
                Objects.requireNonNull(rbh.a.get(i));
                if (o.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
        return "application/cea-608";
    }
    
    public static String e(final int n) {
        if (n == 32) {
            return "video/mp4v-es";
        }
        if (n == 33) {
            return "video/avc";
        }
        if (n != 35) {
            if (n != 64) {
                if (n == 163) {
                    return "video/wvc1";
                }
                if (n == 177) {
                    return "video/x-vnd.on2.vp9";
                }
                if (n == 165) {
                    return "audio/ac3";
                }
                if (n == 166) {
                    return "audio/eac3";
                }
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 174: {
                                return "audio/ac4";
                            }
                            case 173: {
                                return "audio/opus";
                            }
                            case 170:
                            case 171: {
                                return "audio/vnd.dts.hd";
                            }
                            case 169:
                            case 172: {
                                return "audio/vnd.dts";
                            }
                        }
                        break;
                    }
                    case 106: {
                        return "video/mpeg";
                    }
                    case 105:
                    case 107: {
                        return "audio/mpeg";
                    }
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101: {
                        return "video/mpeg2";
                    }
                    case 102:
                    case 103:
                    case 104: {
                        break;
                    }
                }
            }
            return "audio/mp4a-latm";
        }
        return "video/hevc";
    }
    
    public static b f(String group) {
        final Matcher matcher = rbh.b.matcher(group);
        if (!matcher.matches()) {
            return null;
        }
        group = matcher.group(1);
        Objects.requireNonNull(group);
        final String group2 = matcher.group(2);
        int int1 = 0;
        try {
            final int int2 = Integer.parseInt(group, 16);
            if (group2 != null) {
                int1 = Integer.parseInt(group2);
            }
            return new b(int2, int1);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static String g(final String s) {
        if (s == null) {
            return null;
        }
        final int index = s.indexOf(47);
        if (index == -1) {
            return null;
        }
        return s.substring(0, index);
    }
    
    public static int h(final String s) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final int n = -1;
        if (empty) {
            return -1;
        }
        if (i(s)) {
            return 1;
        }
        if (k(s)) {
            return 2;
        }
        if (j(s)) {
            return 3;
        }
        if ("image".equals(g(s))) {
            return 4;
        }
        if ("application/id3".equals(s) || "application/x-emsg".equals(s) || "application/x-scte35".equals(s)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(s)) {
            return 6;
        }
        final int size = rbh.a.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            Objects.requireNonNull(rbh.a.get(n2));
            if (s.equals(null)) {
                n3 = 0;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public static boolean i(final String s) {
        return "audio".equals(g(s));
    }
    
    public static boolean j(final String s) {
        return "text".equals(g(s)) || "application/cea-608".equals(s) || "application/cea-708".equals(s) || "application/x-mp4-cea-608".equals(s) || "application/x-subrip".equals(s) || "application/ttml+xml".equals(s) || "application/x-quicktime-tx3g".equals(s) || "application/x-mp4-vtt".equals(s) || "application/x-rawcc".equals(s) || "application/vobsub".equals(s) || "application/pgs".equals(s) || "application/dvbsubs".equals(s);
    }
    
    public static boolean k(final String s) {
        return "video".equals(g(s));
    }
    
    public static final class a
    {
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        
        public b(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public final int a() {
            final int b = this.b;
            if (b == 2) {
                return 10;
            }
            if (b == 5) {
                return 11;
            }
            if (b == 29) {
                return 12;
            }
            if (b == 42) {
                return 16;
            }
            if (b == 22) {
                return 1073741824;
            }
            if (b != 23) {
                return 0;
            }
            return 15;
        }
    }
}
