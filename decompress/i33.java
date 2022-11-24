import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i33 extends pue implements stb<BusinessListSelectionContentViewResult, BusinessListSelectionData>
{
    public static final i33 F0;
    
    static {
        F0 = new i33();
    }
    
    public i33() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        e0e.f((Object)businessListSelectionContentViewResult, "it");
        return businessListSelectionContentViewResult.getOriginalItem();
    }
}
