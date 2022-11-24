import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tnh extends pue implements stb<ShopSpotlightConfigContentViewResult, Boolean>
{
    public static final tnh F0;
    
    static {
        F0 = new tnh();
    }
    
    public tnh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ShopSpotlightConfigContentViewResult shopSpotlightConfigContentViewResult = (ShopSpotlightConfigContentViewResult)o;
        e0e.f((Object)shopSpotlightConfigContentViewResult, "result");
        return shopSpotlightConfigContentViewResult.getModulesWereUpdated();
    }
}
