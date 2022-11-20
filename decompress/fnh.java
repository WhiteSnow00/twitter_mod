import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnh extends ste implements qsb<ShopSpotlightConfigContentViewResult, Boolean>
{
    public static final fnh D0;
    
    static {
        D0 = new fnh();
    }
    
    public fnh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ShopSpotlightConfigContentViewResult shopSpotlightConfigContentViewResult = (ShopSpotlightConfigContentViewResult)o;
        czd.f((Object)shopSpotlightConfigContentViewResult, "result");
        return shopSpotlightConfigContentViewResult.isFeatured();
    }
}
