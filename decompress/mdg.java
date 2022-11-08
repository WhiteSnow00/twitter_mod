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

public final class mdg
{
    public static final Map<String, geg<kdg>> a;
    public static final byte[] b;
    
    static {
        mdg.a = new HashMap();
        b = new byte[] { 80, 75, 3, 4 };
    }
    
    public static geg<kdg> a(final String s, final Callable<eeg<kdg>> callable) {
        kdg kdg;
        if (s == null) {
            kdg = null;
        }
        else {
            final ldg b = ldg.b;
            Objects.requireNonNull(b);
            kdg = (kdg)b.a.c((Object)s);
        }
        if (kdg != null) {
            return (geg<kdg>)new geg((Callable)new Callable<eeg<kdg>>() {
                @Override
                public final Object call() throws Exception {
                    return new eeg((Object)kdg);
                }
            }, false);
        }
        if (s != null) {
            final HashMap a = mdg.a;
            if (a.containsKey(s)) {
                return (geg<kdg>)a.get(s);
            }
        }
        final geg geg = new geg((Callable)callable, false);
        if (s != null) {
            geg.b((wdg)new wdg<kdg>() {
                public final void a(final Object o) {
                    final kdg kdg = (kdg)o;
                    mdg.a.remove(s);
                }
            });
            geg.a((wdg)new wdg<Throwable>() {
                public final void a(final Object o) {
                    final Throwable t = (Throwable)o;
                    mdg.a.remove(s);
                }
            });
            mdg.a.put(s, geg);
        }
        return (geg<kdg>)geg;
    }
    
    public static eeg<kdg> b(final Context context, final String s, final String s2) {
        try {
            if (!s.endsWith(".zip") && !s.endsWith(".lottie")) {
                return c(context.getAssets().open(s), s2);
            }
            return f(new ZipInputStream(context.getAssets().open(s)), s2);
        }
        catch (final IOException ex) {
            return (eeg<kdg>)new eeg((Throwable)ex);
        }
    }
    
    public static eeg<kdg> c(final InputStream inputStream, final String s) {
        try {
            final mr2 u = poa.u(poa.G0(inputStream));
            final String[] g0 = die.G0;
            return d((die)new dle(u), s, true);
        }
        finally {
            mmw.b(inputStream);
        }
    }
    
    public static eeg<kdg> d(final die die, final String s, final boolean b) {
        try {
            try {
                final kdg a = rdg.a(die);
                if (s != null) {
                    ldg.b.a(s, a);
                }
                final eeg eeg = new eeg((Object)a);
                if (b) {
                    mmw.b((Closeable)die);
                }
                return (eeg<kdg>)eeg;
            }
            finally {
                if (b) {
                    mmw.b((Closeable)die);
                }
                mmw.b((Closeable)die);
                return;
            }
        }
        catch (final Exception ex) {}
    }
    
    public static eeg<kdg> e(final Context context, int i, final String s) {
        try {
            final mr2 u = poa.u(poa.G0(context.getResources().openRawResource(i)));
            Boolean b2 = null;
            Label_0098: {
                try {
                    final mr2 peek = ((x1m)u).peek();
                    final byte[] b = mdg.b;
                    int length;
                    for (length = b.length, i = 0; i < length; ++i) {
                        if (((x1m)peek).readByte() != b[i]) {
                            b2 = Boolean.FALSE;
                            break Label_0098;
                        }
                    }
                    ((x1m)peek).close();
                    b2 = Boolean.TRUE;
                }
                catch (final Exception ex) {
                    Objects.requireNonNull(z9g.a);
                    b2 = Boolean.FALSE;
                }
            }
            if (b2) {
                return f(new ZipInputStream((InputStream)new x1m$a((x1m)u)), s);
            }
            return c((InputStream)new x1m$a((x1m)u), s);
        }
        catch (final Resources$NotFoundException ex2) {
            return (eeg<kdg>)new eeg((Throwable)ex2);
        }
    }
    
    public static eeg<kdg> f(final ZipInputStream zipInputStream, final String s) {
        try {
            return g(zipInputStream, s);
        }
        finally {
            mmw.b(zipInputStream);
        }
    }
    
    public static eeg<kdg> g(final ZipInputStream zipInputStream, final String s) {
        final HashMap hashMap = new HashMap();
        try {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            kdg kdg = null;
            while (zipEntry != null) {
                final String name = zipEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().contains(".json")) {
                    final mr2 u = poa.u(poa.G0(zipInputStream));
                    final String[] g0 = die.G0;
                    kdg = (kdg)d((die)new dle(u), null, false).a;
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
            if (kdg == null) {
                return (eeg<kdg>)new eeg((Throwable)new IllegalArgumentException("Unable to parse composition"));
            }
        Label_0211:
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s2 = entry.getKey();
                while (true) {
                    for (final vdg vdg : kdg.d.values()) {
                        if (vdg.c.equals(s2)) {
                            if (vdg != null) {
                                vdg.d = mmw.e((Bitmap)entry.getValue(), vdg.a, vdg.b);
                                continue Label_0211;
                            }
                            continue Label_0211;
                        }
                    }
                    vdg vdg = null;
                    continue;
                }
            }
            for (final Map.Entry<K, vdg> entry2 : kdg.d.entrySet()) {
                if (entry2.getValue().d == null) {
                    final StringBuilder g2 = w48.g("There is no image for ");
                    g2.append(entry2.getValue().c);
                    return (eeg<kdg>)new eeg((Throwable)new IllegalStateException(g2.toString()));
                }
            }
            if (s != null) {
                ldg.b.a(s, kdg);
            }
            return (eeg<kdg>)new eeg((Object)kdg);
        }
        catch (final IOException ex) {
            return (eeg<kdg>)new eeg((Throwable)ex);
        }
    }
    
    public static String h(final Context context, final int n) {
        final StringBuilder g = w48.g("rawRes");
        String s;
        if ((context.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            s = "_night_";
        }
        else {
            s = "_day_";
        }
        g.append(s);
        g.append(n);
        return g.toString();
    }
}
