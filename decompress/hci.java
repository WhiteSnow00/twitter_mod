import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.File;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hci
{
    public final xdg a;
    
    public hci(final xdg a) {
        this.a = a;
    }
    
    public static String a(String s, final gya gya, final boolean b) {
        final StringBuilder g = w48.g("lottie_cache_");
        g.append(s.replaceAll("\\W+", ""));
        if (b) {
            Objects.requireNonNull(gya);
            final StringBuilder sb = new StringBuilder();
            sb.append(".temp");
            sb.append(gya.C0);
            s = sb.toString();
        }
        else {
            s = gya.C0;
        }
        g.append(s);
        return g.toString();
    }
    
    public final File b() {
        final bte bte = (bte)this.a;
        Objects.requireNonNull(bte);
        final File file = new File(bte.a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
    
    public final File c(String a, final InputStream inputStream, final gya gya) throws IOException {
        a = a((String)a, gya, true);
        final File file = new File(this.b(), (String)a);
        try {
            a = new FileOutputStream(file);
            try {
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = inputStream.read(array);
                    if (read == -1) {
                        break;
                    }
                    ((OutputStream)a).write(array, 0, read);
                }
                ((OutputStream)a).flush();
                return file;
            }
            finally {
                ((OutputStream)a).close();
            }
        }
        finally {
            inputStream.close();
        }
    }
}
