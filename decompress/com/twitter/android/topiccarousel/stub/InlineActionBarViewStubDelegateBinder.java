// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topiccarousel.stub;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.tweetview.core.TweetViewViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/topiccarousel/stub/InlineActionBarViewStubDelegateBinder;", "Lg6x;", "Lvax;", "Lcom/twitter/tweetview/core/TweetViewViewModel;", "subsystem.tfa.topiccarousel.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class InlineActionBarViewStubDelegateBinder implements g6x<vax, TweetViewViewModel>
{
    public final rp2 a;
    
    public InlineActionBarViewStubDelegateBinder(final rp2 a) {
        this.a = a;
    }
    
    public final j29 a(final f6x f6x, final g8x g8x) {
        final vax vax = (vax)f6x;
        final TweetViewViewModel tweetViewViewModel = (TweetViewViewModel)g8x;
        zzd.f((Object)vax, "viewDelegate");
        zzd.f((Object)tweetViewViewModel, "viewModel");
        Objects.requireNonNull(this.a);
        if (dta.b().b("topics_carousel_inline_action_bar_enabled", false)) {
            vax.a();
        }
        return (j29)new rd6();
    }
}
