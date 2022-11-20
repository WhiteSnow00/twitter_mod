import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class enh extends ste implements qsb<ShopSpotlightConfigContentViewResult, Boolean>
{
    public static final enh D0;
    
    static {
        D0 = new enh();
    }
    
    public enh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ShopSpotlightConfigContentViewResult shopSpotlightConfigContentViewResult = (ShopSpotlightConfigContentViewResult)o;
        czd.f((Object)shopSpotlightConfigContentViewResult, "result");
        return shopSpotlightConfigContentViewResult.getModulesWereUpdated();
    }
}
