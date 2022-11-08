import com.twitter.autocomplete.suggestion.SuggestionsProvider$e;
import com.twitter.autocomplete.suggestion.SuggestionsProvider;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ic6 extends xiw
{
    public final Uri f;
    
    public ic6(final Context context, final int n, final lhv lhv, final UserIdentifier userIdentifier) {
        super(context, n, lhv);
        this.f = gfv.a(SuggestionsProvider.C0.buildUpon(), userIdentifier).build();
    }
    
    public final i4e b(final Object o, final boolean b) {
        return (i4e)new d2d(((whv)this).a.getContentResolver().query(this.f, (String[])null, (String)o, (String[])null, (String)null), (s97)new SuggestionsProvider$e());
    }
}
