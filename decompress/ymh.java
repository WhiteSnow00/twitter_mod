import com.twitter.business.api.BusinessInfoContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ymh extends ste implements qsb<BusinessInfoContentViewResult, Boolean>
{
    public static final ymh D0;
    
    static {
        D0 = new ymh();
    }
    
    public ymh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessInfoContentViewResult businessInfoContentViewResult = (BusinessInfoContentViewResult)o;
        czd.f((Object)businessInfoContentViewResult, "result");
        return businessInfoContentViewResult.getModulesWereUpdated();
    }
}
