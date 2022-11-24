import com.twitter.business.model.listselection.BusinessListSelectionData$BusinessTimezone;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ax2 extends pue implements stb<BusinessListSelectionContentViewResult, Boolean>
{
    public static final ax2 F0;
    
    static {
        F0 = new ax2();
    }
    
    public ax2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        e0e.f((Object)businessListSelectionContentViewResult, "it");
        return businessListSelectionContentViewResult.getOriginalItem() instanceof BusinessListSelectionData$BusinessTimezone;
    }
}
