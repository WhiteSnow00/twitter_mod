import java.util.Iterator;
import java.util.zip.ZipEntry;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.res.Resources$NotFoundException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdg
{
    public static final Map<String, wdg<adg>> a;
    public static final byte[] b;
    
    static {
        cdg.a = new HashMap();
        b = new byte[] { 80, 75, 3, 4 };
    }
    
    public static wdg<adg> a(final String s, final Callable<udg<adg>> callable) {
        adg adg;
        if (s == null) {
            adg = null;
        }
        else {
            final bdg b = bdg.b;
            Objects.requireNonNull(b);
            adg = (adg)b.a.c(s);
        }
        if (adg != null) {
            return (wdg<adg>)new wdg((Callable)new Callable<udg<adg>>(adg) {
                public final adg D0;
                
                @Override
                public final Object call() throws Exception {
                    return new udg(this.D0);
                }
            }, false);
        }
        if (s != null) {
            final HashMap a = cdg.a;
            if (a.containsKey(s)) {
                return (wdg<adg>)a.get(s);
            }
        }
        final wdg wdg = new wdg((Callable)callable, false);
        if (s != null) {
            wdg.b((mdg)new cdg$a(s));
            wdg.a((mdg)new cdg$b(s));
            cdg.a.put(s, wdg);
        }
        return (wdg<adg>)wdg;
    }
    
    public static udg<adg> b(final Context context, final String s, final String s2) {
        try {
            if (!s.endsWith(".zip") && !s.endsWith(".lottie")) {
                return c(context.getAssets().open(s), s2);
            }
            return f(new ZipInputStream(context.getAssets().open(s)), s2);
        }
        catch (final IOException ex) {
            return new udg<adg>(ex);
        }
    }
    
    public static udg<adg> c(final InputStream inputStream, final String s) {
        try {
            final dr2 j = yvl.j(yvl.V(inputStream));
            final String[] h0 = nhe.H0;
            return d((nhe)new nke(j), s, true);
        }
        finally {
            hnw.b((Closeable)inputStream);
        }
    }
    
    public static udg<adg> d(final nhe nhe, final String s, final boolean b) {
        try {
            try {
                final adg a = hdg.a(nhe);
                if (s != null) {
                    bdg.b.a(s, a);
                }
                final udg udg = new udg<adg>(a);
                if (b) {
                    hnw.b((Closeable)nhe);
                }
                return (udg<adg>)udg;
            }
            finally {
                if (b) {
                    hnw.b((Closeable)nhe);
                }
                hnw.b((Closeable)nhe);
                return;
            }
        }
        catch (final Exception ex) {}
    }
    
    public static udg<adg> e(final Context context, int i, final String s) {
        try {
            final dr2 j = yvl.j(yvl.V(context.getResources().openRawResource(i)));
            Boolean b2 = null;
            Label_0098: {
                try {
                    final dr2 peek = ((m2m)j).peek();
                    final byte[] b = cdg.b;
                    int length;
                    for (length = b.length, i = 0; i < length; ++i) {
                        if (((m2m)peek).readByte() != b[i]) {
                            b2 = Boolean.FALSE;
                            break Label_0098;
                        }
                    }
                    ((m2m)peek).close();
                    b2 = Boolean.TRUE;
                }
                catch (final Exception ex) {
                    Objects.requireNonNull(p9g.a);
                    b2 = Boolean.FALSE;
                }
            }
            if (b2) {
                return f(new ZipInputStream((InputStream)new m2m$a((m2m)j)), s);
            }
            return c((InputStream)new m2m$a((m2m)j), s);
        }
        catch (final Resources$NotFoundException ex2) {
            return new udg<adg>((Throwable)ex2);
        }
    }
    
    public static udg<adg> f(final ZipInputStream zipInputStream, final String s) {
        try {
            return g(zipInputStream, s);
        }
        finally {
            hnw.b((Closeable)zipInputStream);
        }
    }
    
    public static udg<adg> g(final ZipInputStream zipInputStream, final String s) {
        final HashMap hashMap = new HashMap();
        try {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            adg adg = null;
            while (zipEntry != null) {
                final String name = zipEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().contains(".json")) {
                    final dr2 j = yvl.j(yvl.V((InputStream)zipInputStream));
                    final String[] h0 = nhe.H0;
                    adg = d((nhe)new nke(j), null, false).a;
                }
                else if (!name.contains(".png") && !name.contains(".webp")) {
                    zipInputStream.closeEntry();
                }
                else {
                    final String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream((InputStream)zipInputStream));
                }
                zipEntry = zipInputStream.getNextEntry();
            }
            if (adg == null) {
                return new udg<adg>(new IllegalArgumentException("Unable to parse composition"));
            }
        Label_0210:
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s2 = entry.getKey();
                while (true) {
                    for (final ldg ldg : adg.d.values()) {
                        if (ldg.c.equals(s2)) {
                            if (ldg != null) {
                                ldg.d = hnw.e((Bitmap)entry.getValue(), ldg.a, ldg.b);
                                continue Label_0210;
                            }
                            continue Label_0210;
                        }
                    }
                    ldg ldg = null;
                    continue;
                }
            }
            for (final Map.Entry<K, ldg> entry2 : adg.d.entrySet()) {
                if (entry2.getValue().d == null) {
                    final StringBuilder i = fu8.j("There is no image for ");
                    i.append(entry2.getValue().c);
                    return new udg<adg>(new IllegalStateException(i.toString()));
                }
            }
            if (s != null) {
                bdg.b.a(s, adg);
            }
            return new udg<adg>(adg);
        }
        catch (final IOException ex) {
            return new udg<adg>(ex);
        }
    }
    
    public static String h(final Context context, final int n) {
        final StringBuilder j = fu8.j("rawRes");
        String s;
        if ((context.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            s = "_night_";
        }
        else {
            s = "_day_";
        }
        j.append(s);
        j.append(n);
        return j.toString();
    }
}
