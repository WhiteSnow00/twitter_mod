import com.twitter.business.api.BusinessInfoContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zmh extends ste implements qsb<BusinessInfoContentViewResult, Boolean>
{
    public static final zmh D0;
    
    static {
        D0 = new zmh();
    }
    
    public zmh() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessInfoContentViewResult businessInfoContentViewResult = (BusinessInfoContentViewResult)o;
        czd.f((Object)businessInfoContentViewResult, "result");
        return businessInfoContentViewResult.isFeatured();
    }
}
