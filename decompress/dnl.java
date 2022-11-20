import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnl
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
        final rwj rwj = new rwj(array);
        if (rwj.c < 32) {
            return null;
        }
        rwj.D(0);
        if (rwj.e() != rwj.c - rwj.b + 4) {
            return null;
        }
        if (rwj.e() != 1886614376) {
            return null;
        }
        final int n = rwj.e() >> 24 & 0xFF;
        if (n > 1) {
            mw.A(37, "Unsupported pssh version: ", n, "PsshAtomUtil");
            return null;
        }
        final UUID uuid = new UUID(rwj.m(), rwj.m());
        if (n == 1) {
            rwj.E(rwj.w() * 16);
        }
        final int w = rwj.w();
        if (w != rwj.c - rwj.b) {
            return null;
        }
        final byte[] array2 = new byte[w];
        rwj.d(array2, 0, w);
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
            final StringBuilder d = x70.D(value2.length() + (value.length() + 33), "UUID mismatch. Expected: ", value, ", got: ", value2);
            d.append(".");
            Log.w("PsshAtomUtil", d.toString());
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
