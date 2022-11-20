// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.unifiedlanding.sample.implementation.header;

import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004" }, d2 = { "Lcom/twitter/android/unifiedlanding/sample/implementation/header/SamplePageHeaderViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Loro;", "", "feature.tfa.unifiedlanding.sample.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class SamplePageHeaderViewModel extends MviViewModel
{
    public SamplePageHeaderViewModel(final xbm xbm, final kro kro) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)kro, "samplePageHeader");
        final String b = kro.b;
        czd.e((Object)b, "samplePageHeader.sampleText");
        super((k9e)xbm, (jbx)new oro(b));
        this.Q((qsb)SamplePageHeaderViewModel$a.D0);
    }
}
