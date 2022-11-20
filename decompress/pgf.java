import com.twitter.business.api.BusinessInputTextContentViewResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgf extends ste implements qsb<BusinessInputTextContentViewResult, ogf$a>
{
    public final ogf D0;
    
    public pgf(final ogf d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final BusinessInputTextContentViewResult businessInputTextContentViewResult = (BusinessInputTextContentViewResult)o;
        czd.f((Object)businessInputTextContentViewResult, "result");
        final h93 b = this.D0.b;
        final String tag = businessInputTextContentViewResult.getTag();
        if (tag != null) {
            return new ogf$a(d93.valueOf(tag), businessInputTextContentViewResult.getInputTextValue());
        }
        throw new Error("unrecognized tag");
    }
}
