import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uml
{
    public final x9t a;
    public final rwj b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;
    
    public uml() {
        this.a = new x9t(0L);
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.b = new rwj();
    }
    
    public static long c(final rwj rwj) {
        final int b = rwj.b;
        if (rwj.c - b < 9) {
            return -9223372036854775807L;
        }
        final byte[] array = new byte[9];
        rwj.d(array, 0, 9);
        rwj.D(b);
        boolean b2 = false;
        Label_0106: {
            if ((array[0] & 0xC4) == 0x44) {
                if ((array[2] & 0x4) == 0x4) {
                    if ((array[4] & 0x4) == 0x4) {
                        if ((array[5] & 0x1) == 0x1) {
                            if ((array[8] & 0x3) == 0x3) {
                                b2 = true;
                                break Label_0106;
                            }
                        }
                    }
                }
            }
            b2 = false;
        }
        if (!b2) {
            return -9223372036854775807L;
        }
        return ((long)array[0] & 0x38L) >> 3 << 30 | ((long)array[0] & 0x3L) << 28 | ((long)array[1] & 0xFFL) << 20 | ((long)array[2] & 0xF8L) >> 3 << 15 | ((long)array[2] & 0x3L) << 13 | ((long)array[3] & 0xFFL) << 5 | ((long)array[4] & 0xF8L) >> 3;
    }
    
    public final void a(final jna jna) {
        final rwj b = this.b;
        final byte[] f = cnw.f;
        Objects.requireNonNull(b);
        b.B(f, f.length);
        this.c = true;
        jna.e();
    }
    
    public final int b(final byte[] array, final int n) {
        return (array[n + 3] & 0xFF) | ((array[n] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8);
    }
}
