import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjx
{
    public static boolean a(final roa roa) throws IOException {
        final gxj gxj = new gxj(8);
        final int a = wjx.a.a(roa, gxj).a;
        if (a != 1380533830 && a != 1380333108) {
            return false;
        }
        roa.n(gxj.a, 0, 4);
        gxj.D(0);
        final int e = gxj.e();
        if (e != 1463899717) {
            final StringBuilder sb = new StringBuilder(34);
            sb.append("Unsupported form type: ");
            sb.append(e);
            Log.e("WavHeaderReader", sb.toString());
            return false;
        }
        return true;
    }
    
    public static a b(int a, final roa roa, final gxj gxj) throws IOException {
        a a2 = wjx.a.a(roa, gxj);
        while (true) {
            final int a3 = a2.a;
            if (a3 == a) {
                return a2;
            }
            d10.F(39, "Ignoring unknown WAV chunk: ", a3, "WavHeaderReader");
            final long n = a2.b + 8L;
            if (n > 2147483647L) {
                a = a2.a;
                final StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(a);
                throw ParserException.c(sb.toString());
            }
            roa.k((int)n);
            a2 = wjx.a.a(roa, gxj);
        }
    }
    
    public static final class a
    {
        public final int a;
        public final long b;
        
        public a(final int a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        public static a a(final roa roa, final gxj gxj) throws IOException {
            roa.n(gxj.a, 0, 8);
            gxj.D(0);
            return new a(gxj.e(), gxj.j());
        }
    }
}
