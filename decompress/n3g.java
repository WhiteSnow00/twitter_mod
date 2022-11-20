import java.io.IOException;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;
import android.content.ContentResolver;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3g extends b4g implements wos<j3a>
{
    public static final String[] d;
    public static final Rect e;
    public static final Rect f;
    public final ContentResolver c;
    
    static {
        d = new String[] { "_data" };
        e = new Rect(0, 0, 512, 384);
        f = new Rect(0, 0, 96, 96);
    }
    
    public n3g(final Executor executor, final uqk uqk, final ContentResolver c) {
        super(executor, uqk);
        this.c = c;
    }
    
    @Override
    public final j3a c(final a a) throws IOException {
        z5w.b(a.b);
        return null;
    }
    
    @Override
    public final String d() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
