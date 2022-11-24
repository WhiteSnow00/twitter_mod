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
import com.twitter.model.json.common.JsonModelRegistry$b;
import com.twitter.model.json.common.JsonModelRegistry$Registrar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtr implements JsonModelRegistry$Registrar
{
    public final void a(final JsonModelRegistry$b jsonModelRegistry$b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)jsonModelRegistry$b;
        jsonModelRegistry$a.b((Class)jmg.class, (Class)JsonMarketingPage.class, (gra)null);
        jsonModelRegistry$a.b((Class)kmg.class, (Class)JsonMarketingPageCard.class, (gra)null);
        jsonModelRegistry$a.b((Class)mmg.class, (Class)JsonMarketingPageCarousel.class, (gra)null);
        jsonModelRegistry$a.b((Class)nmg.class, (Class)JsonMarketingPageCarousel$JsonMarketingPageCarouselItem.class, (gra)null);
        jsonModelRegistry$a.b((Class)MarketingPageFeature.class, (Class)JsonMarketingPageFeatureBuckets$JsonMarketingPageFeature.class, (gra)null);
        jsonModelRegistry$a.b((Class)omg.class, (Class)JsonMarketingPageFeatureBuckets$JsonMarketingPageFeatureBucket.class, (gra)null);
        jsonModelRegistry$a.b((Class)pmg.class, (Class)JsonMarketingPageFeatureBuckets.class, (gra)null);
        jsonModelRegistry$a.b((Class)qmg.class, (Class)JsonMarketingPageHeader.class, (gra)null);
        jsonModelRegistry$a.b((Class)rmg.class, (Class)JsonMarketingPageSubscribeButton.class, (gra)null);
    }
}
