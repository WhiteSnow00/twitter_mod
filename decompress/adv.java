import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public class adv extends trc$a<adv>
{
    public final adv o() {
        if (ita.b().b("include_blocked_by_and_blocking_in_requests_enabled", false)) {
            this.f("include_blocking", true);
            this.f("include_blocked_by", true);
        }
        return this;
    }
    
    public final adv p() {
        this.f("include_cards", true);
        this.d("cards_platform", "Android-12");
        return this;
    }
    
    public final adv q() {
        this.e("ext", (Collection)n2v.c());
        return this;
    }
    
    public final adv r() {
        this.i(n2v.g());
        return this;
    }
    
    public final adv s() {
        this.f("include_user_entities", true);
        this.f("include_profile_interstitial_type", true);
        this.f("include_ext_professional", true);
        if (tkr.k()) {
            this.f("include_viewer_quick_promote_eligibility", true);
        }
        if (ita.b().b("creator_android_nft_avatar_http_include_enabled", false)) {
            this.f("include_ext_has_nft_avatar", true);
        }
        if (ita.b().b("subscriptions_android_is_blue_verified_field_enabled", false)) {
            this.f("include_ext_is_blue_verified", true);
        }
        return this;
    }
}
