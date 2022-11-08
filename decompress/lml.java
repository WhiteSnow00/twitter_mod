import java.io.IOException;
import tv.periscope.android.api.PsProfileImageUrl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lml extends s4j<PsProfileImageUrl>
{
    public static final alp<PsProfileImageUrl> b;
    
    static {
        lml.b = new lml();
    }
    
    public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
        return new PsProfileImageUrl(elp.I(), elp.z(), elp.z());
    }
    
    public final void f(final flp flp, final Object o) throws IOException {
        final PsProfileImageUrl psProfileImageUrl = (PsProfileImageUrl)o;
        flp.G(psProfileImageUrl.url);
        flp.z(psProfileImageUrl.width);
        flp.z(psProfileImageUrl.height);
    }
}
