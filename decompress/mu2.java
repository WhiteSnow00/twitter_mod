import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mu2 extends pue implements stb<BusinessListSelectionContentViewResult, BusinessListSelectionData>
{
    public static final mu2 F0;
    
    static {
        F0 = new mu2();
    }
    
    public mu2() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        e0e.f((Object)businessListSelectionContentViewResult, "it");
        return businessListSelectionContentViewResult.getOriginalItem();
    }
}
