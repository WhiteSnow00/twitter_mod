// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.brandedlikepreview;

import android.os.BaseBundle;
import android.content.res.Resources;
import java.util.Map;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Context;
import com.twitter.tweetview.core.TweetViewViewModel;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/brandedlikepreview/BrandedLikePreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lad2;", "Lyc2;", "Lxc2;", "feature.tfa.branded-like-preview.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BrandedLikePreviewViewModel extends MviViewModel<ad2, yc2, xc2>
{
    public static final ape<Object>[] U0;
    public final TweetViewViewModel Q0;
    public final deg R0;
    public String S0;
    public final yyh T0;
    
    static {
        U0 = new ape[] { (ape)lb0.h(BrandedLikePreviewViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BrandedLikePreviewViewModel(final kcm kcm, final BrandedLikePreviewContentViewArgs brandedLikePreviewContentViewArgs, final TweetViewViewModel q0, final dqu dqu, final deg r0, final Context context, final duo duo) {
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)brandedLikePreviewContentViewArgs, "contentViewArgs");
        e0e.f((Object)q0, "tweetViewViewModel");
        e0e.f((Object)dqu, "tweetRepository");
        e0e.f((Object)r0, "lottieFetcher");
        e0e.f((Object)context, "context");
        e0e.f((Object)duo, "savedStateHandler");
        super((iae)kcm, (ccx)ad2$a.a);
        this.Q0 = q0;
        this.R0 = r0;
        this.P((stb)new BrandedLikePreviewViewModel$a(r1n.I0));
        duo.a((gto<?>)new tt2(this, brandedLikePreviewContentViewArgs) {
            public final BrandedLikePreviewViewModel F0;
            public final BrandedLikePreviewContentViewArgs G0;
            
            public final void T0() {
                final String animationPath = this.G0.getAnimationPath();
                if (animationPath != null) {
                    BrandedLikePreviewViewModel.W(this.F0, animationPath);
                }
            }
            
            public final void a(final Bundle bundle) {
                final String s0 = this.F0.S0;
                if (s0 != null) {
                    ((BaseBundle)bundle).putString("URI", s0);
                }
            }
            
            public final void v(final Parcelable parcelable) {
                final String string = ((BaseBundle)parcelable).getString("URI");
                if (string != null) {
                    BrandedLikePreviewViewModel.W(this.F0, string);
                }
            }
        });
        final Long tweetId = brandedLikePreviewContentViewArgs.getTweetId();
        if (tweetId != null) {
            final t5j<noj<hp6>> y2 = dqu.y2(tweetId);
            e0e.e((Object)y2, "tweetRepository.getTweet(tweetId)");
            MviViewModel.M((MviViewModel)this, (t5j)y2, (String)null, (asx)null, (hub)new hub<noj<hp6>, mp6<? super vzv>, Object>(this, null) {
                public Object F0;
                public final BrandedLikePreviewViewModel G0;
                
                public final mp6<vzv> create(final Object f0, final mp6<?> mp6) {
                    final hub<noj<hp6>, mp6<? super vzv>, Object> hub = (hub<noj<hp6>, mp6<? super vzv>, Object>)new hub<noj<hp6>, mp6<? super vzv>, Object>(this.G0, mp6) {
                        public Object F0;
                        public final BrandedLikePreviewViewModel G0;
                    };
                    hub.F0 = f0;
                    return (mp6<vzv>)hub;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    final hub<noj<hp6>, mp6<? super vzv>, Object> hub = (hub<noj<hp6>, mp6<? super vzv>, Object>)this.create(o, (mp6<?>)o2);
                    final vzv a = vzv.a;
                    hub.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    jb2.M0(o);
                    final noj noj = (noj)this.F0;
                    if (noj.f()) {
                        final TweetViewViewModel q0 = this.G0.Q0;
                        final Object c = noj.c();
                        e0e.e(c, "it.get()");
                        q0.i(new xzu((hp6)c));
                    }
                    return vzv.a;
                }
            }, 3, (Object)null);
        }
        else {
            final Resources resources = context.getResources();
            e0e.e((Object)resources, "context.resources");
            final String string = resources.getString(2131957367);
            e0e.e((Object)string, "resources.getString(R.string.sample_tweet_text)");
            final hp6.b b = new hp6.b();
            b.a.b = 1L;
            b.c.a = 1L;
            b.v(783214L);
            b.c.b = 783214L;
            final g5s a = nq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            final long n = 600000;
            final vg3$b a2 = b.a;
            a2.d = currentTimeMillis - n;
            final geu$a b2 = b.b;
            b2.c = "Twitter";
            b2.e = "https://pbs.twimg.com/profile_images/1488548719062654976/u6qfBBkF_400x400.jpg";
            a2.p(5);
            b.b.b = "Twitter";
            b.a.y = new rfu(string, null, null);
            q0.i(new xzu((hp6)b.e()));
        }
        this.T0 = hfe.v((MviViewModel)this, (stb)new BrandedLikePreviewViewModel$d(this));
    }
    
    public static final void W(final BrandedLikePreviewViewModel brandedLikePreviewViewModel, final String s0) {
        brandedLikePreviewViewModel.S0 = s0;
        brandedLikePreviewViewModel.Q((stb)new jd2(s0));
        final f8j b = ((orm)brandedLikePreviewViewModel.R0).b((bsm)new leg(new leg$a(s0)));
        final i3 i3 = new i3((Object)brandedLikePreviewViewModel, (Object)s0, 3);
        final v9j v9j = (v9j)b;
        v9j.I0.a((fa3)i3);
        v9j.f((fa3)new id2((Object)s0, (Object)brandedLikePreviewViewModel, 0));
    }
    
    public final azh<yc2> v() {
        return (azh<yc2>)this.T0.a((ape)BrandedLikePreviewViewModel.U0[0]);
    }
}
