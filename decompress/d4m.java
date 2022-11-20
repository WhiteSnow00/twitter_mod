import java.util.LinkedHashSet;
import android.content.Context;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d4m
{
    public static final a Companion;
    public static final lvj<String, String> i;
    public static final ywm j;
    public final n93<d4m> a;
    public final UserIdentifier b;
    public final trc c;
    public okp d;
    public lvj<String, String> e;
    public kmp f;
    public boolean g;
    public boolean h;
    
    static {
        Companion = new a();
        i = new lvj((Object)"", (Object)"");
        j = new ywm("", new uf3("", "", (Map<String, String>)vn6.a));
    }
    
    public d4m(final n93<d4m> a, final Context context, final UserIdentifier b, final trc c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = d4m.i;
        new LinkedHashSet();
        this.f = d4m.j;
    }
    
    public abstract okp a();
    
    public final void b(final String s, final uf3 uf3, final kmp f) {
        czd.f((Object)f, "recommendation");
        this.h = true;
        this.g = true;
        final String a = uf3.a;
        czd.e((Object)a, "winningCandidate.hostname");
        this.e = (lvj<String, String>)new lvj((Object)s, (Object)a);
        this.f = f;
        this.a.a((Object)this);
    }
    
    public static final class a
    {
    }
}
