import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebc extends RequestBody
{
    public final /* synthetic */ RequestBody a;
    public final /* synthetic */ uq2 b;
    
    public ebc(final RequestBody a, final uq2 b) {
        this.a = a;
        this.b = b;
    }
    
    public final long contentLength() {
        return this.b.D0;
    }
    
    public final MediaType contentType() {
        return this.a.contentType();
    }
    
    public final void writeTo(final kr2 kr2) throws IOException {
        kr2.T0(this.b.N());
    }
}
