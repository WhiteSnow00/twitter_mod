import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zxy
{
    public final long a;
    public final Context b;
    public File c;
    
    public zxy(final Context b) throws PackageManager$NameNotFoundException {
        this.b = b;
        this.a = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
    }
    
    public static void e(final File file) throws IOException {
        if (file.isDirectory()) {
            final File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int length = listFiles.length, i = 0; i < length; ++i) {
                    e(listFiles[i]);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }
    
    public static File f(final File file, final String s) throws IOException {
        final File file2 = new File(file, s);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }
    
    public static File j(final File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return file;
            }
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
        else {
            file.mkdirs();
            if (!file.isDirectory()) {
                final String value = String.valueOf(file.getAbsolutePath());
                String concat;
                if (value.length() != 0) {
                    concat = "Unable to create directory: ".concat(value);
                }
                else {
                    concat = new String("Unable to create directory: ");
                }
                throw new IOException(concat);
            }
            return file;
        }
    }
    
    public final File a() throws IOException {
        final File file = new File(this.l(), "unverified-splits");
        j(file);
        return file;
    }
    
    public final File b(final String s) throws IOException {
        return f(this.i(), String.valueOf(s).concat(".apk"));
    }
    
    public final Set<wyz> c() throws IOException {
        final File i = this.i();
        final HashSet set = new HashSet();
        final File[] listFiles = i.listFiles();
        if (listFiles != null) {
            for (final File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk") && (file.canWrite() ^ true)) {
                    final String name = file.getName();
                    set.add(new gjy(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return set;
    }
    
    public final void d() throws IOException {
        final File k = this.k();
        final String[] list = k.list();
        if (list != null) {
            for (final String s : list) {
                if (!s.equals(Long.toString(this.a))) {
                    final File file = new File(k, s);
                    final String value = String.valueOf(file);
                    final long a = this.a;
                    final StringBuilder sb = new StringBuilder(value.length() + 118);
                    ffe.q(sb, "FileStorage: removing directory for different version code (directory = ", value, ", current version code = ");
                    sb.append(a);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    e(file);
                }
            }
        }
    }
    
    public final File g() throws IOException {
        final File file = new File(this.l(), "native-libraries");
        j(file);
        return file;
    }
    
    public final File h(final String s) throws IOException {
        final File f = f(this.g(), s);
        j(f);
        return f;
    }
    
    public final File i() throws IOException {
        final File file = new File(this.l(), "verified-splits");
        j(file);
        return file;
    }
    
    public final File k() throws IOException {
        if (this.c == null) {
            final Context b = this.b;
            if (b == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = b.getFilesDir();
        }
        final File file = new File(this.c, "splitcompat");
        j(file);
        return file;
    }
    
    public final File l() throws IOException {
        final File file = new File(this.k(), Long.toString(this.a));
        j(file);
        return file;
    }
}
