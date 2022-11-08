import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageSubscribeButton;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageHeader;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageFeatureBuckets;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageFeatureBuckets$JsonMarketingPageFeatureBucket;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageFeatureBuckets$JsonMarketingPageFeature;
import com.twitter.subsystem.subscriptions.signup.model.MarketingPageFeature;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageCarousel$JsonMarketingPageCarouselItem;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageCarousel;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPageCard;
import com.twitter.subsystem.subscriptions.signup.json.JsonMarketingPage;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class trr implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)slg.class, (Class)JsonMarketingPage.class, (bra)null);
        jsonModelRegistry$a.b((Class)tlg.class, (Class)JsonMarketingPageCard.class, (bra)null);
        jsonModelRegistry$a.b((Class)vlg.class, (Class)JsonMarketingPageCarousel.class, (bra)null);
        jsonModelRegistry$a.b((Class)wlg.class, (Class)JsonMarketingPageCarousel$JsonMarketingPageCarouselItem.class, (bra)null);
        jsonModelRegistry$a.b((Class)MarketingPageFeature.class, (Class)JsonMarketingPageFeatureBuckets$JsonMarketingPageFeature.class, (bra)null);
        jsonModelRegistry$a.b((Class)xlg.class, (Class)JsonMarketingPageFeatureBuckets$JsonMarketingPageFeatureBucket.class, (bra)null);
        jsonModelRegistry$a.b((Class)ylg.class, (Class)JsonMarketingPageFeatureBuckets.class, (bra)null);
        jsonModelRegistry$a.b((Class)zlg.class, (Class)JsonMarketingPageHeader.class, (bra)null);
        jsonModelRegistry$a.b((Class)amg.class, (Class)JsonMarketingPageSubscribeButton.class, (bra)null);
    }
}
