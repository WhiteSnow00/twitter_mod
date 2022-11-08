import java.util.Arrays;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import java.util.List;
import com.google.android.exoplayer2.ParserException;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParserFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hux
{
    public static final String[] a;
    public static final String[] b;
    public static final String[] c;
    
    static {
        a = new String[] { "Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo" };
        b = new String[] { "Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs" };
        c = new String[] { "Camera:MicroVideoOffset", "GCamera:MicroVideoOffset" };
    }
    
    public static brh a(final String s) throws XmlPullParserException, IOException {
        final XmlPullParser pullParser = XmlPullParserFactory.newInstance().newPullParser();
        pullParser.setInput((Reader)new StringReader(s));
        pullParser.next();
        if (!ca7.t(pullParser, "x:xmpmeta")) {
            throw ParserException.a("Couldn't find xmp metadata", (Throwable)null);
        }
        final aed$b d0 = aed.D0;
        Object g0 = lam.G0;
        long n = -9223372036854775807L;
        Object o = null;
        long n3 = 0L;
        do {
            pullParser.next();
            Label_0330: {
                if (ca7.t(pullParser, "rdf:Description")) {
                    final String[] a = hux.a;
                    int i = 0;
                    while (true) {
                        while (i < 4) {
                            final String j = ca7.i(pullParser, a[i]);
                            if (j != null) {
                                if (Integer.parseInt(j) != 1) {
                                    break;
                                }
                                final boolean b = true;
                                if (!b) {
                                    return null;
                                }
                                final String[] b2 = hux.b;
                                int k = 0;
                                while (true) {
                                    while (k < 4) {
                                        final String l = ca7.i(pullParser, b2[k]);
                                        if (l != null) {
                                            final long long1;
                                            if ((long1 = Long.parseLong(l)) == -1L) {
                                                break;
                                            }
                                            final String[] c = hux.c;
                                            while (true) {
                                                for (int n2 = 0; n2 < 2; ++n2) {
                                                    final String m = ca7.i(pullParser, c[n2]);
                                                    if (m != null) {
                                                        final long long2 = Long.parseLong(m);
                                                        final brh$a brh$a = new brh$a("image/jpeg", 0L, 0L);
                                                        final brh$a brh$a2 = new brh$a("video/mp4", long2, 0L);
                                                        final aed$b d2 = aed.D0;
                                                        o = aed.p(new Object[] { brh$a, brh$a2 });
                                                        n3 = long1;
                                                        break Label_0330;
                                                    }
                                                }
                                                final aed$b d3 = aed.D0;
                                                o = lam.G0;
                                                continue;
                                            }
                                        }
                                        else {
                                            ++k;
                                        }
                                    }
                                    long long1 = -9223372036854775807L;
                                    continue;
                                }
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b = false;
                        continue;
                    }
                }
                if (ca7.t(pullParser, "Container:Directory")) {
                    o = b(pullParser, "Container", "Item");
                    n3 = n;
                }
                else {
                    o = g0;
                    n3 = n;
                    if (ca7.t(pullParser, "GContainer:Directory")) {
                        o = b(pullParser, "GContainer", "GContainerItem");
                        n3 = n;
                    }
                }
            }
            g0 = o;
            n = n3;
        } while (!ca7.s(pullParser, "x:xmpmeta"));
        if (((List)o).isEmpty()) {
            return null;
        }
        return new brh(n3, (List)o);
    }
    
    public static aed<brh$a> b(final XmlPullParser xmlPullParser, final String s, final String s2) throws XmlPullParserException, IOException {
        final aed$b d0 = aed.D0;
        wvz.i(4, "initialCapacity");
        final Object[] array = new Object[4];
        final String concat = s.concat(":Item");
        final String concat2 = s.concat(":Directory");
        int n = 0;
        Object[] array2 = array;
        Object[] copy;
        int n2;
        do {
            xmlPullParser.next();
            copy = array2;
            n2 = n;
            if (ca7.t(xmlPullParser, concat)) {
                final String concat3 = s2.concat(":Mime");
                final String concat4 = s2.concat(":Semantic");
                final String concat5 = s2.concat(":Length");
                final String concat6 = s2.concat(":Padding");
                final String i = ca7.i(xmlPullParser, concat3);
                final String j = ca7.i(xmlPullParser, concat4);
                final String k = ca7.i(xmlPullParser, concat5);
                final String l = ca7.i(xmlPullParser, concat6);
                if (i == null || j == null) {
                    return lam.G0;
                }
                long long1;
                if (k != null) {
                    long1 = Long.parseLong(k);
                }
                else {
                    long1 = 0L;
                }
                long long2;
                if (l != null) {
                    long2 = Long.parseLong(l);
                }
                else {
                    long2 = 0L;
                }
                final brh$a brh$a = new brh$a(i, long1, long2);
                n2 = n + 1;
                copy = array2;
                if (array2.length < n2) {
                    copy = Arrays.copyOf(array2, tdd.b.b(array2.length, n2));
                }
                copy[n] = brh$a;
            }
            array2 = copy;
            n = n2;
        } while (!ca7.s(xmlPullParser, concat2));
        return (aed<brh$a>)aed.o(copy, n2);
    }
}
