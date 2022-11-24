import java.util.Objects;
import android.content.Intent;
import com.twitter.ocf.contacts.upload.ContactsUploadService;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nl6 implements ml6
{
    public final Context a;
    public final tsc b;
    public final bw0 c;
    
    public nl6(final Context a, final tsc b, final bw0 c) {
        e0e.f((Object)a, "context");
        e0e.f((Object)b, "httpRequestController");
        e0e.f((Object)c, "asyncOperationController");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        final Context a = this.a;
        final int g0 = ContactsUploadService.G0;
        final g2g a2 = g2g.a(userIdentifier);
        final boolean a3 = a2.c.a(a2.a, new String[] { "android.permission.READ_CONTACTS" });
        boolean b = false;
        if (a3 && !a2.c()) {
            a.startService(new Intent(a, (Class)ContactsUploadService.class).putExtra("scribe_page_term", "onboarding").putExtra("extra_is_live_sync_experience", true));
            b = true;
        }
        return b;
    }
    
    public final void b(final UserIdentifier userIdentifier) {
        e0e.f((Object)userIdentifier, "owner");
        final bw0 c = this.c;
        final id4 id4 = new id4(this.a, userIdentifier);
        Objects.requireNonNull(c);
        c.d((aw0)((dw0)id4).c());
    }
    
    public final void c(final UserIdentifier userIdentifier, final stb<? super Boolean, vzv> stb) {
        e0e.f((Object)userIdentifier, "owner");
        final z1g z1g = new z1g(this.a, userIdentifier, g2g.a(userIdentifier));
        ((pnm)z1g).U((aw0$b)new nl6$b((stb)stb));
        this.b.f((pnm)z1g);
    }
    
    public final void d(final UserIdentifier userIdentifier, final stb<? super Boolean, vzv> stb) {
        e0e.f((Object)userIdentifier, "owner");
        final ht8 ht8 = new ht8(userIdentifier);
        ((pnm)ht8).U((aw0$b)new nl6$a((stb)stb));
        this.b.f((pnm)ht8);
    }
}
