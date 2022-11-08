import java.io.IOException;
import java.io.OutputStream;
import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import com.facebook.imagepipeline.memory.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4h implements lqk
{
    public final oqk a;
    public final b b;
    
    public c4h(final b b, final oqk a) {
        this.b = b;
        this.a = a;
    }
    
    public final PooledByteBuffer a(final InputStream inputStream) throws IOException {
        final b b = this.b;
        final MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(b, b.M0[0]);
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
    
    public final nqk c() {
        final b b = this.b;
        return (nqk)new MemoryPooledByteBufferOutputStream(b, b.M0[0]);
    }
    
    public final PooledByteBuffer d(final byte[] array) {
        final MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.b, array.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(array, 0, array.length);
                final b4h b = memoryPooledByteBufferOutputStream.b();
                memoryPooledByteBufferOutputStream.close();
                return (PooledByteBuffer)b;
            }
            finally {}
        }
        catch (final IOException ex) {
            lux.i(ex);
            throw new RuntimeException(ex);
        }
        memoryPooledByteBufferOutputStream.close();
    }
    
    public final nqk e(final int n) {
        return (nqk)new MemoryPooledByteBufferOutputStream(this.b, n);
    }
}
