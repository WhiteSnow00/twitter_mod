import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d73 implements oai
{
    public final byte[] a;
    
    public d73(final byte[] a) {
        this.a = a;
    }
    
    @Override
    public final InputStream h() {
        final byte[] a = this.a;
        InputStream inputStream;
        if (a == null || a.length == 0) {
            inputStream = null;
        }
        else {
            inputStream = new ByteArrayInputStream(this.a);
        }
        return inputStream;
    }
    
    @Override
    public final o17$d$a i() {
        final byte[] a = this.a;
        final boolean b = a == null || a.length == 0;
        final o17$d$a o17$d$a = null;
        while (true) {
            if (b) {
                break Label_0126;
            }
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gzipOutputStream.write(this.a);
                        gzipOutputStream.finish();
                        byteArrayOutputStream.toByteArray();
                        gzipOutputStream.close();
                        byteArrayOutputStream.close();
                    }
                    finally {
                        try {
                            gzipOutputStream.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
                finally {
                    try {
                        byteArrayOutputStream.close();
                    }
                    finally {
                        final Throwable t3;
                        final Throwable t4;
                        t3.addSuppressed(t4);
                    }
                }
                final Throwable t3 = null;
                o17$d$a o17$d$a2;
                if (t3 == null) {
                    o17$d$a2 = o17$d$a;
                }
                else {
                    o17$d$a2 = new ea1("logs_file", (byte[])(Object)t3);
                }
                return o17$d$a2;
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final String j() {
        return "logs";
    }
}
