import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import android.util.Log;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jx0
{
    public final File a;
    public final File b;
    public final File c;
    
    public jx0(final File a) {
        this.a = a;
        final StringBuilder sb = new StringBuilder();
        sb.append(a.getPath());
        sb.append(".new");
        this.b = new File(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(a.getPath());
        sb2.append(".bak");
        this.c = new File(sb2.toString());
    }
    
    public static void a(final File file, final File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete file which is a directory ");
            sb.append(file2);
            Log.e("AtomicFile", sb.toString());
        }
        if (!file.renameTo(file2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to rename ");
            sb2.append(file);
            sb2.append(" to ");
            sb2.append(file2);
            Log.e("AtomicFile", sb2.toString());
        }
    }
    
    public final FileOutputStream b() throws IOException {
        if (this.c.exists()) {
            a(this.c, this.a);
        }
        try {
            return new FileOutputStream(this.b);
        }
        catch (final FileNotFoundException ex) {
            if (this.b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.b);
                }
                catch (final FileNotFoundException ex2) {
                    final StringBuilder j = fu8.j("Failed to create new file ");
                    j.append(this.b);
                    throw new IOException(j.toString(), ex2);
                }
            }
            final StringBuilder i = fu8.j("Failed to create directory for ");
            i.append(this.b);
            throw new IOException(i.toString());
        }
    }
}
