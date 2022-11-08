import java.util.TimeZone;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import java.util.Objects;
import com.twitter.business.model.listselection.BusinessListSelectionData$BusinessTimezone;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ow2 extends gue implements rtb<BusinessListSelectionContentViewResult, oyv>
{
    public final /* synthetic */ rw2 C0;
    
    public ow2(final rw2 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        final gv2 h0 = this.C0.H0;
        final BusinessListSelectionData originalItem = businessListSelectionContentViewResult.getOriginalItem();
        zzd.d((Object)originalItem, "null cannot be cast to non-null type com.twitter.business.model.listselection.BusinessListSelectionData.BusinessTimezone");
        final TimeZone timezone = ((BusinessListSelectionData$BusinessTimezone)originalItem).getTimezone();
        Objects.requireNonNull(h0);
        zzd.f((Object)timezone, "selectedTimeZone");
        h0.a.onNext((Object)new fv2.k(timezone));
        return oyv.a;
    }
}
