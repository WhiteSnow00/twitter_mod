import com.twitter.business.moduleconfiguration.mobileappmodule.util.inputtext.MobileAppPlatformType;
import com.twitter.business.features.mobileappmodule.api.MobileAppUrlInputContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afh extends gue implements rtb<MobileAppUrlInputContentViewResult, edh>
{
    public final /* synthetic */ bfh C0;
    
    public afh(final bfh c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final MobileAppUrlInputContentViewResult mobileAppUrlInputContentViewResult = (MobileAppUrlInputContentViewResult)o;
        zzd.f((Object)mobileAppUrlInputContentViewResult, "it");
        final och c = this.C0.c;
        final String tag = mobileAppUrlInputContentViewResult.getTag();
        if (tag != null) {
            return new edh(MobileAppPlatformType.valueOf(tag), mobileAppUrlInputContentViewResult.getInputTextValue());
        }
        throw new Error("unrecognized tag");
    }
}
