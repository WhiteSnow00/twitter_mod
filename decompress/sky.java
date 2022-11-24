import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sky extends zky
{
    public final char[] d;
    
    public sky() {
        final wky wky = new wky("base16()", "0123456789ABCDEF".toCharArray());
        super(wky, null);
        this.d = new char[512];
        final int length = wky.b.length;
        int i = 0;
        r1n.s0(length == 16);
        while (i < 256) {
            final char[] d = this.d;
            final char[] b = wky.b;
            d[i] = b[i >>> 4];
            d[i | 0x100] = b[i & 0xF];
            ++i;
        }
    }
    
    @Override
    public final void b(final Appendable appendable, final byte[] array, final int n) throws IOException {
        final int length = array.length;
        int i = 0;
        r1n.r0(0, n + 0, length);
        while (i < n) {
            final int n2 = array[i + 0] & 0xFF;
            final char c = this.d[n2];
            final StringBuilder sb = (StringBuilder)appendable;
            sb.append(c);
            sb.append(this.d[n2 | 0x100]);
            ++i;
        }
    }
}
