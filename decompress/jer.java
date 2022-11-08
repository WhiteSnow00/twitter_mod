import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import java.util.Collections;
import java.util.Objects;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jer implements a
{
    public final a a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;
    
    public jer(final a a) {
        Objects.requireNonNull(a);
        this.a = a;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }
    
    public final long a(final b b) throws IOException {
        this.c = b.a;
        this.d = Collections.emptyMap();
        final long a = this.a.a(b);
        final Uri m = this.m();
        Objects.requireNonNull(m);
        this.c = m;
        this.d = this.d();
        return a;
    }
    
    public final int b(final byte[] array, int b, final int n) throws IOException {
        b = ((v78)this.a).b(array, b, n);
        if (b != -1) {
            this.b += b;
        }
        return b;
    }
    
    public final void close() throws IOException {
        this.a.close();
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
