import java.io.IOException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ely extends zky
{
    public ely(final String s, final String s2, @NullableDecl final Character c) {
        final wky wky = new wky(s, s2.toCharArray());
        super(wky, c);
        r1n.s0(wky.b.length == 64);
    }
    
    @Override
    public final void b(final Appendable appendable, final byte[] array, int i) throws IOException {
        final int n = i + 0;
        final int length = array.length;
        int n2 = 0;
        r1n.r0(0, n, length);
        while (i >= 3) {
            final int n3 = n2 + 1;
            final byte b = array[n2];
            final int n4 = n3 + 1;
            final byte b2 = array[n3];
            n2 = n4 + 1;
            final int n5 = (b2 & 0xFF) << 8 | (b & 0xFF) << 16 | (array[n4] & 0xFF);
            final char c = super.a.b[n5 >>> 18];
            final StringBuilder sb = (StringBuilder)appendable;
            sb.append(c);
            sb.append(super.a.b[n5 >>> 12 & 0x3F]);
            sb.append(super.a.b[n5 >>> 6 & 0x3F]);
            sb.append(super.a.b[n5 & 0x3F]);
            i -= 3;
        }
        if (n2 < n) {
            this.c(appendable, array, n2, n - n2);
        }
    }
}
