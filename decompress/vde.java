import java.io.IOException;
import com.twitter.model.json.unifiedcard.components.JsonFacepile;
import com.twitter.model.json.unifiedcard.components.JsonProfileBannerComponent;
import com.twitter.model.json.unifiedcard.components.JsonCommerceProduct;
import com.twitter.model.json.unifiedcard.components.JsonMediaGalleryComponent;
import com.twitter.model.json.unifiedcard.components.JsonCommerceShopComponent;
import com.twitter.model.json.unifiedcard.components.JsonCommerceDropDetails;
import com.twitter.model.json.unifiedcard.components.JsonCommunityDetails;
import com.twitter.model.json.unifiedcard.components.JsonProductDetails;
import com.twitter.model.json.unifiedcard.components.JsonMediaWithDetailsHorizontal;
import com.twitter.model.json.unifiedcard.components.JsonTwitterListDetails;
import com.twitter.model.json.unifiedcard.components.JsonProfile;
import com.twitter.model.json.unifiedcard.components.JsonAppStoreDetails;
import com.twitter.model.json.unifiedcard.components.JsonSwipeableMedia;
import com.twitter.model.json.unifiedcard.components.JsonButtonGroup;
import com.twitter.model.json.unifiedcard.components.JsonDetails;
import com.twitter.model.json.unifiedcard.components.JsonMedia;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vde extends twj<lhh<? extends tvv>>
{
    public static final Map<String, Class<? extends lhh<? extends tvv>>> a;
    
    static {
        final sjg t = sjg.t();
        t.w((Object)"media", (Object)JsonMedia.class);
        t.w((Object)"details", (Object)JsonDetails.class);
        t.w((Object)"button_group", (Object)JsonButtonGroup.class);
        t.w((Object)"swipeable_media", (Object)JsonSwipeableMedia.class);
        t.w((Object)"app_store_details", (Object)JsonAppStoreDetails.class);
        t.w((Object)"profile", (Object)JsonProfile.class);
        t.w((Object)"twitter_list_details", (Object)JsonTwitterListDetails.class);
        t.w((Object)"media_with_details_horizontal", (Object)JsonMediaWithDetailsHorizontal.class);
        t.w((Object)"product_details", (Object)JsonProductDetails.class);
        t.w((Object)"community_details", (Object)JsonCommunityDetails.class);
        t.w((Object)"commerce_drop_details", (Object)JsonCommerceDropDetails.class);
        t.w((Object)"commerce_shop", (Object)JsonCommerceShopComponent.class);
        t.w((Object)"media_gallery", (Object)JsonMediaGalleryComponent.class);
        t.w((Object)"commerce_product", (Object)JsonCommerceProduct.class);
        t.w((Object)"profile_banner", (Object)JsonProfileBannerComponent.class);
        t.w((Object)"facepile", (Object)JsonFacepile.class);
        a = (Map)((h4j)t).e();
    }
    
    public final lhh<? extends tvv> a(final khe khe) throws IOException {
        lje lje = khe.i0();
        lhh lhh = null;
        Object j;
        Object o = j = lhh;
        while (lje != null && lje != lje.L0) {
            final int ordinal = ((Enum)lje).ordinal();
            lhh lhh2;
            String d;
            if (ordinal != 1) {
                if (ordinal != 5) {
                    if (ordinal != 7) {
                        lhh2 = lhh;
                        d = (String)o;
                    }
                    else {
                        lhh2 = lhh;
                        d = (String)o;
                        if ("type".equals(o)) {
                            j = khe.j();
                            lhh2 = lhh;
                            d = (String)o;
                        }
                    }
                }
                else {
                    d = khe.d();
                    lhh2 = lhh;
                }
            }
            else {
                final Map<String, Class<? extends lhh<? extends tvv>>> a = vde.a;
                if (a.containsKey(j)) {
                    lhh2 = (lhh)bih.c(khe, (Class)a.get(j), false);
                    d = (String)o;
                }
                else {
                    khe.m0();
                    lhh2 = null;
                    d = (String)o;
                }
            }
            lje = khe.i0();
            lhh = lhh2;
            o = d;
        }
        return lhh;
    }
}
