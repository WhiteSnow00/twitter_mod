import java.util.LinkedHashSet;
import android.content.Context;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class p4m
{
    public static final a Companion;
    public static final awj<String, String> i;
    public static final oxm j;
    public final fa3<p4m> a;
    public final UserIdentifier b;
    public final tsc c;
    public klp d;
    public awj<String, String> e;
    public gnp f;
    public boolean g;
    public boolean h;
    
    static {
        Companion = new a();
        i = new awj((Object)"", (Object)"");
        j = new oxm("", new ug3("", "", (Map)bp6.a));
    }
    
    public p4m(final fa3<p4m> a, final Context context, final UserIdentifier b, final tsc c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = p4m.i;
        new LinkedHashSet();
        this.f = (gnp)p4m.j;
    }
    
    public abstract klp a();
    
    public final void b(final String s, final ug3 ug3, final gnp f) {
        e0e.f((Object)f, "recommendation");
        this.h = true;
        this.g = true;
        final String a = ug3.a;
        e0e.e((Object)a, "winningCandidate.hostname");
        this.e = (awj<String, String>)new awj((Object)s, (Object)a);
        this.f = f;
        this.a.a((Object)this);
    }
    
    public static final class a
    {
    }
}
