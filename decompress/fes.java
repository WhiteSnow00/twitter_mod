import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import java.util.Objects;
import com.google.android.exoplayer2.upstream.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fes implements a
{
    public final a a;
    public final s88 b;
    public boolean c;
    public long d;
    
    public fes(final a a, final s88 b) {
        this.a = a;
        Objects.requireNonNull(b);
        this.b = b;
    }
    
    public final long a(final b b) throws IOException {
        final long a = this.a.a(b);
        this.d = a;
        if (a == 0L) {
            return 0L;
        }
        b d = b;
        if (b.g == -1L) {
            d = b;
            if (a != -1L) {
                d = b.d(0L, a);
            }
        }
        this.c = true;
        this.b.a(d);
        return this.d;
    }
    
    public final int b(final byte[] array, final int n, int b) throws IOException {
        if (this.d == 0L) {
            return -1;
        }
        b = ((k88)this.a).b(array, n, b);
        if (b > 0) {
            this.b.R(array, n, b);
            final long d = this.d;
            if (d != -1L) {
                this.d = d - b;
            }
        }
        return b;
    }
    
    public final void close() throws IOException {
        try {
            this.a.close();
        }
        finally {
            if (this.c) {
                this.c = false;
                this.b.close();
            }
        }
    }
    
    public final Map<String, List<String>> d() {
        return this.a.d();
    }
    
    public final void g(final hzt hzt) {
        Objects.requireNonNull(hzt);
        this.a.g(hzt);
    }
    
    public final Uri m() {
        return this.a.m();
    }
}
