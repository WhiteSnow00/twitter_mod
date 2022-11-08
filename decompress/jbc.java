import com.google.android.exoplayer2.n;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.Arrays;
import java.util.Objects;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbc implements oy9
{
    public static final float[] l;
    public final daw a;
    public final mwj b;
    public final boolean[] c;
    public final a d;
    public final d6i e;
    public b f;
    public long g;
    public String h;
    public ovt i;
    public boolean j;
    public long k;
    
    static {
        l = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f };
    }
    
    public jbc(final daw a) {
        this.a = a;
        this.c = new boolean[4];
        this.d = new a();
        this.k = -9223372036854775807L;
        this.e = new d6i(178);
        this.b = new mwj();
    }
    
    public final void a(final mwj mwj) {
        ri4.y((Object)this.f);
        ri4.y((Object)this.i);
        int b = mwj.b;
        final int c = mwj.c;
        final byte[] a = mwj.a;
        final long g = this.g;
        final int n = c - b;
        this.g = g + n;
        this.i.d(mwj, n);
        while (true) {
            final int b2 = e6i.b(a, b, c, this.c);
            if (b2 == c) {
                if (!this.j) {
                    this.d.a(a, b, c);
                }
                this.f.a(a, b, c);
                final d6i e = this.e;
                if (e != null) {
                    e.a(a, b, c);
                }
                return;
            }
            final byte[] a2 = mwj.a;
            final int n2 = b2 + 3;
            final int e2 = a2[n2] & 0xFF;
            final int n3 = b2 - b;
            if (!this.j) {
                if (n3 > 0) {
                    this.d.a(a, b, b2);
                }
                int n4;
                if (n3 < 0) {
                    n4 = -n3;
                }
                else {
                    n4 = 0;
                }
                final a d = this.d;
                final int b3 = d.b;
                boolean b4 = false;
                Label_0435: {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            if (b3 != 2) {
                                if (b3 != 3) {
                                    if (b3 != 4) {
                                        throw new IllegalStateException();
                                    }
                                    if (e2 == 179 || e2 == 181) {
                                        d.c -= n4;
                                        d.a = false;
                                        b4 = true;
                                        break Label_0435;
                                    }
                                }
                                else if ((e2 & 0xF0) != 0x20) {
                                    Log.w("H263Reader", "Unexpected start code value");
                                    d.b();
                                }
                                else {
                                    d.d = d.c;
                                    d.b = 4;
                                }
                            }
                            else if (e2 > 31) {
                                Log.w("H263Reader", "Unexpected start code value");
                                d.b();
                            }
                            else {
                                d.b = 3;
                            }
                        }
                        else if (e2 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            d.b();
                        }
                        else {
                            d.b = 2;
                        }
                    }
                    else if (e2 == 176) {
                        d.b = 1;
                        d.a = true;
                    }
                    d.a(jbc.a.f, 0, 3);
                    b4 = false;
                }
                if (b4) {
                    final ovt i = this.i;
                    final a d2 = this.d;
                    final int d3 = d2.d;
                    final String h = this.h;
                    Objects.requireNonNull(h);
                    final byte[] copy = Arrays.copyOf(d2.e, d2.c);
                    final rgx rgx = new rgx(copy, 1, (w48)null);
                    rgx.n(d3);
                    rgx.n(4);
                    rgx.l();
                    rgx.m(8);
                    if (rgx.f()) {
                        rgx.m(4);
                        rgx.m(3);
                    }
                    final int g2 = rgx.g(4);
                    float t = 0.0f;
                    Label_0638: {
                        if (g2 == 15) {
                            final int g3 = rgx.g(8);
                            final int g4 = rgx.g(8);
                            if (g4 != 0) {
                                t = g3 / (float)g4;
                                break Label_0638;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        else {
                            final float[] l = jbc.l;
                            if (g2 < 7) {
                                t = l[g2];
                                break Label_0638;
                            }
                            Log.w("H263Reader", "Invalid aspect ratio");
                        }
                        t = 1.0f;
                    }
                    if (rgx.f()) {
                        rgx.m(2);
                        rgx.m(1);
                        if (rgx.f()) {
                            rgx.m(15);
                            rgx.l();
                            rgx.m(15);
                            rgx.l();
                            rgx.m(15);
                            rgx.l();
                            rgx.m(3);
                            rgx.m(11);
                            rgx.l();
                            rgx.m(15);
                            rgx.l();
                        }
                    }
                    if (rgx.g(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    rgx.l();
                    final int g5 = rgx.g(16);
                    rgx.l();
                    if (rgx.f()) {
                        if (g5 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        }
                        else {
                            int j = g5 - 1;
                            int n5 = 0;
                            while (j > 0) {
                                ++n5;
                                j >>= 1;
                            }
                            rgx.m(n5);
                        }
                    }
                    rgx.l();
                    final int g6 = rgx.g(13);
                    rgx.l();
                    final int g7 = rgx.g(13);
                    rgx.l();
                    rgx.l();
                    final n$a n$a = new n$a();
                    n$a.a = h;
                    n$a.k = "video/mp4v-es";
                    n$a.p = g6;
                    n$a.q = g7;
                    n$a.t = t;
                    n$a.m = Collections.singletonList(copy);
                    i.e(new n(n$a));
                    this.j = true;
                }
            }
            this.f.a(a, b, b2);
            final d6i e3 = this.e;
            if (e3 != null) {
                int n6;
                if (n3 > 0) {
                    e3.a(a, b, b2);
                    n6 = 0;
                }
                else {
                    n6 = -n3;
                }
                if (this.e.b(n6)) {
                    final d6i e4 = this.e;
                    final int f = e6i.f(e4.d, e4.e);
                    final mwj b5 = this.b;
                    final int a3 = imw.a;
                    b5.B(this.e.d, f);
                    this.a.a(this.k, this.b);
                }
                if (e2 == 178 && mwj.a[b2 + 2] == 1) {
                    this.e.d(e2);
                }
            }
            final int n7 = c - b2;
            final long g8 = this.g - n7;
            final b f2 = this.f;
            final boolean k = this.j;
            if (f2.e == 182 && k && f2.b) {
                final long h2 = f2.h;
                if (h2 != -9223372036854775807L) {
                    f2.a.b(h2, (int)(f2.d ? 1 : 0), (int)(g8 - f2.g), n7, (ovt$a)null);
                }
            }
            if (f2.e != 179) {
                f2.g = g8;
            }
            final b f3 = this.f;
            final long m = this.k;
            f3.e = e2;
            f3.d = false;
            f3.b = (e2 == 182 || e2 == 179);
            f3.c = (e2 == 182);
            f3.f = 0;
            f3.h = m;
            b = n2;
        }
    }
    
    public final void c() {
        e6i.a(this.c);
        this.d.b();
        final b f = this.f;
        if (f != null) {
            f.b = false;
            f.c = false;
            f.d = false;
            f.e = -1;
        }
        final d6i e = this.e;
        if (e != null) {
            e.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
    
    public final void d(final ooa ooa, final bau$d bau$d) {
        bau$d.a();
        this.h = bau$d.b();
        final ovt s = ooa.s(bau$d.c(), 2);
        this.i = s;
        this.f = new b(s);
        final daw a = this.a;
        if (a != null) {
            a.b(ooa, bau$d);
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long k, final int n) {
        if (k != -9223372036854775807L) {
            this.k = k;
        }
    }
    
    public static final class a
    {
        public static final byte[] f;
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;
        
        static {
            f = new byte[] { 0, 0, 1 };
        }
        
        public a() {
            this.e = new byte[128];
        }
        
        public final void a(final byte[] array, final int n, int c) {
            if (!this.a) {
                return;
            }
            final int n2 = c - n;
            final byte[] e = this.e;
            final int length = e.length;
            c = this.c;
            if (length < c + n2) {
                this.e = Arrays.copyOf(e, (c + n2) * 2);
            }
            System.arraycopy(array, n, this.e, this.c, n2);
            this.c += n2;
        }
        
        public final void b() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }
    
    public static final class b
    {
        public final ovt a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;
        
        public b(final ovt a) {
            this.a = a;
        }
        
        public final void a(final byte[] array, final int n, final int n2) {
            if (this.c) {
                final int f = this.f;
                final int n3 = n + 1 - f;
                if (n3 < n2) {
                    this.d = ((array[n3] & 0xC0) >> 6 == 0);
                    this.c = false;
                }
                else {
                    this.f = n2 - n + f;
                }
            }
        }
    }
}
