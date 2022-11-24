import com.twitter.account.smartlock.a$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class np3 extends zp1<noj<a$c>>
{
    public final void b(final Object o) {
        e0e.f((Object)o, "credentialOptional");
        ffe.h("settings", "save_credential", "success");
    }
    
    public final void onError(final Throwable t) {
        e0e.f((Object)t, "e");
        ffe.i("settings", t);
    }
}
