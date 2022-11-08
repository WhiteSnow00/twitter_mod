import java.io.FilenameFilter;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.File;
import java.util.Comparator;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i17
{
    public static final Charset d;
    public static final int e;
    public static final f17 f;
    public static final Comparator<? super File> g;
    public static final g17 h;
    public final AtomicInteger a;
    public final qya b;
    public final gop c;
    
    static {
        d = Charset.forName("UTF-8");
        e = 15;
        f = new f17();
        i17.g = iwe.H0;
        h = g17.a;
    }
    
    public i17(final qya b, final gop c) {
        this.a = new AtomicInteger(0);
        this.b = b;
        this.c = c;
    }
    
    public static String e(File file) throws IOException {
        final byte[] array = new byte[8192];
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        file = (File)new FileInputStream(file);
        try {
            while (true) {
                final int read = ((FileInputStream)file).read(array);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            final String s = new String(byteArrayOutputStream.toByteArray(), i17.d);
            ((FileInputStream)file).close();
            return s;
        }
        finally {
            try {
                ((FileInputStream)file).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                t.addSuppressed(t2);
            }
        }
    }
    
    public static void f(final File file, final String s) throws IOException {
        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), i17.d);
        try {
            outputStreamWriter.write(s);
            outputStreamWriter.close();
        }
        finally {
            try {
                outputStreamWriter.close();
            }
            finally {
                final Throwable t;
                ((Throwable)file).addSuppressed(t);
            }
        }
    }
    
    public final void a(final List<File> list) {
        final Iterator<File> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public final List<File> b() {
        final ArrayList list = new ArrayList();
        list.addAll(this.b.e());
        list.addAll(this.b.c());
        final iwe g = i17.g;
        Collections.sort((List<Object>)list, (Comparator<? super Object>)g);
        final List f = this.b.f();
        Collections.sort((List<Object>)f, (Comparator<? super Object>)g);
        list.addAll(f);
        return list;
    }
    
    public final SortedSet<String> c() {
        return new TreeSet(qya.k((Object[])this.b.c.list())).descendingSet();
    }
    
    public final void d(final d17$e$d d17$e$d, final String s, final boolean b) {
        final int a = ((mnp)this.c).b().a.a;
        Objects.requireNonNull(i17.f);
        final String a2 = f17.a.a((Object)d17$e$d);
        final String format = String.format(Locale.US, "%010d", this.a.getAndIncrement());
        String s2;
        if (b) {
            s2 = "_";
        }
        else {
            s2 = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("event");
        sb.append(format);
        sb.append(s2);
        final String string = sb.toString();
        try {
            f(this.b.h(s, string), a2);
        }
        catch (final IOException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not persist event for session ");
            sb2.append(s);
            Log.w("FirebaseCrashlytics", sb2.toString(), (Throwable)ex);
        }
        final List k = qya.k((Object[])this.b.g(s).listFiles((FilenameFilter)h17.a));
        Collections.sort((List<Object>)k, (Comparator<? super Object>)uk8.H0);
        int size = k.size();
        for (final File file : k) {
            if (size <= a) {
                break;
            }
            qya.j(file);
            --size;
        }
    }
}
