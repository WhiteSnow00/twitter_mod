import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.nio.channels.FileChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsy implements any
{
    public final FileChannel a;
    public final long b;
    public final long c;
    
    public bsy(final FileChannel a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final long a() {
        return this.c;
    }
    
    @Override
    public final void b(final MessageDigest[] array, final long n, int i) throws IOException {
        final MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + n, i);
        map.load();
        int length;
        MessageDigest messageDigest;
        for (length = array.length, i = 0; i < length; ++i) {
            messageDigest = array[i];
            map.position(0);
            messageDigest.update(map);
        }
    }
}
