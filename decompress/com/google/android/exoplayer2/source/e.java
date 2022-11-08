// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.List;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;

public final class e implements a
{
    public final a a;
    public final int b;
    public final e.e$a c;
    public final byte[] d;
    public int e;
    
    public e(final a a, final int n, final e.e$a c) {
        ri4.k(n > 0);
        this.a = a;
        this.b = n;
        this.c = c;
        this.d = new byte[1];
        this.e = n;
    }
    
    public final long a(final b b) {
        throw new UnsupportedOperationException();
    }
    
    public final int b(final byte[] array, int b, final int n) throws IOException {
        if (this.e == 0) {
            final a a = this.a;
            final byte[] d = this.d;
            final boolean b2 = true;
            int n3 = 0;
            Label_0301: {
                Label_0111: {
                    if (((v78)a).b(d, 0, 1) != -1) {
                        final int n2 = (this.d[0] & 0xFF) << 4;
                        if (n2 == 0) {
                            n3 = (b2 ? 1 : 0);
                            break Label_0301;
                        }
                        final byte[] array2 = new byte[n2];
                        int n4 = n2;
                        int n5 = 0;
                        int i;
                        while (true) {
                            i = n2;
                            if (n4 <= 0) {
                                break;
                            }
                            final int b3 = ((v78)this.a).b(array2, n5, n4);
                            if (b3 == -1) {
                                break Label_0111;
                            }
                            n5 += b3;
                            n4 -= b3;
                        }
                        while (i > 0) {
                            final int n6 = i - 1;
                            if (array2[n6] != 0) {
                                break;
                            }
                            i = n6;
                        }
                        n3 = (b2 ? 1 : 0);
                        if (i > 0) {
                            final e.e$a c = this.c;
                            final mwj mwj = new mwj(array2, i);
                            final l$a l$a = (l$a)c;
                            long n7;
                            if (!l$a.n) {
                                n7 = l$a.j;
                            }
                            else {
                                final l o = l$a.o;
                                final Map<String, String> o2 = l.o1;
                                n7 = Math.max(o.y(), l$a.j);
                            }
                            final int n8 = mwj.c - mwj.b;
                            final ovt m = l$a.m;
                            Objects.requireNonNull(m);
                            m.d(mwj, n8);
                            m.b(n7, 1, n8, 0, (ovt$a)null);
                            l$a.n = true;
                            n3 = (b2 ? 1 : 0);
                        }
                        break Label_0301;
                    }
                }
                n3 = 0;
            }
            if (n3 == 0) {
                return -1;
            }
            this.e = this.b;
        }
        b = ((v78)this.a).b(array, b, Math.min(this.e, n));
        if (b != -1) {
            this.e -= b;
        }
        return b;
    }
    
    public final void close() {
        throw new UnsupportedOperationException();
    }
    
    public final Map<String, List<String>> d() {
        return this.a.d();
    }
    
    public final void g(final zxt zxt) {
        Objects.requireNonNull(zxt);
        this.a.g(zxt);
    }
    
    public final Uri m() {
        return this.a.m();
    }
}
