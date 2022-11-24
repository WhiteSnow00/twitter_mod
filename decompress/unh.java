import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class unh extends pue implements stb<ShopSpotlightConfigContentViewResult, Boolean>
{
    public static final unh F0;
    
    static {
        F0 = new unh();
    }
    
    public unh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ShopSpotlightConfigContentViewResult shopSpotlightConfigContentViewResult = (ShopSpotlightConfigContentViewResult)o;
        e0e.f((Object)shopSpotlightConfigContentViewResult, "result");
        return shopSpotlightConfigContentViewResult.isFeatured();
    }
}
