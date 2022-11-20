import java.io.IOException;
import tv.periscope.android.api.PsProfileImageUrl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zml extends y4j<PsProfileImageUrl>
{
    public static final rlp<PsProfileImageUrl> b;
    
    static {
        zml.b = new zml();
    }
    
    public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
        return new PsProfileImageUrl(vlp.G(), vlp.x(), vlp.x());
    }
    
    public final void f(final wlp wlp, final Object o) throws IOException {
        final PsProfileImageUrl psProfileImageUrl = (PsProfileImageUrl)o;
        wlp.E(psProfileImageUrl.url);
        wlp.x(psProfileImageUrl.width);
        wlp.x(psProfileImageUrl.height);
    }
}
