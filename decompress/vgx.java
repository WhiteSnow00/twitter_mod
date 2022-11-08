import com.google.android.exoplayer2.ParserException;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgx
{
    public static int a(int i) {
        int n = 0;
        while (i > 0) {
            ++n;
            i >>>= 1;
        }
        return n;
    }
    
    public static x8h b(final List<String> list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            final int a = imw.a;
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
                    list2.add(pck.a(new mwj(Base64.decode(split[1], 0))));
                }
                catch (final RuntimeException ex) {
                    dml.F0("VorbisUtil", "Failed to parse vorbis picture", (Throwable)ex);
                }
            }
            else {
                list2.add(new tgx(split[0], split[1]));
            }
        }
        x8h x8h;
        if (list2.isEmpty()) {
            x8h = null;
        }
        else {
            x8h = new x8h((List)list2);
        }
        return x8h;
    }
    
    public static a c(final mwj mwj, final boolean b, final boolean b2) throws ParserException {
        int n = 0;
        if (b) {
            d(3, mwj, false);
        }
        mwj.q((int)mwj.j());
        final long j = mwj.j();
        final String[] array = new String[(int)j];
        while (n < j) {
            (array[n] = mwj.q((int)mwj.j())).length();
            ++n;
        }
        if (b2 && (mwj.t() & 0x1) == 0x0) {
            throw ParserException.a("framing bit expected to be set", (Throwable)null);
        }
        return new a(array);
    }
    
    public static boolean d(final int n, final mwj mwj, final boolean b) throws ParserException {
        final int c = mwj.c;
        final int b2 = mwj.b;
        if (c - b2 < 7) {
            if (b) {
                return false;
            }
            final StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(c - b2);
            throw ParserException.a(sb.toString(), (Throwable)null);
        }
        else if (mwj.t() != n) {
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
            if (mwj.t() == 118 && mwj.t() == 111 && mwj.t() == 114 && mwj.t() == 98 && mwj.t() == 105 && mwj.t() == 115) {
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
