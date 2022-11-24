import android.util.Log;
import com.google.android.exoplayer2.z;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lj8 implements y2g
{
    public final ke8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;
    
    public lj8(final ke8 a, final int n, final int n2, final int n3, final int n4) {
        j(n3, 0, "bufferForPlaybackMs", "0");
        j(n4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(n, n3, "minBufferMs", "bufferForPlaybackMs");
        j(n, n4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(n2, n, "maxBufferMs", "minBufferMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.a = a;
        this.b = rnw.H((long)n);
        this.c = rnw.H((long)n2);
        this.d = rnw.H((long)n3);
        this.e = rnw.H((long)n4);
        this.f = -1;
        this.j = 13107200;
        this.g = false;
        this.h = rnw.H((long)0);
        this.i = false;
    }
    
    public static void j(int length, final int n, final String s, final String s2) {
        final boolean b = length >= n;
        length = s.length();
        final StringBuilder sb = new StringBuilder(s2.length() + (length + 21));
        sb.append(s);
        sb.append(" cannot be less than ");
        sb.append(s2);
        omi.n(b, (Object)sb.toString());
    }
    
    public final boolean a() {
        return this.i;
    }
    
    public final long b() {
        return this.h;
    }
    
    public final void c() {
        this.k(false);
    }
    
    public final boolean d(long n, final float n2, final boolean b, final long n3) {
        final long y = rnw.y(n, n2);
        if (b) {
            n = this.e;
        }
        else {
            n = this.d;
        }
        long min = n;
        if (n3 != -9223372036854775807L) {
            min = Math.min(n3 / 2L, n);
        }
        if (min > 0L && y < min) {
            if (!this.g) {
                final ke8 a = this.a;
                synchronized (a) {
                    final int d = a.d;
                    final int b2 = a.b;
                    monitorexit(a);
                    if (d * b2 >= this.j) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final sx e() {
        return (sx)this.a;
    }
    
    public final void f() {
        this.k(true);
    }
    
    public final void g() {
        this.k(true);
    }
    
    public final void h(final z[] array, twt a, final tha[] array2) {
        final int f = this.f;
        final int n = 0;
        int max = f;
        if (f == -1) {
            int n2 = 0;
            int n3 = 0;
            while (true) {
                final int length = array.length;
                final int n4 = 13107200;
                if (n2 >= length) {
                    max = Math.max(13107200, n3);
                    break;
                }
                int n5 = n3;
                if (array2[n2] != null) {
                    int n6 = n4;
                    while (true) {
                        switch (array[n2].g()) {
                            default: {
                                throw new IllegalArgumentException();
                            }
                            case 1: {
                                n5 = n3 + n6;
                                break;
                            }
                            case 3:
                            case 4:
                            case 5:
                            case 6: {
                                n6 = 131072;
                                continue;
                            }
                            case 2: {
                                n6 = 131072000;
                                continue;
                            }
                            case 0: {
                                n6 = 144310272;
                                continue;
                            }
                            case -2: {
                                n6 = 0;
                                continue;
                            }
                        }
                        break;
                    }
                }
                ++n2;
                n3 = n5;
            }
        }
        this.j = max;
        a = (twt)this.a;
        monitorenter(a);
        int n7 = n;
        try {
            if (max < ((ke8)a).c) {
                n7 = 1;
            }
            ((ke8)a).c = max;
            if (n7 != 0) {
                ((ke8)a).a();
            }
        }
        finally {
            monitorexit(a);
        }
    }
    
    public final boolean i(long n, final long n2, final float n3) {
        final ke8 a = this.a;
        synchronized (a) {
            final int d = a.d;
            final int b = a.b;
            monitorexit(a);
            final int j = this.j;
            final boolean b2 = true;
            final boolean b3 = d * b >= j;
            n = this.b;
            if (n3 > 1.0f) {
                n = Math.min(rnw.v(n, n3), this.c);
            }
            if (n2 < Math.max(n, 500000L)) {
                boolean k = b2;
                if (!this.g) {
                    k = (!b3 && b2);
                }
                this.k = k;
                if (!k && n2 < 500000L) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            }
            else if (n2 >= this.c || b3) {
                this.k = false;
            }
            return this.k;
        }
    }
    
    public final void k(final boolean b) {
        int f;
        if ((f = this.f) == -1) {
            f = 13107200;
        }
        this.j = f;
        this.k = false;
        if (b) {
            final ke8 a = this.a;
            synchronized (a) {
                if (a.a) {
                    synchronized (a) {
                        final boolean b2 = a.c > 0;
                        a.c = 0;
                        if (b2) {
                            a.a();
                        }
                    }
                }
            }
        }
    }
}
