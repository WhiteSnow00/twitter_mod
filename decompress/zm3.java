import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Objects;
import com.google.android.exoplayer2.decoder.DecoderException;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zm3 extends bn3
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final boolean[] F;
    public static final int[] y;
    public static final int[] z;
    public final rwj g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final ArrayList<zm3.zm3$a> l;
    public zm3.zm3$a m;
    public List<q77> n;
    public List<q77> o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public int v;
    public boolean w;
    public long x;
    
    static {
        y = new int[] { 11, 1, 3, 12, 14, 5, 7, 9 };
        z = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
        A = new int[] { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
        B = new int[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
        C = new int[] { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
        D = new int[] { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
        E = new int[] { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
        F = new boolean[] { false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false };
    }
    
    public zm3(final String s, final int n) {
        this.g = new rwj();
        this.l = new ArrayList<zm3.zm3$a>();
        this.m = new zm3.zm3$a(0, 4);
        this.v = 0;
        this.k = 16000000L;
        int h;
        if ("application/x-mp4-cea-608".equals(s)) {
            h = 2;
        }
        else {
            h = 3;
        }
        this.h = h;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.j = 0;
                        this.i = 0;
                    }
                    else {
                        this.j = 1;
                        this.i = 1;
                    }
                }
                else {
                    this.j = 0;
                    this.i = 1;
                }
            }
            else {
                this.j = 1;
                this.i = 0;
            }
        }
        else {
            this.j = 0;
            this.i = 0;
        }
        this.l(0);
        this.k();
        this.w = true;
        this.x = -9223372036854775807L;
    }
    
    public final /* bridge */ Object b() throws DecoderException {
        return this.g();
    }
    
    public final htr e() {
        final List<q77> n = this.n;
        Objects.requireNonNull(this.o = n);
        return (htr)new cn3((List)n);
    }
    
    public final void f(final ktr ktr) {
        final ByteBuffer f0 = ((DecoderInputBuffer)ktr).F0;
        Objects.requireNonNull(f0);
        this.g.B(f0.array(), f0.limit());
        boolean b = false;
        while (true) {
            final rwj g = this.g;
            final int c = g.c;
            final int b2 = g.b;
            final int h = this.h;
            if (c - b2 < h) {
                break;
            }
            int n;
            if (h == 2) {
                n = -4;
            }
            else {
                n = (byte)g.t();
            }
            final int t = this.g.t();
            final int t2 = this.g.t();
            if ((n & 0x2) != 0x0) {
                continue;
            }
            if ((n & 0x1) != this.i) {
                continue;
            }
            final byte t3 = (byte)(t & 0x7F);
            final byte u = (byte)(t2 & 0x7F);
            if (t3 == 0 && u == 0) {
                continue;
            }
            final boolean r = this.r;
            boolean r2 = false;
            Label_0189: {
                if ((n & 0x4) == 0x4) {
                    final boolean[] f2 = zm3.F;
                    if (f2[t] && f2[t2]) {
                        r2 = true;
                        break Label_0189;
                    }
                }
                r2 = false;
            }
            this.r = r2;
            boolean b3 = false;
            Label_0284: {
                if (r2 && (t3 & 0xF0) == 0x10) {
                    if (this.s && this.t == t3 && this.u == u) {
                        this.s = false;
                        b3 = true;
                        break Label_0284;
                    }
                    this.s = true;
                    this.t = t3;
                    this.u = u;
                }
                else {
                    this.s = false;
                }
                b3 = false;
            }
            if (b3) {
                continue;
            }
            Label_1404: {
                if (!r2) {
                    if (!r) {
                        continue;
                    }
                    this.k();
                }
                else {
                    Label_0448: {
                        if (1 <= t3 && t3 <= 15) {
                            this.w = false;
                        }
                        else if ((t3 & 0xF7) == 0x14) {
                            Label_0443: {
                                if (u != 32 && u != 47) {
                                    switch (u) {
                                        default: {
                                            switch (u) {
                                                default: {
                                                    break Label_0448;
                                                }
                                                case 42:
                                                case 43: {
                                                    this.w = false;
                                                    break Label_0448;
                                                }
                                                case 41: {
                                                    break Label_0443;
                                                }
                                            }
                                            break;
                                        }
                                        case 37:
                                        case 38:
                                        case 39: {
                                            break;
                                        }
                                    }
                                }
                            }
                            this.w = true;
                        }
                    }
                    if (!this.w) {
                        continue;
                    }
                    final int n2 = t3 & 0xE0;
                    if (n2 == 0) {
                        this.v = (t3 >> 3 & 0x1);
                    }
                    if (this.v != this.j) {
                        continue;
                    }
                    if (n2 == 0) {
                        final int n3 = t3 & 0xF7;
                        if (n3 == 17 && (u & 0xF0) == 0x30) {
                            this.m.a((char)zm3.C[u & 0xF]);
                        }
                        else {
                            final int n4 = t3 & 0xF6;
                            if (n4 == 18 && (u & 0xE0) == 0x20) {
                                this.m.b();
                                final zm3.zm3$a m = this.m;
                                int n5;
                                if ((t3 & 0x1) == 0x0) {
                                    n5 = zm3.D[u & 0x1F];
                                }
                                else {
                                    n5 = zm3.E[u & 0x1F];
                                }
                                m.a((char)n5);
                            }
                            else if (n3 == 17 && (u & 0xF0) == 0x20) {
                                this.m.a(' ');
                                final boolean b4 = (u & 0x1) == 0x1;
                                final zm3.zm3$a i = this.m;
                                i.a.add(new zm3$a$a(u >> 1 & 0x7, b4, i.c.length()));
                            }
                            else if ((t3 & 0xF0) == 0x10 && (u & 0xC0) == 0x40) {
                                final int n6 = zm3.y[t3 & 0x7];
                                final boolean b5 = (u & 0x20) != 0x0;
                                int d = n6;
                                if (b5) {
                                    d = n6 + 1;
                                }
                                final zm3.zm3$a j = this.m;
                                if (d != j.d) {
                                    if (this.p != 1 && !j.e()) {
                                        final zm3.zm3$a k = new zm3.zm3$a(this.p, this.q);
                                        this.m = k;
                                        this.l.add(k);
                                    }
                                    this.m.d = d;
                                }
                                final boolean b6 = (u & 0x10) == 0x10;
                                final boolean b7 = (u & 0x1) == 0x1;
                                final int n7 = u >> 1 & 0x7;
                                final zm3.zm3$a l = this.m;
                                int n8;
                                if (b6) {
                                    n8 = 8;
                                }
                                else {
                                    n8 = n7;
                                }
                                l.a.add(new zm3$a$a(n8, b7, l.c.length()));
                                if (b6) {
                                    this.m.e = zm3.z[n7];
                                }
                            }
                            else if (n3 == 23 && u >= 33 && u <= 35) {
                                this.m.f = u - 32;
                            }
                            else if (n4 == 20 && (u & 0xF0) == 0x20) {
                                if (u != 32) {
                                    if (u != 41) {
                                        switch (u) {
                                            default: {
                                                final int p = this.p;
                                                if (p == 0) {
                                                    break;
                                                }
                                                if (u == 33) {
                                                    this.m.b();
                                                    break;
                                                }
                                                switch (u) {
                                                    default: {
                                                        break Label_1404;
                                                    }
                                                    case 47: {
                                                        this.n = this.j();
                                                        this.k();
                                                        break Label_1404;
                                                    }
                                                    case 46: {
                                                        this.k();
                                                        break Label_1404;
                                                    }
                                                    case 45: {
                                                        if (p == 1 && !this.m.e()) {
                                                            this.m.g();
                                                            break Label_1404;
                                                        }
                                                        break Label_1404;
                                                    }
                                                    case 44: {
                                                        this.n = Collections.emptyList();
                                                        final int p2 = this.p;
                                                        if (p2 == 1 || p2 == 3) {
                                                            this.k();
                                                            break Label_1404;
                                                        }
                                                        break Label_1404;
                                                    }
                                                }
                                                break;
                                            }
                                            case 39: {
                                                this.l(1);
                                                this.m(4);
                                                break;
                                            }
                                            case 38: {
                                                this.l(1);
                                                this.m(3);
                                                break;
                                            }
                                            case 37: {
                                                this.l(1);
                                                this.m(2);
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        this.l(3);
                                    }
                                }
                                else {
                                    this.l(2);
                                }
                            }
                        }
                    }
                    else {
                        final zm3.zm3$a m2 = this.m;
                        final int[] b8 = zm3.B;
                        m2.a((char)b8[(t3 & 0x7F) - 32]);
                        if ((u & 0xE0) != 0x0) {
                            this.m.a((char)b8[(u & 0x7F) - 32]);
                        }
                    }
                }
            }
            b = true;
        }
        if (b) {
            final int p3 = this.p;
            if (p3 == 1 || p3 == 3) {
                this.n = this.j();
                this.x = super.e;
            }
        }
    }
    
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.l(0);
        this.m(4);
        this.k();
        this.r = false;
        this.s = false;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }
    
    public final ltr g() throws SubtitleDecoderException {
        final ltr g = super.g();
        if (g != null) {
            return g;
        }
        final long k = this.k;
        int n2;
        final int n = n2 = 0;
        if (k != -9223372036854775807L) {
            final long x = this.x;
            if (x == -9223372036854775807L) {
                n2 = n;
            }
            else {
                n2 = n;
                if (super.e - x >= k) {
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            final ltr ltr = super.b.pollFirst();
            if (ltr != null) {
                final List<Object> emptyList = Collections.emptyList();
                this.n = (List<q77>)emptyList;
                this.x = -9223372036854775807L;
                Objects.requireNonNull(this.o = (List<q77>)emptyList);
                ltr.s(super.e, (htr)new cn3((List)emptyList), Long.MAX_VALUE);
                return ltr;
            }
        }
        return null;
    }
    
    public final boolean h() {
        return this.n != this.o;
    }
    
    public final List<q77> j() {
        final int size = this.l.size();
        final ArrayList list = new ArrayList<q77>(size);
        final int n = 0;
        int n2 = 2;
        int min;
        for (int i = 0; i < size; ++i, n2 = min) {
            final q77 c = this.l.get(i).c(Integer.MIN_VALUE);
            list.add(c);
            min = n2;
            if (c != null) {
                min = Math.min(n2, c.L0);
            }
        }
        final ArrayList list2 = new ArrayList<q77>(size);
        for (int j = n; j < size; ++j) {
            final q77 q77 = list.get(j);
            if (q77 != null) {
                q77 c2 = q77;
                if (q77.L0 != n2) {
                    c2 = this.l.get(j).c(n2);
                    Objects.requireNonNull(c2);
                }
                list2.add(c2);
            }
        }
        return (List<q77>)list2;
    }
    
    public final void k() {
        this.m.f(this.p);
        this.l.clear();
        this.l.add(this.m);
    }
    
    public final void l(final int n) {
        final int p = this.p;
        if (p == n) {
            return;
        }
        if ((this.p = n) == 3) {
            for (int i = 0; i < this.l.size(); ++i) {
                this.l.get(i).g = n;
            }
            return;
        }
        this.k();
        if (p == 3 || n == 1 || n == 0) {
            this.n = Collections.emptyList();
        }
    }
    
    public final void m(final int n) {
        this.q = n;
        this.m.h = n;
    }
    
    public final void release() {
    }
}
