import com.twitter.commerce.api.merchantconfiguration.ShopSpotlightConfigContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zmh extends gue implements rtb<ShopSpotlightConfigContentViewResult, Boolean>
{
    public static final zmh C0;
    
    static {
        C0 = new zmh();
    }
    
    public zmh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ShopSpotlightConfigContentViewResult shopSpotlightConfigContentViewResult = (ShopSpotlightConfigContentViewResult)o;
        zzd.f((Object)shopSpotlightConfigContentViewResult, "result");
        return shopSpotlightConfigContentViewResult.getModulesWereUpdated();
    }
}
