import java.io.IOException;
import java.io.InputStream;
import android.net.Uri;
import java.util.List;
import com.google.android.exoplayer2.upstream.i$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n0b<T extends j0b<T>> implements i$a<T>
{
    public final i$a<? extends T> a;
    public final List<akr> b;
    
    public n0b(final i$a<? extends T> a, final List<akr> b) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Uri uri, final InputStream inputStream) throws IOException {
        final j0b j0b = (j0b)this.a.a(uri, inputStream);
        final List<akr> b = this.b;
        j0b j0b2 = j0b;
        if (b != null) {
            if (b.isEmpty()) {
                j0b2 = j0b;
            }
            else {
                j0b2 = (j0b)j0b.a((List)this.b);
            }
        }
        return j0b2;
    }
}
