import com.twitter.autocomplete.suggestion.SuggestionsProvider;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qjw extends tiv<String, njw>
{
    public qjw(final Context context, final int n, final iiv iiv) {
        super(context, 1, n, false, iiv);
    }
    
    public final void f(final Object o, final agv agv) {
        SuggestionsProvider.b((String)o, agv.a);
    }
    
    public final boolean g(final Object o) {
        return SuggestionsProvider.f((String)o) == null;
    }
}
