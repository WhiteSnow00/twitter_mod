import com.twitter.model.json.onboarding.JsonOcfRichText;
import j$.util.function.Function$_CC;
import j$.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uie implements Function
{
    public static final uie a;
    
    static {
        a = new uie();
    }
    
    public final Function andThen(final Function function) {
        return Function$_CC.$default$andThen((Function)this, function);
    }
    
    public final Object apply(final Object o) {
        return JsonOcfRichText.s((JsonOcfRichText)o);
    }
    
    public final Function compose(final Function function) {
        return Function$_CC.$default$compose((Function)this, function);
    }
}
