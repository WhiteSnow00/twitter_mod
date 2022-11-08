import android.net.Uri;
import java.util.Map;
import tv.periscope.android.api.customheart.Asset;
import tv.periscope.android.api.customheart.Theme;
import tv.periscope.android.api.GetHeartThemeAssetsResponse;
import android.content.Context;
import android.util.Pair;
import java.text.Normalizer;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import java.util.Iterator;
import java.util.Set;
import java.io.File;
import java.util.List;
import kotlinx.serialization.MissingFieldException;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.io.IOException;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j78 implements pyy
{
    public static final jkh A(final jkh jkh, final qqj qqj) {
        zzd.f((Object)jkh, "<this>");
        zzd.f((Object)qqj, "overscrollEffect");
        return jkh.E(qqj.f());
    }
    
    public static int B(final InputStream inputStream) throws IOException {
        return ((byte)(inputStream.read() & 0xFF) << 16 & 0xFF0000) | ((byte)(inputStream.read() & 0xFF) << 8 & 0xFF00) | ((byte)(inputStream.read() & 0xFF) & 0xFF);
    }
    
    public static final void C(int i, int n, final SerialDescriptor serialDescriptor) {
        zzd.f((Object)serialDescriptor, "descriptor");
        final ArrayList list = new ArrayList();
        n &= ~i;
        for (i = 0; i < 32; ++i) {
            if ((n & 0x1) != 0x0) {
                list.add(serialDescriptor.e(i));
            }
            n >>>= 1;
        }
        throw new MissingFieldException((List)list, serialDescriptor.h());
    }
    
    public static void D(final File file, final rya rya) {
        rya.c(file);
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (final File file2 : listFiles) {
                if (file2.isDirectory()) {
                    D(file2, rya);
                }
                else {
                    rya.b(file2);
                }
            }
        }
        rya.a(file);
    }
    
    public static final Set E(final Set set) {
        zzd.f((Object)set, "<this>");
        final ArrayList list = new ArrayList(kr4.h1((Iterable)set, 10));
        for (final gon gon : set) {
            list.add(new hon(gon.a, gon.b, gon.c, gon.d, gon.e));
        }
        return or4.r2((Iterable)list);
    }
    
    public static final void b(wv8 m0, m76 h, final int n, final int n2) {
        h = h.h(1037356856);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x2);
        }
        else {
            n4 = n;
        }
        if (n3 == 1 && (n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
            }
            else if (n3 != 0) {
                m0 = dml.m0(h);
            }
            h.s();
            final ea6$b a = ea6.a;
            final q66 a2 = q66.a;
            ge0.a((gub)q66.b, (gub)q66.c, (gub)m8y.j(h, 1922049180, new muw(m0)), (jkh)null, 0L, (oqp)null, (gub)null, (jub)q66.d, h, 12583350, 120);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new nuw(m0, n, n2));
        }
    }
    
    public static String c(final int n, final int n2, final String s) {
        if (n < 0) {
            return m0n.d0("%s (%s) must not be negative", new Object[] { s, n });
        }
        if (n2 >= 0) {
            return m0n.d0("%s (%s) must not be greater than size (%s)", new Object[] { s, n, n2 });
        }
        throw new IllegalArgumentException(q1a.f(26, "negative size: ", n2));
    }
    
    public static void d(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static int e(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return n;
        }
        String s;
        if (n >= 0) {
            if (n2 < 0) {
                throw new IllegalArgumentException(q1a.f(26, "negative size: ", n2));
            }
            s = m0n.d0("%s (%s) must be less than size (%s)", new Object[] { "index", n, n2 });
        }
        else {
            s = m0n.d0("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static Object f(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(o2));
    }
    
    public static int g(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(c(n, n2, "index"));
    }
    
    public static void h(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        String s;
        if (n >= 0 && n <= n3) {
            if (n2 >= 0 && n2 <= n3) {
                s = m0n.d0("end index (%s) must not be less than start index (%s)", new Object[] { n2, n });
            }
            else {
                s = c(n2, n3, "end index");
            }
        }
        else {
            s = c(n, n3, "start index");
        }
        throw new IndexOutOfBoundsException(s);
    }
    
    public static void i(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
    
    public static boolean j(final byte[] array, final String s) {
        if (array.length != s.length()) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (s.charAt(i) != array[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static final qiv k(final boolean b, final boolean b2, final fc4 fc4, final use use, final vse vse) {
        zzd.f((Object)fc4, "typeSystemContext");
        zzd.f((Object)use, "kotlinTypePreparator");
        zzd.f((Object)vse, "kotlinTypeRefiner");
        return new qiv(b, b2, (bkv)fc4, (fb)use, (uau)vse);
    }
    
    public static boolean m(final File file) {
        final File[] listFiles = file.listFiles();
        int n = 1;
        int n2 = 1;
        if (listFiles != null) {
            final int length = listFiles.length;
            int n3 = 0;
            while (true) {
                n = n2;
                if (n3 >= length) {
                    break;
                }
                n2 &= (n(listFiles[n3]) ? 1 : 0);
                ++n3;
            }
        }
        return n != 0;
    }
    
    public static boolean n(final File file) {
        if (file.isDirectory()) {
            m(file);
        }
        return file.delete();
    }
    
    public static final String o(final alf alf) {
        zzd.f((Object)alf, "<this>");
        final int ordinal = ((Enum)alf).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal == 1) {
                throw new Exception("Not supported");
            }
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            s = "ownedSubscribedListModule";
        }
        else {
            s = "pinnedListModule";
        }
        return s;
    }
    
    public static int p(final InputStream inputStream) throws IOException {
        return ((byte)inputStream.read() << 24 & 0xFF000000) | ((byte)inputStream.read() << 16 & 0xFF0000) | ((byte)inputStream.read() << 8 & 0xFF00) | ((byte)inputStream.read() & 0xFF);
    }
    
    public static int q(final List list) {
        if (hr4.t((Collection)list)) {
            return 0;
        }
    Label_0233_Outer:
        for (int size = list.size(), i = 0; i < size; ++i) {
            final w66 w66 = list.get(i);
            final h36 a = w66.a();
            final boolean v = a.v();
            final boolean t = a.t();
            boolean b = true;
            boolean b3 = false;
            Label_0255: {
                Label_0252: {
                    if ((!t || a.a.l != null) && (v || cli.h(a.a.i).c) && a.b.size() <= 4) {
                        Label_0246: {
                            if (a.o()) {
                                final Iterator iterator = a.a.n.a.iterator();
                                int n = 0;
                            Label_0236_Outer:
                                while (true) {
                                    while (true) {
                                        while (iterator.hasNext()) {
                                            final String s = (String)iterator.next();
                                            final String normalize = Normalizer.normalize(s, Normalizer.Form.NFC);
                                            if (25 - normalize.codePointCount(0, normalize.length()) < 0) {
                                                final boolean b2 = false;
                                                if (b2 && !v) {
                                                    break Label_0246;
                                                }
                                                break Label_0252;
                                            }
                                            else {
                                                if (!pjr.g((CharSequence)s.trim())) {
                                                    continue Label_0233_Outer;
                                                }
                                                ++n;
                                            }
                                        }
                                        if (n >= 2) {
                                            final boolean b2 = true;
                                            continue;
                                        }
                                        break;
                                    }
                                    continue Label_0236_Outer;
                                }
                            }
                        }
                        b3 = true;
                        break Label_0255;
                    }
                }
                b3 = false;
            }
            if (size <= 1 || !w66.a().u()) {
                b = false;
            }
            if (!b3 || b) {
                return i;
            }
        }
        return -1;
    }
    
    public static String r(final i1 i1) {
        if (i1 instanceof ddc) {
            return ((ddc)i1).a();
        }
        return i1.getId();
    }
    
    public static Pair s(final InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        final short n = (short)(inputStream.read() & 0xFF);
        final short n2 = (short)(inputStream.read() & 0xFF);
        final short n3 = (short)(inputStream.read() & 0xFF);
        if (n == 157 && n2 == 1 && n3 == 42) {
            return new Pair((Object)(((byte)inputStream.read() & 0xFF) | ((byte)inputStream.read() << 8 & 0xFF00)), (Object)(((byte)inputStream.read() << 8 & 0xFF00) | ((byte)inputStream.read() & 0xFF)));
        }
        return null;
    }
    
    public static Pair t(final InputStream inputStream) throws IOException {
        p(inputStream);
        if ((byte)(inputStream.read() & 0xFF) != 47) {
            return null;
        }
        final byte b = (byte)inputStream.read();
        final int n = (byte)inputStream.read() & 0xFF;
        return new Pair((Object)(((b & 0xFF) | (n & 0x3F) << 8) + 1), (Object)((((byte)inputStream.read() & 0xFF & 0xF) << 10 | ((byte)inputStream.read() & 0xFF) << 2 | (n & 0xC0) >> 6) + 1));
    }
    
    public static final void u(final Context context, final qa7 qa7, final GetHeartThemeAssetsResponse getHeartThemeAssetsResponse) {
        zzd.f((Object)context, "context");
        zzd.f((Object)qa7, "customHeartCache");
        zzd.f((Object)getHeartThemeAssetsResponse, "response");
        final cyo$a b = cyo.b(context.getApplicationContext());
        final List themes = getHeartThemeAssetsResponse.themes;
        zzd.e((Object)themes, "response.themes");
        final int ordinal = ((Enum)b).ordinal();
        String s;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                s = "xxhdpi";
            }
            else {
                s = "xhdpi";
            }
        }
        else {
            s = "hdpi";
        }
        for (final Theme theme : themes) {
            final String theme2 = theme.theme;
            final Iterator iterator2 = theme.assets.iterator();
            String s2 = null;
            String s3 = null;
            String assetUrl;
            String assetUrl2;
            while (true) {
                assetUrl = s2;
                assetUrl2 = s3;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Asset asset = (Asset)iterator2.next();
                if (!zzd.a((Object)asset.density, (Object)s)) {
                    continue;
                }
                final String assetName = asset.assetName;
                if (zzd.a((Object)assetName, (Object)"border")) {
                    assetUrl = asset.assetUrl;
                    assetUrl2 = s3;
                }
                else {
                    assetUrl = s2;
                    assetUrl2 = s3;
                    if (zzd.a((Object)assetName, (Object)"fill")) {
                        assetUrl2 = asset.assetUrl;
                        assetUrl = s2;
                    }
                }
                s2 = assetUrl;
                s3 = assetUrl2;
                if (assetUrl == null) {
                    continue;
                }
                s2 = assetUrl;
                if ((s3 = assetUrl2) != null) {
                    break;
                }
            }
            if (assetUrl == null && assetUrl2 == null) {
                continue;
            }
            zzd.e((Object)theme2, "themeName");
            pa7 pa7;
            if ((pa7 = qa7.a.get(theme2)) == null) {
                pa7 = new pa7();
                qa7.a.put(theme2, pa7);
            }
            String a;
            if ((a = assetUrl) == null) {
                a = pa7.a;
            }
            pa7.a = a;
            String b2;
            if ((b2 = assetUrl2) == null) {
                b2 = pa7.b;
            }
            pa7.b = b2;
            if (qa7.b.contains(theme2)) {
                continue;
            }
            qa7.b.add(theme2);
        }
    }
    
    public static int v(String s) {
        final String s2 = s;
        if (s2 == null) {
            return -1;
        }
        final ArrayList a = zah.a;
        final int hashCode = s.hashCode();
        final int n = 2;
        int n2 = 0;
        Label_0112: {
            switch (hashCode) {
                case 187090231: {
                    if (!s2.equals("audio/mp3")) {
                        break;
                    }
                    n2 = 2;
                    break Label_0112;
                }
                case -586683234: {
                    if (!s2.equals("audio/x-wav")) {
                        break;
                    }
                    n2 = 1;
                    break Label_0112;
                }
                case -1007807498: {
                    if (!s2.equals("audio/x-flac")) {
                        break;
                    }
                    n2 = 0;
                    break Label_0112;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                s = s2;
                break;
            }
            case 2: {
                s = "audio/mpeg";
                break;
            }
            case 1: {
                s = "audio/wav";
                break;
            }
            case 0: {
                s = "audio/flac";
                break;
            }
        }
        int n3 = 0;
        Label_0818: {
            switch (s.hashCode()) {
                case 2039520277: {
                    if (!s.equals("video/x-matroska")) {
                        break;
                    }
                    n3 = 23;
                    break Label_0818;
                }
                case 1505118770: {
                    if (!s.equals("audio/webm")) {
                        break;
                    }
                    n3 = 22;
                    break Label_0818;
                }
                case 1504831518: {
                    if (!s.equals("audio/mpeg")) {
                        break;
                    }
                    n3 = 21;
                    break Label_0818;
                }
                case 1504619009: {
                    if (!s.equals("audio/flac")) {
                        break;
                    }
                    n3 = 20;
                    break Label_0818;
                }
                case 1504578661: {
                    if (!s.equals("audio/eac3")) {
                        break;
                    }
                    n3 = 19;
                    break Label_0818;
                }
                case 1503095341: {
                    if (!s.equals("audio/3gpp")) {
                        break;
                    }
                    n3 = 18;
                    break Label_0818;
                }
                case 1331848029: {
                    if (!s.equals("video/mp4")) {
                        break;
                    }
                    n3 = 17;
                    break Label_0818;
                }
                case 187099443: {
                    if (!s.equals("audio/wav")) {
                        break;
                    }
                    n3 = 16;
                    break Label_0818;
                }
                case 187091926: {
                    if (!s.equals("audio/ogg")) {
                        break;
                    }
                    n3 = 15;
                    break Label_0818;
                }
                case 187090232: {
                    if (!s.equals("audio/mp4")) {
                        break;
                    }
                    n3 = 14;
                    break Label_0818;
                }
                case 187078669: {
                    if (!s.equals("audio/amr")) {
                        break;
                    }
                    n3 = 13;
                    break Label_0818;
                }
                case 187078297: {
                    if (!s.equals("audio/ac4")) {
                        break;
                    }
                    n3 = 12;
                    break Label_0818;
                }
                case 187078296: {
                    if (!s.equals("audio/ac3")) {
                        break;
                    }
                    n3 = 11;
                    break Label_0818;
                }
                case 13915911: {
                    if (!s.equals("video/x-flv")) {
                        break;
                    }
                    n3 = 10;
                    break Label_0818;
                }
                case -43467528: {
                    if (!s.equals("application/webm")) {
                        break;
                    }
                    n3 = 9;
                    break Label_0818;
                }
                case -387023398: {
                    if (!s.equals("audio/x-matroska")) {
                        break;
                    }
                    n3 = 8;
                    break Label_0818;
                }
                case -1004728940: {
                    if (!s.equals("text/vtt")) {
                        break;
                    }
                    n3 = 7;
                    break Label_0818;
                }
                case -1248337486: {
                    if (!s.equals("application/mp4")) {
                        break;
                    }
                    n3 = 6;
                    break Label_0818;
                }
                case -1487394660: {
                    if (!s.equals("image/jpeg")) {
                        break;
                    }
                    n3 = 5;
                    break Label_0818;
                }
                case -1606874997: {
                    if (!s.equals("audio/amr-wb")) {
                        break;
                    }
                    n3 = 4;
                    break Label_0818;
                }
                case -1662095187: {
                    if (!s.equals("video/webm")) {
                        break;
                    }
                    n3 = 3;
                    break Label_0818;
                }
                case -1662384007: {
                    n3 = n;
                    if (!s.equals("video/mp2t")) {
                        break;
                    }
                    break Label_0818;
                }
                case -1662384011: {
                    if (!s.equals("video/mp2p")) {
                        break;
                    }
                    n3 = 1;
                    break Label_0818;
                }
                case -2123537834: {
                    if (!s.equals("audio/eac3-joc")) {
                        break;
                    }
                    n3 = 0;
                    break Label_0818;
                }
            }
            n3 = -1;
        }
        switch (n3) {
            default: {
                return -1;
            }
            case 21: {
                return 7;
            }
            case 20: {
                return 4;
            }
            case 16: {
                return 12;
            }
            case 15: {
                return 9;
            }
            case 12: {
                return 1;
            }
            case 10: {
                return 5;
            }
            case 7: {
                return 13;
            }
            case 6:
            case 14:
            case 17: {
                return 8;
            }
            case 5: {
                return 14;
            }
            case 4:
            case 13:
            case 18: {
                return 3;
            }
            case 3:
            case 8:
            case 9:
            case 22:
            case 23: {
                return 6;
            }
            case 2: {
                return 11;
            }
            case 1: {
                return 10;
            }
            case 0:
            case 11:
            case 19: {
                return 0;
            }
        }
    }
    
    public static int w(final Map map) {
        final List list = map.get("Content-Type");
        String s;
        if (list != null && !list.isEmpty()) {
            s = (String)list.get(0);
        }
        else {
            s = null;
        }
        return v(s);
    }
    
    public static int x(final Uri uri) {
        final String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
            return -1;
        }
        return 14;
    }
    
    public static final void y(final m76 m76, final gub gub) {
        zzd.f((Object)m76, "composer");
        zzd.f((Object)gub, "composable");
        fjv.e((Object)gub, 2);
        gub.invoke((Object)m76, (Object)1);
    }
    
    public static final boolean z(final pb4 pb4) {
        zzd.f((Object)pb4, "<this>");
        return pb4.r() == vgh.C0 && pb4.i() != vb4.E0;
    }
    
    public Object a() {
        final azy c = fzy.c;
        return lsz.D0.b().c();
    }
}
