import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fe1
{
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    
    public fe1(final List<byte[]> a, final int b, final int c, final int d, final float e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static byte[] a(final mwj mwj) {
        final int y = mwj.y();
        final int b = mwj.b;
        mwj.E(y);
        final byte[] a = mwj.a;
        final byte[] c0 = poa.C0;
        final byte[] array = new byte[y + 4];
        System.arraycopy(c0, 0, array, 0, 4);
        System.arraycopy(a, b, array, 4, y);
        return array;
    }
    
    public static fe1 b(final mwj mwj) throws ParserException {
        try {
            mwj.E(4);
            final int n = (mwj.t() & 0x3) + 1;
            if (n != 3) {
                final ArrayList<byte[]> list = new ArrayList<byte[]>();
                final int n2 = mwj.t() & 0x1F;
                for (int i = 0; i < n2; ++i) {
                    list.add(a(mwj));
                }
                for (int t = mwj.t(), j = 0; j < t; ++j) {
                    list.add(a(mwj));
                }
                int n3 = -1;
                float g;
                String v;
                int n4;
                if (n2 > 0) {
                    final e6i$c e = e6i.e((byte[])list.get(0), n, list.get(0).length);
                    final int e2 = e.e;
                    final int f = e.f;
                    g = e.g;
                    v = poa.v(e.a, e.b, e.c);
                    n3 = e2;
                    n4 = f;
                }
                else {
                    v = null;
                    n4 = -1;
                    g = 1.0f;
                }
                return new fe1(list, n, n3, n4, g, v);
            }
            throw new IllegalStateException();
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw ParserException.a("Error parsing AVC config", (Throwable)ex);
        }
    }
}
