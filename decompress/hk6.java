import java.util.Objects;
import android.content.Intent;
import com.twitter.ocf.contacts.upload.ContactsUploadService;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hk6 implements gk6
{
    public final Context a;
    public final trc b;
    public final xv0 c;
    
    public hk6(final Context a, final trc b, final xv0 c) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "httpRequestController");
        czd.f((Object)c, "asyncOperationController");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "owner");
        final Context a = this.a;
        final int e0 = ContactsUploadService.E0;
        final i1g a2 = i1g.a(userIdentifier);
        final boolean a3 = a2.c.a(a2.a, new String[] { "android.permission.READ_CONTACTS" });
        boolean b = false;
        if (a3 && !a2.c()) {
            a.startService(new Intent(a, (Class)ContactsUploadService.class).putExtra("scribe_page_term", "onboarding").putExtra("extra_is_live_sync_experience", true));
            b = true;
        }
        return b;
    }
    
    public final void b(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "owner");
        final xv0 c = this.c;
        final fc4 fc4 = new fc4(this.a, userIdentifier);
        Objects.requireNonNull(c);
        c.d(((zv0)fc4).c());
    }
    
    public final void c(final UserIdentifier userIdentifier, final qsb<? super Boolean, fzv> qsb) {
        czd.f((Object)userIdentifier, "owner");
        final b1g b1g = new b1g(this.a, userIdentifier, i1g.a(userIdentifier));
        ((anm)b1g).U((wv0$b)new orc$a<b1g>(qsb) {
            public final qsb<Boolean, fzv> D0;
            
            public final void a(final wv0 wv0) {
            }
            
            public final void b(final wv0 wv0) {
                this.D0.invoke((Object)((orc)wv0).T().b);
            }
            
            public final void c(final wv0 wv0, final boolean b) {
            }
        });
        this.b.f((orc)b1g);
    }
    
    public final void d(final UserIdentifier userIdentifier, final qsb<? super Boolean, fzv> qsb) {
        czd.f((Object)userIdentifier, "owner");
        final bs8 bs8 = new bs8(userIdentifier);
        ((anm)bs8).U((wv0$b)new orc$a<bs8>(qsb) {
            public final qsb<Boolean, fzv> D0;
            
            public final void a(final wv0 wv0) {
            }
            
            public final void b(final wv0 wv0) {
                this.D0.invoke((Object)((orc)wv0).T().b);
            }
            
            public final void c(final wv0 wv0, final boolean b) {
            }
        });
        this.b.f((orc)bs8);
    }
}
