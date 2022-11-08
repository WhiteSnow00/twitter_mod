// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.topiccarousel.followtoggle;

import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;
import kotlin.Metadata;
import com.twitter.tweetview.core.TweetViewViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/topiccarousel/followtoggle/FollowToggleViewDelegateBinder;", "Lg6x;", "Ljjb;", "Lcom/twitter/tweetview/core/TweetViewViewModel;", "subsystem.tfa.topiccarousel.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class FollowToggleViewDelegateBinder implements g6x<jjb, TweetViewViewModel>
{
    public final gob a;
    public final dsb b;
    public final blu c;
    public final aav d;
    public final z7x e;
    
    public FollowToggleViewDelegateBinder(final gob a, final dsb b, final blu c, final aav d, final z7x e) {
        zzd.f((Object)b, "friendshipCache");
        zzd.f((Object)c, "tweetFollowRepository");
        zzd.f((Object)d, "twitterDatabaseHelper");
        zzd.f((Object)e, "viewLifecycle");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final j29 a(final f6x f6x, final g8x g8x) {
        final jjb jjb = (jjb)f6x;
        final TweetViewViewModel tweetViewViewModel = (TweetViewViewModel)g8x;
        zzd.f((Object)jjb, "viewDelegate");
        zzd.f((Object)tweetViewViewModel, "viewModel");
        final ryu b = tweetViewViewModel.b();
        if (b != null) {
            final vo6 a = b.a;
            if (a != null) {
                this.b(jjb, a);
            }
        }
        final rd6 rd6 = new rd6();
        rd6.a(this.e.d().observeOn(yvo.c()).flatMap((qtb)new tj4((rtb)new kjb(tweetViewViewModel, this), 6)).observeOn(h6q.C()).subscribe((fk6)new sna((rtb)new ljb(this, jjb), 9)));
        rd6.a(kno.f((View)jjb.C0).subscribe((fk6)new ug((rtb)new njb(tweetViewViewModel, this, jjb), 8)));
        return (j29)rd6;
    }
    
    public final void b(final jjb jjb, final vo6 vo6) {
        final boolean f = this.b.f(vo6.w(), 1);
        final TypefacesTextView c0 = jjb.C0;
        int text;
        if (f) {
            text = 2131959333;
        }
        else {
            text = 2131954121;
        }
        ((TextView)c0).setText(text);
    }
}
