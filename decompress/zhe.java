import com.twitter.api.model.json.onboarding.JsonSettingsValue;
import com.twitter.model.json.onboarding.ocf.subtasks.JsonSubtask;
import java.util.Collection;
import j$.util.Collection$_EL;
import j$.util.function.Function$_CC;
import j$.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zhe implements Function
{
    public static final zhe b;
    public static final zhe c;
    public static final zhe d;
    public final int a;
    
    static {
        b = new zhe(0);
        c = new zhe(1);
        d = new zhe(2);
    }
    
    public zhe(final int a) {
        this.a = a;
    }
    
    public final Function andThen(final Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
        }
    }
    
    public final Object apply(final Object o) {
        switch (this.a) {
            default: {
                final wqp wqp = (wqp)o;
                final int q = sop.q;
                return Collection$_EL.stream((Collection)wqp.b());
            }
            case 1: {
                return ((JsonSubtask)o).t();
            }
            case 0: {
                return ((JsonSettingsValue)o).u();
            }
        }
    }
    
    public final Function compose(final Function function) {
        switch (this.a) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$compose((Function)this, function);
            }
        }
    }
}
