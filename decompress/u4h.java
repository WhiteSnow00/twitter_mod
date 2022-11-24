import java.io.IOException;
import java.io.OutputStream;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import com.facebook.imagepipeline.memory.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u4h implements grk
{
    public final jrk a;
    public final b b;
    
    public u4h(final b b, final jrk a) {
        this.b = b;
        this.a = a;
    }
    
    public final PooledByteBuffer a(final InputStream inputStream) throws IOException {
        final b b = this.b;
        final MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(b, b.P0[0]);
        try {
            this.a.a(inputStream, (OutputStream)memoryPooledByteBufferOutputStream);
            return (PooledByteBuffer)memoryPooledByteBufferOutputStream.b();
        }
        finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
    
    public final PooledByteBuffer b(final InputStream inputStream, final int n) throws IOException {
        final MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.b, n);
        try {
            this.a.a(inputStream, (OutputStream)memoryPooledByteBufferOutputStream);
            return (PooledByteBuffer)memoryPooledByteBufferOutputStream.b();
        }
        finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }
    
    public final irk c() {
        final b b = this.b;
        return (irk)new MemoryPooledByteBufferOutputStream(b, b.P0[0]);
    }
    
    public final PooledByteBuffer d(final byte[] array) {
        final MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.b, array.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(array, 0, array.length);
                final t4h b = memoryPooledByteBufferOutputStream.b();
                memoryPooledByteBufferOutputStream.close();
                return (PooledByteBuffer)b;
            }
            finally {}
        }
        catch (final IOException ex) {
            lp7.s0((Throwable)ex);
            throw new RuntimeException(ex);
        }
        memoryPooledByteBufferOutputStream.close();
    }
    
    public final irk e(final int n) {
        return (irk)new MemoryPooledByteBufferOutputStream(this.b, n);
    }
}
