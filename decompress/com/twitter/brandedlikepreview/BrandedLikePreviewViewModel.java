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

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/brandedlikepreview/BrandedLikePreviewViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lnc2;", "Llc2;", "Lkc2;", "feature.tfa.branded-like-preview.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class BrandedLikePreviewViewModel extends MviViewModel<nc2, lc2, kc2>
{
    public static final coe<Object>[] S0;
    public final TweetViewViewModel O0;
    public final jdg P0;
    public String Q0;
    public final hyh R0;
    
    static {
        S0 = new coe[] { (coe)w9.f((Class)BrandedLikePreviewViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
    }
    
    public BrandedLikePreviewViewModel(final xbm xbm, final BrandedLikePreviewContentViewArgs brandedLikePreviewContentViewArgs, final TweetViewViewModel o0, final rpu rpu, final jdg p7, final Context context, final jto jto) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)brandedLikePreviewContentViewArgs, "contentViewArgs");
        czd.f((Object)o0, "tweetViewViewModel");
        czd.f((Object)rpu, "tweetRepository");
        czd.f((Object)p7, "lottieFetcher");
        czd.f((Object)context, "context");
        czd.f((Object)jto, "savedStateHandler");
        super((k9e)xbm, (jbx)nc2$a.a);
        this.O0 = o0;
        this.P0 = p7;
        this.P((qsb)new BrandedLikePreviewViewModel$a(io7.Q0));
        jto.a((mso)new bt2(this, brandedLikePreviewContentViewArgs) {
            public final BrandedLikePreviewViewModel D0;
            public final BrandedLikePreviewContentViewArgs E0;
            
            @Override
            public final void T0() {
                final String animationPath = this.E0.getAnimationPath();
                if (animationPath != null) {
                    BrandedLikePreviewViewModel.W(this.D0, animationPath);
                }
            }
            
            @Override
            public final void a(final Bundle bundle) {
                final String q0 = this.D0.Q0;
                if (q0 != null) {
                    ((BaseBundle)bundle).putString("URI", q0);
                }
            }
            
            public final void v(final Parcelable parcelable) {
                final String string = ((BaseBundle)parcelable).getString("URI");
                if (string != null) {
                    BrandedLikePreviewViewModel.W(this.D0, string);
                }
            }
        });
        final Long tweetId = brandedLikePreviewContentViewArgs.getTweetId();
        if (tweetId != null) {
            final h5j x2 = rpu.x2((long)tweetId);
            czd.e((Object)x2, "tweetRepository.getTweet(tweetId)");
            MviViewModel.M((MviViewModel)this, x2, (String)null, (jrx)null, (ftb)new ftb<ynj<bo6>, go6<? super fzv>, Object>(this, null) {
                public Object D0;
                public final BrandedLikePreviewViewModel E0;
                
                public final go6<fzv> create(final Object d0, final go6<?> go6) {
                    final ftb<ynj<bo6>, go6<? super fzv>, Object> ftb = (ftb<ynj<bo6>, go6<? super fzv>, Object>)new ftb<ynj<bo6>, go6<? super fzv>, Object>(this.E0, go6) {
                        public Object D0;
                        public final BrandedLikePreviewViewModel E0;
                    };
                    ftb.D0 = d0;
                    return (go6<fzv>)ftb;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    final ftb<ynj<bo6>, go6<? super fzv>, Object> ftb = (ftb<ynj<bo6>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                    final fzv a = fzv.a;
                    ftb.invokeSuspend(a);
                    return a;
                }
                
                public final Object invokeSuspend(final Object o) {
                    b1n.u(o);
                    final ynj ynj = (ynj)this.D0;
                    if (ynj.f()) {
                        final TweetViewViewModel o2 = this.E0.O0;
                        final Object c = ynj.c();
                        czd.e(c, "it.get()");
                        o2.i(new mzu((bo6)c));
                    }
                    return fzv.a;
                }
            }, 3, (Object)null);
        }
        else {
            final Resources resources = context.getResources();
            czd.e((Object)resources, "context.resources");
            final String string = resources.getString(2131957367);
            czd.e((Object)string, "resources.getString(R.string.sample_tweet_text)");
            final bo6$b bo6$b = new bo6$b();
            bo6$b.a.b = 1L;
            bo6$b.c.a = 1L;
            bo6$b.v(783214L);
            bo6$b.c.b = 783214L;
            final m4s a = hq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            final long n = 600000;
            final vf3.b a2 = bo6$b.a;
            a2.d = currentTimeMillis - n;
            final qdu.a b = bo6$b.b;
            b.c = "Twitter";
            b.e = "https://pbs.twimg.com/profile_images/1488548719062654976/u6qfBBkF_400x400.jpg";
            a2.p(5);
            bo6$b.b.b = "Twitter";
            bo6$b.a.y = new cfu(string, (eku)null, (Map)null);
            o0.i(new mzu((bo6)((n4j)bo6$b).e()));
        }
        this.R0 = ewj.n(this, (qsb)new BrandedLikePreviewViewModel$d(this));
    }
    
    public static final void W(final BrandedLikePreviewViewModel brandedLikePreviewViewModel, final String q0) {
        brandedLikePreviewViewModel.Q0 = q0;
        brandedLikePreviewViewModel.Q((qsb)new vc2(q0));
        final t7j b = ((arm)brandedLikePreviewViewModel.P0).b((mrm)new rdg(new rdg$a(q0)));
        final aj0 aj0 = new aj0((Object)brandedLikePreviewViewModel, (Object)q0, 2);
        final j9j j9j = (j9j)b;
        j9j.G0.a((n93)aj0);
        j9j.f((n93)new uc2((Object)q0, (Object)brandedLikePreviewViewModel, 0));
    }
    
    public final jyh<lc2> v() {
        return (jyh<lc2>)this.R0.a((coe)BrandedLikePreviewViewModel.S0[0]);
    }
}
