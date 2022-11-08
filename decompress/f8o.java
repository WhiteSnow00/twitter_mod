import java.util.Objects;
import java.util.concurrent.TimeUnit;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8o implements e8o
{
    public static final f8o.f8o$a Companion;
    public static final vf6<UserIdentifier, String> c;
    public final UserIdentifier a;
    public final flv<UserIdentifier, String> b;
    
    static {
        Companion = new f8o.f8o$a();
        final vf6$a vf6$a = new vf6$a();
        vf6$a.d = (tpe)tpe.c;
        vf6$a.b = "auto_tweeted_space_id";
        final hx6$h a = hx6.a;
        vf6$a.c = (alp)new kx6();
        vf6$a.a = new cir(new afg(1, 1), TimeUnit.DAYS.toMillis(3L));
        c = new vf6(vf6$a);
    }
    
    public f8o(final glv glv, final UserIdentifier a) {
        zzd.f((Object)glv, "repositoryManager");
        zzd.f((Object)a, "owner");
        this.a = a;
        Objects.requireNonNull(f8o.Companion);
        final flv a2 = glv.a((vf6)f8o.c);
        zzd.e((Object)a2, "repositoryManager.getRepository(configuration)");
        this.b = (flv<UserIdentifier, String>)a2;
    }
    
    public final iz5 a(final String s) {
        zzd.f((Object)s, "spaceId");
        final n9q e = this.b.e((Object)this.a, (Object)s);
        Objects.requireNonNull(e);
        return (iz5)new yz5((ubq)e);
    }
    
    public final n9q<Boolean> b(final String s) {
        return (n9q<Boolean>)this.b.get((Object)this.a).w((qtb)new dzf((rtb)new f8o$b(s), 23));
    }
}
