import java.util.TimeZone;
import java.util.Objects;
import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hw2 extends ste implements qsb<BusinessListSelectionContentViewResult, fzv>
{
    public final kw2 D0;
    
    public hw2(final kw2 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        final zu2 i0 = this.D0.I0;
        final BusinessListSelectionData originalItem = businessListSelectionContentViewResult.getOriginalItem();
        czd.d((Object)originalItem, "null cannot be cast to non-null type com.twitter.business.model.listselection.BusinessListSelectionData.BusinessTimezone");
        final TimeZone timezone = ((BusinessListSelectionData.BusinessTimezone)originalItem).getTimezone();
        Objects.requireNonNull(i0);
        czd.f((Object)timezone, "selectedTimeZone");
        i0.a.onNext((Object)new yu2$k(timezone));
        return fzv.a;
    }
}
