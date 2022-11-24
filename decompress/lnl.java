import java.io.IOException;
import tv.periscope.android.api.PsProfileImageUrl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnl extends k5j<PsProfileImageUrl>
{
    public static final nmp<PsProfileImageUrl> b;
    
    static {
        lnl.b = new lnl();
    }
    
    public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
        return new PsProfileImageUrl(rmp.I(), rmp.z(), rmp.z());
    }
    
    public final void f(final smp smp, final Object o) throws IOException {
        final PsProfileImageUrl psProfileImageUrl = (PsProfileImageUrl)o;
        smp.G(psProfileImageUrl.url);
        smp.z(psProfileImageUrl.width);
        smp.z(psProfileImageUrl.height);
    }
}
