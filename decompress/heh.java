import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class heh extends pue implements stb<cfh, vzv>
{
    public final ydh F0;
    
    public heh(final ydh f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final cfh cfh = (cfh)o;
        e0e.f((Object)cfh, "$this$distinct");
        final ydh f0 = this.F0;
        final FrescoMediaImageView y0 = f0.Y0;
        e0e.e((Object)y0, "googleAppIconContainer");
        ydh.a(f0, y0, cfh.i, cfh.h, MobileAppPlatformType.GOOGLE);
        return vzv.a;
    }
}
