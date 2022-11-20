import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gt3
{
    public final gt3 a;
    public final AtomicReference<b> b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public a[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;
    
    public gt3(final int c) {
        this.a = null;
        this.c = c;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference<b>(new b(new String[64], new a[32]));
    }
    
    public gt3(final gt3 a, int length, final int c, final b b) {
        this.a = a;
        this.c = c;
        this.b = null;
        this.d = length;
        this.e = shc.a(2, length);
        final String[] c2 = b.c;
        this.f = c2;
        this.g = b.d;
        this.h = b.a;
        this.k = b.b;
        length = c2.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
    
    public final int a(int n) {
        n += n >>> 15;
        n ^= n << 7;
        return n + (n >>> 3) & this.j;
    }
    
    public final int b(final String s) {
        final int length = s.length();
        int c = this.c;
        for (int i = 0; i < length; ++i) {
            c = c * 33 + s.charAt(i);
        }
        int n;
        if ((n = c) == 0) {
            n = 1;
        }
        return n;
    }
    
    public final String c(final char[] array, int c, int n, int i) {
        if (n < 1) {
            return "";
        }
        if (!this.e) {
            return new String(array, c, n);
        }
        final int a = this.a(i);
        final String s = this.f[a];
        Label_0184: {
            if (s != null) {
                if (s.length() == n) {
                    i = 0;
                    while (s.charAt(i) == array[c + i]) {
                        if (++i == n) {
                            return s;
                        }
                    }
                }
                final a a2 = this.g[a >> 1];
                if (a2 != null) {
                    final String a3 = a2.a(array, c, n);
                    if (a3 != null) {
                        return a3;
                    }
                    a a4 = a2.b;
                    while (true) {
                        while (a4 != null) {
                            final String a5 = a4.a(array, c, n);
                            if (a5 != null) {
                                final String s2 = a5;
                                if (s2 != null) {
                                    return s2;
                                }
                                break Label_0184;
                            }
                            else {
                                a4 = a4.b;
                            }
                        }
                        final String s2 = null;
                        continue;
                    }
                }
            }
        }
        if (this.l) {
            final String[] f = this.f;
            this.f = Arrays.copyOf(f, f.length);
            final a[] g = this.g;
            this.g = Arrays.copyOf(g, g.length);
            this.l = false;
            i = a;
        }
        else {
            i = a;
            if (this.h >= this.i) {
                final String[] f2 = this.f;
                final int length = f2.length;
                i = length + length;
                if (i > 65536) {
                    this.h = 0;
                    this.e = false;
                    this.f = new String[64];
                    this.g = new a[32];
                    this.j = 63;
                    this.l = false;
                }
                else {
                    final a[] g2 = this.g;
                    this.f = new String[i];
                    this.g = new a[i >> 1];
                    this.j = i - 1;
                    this.i = i - (i >> 2);
                    int j = 0;
                    int n2 = 0;
                    i = 0;
                    while (j < length) {
                        final String s3 = f2[j];
                        int n3 = n2;
                        int max = i;
                        if (s3 != null) {
                            n3 = n2 + 1;
                            final int a6 = this.a(this.b(s3));
                            final String[] f3 = this.f;
                            if (f3[a6] == null) {
                                f3[a6] = s3;
                                max = i;
                            }
                            else {
                                final int n4 = a6 >> 1;
                                final a[] g3 = this.g;
                                final a a7 = new a(s3, g3[n4]);
                                g3[n4] = a7;
                                max = Math.max(i, a7.c);
                            }
                        }
                        ++j;
                        n2 = n3;
                        i = max;
                    }
                    final int n5 = 0;
                    int k = i;
                    int n6 = n2;
                    a b;
                    int max2;
                    String a8;
                    int a9;
                    String[] f4;
                    int n7;
                    a[] g4;
                    a a10;
                    for (i = n5; i < length >> 1; ++i, k = max2) {
                        b = g2[i];
                        max2 = k;
                        while (b != null) {
                            ++n6;
                            a8 = b.a;
                            a9 = this.a(this.b(a8));
                            f4 = this.f;
                            if (f4[a9] == null) {
                                f4[a9] = a8;
                            }
                            else {
                                n7 = a9 >> 1;
                                g4 = this.g;
                                a10 = new a(a8, g4[n7]);
                                g4[n7] = a10;
                                max2 = Math.max(max2, a10.c);
                            }
                            b = b.b;
                        }
                    }
                    this.k = k;
                    this.m = null;
                    if (n6 != this.h) {
                        throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", this.h, n6));
                    }
                }
                i = this.c;
                for (int l = c; l < n + c; ++l) {
                    i = i * 33 + array[l];
                }
                int n8;
                if ((n8 = i) == 0) {
                    n8 = 1;
                }
                i = this.a(n8);
            }
        }
        String a11;
        final String s4 = a11 = new String(array, c, n);
        if (shc.a(1, this.d)) {
            a11 = exd.E0.a(s4);
        }
        ++this.h;
        final String[] f5 = this.f;
        if (f5[i] == null) {
            f5[i] = a11;
        }
        else {
            n = i >> 1;
            final a[] g5 = this.g;
            final a a12 = new a(a11, g5[n]);
            c = a12.c;
            if (c > 100) {
                final BitSet m = this.m;
                if (m == null) {
                    (this.m = new BitSet()).set(n);
                }
                else if (m.get(n)) {
                    if (shc.a(3, this.d)) {
                        final StringBuilder j2 = fu8.j("Longest collision chain in symbol table (of size ");
                        j2.append(this.h);
                        j2.append(") now exceeds maximum, ");
                        j2.append(100);
                        j2.append(" -- suspect a DoS attack based on hash collisions");
                        throw new IllegalStateException(j2.toString());
                    }
                    this.e = false;
                }
                else {
                    this.m.set(n);
                }
                this.f[n + n] = a11;
                this.g[n] = null;
                this.h -= a12.c;
                this.k = -1;
            }
            else {
                g5[n] = a12;
                this.k = Math.max(c, this.k);
            }
        }
        return a11;
    }
    
    public final gt3 d(final int n) {
        return new gt3(this, n, this.c, this.b.get());
    }
    
    public static final class a
    {
        public final String a;
        public final a b;
        public final int c;
        
        public a(final String a, final a b) {
            this.a = a;
            this.b = b;
            int c = 1;
            if (b != null) {
                c = 1 + b.c;
            }
            this.c = c;
        }
        
        public final String a(final char[] array, final int n, final int n2) {
            if (this.a.length() != n2) {
                return null;
            }
            int n3 = 0;
            while (this.a.charAt(n3) == array[n + n3]) {
                if (++n3 >= n2) {
                    return this.a;
                }
            }
            return null;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final String[] c;
        public final a[] d;
        
        public b(final gt3 gt3) {
            this.a = gt3.h;
            this.b = gt3.k;
            this.c = gt3.f;
            this.d = gt3.g;
        }
        
        public b(final String[] c, final a[] d) {
            this.a = 0;
            this.b = 0;
            this.c = c;
            this.d = d;
        }
    }
}
