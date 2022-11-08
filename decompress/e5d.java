import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e5d implements oy9
{
    public final mwj a;
    public ovt b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    
    public e5d() {
        this.a = new mwj(10);
        this.d = -9223372036854775807L;
    }
    
    public final void a(final mwj mwj) {
        ri4.y((Object)this.b);
        if (!this.c) {
            return;
        }
        final int n = mwj.c - mwj.b;
        final int f = this.f;
        if (f < 10) {
            final int min = Math.min(n, 10 - f);
            System.arraycopy(mwj.a, mwj.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.D(0);
                if (73 != this.a.t() || 68 != this.a.t() || 51 != this.a.t()) {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.E(3);
                this.e = this.a.s() + 10;
            }
        }
        final int min2 = Math.min(n, this.e - this.f);
        this.b.d(mwj, min2);
        this.f += min2;
    }
    
    public final void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
    
    public final void d(final ooa ooa, final bau$d bau$d) {
        bau$d.a();
        final ovt s = ooa.s(bau$d.c(), 5);
        this.b = s;
        final n$a n$a = new n$a();
        n$a.a = bau$d.b();
        n$a.k = "application/id3";
        s.e(new n(n$a));
    }
    
    public final void e() {
        ri4.y((Object)this.b);
        if (this.c) {
            final int e = this.e;
            if (e != 0) {
                if (this.f == e) {
                    final long d = this.d;
                    if (d != -9223372036854775807L) {
                        this.b.b(d, 1, e, 0, (ovt$a)null);
                    }
                    this.c = false;
                }
            }
        }
    }
    
    public final void f(final long d, final int n) {
        if ((n & 0x4) == 0x0) {
            return;
        }
        this.c = true;
        if (d != -9223372036854775807L) {
            this.d = d;
        }
        this.e = 0;
        this.f = 0;
    }
}
