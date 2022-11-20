import com.twitter.account.smartlock.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class po3 extends tp1<ynj<a.c>>
{
    public final void b(final Object o) {
        czd.f((Object)o, "credentialOptional");
        tqf.n("settings", "save_credential", "success");
    }
    
    public final void onError(final Throwable t) {
        czd.f((Object)t, "e");
        tqf.o("settings", t);
    }
}
