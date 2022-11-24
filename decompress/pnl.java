import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnl
{
    public static byte[] a(final UUID uuid, final byte[] array) {
        int length;
        if (array != null) {
            length = array.length;
        }
        else {
            length = 0;
        }
        length += 32;
        final ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (array != null && array.length != 0) {
            allocate.putInt(array.length);
            allocate.put(array);
        }
        return allocate.array();
    }
    
    public static a b(final byte[] array) {
        final gxj gxj = new gxj(array);
        if (gxj.c < 32) {
            return null;
        }
        gxj.D(0);
        if (gxj.e() != gxj.c - gxj.b + 4) {
            return null;
        }
        if (gxj.e() != 1886614376) {
            return null;
        }
        final int n = gxj.e() >> 24 & 0xFF;
        if (n > 1) {
            d10.F(37, "Unsupported pssh version: ", n, "PsshAtomUtil");
            return null;
        }
        final UUID uuid = new UUID(gxj.m(), gxj.m());
        if (n == 1) {
            gxj.E(gxj.w() * 16);
        }
        final int w = gxj.w();
        if (w != gxj.c - gxj.b) {
            return null;
        }
        final byte[] array2 = new byte[w];
        gxj.d(array2, 0, w);
        return new a(uuid, n, array2);
    }
    
    public static byte[] c(final byte[] array, final UUID uuid) {
        final a b = b(array);
        if (b == null) {
            return null;
        }
        if (!uuid.equals(b.a)) {
            final String value = String.valueOf(uuid);
            final String value2 = String.valueOf(b.a);
            final StringBuilder k = tf8.k(value2.length() + (value.length() + 33), "UUID mismatch. Expected: ", value, ", got: ", value2);
            k.append(".");
            Log.w("PsshAtomUtil", k.toString());
            return null;
        }
        return b.c;
    }
    
    public static final class a
    {
        public final UUID a;
        public final int b;
        public final byte[] c;
        
        public a(final UUID a, final int b, final byte[] c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
