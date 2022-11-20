import java.util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ulz
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
        final joz d = ((loz)o).d();
        final loz loz = (loz)o2;
        final qfz qfz = (qfz)d;
        Objects.requireNonNull(qfz);
        final akz akz = (akz)qfz;
        if (akz.D0.getClass().isInstance(loz)) {
            akz.h((clz)loz);
            return akz.k();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
