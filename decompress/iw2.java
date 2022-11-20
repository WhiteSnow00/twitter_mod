import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iw2 extends ste implements qsb<BusinessListSelectionContentViewResult, Boolean>
{
    public static final iw2 D0;
    
    static {
        D0 = new iw2();
    }
    
    public iw2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        czd.f((Object)businessListSelectionContentViewResult, "it");
        return businessListSelectionContentViewResult.getOriginalItem() instanceof BusinessListSelectionData.BusinessTimezone;
    }
}
