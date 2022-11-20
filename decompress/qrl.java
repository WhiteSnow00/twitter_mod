import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qrl
{
    public final xra a;
    public final kca b;
    public final daa c;
    
    public qrl(final xra a) {
        this.a = a;
        final ica a2 = hca.a("jobs", "gcm_token_update");
        this.b = (kca)a2;
        this.c = (daa)aaa.a(a2, "gcm_registration");
    }
    
    public static void a(final af4 af4) {
        fca.a().b(UserIdentifier.LOGGED_OUT, (elm)af4);
    }
}
