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

public final class wdg
{
    public static final Map<String, qeg<udg>> a;
    public static final byte[] b;
    
    static {
        wdg.a = new HashMap();
        b = new byte[] { 80, 75, 3, 4 };
    }
    
    public static qeg<udg> a(final String s, final Callable<oeg<udg>> callable) {
        udg udg;
        if (s == null) {
            udg = null;
        }
        else {
            final vdg b = vdg.b;
            Objects.requireNonNull(b);
            udg = b.a.c(s);
        }
        if (udg != null) {
            return (qeg<udg>)new qeg((Callable)new Callable<oeg<udg>>(udg) {
                public final udg F0;
                
                @Override
                public final Object call() throws Exception {
                    return new oeg(this.F0);
                }
            }, false);
        }
        if (s != null) {
            final HashMap a = wdg.a;
            if (a.containsKey(s)) {
                return (qeg<udg>)a.get(s);
            }
        }
        final qeg qeg = new qeg((Callable)callable, false);
        if (s != null) {
            qeg.b((geg)new geg<udg>(s) {
                public final String a;
                
                public final void a(final Object o) {
                    final udg udg = (udg)o;
                    wdg.a.remove(this.a);
                }
            });
            qeg.a((geg)new geg<Throwable>(s) {
                public final String a;
                
                public final void a(final Object o) {
                    final Throwable t = (Throwable)o;
                    wdg.a.remove(this.a);
                }
            });
            wdg.a.put(s, qeg);
        }
        return (qeg<udg>)qeg;
    }
    
    public static oeg<udg> b(final Context context, final String s, final String s2) {
        try {
            if (!s.endsWith(".zip") && !s.endsWith(".lottie")) {
                return c(context.getAssets().open(s), s2);
            }
            return f(new ZipInputStream(context.getAssets().open(s)), s2);
        }
        catch (final IOException ex) {
            return new oeg<udg>(ex);
        }
    }
    
    public static oeg<udg> c(final InputStream inputStream, final String s) {
        try {
            final ur2 l = o9a.l(o9a.K(inputStream));
            final String[] j0 = jie.J0;
            return d(new kle(l), s, true);
        }
        finally {
            wnw.b((Closeable)inputStream);
        }
    }
    
    public static oeg<udg> d(final jie jie, final String s, final boolean b) {
        try {
            try {
                final udg a = beg.a(jie);
                if (s != null) {
                    vdg.b.a(s, a);
                }
                final oeg oeg = new oeg<udg>(a);
                if (b) {
                    wnw.b((Closeable)jie);
                }
                return (oeg<udg>)oeg;
            }
            finally {
                if (b) {
                    wnw.b((Closeable)jie);
                }
                wnw.b((Closeable)jie);
                return;
            }
        }
        catch (final Exception ex) {}
    }
    
    public static oeg<udg> e(final Context context, int i, final String s) {
        try {
            final ur2 l = o9a.l(o9a.K(context.getResources().openRawResource(i)));
            Boolean b2 = null;
            Label_0098: {
                try {
                    final ur2 peek = ((x2m)l).peek();
                    final byte[] b = wdg.b;
                    int length;
                    for (length = b.length, i = 0; i < length; ++i) {
                        if (((x2m)peek).readByte() != b[i]) {
                            b2 = Boolean.FALSE;
                            break Label_0098;
                        }
                    }
                    ((x2m)peek).close();
                    b2 = Boolean.TRUE;
                }
                catch (final Exception ex) {
                    Objects.requireNonNull(kag.a);
                    b2 = Boolean.FALSE;
                }
            }
            if (b2) {
                return f(new ZipInputStream((InputStream)new x2m$a((x2m)l)), s);
            }
            return c((InputStream)new x2m$a((x2m)l), s);
        }
        catch (final Resources$NotFoundException ex2) {
            return new oeg<udg>((Throwable)ex2);
        }
    }
    
    public static oeg<udg> f(final ZipInputStream zipInputStream, final String s) {
        try {
            return g(zipInputStream, s);
        }
        finally {
            wnw.b((Closeable)zipInputStream);
        }
    }
    
    public static oeg<udg> g(final ZipInputStream zipInputStream, final String s) {
        final HashMap hashMap = new HashMap();
        try {
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            udg udg = null;
            while (zipEntry != null) {
                final String name = zipEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                }
                else if (zipEntry.getName().contains(".json")) {
                    final ur2 l = o9a.l(o9a.K((InputStream)zipInputStream));
                    final String[] j0 = jie.J0;
                    udg = d(new kle(l), null, false).a;
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
            if (udg == null) {
                return new oeg<udg>(new IllegalArgumentException("Unable to parse composition"));
            }
        Label_0209:
            for (final Map.Entry<String, V> entry : hashMap.entrySet()) {
                final String s2 = entry.getKey();
                while (true) {
                    for (final feg feg : udg.d.values()) {
                        if (feg.c.equals(s2)) {
                            if (feg != null) {
                                feg.d = wnw.e((Bitmap)entry.getValue(), feg.a, feg.b);
                                continue Label_0209;
                            }
                            continue Label_0209;
                        }
                    }
                    feg feg = null;
                    continue;
                }
            }
            for (final Map.Entry<K, feg> entry2 : udg.d.entrySet()) {
                if (entry2.getValue().d == null) {
                    final StringBuilder f = ehk.f("There is no image for ");
                    f.append(entry2.getValue().c);
                    return new oeg<udg>(new IllegalStateException(f.toString()));
                }
            }
            if (s != null) {
                vdg.b.a(s, udg);
            }
            return new oeg<udg>(udg);
        }
        catch (final IOException ex) {
            return new oeg<udg>(ex);
        }
    }
    
    public static String h(final Context context, final int n) {
        final StringBuilder f = ehk.f("rawRes");
        String s;
        if ((context.getResources().getConfiguration().uiMode & 0x30) == 0x20) {
            s = "_night_";
        }
        else {
            s = "_day_";
        }
        f.append(s);
        f.append(n);
        return f.toString();
    }
}
