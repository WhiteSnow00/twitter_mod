import com.twitter.business.moduleconfiguration.businessinfo.util.inputtext.BusinessInputTextType;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e03
{
    public final sv1<a> a;
    
    public e03() {
        this.a = (sv1<a>)new sv1();
    }
    
    public final t5j<a.e03$a$a> a() {
        final sv1<a> a = this.a;
        Objects.requireNonNull(a);
        final t5j distinctUntilChanged = ((t5j)new d8j((bol)a)).distinctUntilChanged();
        e0e.e((Object)distinctUntilChanged, "emitter.toObservable().distinctUntilChanged()");
        final t5j ofType = distinctUntilChanged.ofType((Class)a.e03$a$a.class);
        e0e.c((Object)ofType);
        return (t5j<a.e03$a$a>)ofType;
    }
    
    public final void b(final String s, final BusinessInputTextType businessInputTextType) {
        e0e.f((Object)s, "input");
        e0e.f((Object)businessInputTextType, "type");
        this.a.onNext((Object)new a.e03$a$a(s, businessInputTextType));
    }
    
    public abstract static class a
    {
    }
}
