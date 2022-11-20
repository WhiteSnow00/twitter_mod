import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.util.Log;
import android.app.Application;
import android.os.Build$VERSION;
import android.content.Context;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxa
{
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    
    public nxa(final Context context) {
        final File filesDir = context.getFilesDir();
        this.a = filesDir;
        String string;
        if (Build$VERSION.SDK_INT >= 28) {
            final StringBuilder j = fu8.j(".com.google.firebase.crashlytics.files.v2");
            j.append(File.pathSeparator);
            j.append(Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_"));
            string = j.toString();
        }
        else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        final File b = new File(filesDir, string);
        i(b);
        this.b = b;
        final File c = new File(b, "open-sessions");
        i(c);
        this.c = c;
        final File d = new File(b, "reports");
        i(d);
        this.d = d;
        final File e = new File(b, "priority-reports");
        i(e);
        this.e = e;
        final File f = new File(b, "native-reports");
        i(f);
        this.f = f;
    }
    
    public static File i(final File file) {
        synchronized (nxa.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected non-directory file: ");
                sb.append(file);
                sb.append("; deleting file and creating new directory.");
                final String string = sb.toString();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", string, (Throwable)null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not create Crashlytics-specific directory: ");
                sb2.append(file);
                Log.e("FirebaseCrashlytics", sb2.toString(), (Throwable)null);
            }
            return file;
        }
    }
    
    public static boolean j(final File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                j(listFiles[i]);
            }
        }
        return file.delete();
    }
    
    public static <T> List<T> k(final T[] array) {
        Object o;
        if (array == null) {
            o = Collections.emptyList();
        }
        else {
            o = Arrays.asList(array);
        }
        return (List<T>)o;
    }
    
    public final void a(final File file) {
        if (file.exists() && j(file)) {
            final StringBuilder j = fu8.j("Deleted previous Crashlytics file system: ");
            j.append(file.getPath());
            final String string = j.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string, (Throwable)null);
            }
        }
    }
    
    public final File b(final String s) {
        return new File(this.b, s);
    }
    
    public final List<File> c() {
        return k(this.f.listFiles());
    }
    
    public final File d(final String s) {
        final File file = new File(this.g(s), "native");
        file.mkdirs();
        return file;
    }
    
    public final List<File> e() {
        return k(this.e.listFiles());
    }
    
    public final List<File> f() {
        return k(this.d.listFiles());
    }
    
    public final File g(final String s) {
        final File file = new File(this.c, s);
        file.mkdirs();
        return file;
    }
    
    public final File h(final String s, final String s2) {
        return new File(this.g(s), s2);
    }
}
