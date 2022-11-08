import com.twitter.media.ui.fresco.FrescoMediaImageView;
import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zdh extends gue implements rtb<leh, oyv>
{
    public final /* synthetic */ hdh C0;
    
    public zdh(final hdh c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final leh leh = (leh)o;
        zzd.f((Object)leh, "$this$distinct");
        final hdh c0 = this.C0;
        final FrescoMediaImageView r0 = c0.R0;
        zzd.e((Object)r0, "appleAppIconContainer");
        hdh.a(c0, r0, leh.e, leh.d, MobileAppPlatformType.APPLE);
        return oyv.a;
    }
}
