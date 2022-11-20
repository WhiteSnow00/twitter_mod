import com.twitter.autocomplete.suggestion.SuggestionsProvider$e;
import com.twitter.autocomplete.suggestion.SuggestionsProvider;
import android.content.Context;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d1h extends qjw
{
    public final Uri f;
    public final Uri g;
    public String h;
    
    public d1h(final Context context, final boolean b, final iiv iiv) {
        super(context, eiv.a(), iiv);
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        final Uri build = SuggestionsProvider.F0.buildUpon().appendQueryParameter("friendship", String.valueOf(n | 0x400)).build();
        this.f = build;
        this.g = build.buildUpon().appendQueryParameter("add_real_time_suggestions", "true").build();
    }
    
    public final n3e b(final Object o, final boolean b) {
        final String trim = ((String)o).trim();
        Uri uri;
        if (ikr.e((CharSequence)trim)) {
            if (this.h == null) {
                uri = this.f;
            }
            else {
                uri = this.f.buildUpon().appendQueryParameter("additional_user_ids", this.h).build();
            }
        }
        else {
            uri = this.g;
        }
        return (n3e)new j1d(super.a.getContentResolver().query(uri, (String[])null, trim, (String[])null, (String)null), (w87)new SuggestionsProvider$e());
    }
}
