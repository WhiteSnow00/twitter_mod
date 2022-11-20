import java.io.IOException;
import java.util.Objects;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwa implements v9i
{
    public final File a;
    public final String b;
    public final String c;
    
    public vwa(final String b, final String c, final File a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public final InputStream i() {
        Label_0037: {
            if (!this.a.exists()) {
                break Label_0037;
            }
            if (!this.a.isFile()) {
                break Label_0037;
            }
            try {
                return new FileInputStream(this.a);
                return null;
            }
            catch (final FileNotFoundException ex) {
                return null;
            }
        }
    }
    
    public final i07$d$a j() {
        final byte[] array = new byte[8192];
        Object b = null;
        while (true) {
            try {
                final InputStream i = this.i();
                try {
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        if (i == null) {
                            gzipOutputStream.close();
                            byteArrayOutputStream.close();
                            if (i != null) {
                                i.close();
                            }
                        }
                        else {
                            Label_0064: {
                                break Label_0064;
                                try {
                                    while (true) {
                                        final int read = i.read(array);
                                        if (read <= 0) {
                                            break;
                                        }
                                        gzipOutputStream.write(array, 0, read);
                                    }
                                    gzipOutputStream.finish();
                                    byteArrayOutputStream.toByteArray();
                                    gzipOutputStream.close();
                                    byteArrayOutputStream.close();
                                    i.close();
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
                }
                finally {
                    if (i != null) {
                        try {
                            i.close();
                        }
                        finally {
                            final Throwable t5;
                            final Throwable t6;
                            t5.addSuppressed(t6);
                        }
                    }
                }
                final Throwable t5 = null;
                if (t5 != null) {
                    b = this.b;
                    Objects.requireNonNull(b, "Null filename");
                    b = new aa1((String)b, (byte[])(Object)t5);
                }
                return (i07$d$a)b;
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final String k() {
        return this.c;
    }
}
