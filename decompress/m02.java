import java.io.Closeable;
import com.facebook.imagepipeline.request.a$c;
import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m02 extends mth<Pair<h73, a$c>, xh4<vh4>>
{
    public final l73 f;
    
    public m02(final l73 f, final y0l y0l) {
        super(y0l);
        this.f = f;
    }
    
    public final Closeable b(final Closeable closeable) {
        return (Closeable)xh4.c((xh4)closeable);
    }
    
    public final Object c(final z0l z0l) {
        return Pair.create((Object)((af8)this.f).s(z0l.l(), z0l.a()), (Object)z0l.o());
    }
}
