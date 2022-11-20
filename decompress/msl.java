import java.io.IOException;
import java.io.InputStream;
import com.facebook.imagepipeline.request.a;
import java.util.concurrent.Executor;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msl extends b4g
{
    public final ContentResolver c;
    
    public msl(final Executor executor, final uqk uqk, final ContentResolver c) {
        super(executor, uqk);
        this.c = c;
    }
    
    @Override
    public final j3a c(final a a) throws IOException {
        final InputStream openInputStream = this.c.openInputStream(a.b);
        fli.t((Object)openInputStream, (Object)"ContentResolver returned null InputStream");
        return this.b(openInputStream, -1);
    }
    
    @Override
    public final String d() {
        return "QualifiedResourceFetchProducer";
    }
}
