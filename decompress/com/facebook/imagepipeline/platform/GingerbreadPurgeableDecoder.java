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

@x49
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder
{
    public static Method d;
    public final smx c;
    
    @x49
    public GingerbreadPurgeableDecoder() {
        this.c = tmx.c();
    }
    
    public static MemoryFile g(final wi4<PooledByteBuffer> wi4, final int n, final byte[] array) throws IOException {
        int length;
        if (array == null) {
            length = 0;
        }
        else {
            length = array.length;
        }
        Closeable outputStream = null;
        Closeable closeable = null;
        final InputStream inputStream = null;
        final MemoryFile memoryFile = new MemoryFile((String)null, length + n);
        memoryFile.allowPurging(false);
        InputStream inputStream2;
        try {
            final mqk mqk = new mqk((PooledByteBuffer)wi4.h());
            try {
                final xcf xcf = new xcf((InputStream)mqk, n);
                outputStream = inputStream;
                try {
                    closeable = (outputStream = memoryFile.getOutputStream());
                    Objects.requireNonNull(closeable);
                    outputStream = closeable;
                    final byte[] array2 = new byte[4096];
                    while (true) {
                        outputStream = closeable;
                        final int read = ((InputStream)xcf).read(array2);
                        if (read == -1) {
                            break;
                        }
                        outputStream = closeable;
                        ((OutputStream)closeable).write(array2, 0, read);
                    }
                    if (array != null) {
                        outputStream = closeable;
                        memoryFile.writeBytes(array, 0, n, array.length);
                    }
                    wi4.e((wi4)wi4);
                    aj4.b((InputStream)mqk);
                    aj4.b((InputStream)xcf);
                    aj4.a(closeable);
                    return memoryFile;
                }
                finally {
                    closeable = outputStream;
                    outputStream = (Closeable)xcf;
                }
            }
            finally {
                closeable = null;
            }
            closeable = mqk;
        }
        finally {
            inputStream2 = null;
        }
        wi4.e((wi4)wi4);
        aj4.b((InputStream)closeable);
        aj4.b(inputStream2);
        aj4.a((Closeable)inputStream2);
    }
    
    public final Bitmap c(final wi4<PooledByteBuffer> wi4, final BitmapFactory$Options bitmapFactory$Options) {
        return this.h(wi4, ((PooledByteBuffer)wi4.h()).size(), null, bitmapFactory$Options);
    }
    
    public final Bitmap d(final wi4<PooledByteBuffer> wi4, final int n, final BitmapFactory$Options bitmapFactory$Options) {
        byte[] b;
        if (DalvikPurgeableDecoder.e((wi4)wi4, n)) {
            b = null;
        }
        else {
            b = DalvikPurgeableDecoder.b;
        }
        return this.h(wi4, n, b, bitmapFactory$Options);
    }
    
    public final Bitmap h(final wi4<PooledByteBuffer> wi4, final int n, final byte[] array, final BitmapFactory$Options bitmapFactory$Options) {
        MemoryFile memoryFile = null;
        Label_0116: {
            try {
                final MemoryFile g;
                final MemoryFile memoryFile2 = memoryFile = (g = g(wi4, n, array));
                final FileDescriptor i = this.i(memoryFile2);
                memoryFile = memoryFile2;
                final smx c = this.c;
                if (c != null) {
                    memoryFile = memoryFile2;
                    final Bitmap a = c.a(i, bitmapFactory$Options);
                    memoryFile = memoryFile2;
                    ri4.s((Object)a, (Object)"BitmapFactory returned null");
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
                break Label_0116;
            }
            finally {
                if (memoryFile != null) {
                    memoryFile.close();
                }
                final IOException ex2;
                lux.i(ex2);
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
                        lux.i(ex);
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
                    lux.i(ex2);
                    throw new RuntimeException(ex2);
                }
            }
        }
        catch (final Exception ex3) {}
    }
}
