import java.util.HashMap;
import java.util.List;
import android.net.Uri$Builder;
import com.twitter.autocomplete.suggestion.SuggestionsProvider$b;
import com.twitter.autocomplete.suggestion.SuggestionsProvider;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgc extends tiv<String, ngc>
{
    public final Uri f;
    
    public pgc(final Context context, final int n, final iiv iiv, final UserIdentifier userIdentifier) {
        super(context, 2, n, true, iiv);
        this.f = bgv.a(SuggestionsProvider.E0.buildUpon(), userIdentifier).build();
    }
    
    public final n3e b(final Object o, final boolean b) {
        final String s = (String)o;
        final Uri$Builder buildUpon = this.f.buildUpon();
        String s2;
        if (b) {
            s2 = "true";
        }
        else {
            s2 = "false";
        }
        return (n3e)new j1d(super.a.getContentResolver().query(buildUpon.appendQueryParameter("add_query_to_empty_result", s2).build(), (String[])null, s, (String[])null, (String)null), (w87)new SuggestionsProvider$b());
    }
    
    public final void f(final Object o, agv h0) {
        String string = (String)o;
        final List b = h0.b;
        h0 = (agv)SuggestionsProvider.H0;
        synchronized (h0) {
            if (!string.startsWith("#")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(string);
                string = sb.toString();
            }
            ((HashMap<String, List>)h0).put(string, b);
        }
    }
    
    public final boolean g(final Object o) {
        return SuggestionsProvider.e((String)o) == null;
    }
}
