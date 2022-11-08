import java.util.Dictionary;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.io.File;
import java.util.concurrent.TimeUnit;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tjy
{
    public static final v3a c;
    public final Context a;
    public final rxy b;
    
    static {
        c = new v3a("AssetPackStorage");
        final TimeUnit days = TimeUnit.DAYS;
        days.toMillis(14L);
        days.toMillis(28L);
    }
    
    public tjy(final Context a, final rxy b) {
        this.a = a;
        this.b = b;
    }
    
    public static long d(File file, final boolean b) {
        if (!file.exists()) {
            return -1L;
        }
        final ArrayList list = new ArrayList();
        if (b && file.listFiles().length > 1) {
            tjy.c.o("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            final File[] listFiles = file.listFiles();
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (!file.getName().equals("stale.tmp")) {
                    list.add(Long.valueOf(file.getName()));
                }
            }
        }
        catch (final NumberFormatException ex) {
            tjy.c.l((Throwable)ex, "Corrupt asset pack directories.", new Object[0]);
        }
        if (list.isEmpty()) {
            return -1L;
        }
        Collections.sort((List<Comparable>)list);
        return (long)list.get(list.size() - 1);
    }
    
    public static void i(final File file) {
        if (file.listFiles() != null) {
            if (file.listFiles().length > 1) {
                int i = 0;
                final long d = d(file, false);
                for (File[] listFiles = file.listFiles(); i < listFiles.length; ++i) {
                    final File file2 = listFiles[i];
                    if (!file2.getName().equals(String.valueOf(d)) && !file2.getName().equals("stale.tmp")) {
                        j(file2);
                    }
                }
            }
        }
    }
    
    public static boolean j(final File file) {
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
                n2 &= (j(listFiles[n3]) ? 1 : 0);
                ++n3;
            }
        }
        return file.delete() && n;
    }
    
    public final void a(final String s, final int n, final long n2, final int n3) throws IOException {
        final File file = new File(this.p(s, n, n2), "merge.tmp");
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("numberOfMerges", String.valueOf(n3));
        file.getParentFile().mkdirs();
        file.createNewFile();
        final FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, null);
        fileOutputStream.close();
    }
    
    public final void b(final String s, final int n, final long n2) {
        final File e = this.e(s);
        if (!e.exists()) {
            return;
        }
        for (final File file : e.listFiles()) {
            if (!file.getName().equals(String.valueOf(n)) && !file.getName().equals("stale.tmp")) {
                j(file);
            }
            else if (file.getName().equals(String.valueOf(n))) {
                for (final File file2 : file.listFiles()) {
                    if (!file2.getName().equals(String.valueOf(n2))) {
                        j(file2);
                    }
                }
            }
        }
    }
    
    public final boolean c(final String s, final int n, final long n2) {
        return !this.f(s, n, n2).exists() || j(this.f(s, n, n2));
    }
    
    public final File e(final String s) {
        return new File(this.g(), s);
    }
    
    public final File f(final String s, final int n, final long n2) {
        return new File(new File(new File(new File(this.g(), "_tmp"), s), String.valueOf(n)), String.valueOf(n2));
    }
    
    public final File g() {
        return new File(this.a.getFilesDir(), "assetpacks");
    }
    
    public final List<File> h() {
        final ArrayList list = new ArrayList();
        try {
            if (!this.g().exists() || this.g().listFiles() == null) {
                return list;
            }
            for (final File file : this.g().listFiles()) {
                if (!file.getCanonicalPath().equals(new File(this.g(), "_tmp").getCanonicalPath())) {
                    list.add(file);
                }
            }
        }
        catch (final IOException ex) {
            tjy.c.k("Could not process directory while scanning installed packs. %s", new Object[] { ex });
        }
        return list;
    }
    
    public final int k(String ex, int int1, final long n) throws IOException {
        final File file = new File(this.p((String)ex, int1, n), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        final Properties properties = new Properties();
        ex = (NumberFormatException)new FileInputStream(file);
        try {
            properties.load((InputStream)ex);
            ((InputStream)ex).close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    int1 = Integer.parseInt(properties.getProperty("numberOfMerges"));
                    return int1;
                }
                catch (final NumberFormatException ex) {
                    throw new kpy("Merge checkpoint file corrupt.", (Exception)ex);
                }
            }
            throw new kpy("Merge checkpoint file corrupt.");
        }
        finally {
            try {
                ((InputStream)ex).close();
            }
            finally {}
        }
    }
    
    public final long l(final String s) {
        return d(this.m(s, (int)d(this.e(s), true)), true);
    }
    
    public final File m(final String s, final int n) {
        return new File(this.e(s), String.valueOf(n));
    }
    
    public final File n(final String s, final int n, final long n2) {
        return new File(this.m(s, n), String.valueOf(n2));
    }
    
    public final File o(final String s, final int n, final long n2) {
        return new File(this.n(s, n, n2), "_metadata");
    }
    
    public final File p(final String s, final int n, final long n2) {
        return new File(this.f(s, n, n2), "_packs");
    }
    
    public final File q(final String s, final int n, final long n2, final String s2) {
        return new File(this.r(s, n, n2, s2), "checkpoint.dat");
    }
    
    public final File r(final String s, final int n, final long n2, final String s2) {
        return new File(new File(new File(this.f(s, n, n2), "_slices"), "_metadata"), s2);
    }
    
    public final File s(final String s, final int n, final long n2, final String s2) {
        return new File(new File(new File(this.f(s, n, n2), "_slices"), "_unverified"), s2);
    }
    
    public final File t(final String s, final int n, final long n2, final String s2) {
        return new File(new File(new File(this.f(s, n, n2), "_slices"), "_verified"), s2);
    }
    
    public final String u(final String s) throws IOException {
        final File file = new File(this.g(), s);
        if (!file.exists()) {
            tjy.c.i("Pack not found with pack name: %s", new Object[] { s });
            return null;
        }
        final File file2 = new File(file, String.valueOf(this.b.a()));
        if (!file2.exists()) {
            tjy.c.i("Pack not found with pack name: %s app version: %s", new Object[] { s, this.b.a() });
            return null;
        }
        final File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            final int length = listFiles.length;
            if (length != 0) {
                if (length > 1) {
                    tjy.c.k("Multiple pack versions found for pack name: %s app version: %s", new Object[] { s, this.b.a() });
                    return null;
                }
                return listFiles[0].getCanonicalPath();
            }
        }
        tjy.c.i("No pack version found for pack name: %s app version: %s", new Object[] { s, this.b.a() });
        return null;
    }
    
    public final Map<String, Long> v() {
        final HashMap hashMap = new HashMap();
        final Iterator iterator = ((ArrayList)this.h()).iterator();
        while (iterator.hasNext()) {
            final String name = ((File)iterator.next()).getName();
            final int n = (int)d(this.e(name), true);
            final long d = d(this.m(name, n), true);
            if (this.n(name, n, d).exists()) {
                hashMap.put(name, d);
            }
        }
        return hashMap;
    }
}
