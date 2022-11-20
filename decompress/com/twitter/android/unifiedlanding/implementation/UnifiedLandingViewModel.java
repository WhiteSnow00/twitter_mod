// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.unifiedlanding.implementation;

import java.util.Objects;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/unifiedlanding/implementation/UnifiedLandingViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lazv;", "", "feature.tfa.unifiedlanding.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class UnifiedLandingViewModel extends MviViewModel
{
    public static final int P0 = 0;
    public final jca O0;
    
    public UnifiedLandingViewModel(final vsj vsj, final xbm xbm, final jca o0, final wyv wyv, final r8x r8x) {
        czd.f((Object)vsj, "pageRepository");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)o0, "eventSectionPrefixDispatcher");
        czd.f((Object)wyv, "impressionScriber");
        czd.f((Object)r8x, "lifecycle");
        super((k9e)xbm, (jbx)azv$b.a);
        this.O0 = o0;
        final h5j doOnSubscribe = ((h5j)vsj.e).doOnSubscribe((lj6)new gt1((qsb)new usj(vsj), 4));
        czd.e((Object)doOnSubscribe, "fun observable(): Observ\u2026Subscribe { fetchData() }");
        MviViewModel.M((MviViewModel)this, doOnSubscribe, (String)null, (jrx)null, (ftb)new ftb<msm<xsj, kbv>, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final UnifiedLandingViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<msm<xsj, kbv>, go6<? super fzv>, Object> ftb = (ftb<msm<xsj, kbv>, go6<? super fzv>, Object>)new ftb<msm<xsj, kbv>, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final UnifiedLandingViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<msm<xsj, kbv>, go6<? super fzv>, Object> ftb = (ftb<msm<xsj, kbv>, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final msm msm = (msm)this.D0;
                final UnifiedLandingViewModel e0 = this.E0;
                final UnifiedLandingViewModel$a$a unifiedLandingViewModel$a$a = new UnifiedLandingViewModel$a$a(e0, msm);
                final int p = UnifiedLandingViewModel.P0;
                e0.Q((qsb)unifiedLandingViewModel$a$a);
                return fzv.a;
            }
        }, 3, (Object)null);
        MviViewModel.M((MviViewModel)this, r8x.d(), (String)null, (jrx)null, (ftb)new ftb<tmi, go6<? super fzv>, Object>(wyv, null) {
            public final wyv D0;
            
            public final go6<fzv> create(final Object o, final go6<?> go6) {
                return (go6<fzv>)new ftb<tmi, go6<? super fzv>, Object>(this.D0, go6) {
                    public final wyv D0;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<tmi, go6<? super fzv>, Object> ftb = (ftb<tmi, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final wyv d0 = this.D0;
                Objects.requireNonNull(d0);
                final af4 af4 = new af4(vba.Companion.d(d0.a, "", "", "page_impression"));
                final vba b = d0.b;
                if (b != null) {
                    ((u0p)af4).z(b);
                }
                cbw.b((elm)af4);
                return fzv.a;
            }
        }, 3, (Object)null);
    }
}
