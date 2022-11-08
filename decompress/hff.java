import com.twitter.business.model.listselection.BusinessListSelectionData;
import com.twitter.business.api.BusinessListSelectionContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hff extends gue implements rtb<BusinessListSelectionContentViewResult, BusinessListSelectionData>
{
    public static final hff C0;
    
    static {
        C0 = new hff();
    }
    
    public hff() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessListSelectionContentViewResult businessListSelectionContentViewResult = (BusinessListSelectionContentViewResult)o;
        zzd.f((Object)businessListSelectionContentViewResult, "it");
        return businessListSelectionContentViewResult.getOriginalItem();
    }
}
