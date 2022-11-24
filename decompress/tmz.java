import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tmz
{
    public static final Charset a;
    public static final byte[] b;
    
    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        ByteBuffer.wrap(b = new byte[0]);
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 1231;
        }
        return 1237;
    }
    
    public static int b(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static Object c(final Object o, final Object o2) {
        final ipz d = ((kpz)o).d();
        final kpz kpz = (kpz)o2;
        final pgz pgz = (pgz)d;
        Objects.requireNonNull(pgz);
        final zkz zkz = (zkz)pgz;
        if (zkz.F0.getClass().isInstance(kpz)) {
            zkz.h((bmz)kpz);
            return zkz.k();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
