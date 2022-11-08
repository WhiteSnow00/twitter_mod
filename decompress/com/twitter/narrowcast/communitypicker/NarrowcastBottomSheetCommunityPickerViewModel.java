// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.narrowcast.communitypicker;

import com.twitter.narrowcast.args.NarrowcastBottomSheetCommunityPickerFragmentArgs;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/narrowcast/communitypicker/NarrowcastBottomSheetCommunityPickerViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Ll7i;", "", "La7i;", "feature.tfa.narrowcast.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NarrowcastBottomSheetCommunityPickerViewModel extends MviViewModel
{
    public final NarrowcastBottomSheetCommunityPickerFragmentArgs N0;
    
    public NarrowcastBottomSheetCommunityPickerViewModel(final y8i y8i, final NarrowcastBottomSheetCommunityPickerFragmentArgs n0, final ibm ibm) {
        zzd.f((Object)y8i, "repository");
        zzd.f((Object)n0, "args");
        zzd.f((Object)ibm, "releaseCompletable");
        super((fae)ibm, (oax)new l7i((ded)tdy.D0()));
        this.N0 = n0;
        this.B(y8i.a(n0.getUserIdentifier()), (rtb)new NarrowcastBottomSheetCommunityPickerViewModel$a(this));
    }
}
