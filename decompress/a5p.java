import java.util.Collection;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a5p implements c9p
{
    public final a8p a;
    public final p9r b;
    public final c5p c;
    public final aav d;
    public final n5p e;
    
    public a5p(final a8p a, final p9r b, final c5p c, final aav d, final n5p e) {
        zzd.f((Object)a, "searchSuggestionCache");
        zzd.f((Object)b, "staticSearchProvider");
        zzd.f((Object)c, "searchAvatarPresenceManager");
        zzd.f((Object)d, "twitterDatabaseHelper");
        zzd.f((Object)e, "searchDatabaseHelper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final List<l8p> a(final String s, final psl psl) {
        zzd.f((Object)s, "untrimmedQuery");
        final ArrayList list = new ArrayList();
        this.b.c(((tk1)this.e).p(), s, (Set)new LinkedHashSet(), dta.b().f("recent_search_limit_count", 5));
        final Collection c = this.b.c;
        zzd.e((Object)c, "staticSearchProvider.savedSuggestions");
        final Collection a = this.b.a();
        list.addAll(a);
        this.c.b(a);
        list.addAll(c);
        return xkq.a((List)list, (List)null, (l8p)null);
    }
    
    @Override
    public final List<l8p> b(final String s, final String s2, final psl psl) {
        zzd.f((Object)s, "untrimmedQuery");
        zzd.f((Object)s2, "trimmedQuery");
        final ArrayList list = new ArrayList();
        final int a = hhv.a;
        final int f = dta.b().f("typeahead_search_max_users", 10);
        final o6p a2 = o6p.e.a(s2);
        ffv a3;
        if (f == 0) {
            a3 = null;
        }
        else {
            a3 = this.a.a(s2);
        }
        List e;
        if (a3 != null) {
            e = a3.e;
        }
        else {
            e = null;
        }
        if (a2.c || a2.a) {
            final tyr p3 = ((tk1)this.d).p();
            zzd.e((Object)p3, "twitterDatabaseHelper.readableDatabase");
            final List a4 = new yiw(p3, this.a).a(s2, f);
            list.addAll(a4);
            this.c.c(a4);
        }
        return xkq.a((List)list, e, (l8p)null);
    }
}
