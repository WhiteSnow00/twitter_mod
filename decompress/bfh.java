import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;
import com.twitter.business.features.mobileappmodule.api.MobileAppUrlInputContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfh extends ste implements qsb<MobileAppUrlInputContentViewResult, fdh>
{
    public final cfh D0;
    
    public bfh(final cfh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final MobileAppUrlInputContentViewResult mobileAppUrlInputContentViewResult = (MobileAppUrlInputContentViewResult)o;
        czd.f((Object)mobileAppUrlInputContentViewResult, "it");
        final pch c = this.D0.c;
        final String tag = mobileAppUrlInputContentViewResult.getTag();
        if (tag != null) {
            return new fdh(MobileAppPlatformType.valueOf(tag), mobileAppUrlInputContentViewResult.getInputTextValue());
        }
        throw new Error("unrecognized tag");
    }
}
