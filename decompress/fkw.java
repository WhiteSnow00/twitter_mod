import com.twitter.autocomplete.suggestion.SuggestionsProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fkw extends fjv<String, ckw>
{
    public fkw(final Context context, final int n, final uiv uiv) {
        super(context, 1, n, false, uiv);
    }
    
    public final void f(final Object o, final ogv ogv) {
        SuggestionsProvider.b((String)o, ogv.a);
    }
    
    public final boolean g(final Object o) {
        return SuggestionsProvider.f((String)o) == null;
    }
}
