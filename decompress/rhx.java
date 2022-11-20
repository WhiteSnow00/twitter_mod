import com.google.android.exoplayer2.ParserException;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rhx
{
    public static int a(int i) {
        int n = 0;
        while (i > 0) {
            ++n;
            i >>>= 1;
        }
        return n;
    }
    
    public static z8h b(final List<String> list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            final int a = cnw.a;
            final String[] split = s.split("=", 2);
            if (split.length != 2) {
                String concat;
                if (s.length() != 0) {
                    concat = "Failed to parse Vorbis comment: ".concat(s);
                }
                else {
                    concat = new String("Failed to parse Vorbis comment: ");
                }
                Log.w("VorbisUtil", concat);
            }
            else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    list2.add(uck.a(new rwj(Base64.decode(split[1], 0))));
                }
                catch (final RuntimeException ex) {
                    g63.f0("VorbisUtil", "Failed to parse vorbis picture", (Throwable)ex);
                }
            }
            else {
                list2.add(new phx(split[0], split[1]));
            }
        }
        z8h z8h;
        if (list2.isEmpty()) {
            z8h = null;
        }
        else {
            z8h = new z8h((List)list2);
        }
        return z8h;
    }
    
    public static a c(final rwj rwj, final boolean b, final boolean b2) throws ParserException {
        int n = 0;
        if (b) {
            d(3, rwj, false);
        }
        rwj.q((int)rwj.j());
        final long j = rwj.j();
        final String[] array = new String[(int)j];
        while (n < j) {
            (array[n] = rwj.q((int)rwj.j())).length();
            ++n;
        }
        if (b2 && (rwj.t() & 0x1) == 0x0) {
            throw ParserException.a("framing bit expected to be set", (Throwable)null);
        }
        return new a(array);
    }
    
    public static boolean d(final int n, final rwj rwj, final boolean b) throws ParserException {
        final int c = rwj.c;
        final int b2 = rwj.b;
        if (c - b2 < 7) {
            if (b) {
                return false;
            }
            final StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(c - b2);
            throw ParserException.a(sb.toString(), (Throwable)null);
        }
        else if (rwj.t() != n) {
            if (b) {
                return false;
            }
            final String value = String.valueOf(Integer.toHexString(n));
            String concat;
            if (value.length() != 0) {
                concat = "expected header type ".concat(value);
            }
            else {
                concat = new String("expected header type ");
            }
            throw ParserException.a(concat, (Throwable)null);
        }
        else {
            if (rwj.t() == 118 && rwj.t() == 111 && rwj.t() == 114 && rwj.t() == 98 && rwj.t() == 105 && rwj.t() == 115) {
                return true;
            }
            if (b) {
                return false;
            }
            throw ParserException.a("expected characters 'vorbis'", (Throwable)null);
        }
    }
    
    public static final class a
    {
        public final String[] a;
        
        public a(final String[] a) {
            this.a = a;
        }
    }
    
    public static final class b
    {
        public final boolean a;
        
        public b(final boolean a) {
            this.a = a;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        
        public c(final int a, final int b, final int c, final int d, final int e, final int f, final byte[] g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
}
