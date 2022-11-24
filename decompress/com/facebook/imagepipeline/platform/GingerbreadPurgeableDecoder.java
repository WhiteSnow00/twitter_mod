// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.imagepipeline.platform;

import java.io.FileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.io.IOException;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;
import java.io.InputStream;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.reflect.Method;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

@m59
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder
{
    public static Method d;
    public final box c;
    
    @m59
    public GingerbreadPurgeableDecoder() {
        this.c = cox.c();
    }
    
    public static MemoryFile g(final cj4<PooledByteBuffer> cj4, final int n, final byte[] array) throws IOException {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        Closeable closeable = null;
        final InputStream inputStream = null;
        final MemoryFile memoryFile = new MemoryFile((String)null, length + n);
        memoryFile.allowPurging(false);
        InputStream inputStream2;
        OutputStream outputStream2;
        Closeable closeable3;
        try {
            final hrk hrk = new hrk((PooledByteBuffer)cj4.h());
            try {
                final gdf gdf = new gdf((InputStream)hrk, n);
                OutputStream outputStream = (OutputStream)inputStream;
                try {
                    closeable = (outputStream = memoryFile.getOutputStream());
                    Objects.requireNonNull(closeable);
                    outputStream = (OutputStream)closeable;
                    final byte[] array2 = new byte[4096];
                    while (true) {
                        outputStream = (OutputStream)closeable;
                        final int read = ((InputStream)gdf).read(array2);
                        if (read == -1) {
                            break;
                        }
                        outputStream = (OutputStream)closeable;
                        ((OutputStream)closeable).write(array2, 0, read);
                    }
                    if (array != null) {
                        outputStream = (OutputStream)closeable;
                        memoryFile.writeBytes(array, 0, n, array.length);
                    }
                    cj4.e(cj4);
                    gj4.b((InputStream)hrk);
                    gj4.b((InputStream)gdf);
                    gj4.a(closeable);
                    return memoryFile;
                }
                finally {
                    closeable = outputStream;
                }
            }
            finally {
                closeable = null;
            }
        }
        finally {
            inputStream2 = null;
            final Closeable closeable2 = null;
            outputStream2 = (OutputStream)closeable;
            closeable3 = closeable2;
        }
        cj4.e(cj4);
        gj4.b((InputStream)outputStream2);
        gj4.b(inputStream2);
        gj4.a(closeable3);
    }
    
    public final Bitmap c(final cj4<PooledByteBuffer> cj4, final BitmapFactory$Options bitmapFactory$Options) {
        return this.h(cj4, cj4.h().size(), null, bitmapFactory$Options);
    }
    
    public final Bitmap d(final cj4<PooledByteBuffer> cj4, final int n, final BitmapFactory$Options bitmapFactory$Options) {
        byte[] b;
        if (DalvikPurgeableDecoder.e((cj4)cj4, n)) {
            b = null;
        }
        else {
            b = DalvikPurgeableDecoder.b;
        }
        return this.h(cj4, n, b, bitmapFactory$Options);
    }
    
    public final Bitmap h(final cj4<PooledByteBuffer> cj4, final int n, final byte[] array, final BitmapFactory$Options bitmapFactory$Options) {
        MemoryFile memoryFile = null;
        Label_0115: {
            try {
                final MemoryFile g;
                final MemoryFile memoryFile2 = memoryFile = (g = g(cj4, n, array));
                final FileDescriptor i = this.i(memoryFile2);
                memoryFile = memoryFile2;
                final box c = this.c;
                if (c != null) {
                    memoryFile = memoryFile2;
                    final Bitmap a = c.a(i, bitmapFactory$Options);
                    memoryFile = memoryFile2;
                    xd.K(a, "BitmapFactory returned null");
                    memoryFile2.close();
                    return a;
                }
                memoryFile = memoryFile2;
                memoryFile = memoryFile2;
                final IllegalStateException ex = new IllegalStateException("WebpBitmapFactory is null");
                memoryFile = memoryFile2;
                throw ex;
            }
            catch (final IOException ex2) {
                break Label_0115;
            }
            finally {
                if (memoryFile != null) {
                    memoryFile.close();
                }
                final IOException ex2;
                lp7.s0((Throwable)ex2);
                throw new RuntimeException(ex2);
            }
        }
    }
    
    public final FileDescriptor i(final MemoryFile memoryFile) {
        try {
            monitorenter(this);
            try {
                if (GingerbreadPurgeableDecoder.d == null) {
                    try {
                        GingerbreadPurgeableDecoder.d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", (Class<?>[])new Class[0]);
                    }
                    catch (final Exception ex) {
                        lp7.s0((Throwable)ex);
                        throw new RuntimeException(ex);
                    }
                }
                final Method d = GingerbreadPurgeableDecoder.d;
                monitorexit(this);
                final Object invoke = d.invoke(memoryFile, new Object[0]);
                Objects.requireNonNull(invoke);
                return (FileDescriptor)invoke;
            }
            finally {
                try {
                    monitorexit(this);
                }
                catch (final Exception ex2) {
                    lp7.s0((Throwable)ex2);
                    throw new RuntimeException(ex2);
                }
            }
        }
        catch (final Exception ex3) {}
    }
}
