import java.io.IOException;
import java.security.MessageDigest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djy implements koy
{
    public final ByteBuffer a;
    
    public djy(final ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }
    
    public final long a() {
        return this.a.capacity();
    }
    
    public final void b(final MessageDigest[] array, final long n, int i) throws IOException {
        Object a = this.a;
        synchronized (a) {
            final ByteBuffer a2 = this.a;
            final int n2 = (int)n;
            a2.position(n2);
            this.a.limit(n2 + i);
            final ByteBuffer slice = this.a.slice();
            monitorexit(a);
            int length;
            for (length = array.length, i = 0; i < length; ++i) {
                a = array[i];
                slice.position(0);
                ((MessageDigest)a).update(slice);
            }
        }
    }
}
