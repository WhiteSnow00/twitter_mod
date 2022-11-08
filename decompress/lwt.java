import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwt
{
    public final yp6 a;
    public final Context b;
    public final UserIdentifier c;
    public final psc d;
    public final aq6 e;
    public Collection<? extends o3m> f;
    
    public lwt(final yp6 a, final Context b, final UserIdentifier c, final psc d, final aq6 e) {
        zzd.f((Object)a, "client");
        zzd.f((Object)b, "context");
        zzd.f((Object)d, "requestController");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
