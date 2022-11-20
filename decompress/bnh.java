import com.twitter.business.features.mobileappmodule.api.MobileAppModuleConfigurationResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bnh extends ste implements qsb<MobileAppModuleConfigurationResult, Boolean>
{
    public static final bnh D0;
    
    static {
        D0 = new bnh();
    }
    
    public bnh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final MobileAppModuleConfigurationResult mobileAppModuleConfigurationResult = (MobileAppModuleConfigurationResult)o;
        czd.f((Object)mobileAppModuleConfigurationResult, "result");
        return mobileAppModuleConfigurationResult.isFeatured();
    }
}
