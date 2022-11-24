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

public final class rhc extends fjv<String, phc>
{
    public final Uri f;
    
    public rhc(final Context context, final int n, final uiv uiv, final UserIdentifier userIdentifier) {
        super(context, 2, n, true, uiv);
        this.f = pgv.a(SuggestionsProvider.G0.buildUpon(), userIdentifier).build();
    }
    
    public final p4e b(final Object o, final boolean b) {
        final String s = (String)o;
        final Uri$Builder buildUpon = this.f.buildUpon();
        String s2;
        if (b) {
            s2 = "true";
        }
        else {
            s2 = "false";
        }
        return (p4e)new j2d(super.a.getContentResolver().query(buildUpon.appendQueryParameter("add_query_to_empty_result", s2).build(), (String[])null, s, (String[])null, (String)null), (ca7)new SuggestionsProvider$b());
    }
    
    public final void f(final Object o, ogv j0) {
        String string = (String)o;
        final List b = j0.b;
        j0 = (ogv)SuggestionsProvider.J0;
        synchronized (j0) {
            if (!string.startsWith("#")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(string);
                string = sb.toString();
            }
            ((HashMap<String, List>)j0).put(string, b);
        }
    }
    
    public final boolean g(final Object o) {
        return SuggestionsProvider.e((String)o) == null;
    }
}
