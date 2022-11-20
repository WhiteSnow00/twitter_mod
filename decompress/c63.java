import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c63
{
    public final c63 a;
    public final AtomicReference<a> b;
    public final int c;
    public boolean d;
    public final boolean e;
    public int[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public String[] l;
    public int m;
    public int n;
    public transient boolean o;
    public boolean p;
    
    public c63(final int c) {
        this.a = null;
        this.c = c;
        this.d = true;
        this.e = true;
        this.b = new AtomicReference<a>(c63.a.a(64));
    }
    
    public c63(final c63 a, final boolean d, int a2, final boolean e, final a a3) {
        this.a = a;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.b = null;
        this.k = a3.b;
        a2 = a3.a;
        this.g = a2;
        a2 <<= 2;
        this.h = a2;
        this.i = a2 + (a2 >> 1);
        this.j = a3.c;
        this.f = a3.d;
        this.l = a3.e;
        this.m = a3.f;
        this.n = a3.g;
        this.o = false;
        this.p = true;
    }
    
    public static int b(int n) {
        n >>= 2;
        if (n < 64) {
            return 4;
        }
        if (n <= 256) {
            return 5;
        }
        if (n <= 1024) {
            return 6;
        }
        return 7;
    }
    
    public final int a(final int n) {
        return (n & this.g - 1) << 2;
    }
    
    public final int c(int i) {
        i = this.a(i);
        final int[] f = this.f;
        if (f[i + 3] == 0) {
            return i;
        }
        final int n = this.h + (i >> 3 << 2);
        if (f[n + 3] == 0) {
            return n;
        }
        for (int j = this.i, k = this.j; i < (1 << k) + (i = j + (i >> k + 2 << k)); i += 4) {
            if (f[i + 3] == 0) {
                return i;
            }
        }
        i = this.m;
        final int m = i + 4;
        this.m = m;
        final int g = this.g;
        if (m >= g << 3) {
            if (this.e && g > 1024) {
                final StringBuilder l = fu8.j("Spill-over slots in symbol table with ");
                l.append(this.k);
                l.append(" entries, hash area of ");
                l.append(this.g);
                l.append(" slots is now full (all ");
                l.append(this.g >> 3);
                l.append(" slots -- suspect a DoS attack based on hash collisions.");
                l.append(" You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
                throw new IllegalStateException(l.toString());
            }
            this.o = true;
        }
        return i;
    }
    
    public final boolean d(final int[] array, int n, int n2) {
        final int[] f = this.f;
        boolean b = false;
        Label_0153: {
            Label_0125: {
                Label_0097: {
                    switch (n) {
                        default: {
                            int n3 = 0;
                            while (true) {
                                final int n4 = n3 + 1;
                                if (array[n3] != this.f[n2]) {
                                    break;
                                }
                                if (n4 >= n) {
                                    b = true;
                                    break;
                                }
                                n3 = n4;
                                ++n2;
                            }
                            return b;
                        }
                        case 8: {
                            if (array[0] != f[n2]) {
                                return false;
                            }
                            ++n2;
                            n = 1;
                            break;
                        }
                        case 7: {
                            n = 0;
                            break;
                        }
                        case 6: {
                            n = 0;
                            break Label_0097;
                        }
                        case 5: {
                            n = 0;
                            break Label_0125;
                        }
                        case 4: {
                            n = 0;
                            break Label_0153;
                        }
                    }
                    final int n5 = n + 1;
                    if (array[n] != f[n2]) {
                        return false;
                    }
                    ++n2;
                    n = n5;
                }
                final int n6 = n + 1;
                if (array[n] != f[n2]) {
                    return false;
                }
                ++n2;
                n = n6;
            }
            final int n7 = n + 1;
            if (array[n] != f[n2]) {
                return false;
            }
            ++n2;
            n = n7;
        }
        final int n8 = n + 1;
        final int n9 = array[n];
        n = n2 + 1;
        if (n9 != f[n2]) {
            return false;
        }
        n2 = n8 + 1;
        final int n10 = array[n8];
        final int n11 = n + 1;
        return n10 == f[n] && array[n2] == f[n11] && array[n2 + 1] == f[n11 + 1];
    }
    
    public final void e() {
        final int k = this.k;
        final int g = this.g;
        if (k > g >> 1 && (this.m - ((g << 3) - g) >> 2 > k + 1 >> 7 || k > g * 0.8)) {
            this.o = true;
        }
    }
    
    public final String f(String a, int[] f, int n) {
        if (this.p) {
            final int[] f2 = this.f;
            this.f = Arrays.copyOf(f2, f2.length);
            final String[] l = this.l;
            this.l = Arrays.copyOf(l, l.length);
            this.p = false;
            this.e();
        }
        if (this.o) {
            this.o = false;
            this.p = false;
            final int[] f3 = this.f;
            final String[] i = this.l;
            final int g = this.g;
            final int k = this.k;
            final int g2 = g + g;
            final int m = this.m;
            if (g2 > 65536) {
                this.n(true);
            }
            else {
                this.f = new int[f3.length + (g << 3)];
                this.g = g2;
                final int h = g2 << 2;
                this.h = h;
                this.i = h + (h >> 1);
                this.j = b(g2);
                this.l = new String[i.length << 1];
                this.n(false);
                int[] array = new int[16];
                int j = 0;
                int n2 = 0;
                while (j < m) {
                    final int n3 = f3[j + 3];
                    int[] array2;
                    if (n3 == 0) {
                        array2 = array;
                    }
                    else {
                        ++n2;
                        final String s = i[j >> 2];
                        if (n3 != 1) {
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    array2 = array;
                                    if (n3 > array.length) {
                                        array2 = new int[n3];
                                    }
                                    System.arraycopy(f3, f3[j + 1], array2, 0, n3);
                                    this.f(s, array2, n3);
                                }
                                else {
                                    array[0] = f3[j];
                                    array[1] = f3[j + 1];
                                    array[2] = f3[j + 2];
                                    this.f(s, array, 3);
                                    array2 = array;
                                }
                            }
                            else {
                                array[0] = f3[j];
                                array[1] = f3[j + 1];
                                this.f(s, array, 2);
                                array2 = array;
                            }
                        }
                        else {
                            array[0] = f3[j];
                            this.f(s, array, 1);
                            array2 = array;
                        }
                    }
                    j += 4;
                    array = array2;
                }
                if (n2 != k) {
                    throw new IllegalStateException(zjf.h("Failed rehash(): old count=", k, ", copyCount=", n2));
                }
            }
        }
        if (this.d) {
            a = exd.E0.a(a);
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    final int i2 = this.i(f, n);
                    final int c = this.c(i2);
                    final int[] f4 = this.f;
                    f4[c] = i2;
                    final int n4 = this.n;
                    final int n5 = n4 + n;
                    if (n5 > f4.length) {
                        this.f = Arrays.copyOf(this.f, Math.max(n5 - f4.length, Math.min(4096, this.g)) + this.f.length);
                    }
                    System.arraycopy(f, 0, this.f, n4, n);
                    this.n += n;
                    f = this.f;
                    f[c + 1] = n4;
                    f[c + 3] = n;
                    n = c;
                }
                else {
                    n = this.c(this.h(f[0], f[1], f[2]));
                    final int[] f5 = this.f;
                    f5[n] = f[0];
                    f5[n + 1] = f[1];
                    f5[n + 2] = f[2];
                    f5[n + 3] = 3;
                }
            }
            else {
                n = this.c(this.g(f[0], f[1]));
                final int[] f6 = this.f;
                f6[n] = f[0];
                f6[n + 1] = f[1];
                f6[n + 3] = 2;
            }
        }
        else {
            n = (f[0] ^ this.c);
            n += n >>> 16;
            n ^= n << 3;
            n = this.c(n + (n >>> 12));
            final int[] f7 = this.f;
            f7[n] = f[0];
            f7[n + 3] = 1;
        }
        this.l[n >> 2] = a;
        ++this.k;
        this.e();
        return a;
    }
    
    public final int g(int n, final int n2) {
        n += n >>> 15;
        n = (this.c ^ n2 * 33 + (n ^ n >>> 9));
        n += n >>> 16;
        n ^= n >>> 4;
        return n + (n << 3);
    }
    
    public final int h(int n, final int n2, final int n3) {
        n ^= this.c;
        n = ((n + (n >>> 9)) * 31 + n2) * 33;
        n = (n + (n >>> 15) ^ n3);
        n += n >>> 4;
        n += n >>> 15;
        return n ^ n << 9;
    }
    
    public final int i(final int[] array, int n) {
        if (n >= 4) {
            final int n2 = array[0] ^ this.c;
            final int n3 = n2 + (n2 >>> 9) + array[1];
            final int n4 = (n3 + (n3 >>> 15)) * 33 ^ array[2];
            int n5 = n4 + (n4 >>> 4);
            for (int i = 3; i < n; ++i) {
                final int n6 = array[i];
                n5 += (n6 ^ n6 >> 21);
            }
            n = n5 * 65599;
            n += n >>> 19;
            return n << 5 ^ n;
        }
        throw new IllegalArgumentException();
    }
    
    public final String j(final int n) {
        final int n2 = this.c ^ n;
        final int n3 = n2 + (n2 >>> 16);
        final int n4 = n3 ^ n3 << 3;
        final int a = this.a(n4 + (n4 >>> 12));
        final int[] f = this.f;
        final int n5 = f[a + 3];
        final String s = null;
        if (n5 == 1) {
            if (f[a] == n) {
                return this.l[a >> 2];
            }
        }
        else if (n5 == 0) {
            return null;
        }
        final int n6 = this.h + (a >> 3 << 2);
        final int n7 = f[n6 + 3];
        if (n7 == 1) {
            if (f[n6] == n) {
                return this.l[n6 >> 2];
            }
        }
        else if (n7 == 0) {
            return null;
        }
        final int i = this.i;
        final int j = this.j;
        int k = 0;
        while (k < (1 << j) + (k = i + (a >> j + 2 << j))) {
            final int n8 = f[k + 3];
            String s2;
            if (n == f[k] && n8) {
                s2 = this.l[k >> 2];
            }
            else {
                if (n8 != 0) {
                    k += 4;
                    continue;
                }
                s2 = s;
            }
            return s2;
        }
        final int g = this.g;
        int n9 = (g << 3) - g;
        while (true) {
            String s2 = s;
            if (n9 >= this.m) {
                return s2;
            }
            if (n == f[n9] && 1 == f[n9 + 3]) {
                s2 = this.l[n9 >> 2];
                return s2;
            }
            n9 += 4;
        }
    }
    
    public final String k(final int n, final int n2) {
        final int a = this.a(this.g(n, n2));
        final int[] f = this.f;
        final int n3 = f[a + 3];
        final String s = null;
        if (n3 == 2) {
            if (n == f[a] && n2 == f[a + 1]) {
                return this.l[a >> 2];
            }
        }
        else if (n3 == 0) {
            return null;
        }
        final int n4 = this.h + (a >> 3 << 2);
        final int n5 = f[n4 + 3];
        if (n5 == 2) {
            if (n == f[n4] && n2 == f[n4 + 1]) {
                return this.l[n4 >> 2];
            }
        }
        else if (n5 == 0) {
            return null;
        }
        final int i = this.i;
        final int j = this.j;
        int k = 0;
        while (k < (1 << j) + (k = i + (a >> j + 2 << j))) {
            final int n6 = f[k + 3];
            String s2;
            if (n == f[k] && n2 == f[k + 1] && 2 == n6) {
                s2 = this.l[k >> 2];
            }
            else {
                if (n6 != 0) {
                    k += 4;
                    continue;
                }
                s2 = s;
            }
            return s2;
        }
        final int g = this.g;
        int n7 = (g << 3) - g;
        while (true) {
            String s2 = s;
            if (n7 >= this.m) {
                return s2;
            }
            if (n == f[n7] && n2 == f[n7 + 1] && 2 == f[n7 + 3]) {
                s2 = this.l[n7 >> 2];
                return s2;
            }
            n7 += 4;
        }
    }
    
    public final String l(final int n, final int n2, final int n3) {
        final int a = this.a(this.h(n, n2, n3));
        final int[] f = this.f;
        final int n4 = f[a + 3];
        final String s = null;
        if (n4 == 3) {
            if (n == f[a] && f[a + 1] == n2 && f[a + 2] == n3) {
                return this.l[a >> 2];
            }
        }
        else if (n4 == 0) {
            return null;
        }
        final int n5 = this.h + (a >> 3 << 2);
        final int n6 = f[n5 + 3];
        if (n6 == 3) {
            if (n == f[n5] && f[n5 + 1] == n2 && f[n5 + 2] == n3) {
                return this.l[n5 >> 2];
            }
        }
        else if (n6 == 0) {
            return null;
        }
        final int i = this.i;
        final int j = this.j;
        int k = 0;
        while (k < (1 << j) + (k = i + (a >> j + 2 << j))) {
            final int n7 = f[k + 3];
            String s2;
            if (n == f[k] && n2 == f[k + 1] && n3 == f[k + 2] && 3 == n7) {
                s2 = this.l[k >> 2];
            }
            else {
                if (n7 != 0) {
                    k += 4;
                    continue;
                }
                s2 = s;
            }
            return s2;
        }
        final int g = this.g;
        int n8 = (g << 3) - g;
        while (true) {
            String s2 = s;
            if (n8 >= this.m) {
                return s2;
            }
            if (n == f[n8] && n2 == f[n8 + 1] && n3 == f[n8 + 2] && 3 == f[n8 + 3]) {
                s2 = this.l[n8 >> 2];
                return s2;
            }
            n8 += 4;
        }
    }
    
    public final String m(final int[] array, final int n) {
        if (n < 4) {
            if (n == 3) {
                return this.l(array[0], array[1], array[2]);
            }
            if (n == 2) {
                return this.k(array[0], array[1]);
            }
            return this.j(array[0]);
        }
        else {
            final int i = this.i(array, n);
            final int a = this.a(i);
            final int[] f = this.f;
            final int n2 = f[a + 3];
            if (i == f[a] && n2 == n && this.d(array, n, f[a + 1])) {
                return this.l[a >> 2];
            }
            final String s = null;
            if (n2 == 0) {
                return null;
            }
            final int n3 = this.h + (a >> 3 << 2);
            final int n4 = f[n3 + 3];
            if (i == f[n3] && n4 == n && this.d(array, n, f[n3 + 1])) {
                return this.l[n3 >> 2];
            }
            final int j = this.i;
            final int k = this.j;
            final int n5 = j + (a >> k + 2 << k);
            final int[] f2 = this.f;
            int l = n5;
            while (l < (1 << k) + n5) {
                final int n6 = f2[l + 3];
                String s2;
                if (i == f2[l] && n == n6 && this.d(array, n, f2[l + 1])) {
                    s2 = this.l[l >> 2];
                }
                else {
                    if (n6 != 0) {
                        l += 4;
                        continue;
                    }
                    s2 = s;
                }
                return s2;
            }
            final int g = this.g;
            int n7 = (g << 3) - g;
            while (true) {
                String s2 = s;
                if (n7 >= this.m) {
                    return s2;
                }
                if (i == f2[n7] && n == f2[n7 + 3] && this.d(array, n, f2[n7 + 1])) {
                    s2 = this.l[n7 >> 2];
                    return s2;
                }
                n7 += 4;
            }
        }
    }
    
    public final void n(final boolean b) {
        this.k = 0;
        final int g = this.g;
        this.m = (g << 3) - g;
        this.n = g << 3;
        if (b) {
            Arrays.fill(this.f, 0);
            Arrays.fill(this.l, null);
        }
    }
    
    @Override
    public final String toString() {
        final int h = this.h;
        int i = 3;
        int n = 0;
        while (i < h) {
            int n2 = n;
            if (this.f[i] != 0) {
                n2 = n + 1;
            }
            i += 4;
            n = n2;
        }
        int j = this.h + 3;
        final int k = this.i;
        int n3 = 0;
        while (j < k) {
            int n4 = n3;
            if (this.f[j] != 0) {
                n4 = n3 + 1;
            }
            j += 4;
            n3 = n4;
        }
        final int n5 = this.i + 3;
        final int g = this.g;
        int n6 = 0;
        int n7;
        for (int l = n5; l < g + n5; l += 4, n6 = n7) {
            n7 = n6;
            if (this.f[l] != 0) {
                n7 = n6 + 1;
            }
        }
        final int m = this.m;
        final int g2 = this.g;
        final int n8 = m - ((g2 << 3) - g2) >> 2;
        int n9 = 3;
        int n10 = 0;
        while (n9 < g2 << 3) {
            int n11 = n10;
            if (this.f[n9] != 0) {
                n11 = n10 + 1;
            }
            n9 += 4;
            n10 = n11;
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", c63.class.getName(), this.k, this.g, n, n3, n6, n8, n + n3 + n6 + n8, n10);
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int[] d;
        public final String[] e;
        public final int f;
        public final int g;
        
        public a(final int a, final int c, final int[] d, final String[] e, final int f, final int g) {
            this.a = a;
            this.b = 0;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public a(final c63 c63) {
            this.a = c63.g;
            this.b = c63.k;
            this.c = c63.j;
            this.d = c63.f;
            this.e = c63.l;
            this.f = c63.m;
            this.g = c63.n;
        }
        
        public static a a(final int n) {
            final int n2 = n << 3;
            return new a(n, c63.b(n), new int[n2], new String[n << 1], n2 - n, n2);
        }
    }
}
