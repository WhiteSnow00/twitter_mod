import androidx.fragment.app.Fragment;
import java.util.List;
import androidx.fragment.app.p;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kc1
{
    public static final a Companion;
    public final Context a;
    public final trc b;
    public final qft c;
    
    static {
        Companion = new a();
    }
    
    public kc1(final Context a, final trc b, final qft c) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "requestController");
        czd.f((Object)c, "toaster");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final String s, final UserIdentifier userIdentifier, final long n, final uil uil, final brb brb, final p p8, final elm elm, final elm elm2) {
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)brb, "friendshipCache");
        czd.f((Object)p8, "fragmentManager");
        this.b(s, p8, (nsb<fzv>)new kc1$b(elm, this, userIdentifier, n, uil, brb), (nsb<fzv>)new kc1$c(elm2, this, userIdentifier, n, uil, brb));
    }
    
    public final void b(String string, final p p4, final nsb<fzv> nsb, final nsb<fzv> nsb2) {
        final String string2 = this.a.getString(2131956986);
        czd.e((Object)string2, "context.getString(R.string.remove_autoblock)");
        final tl tl = new tl(2131232251, 1, string2, (String)null, 0, (String)null, (String)null, 2040);
        final Context a = this.a;
        if (string == null) {
            string = "";
        }
        string = a.getString(2131952121, new Object[] { string });
        czd.e((Object)string, "context.getString(R.stri\u2026sand_arg, username ?: \"\")");
        final List s = s9i.s(tl, new tl(2131232273, 4, string, (String)null, 0, (String)null, (String)null, 2040));
        final rl$b rl$b = new rl$b(1);
        final dm$b dm$b = new dm$b();
        ((rif)dm$b.h).q((Iterable)s);
        ((m92$a)dm$b).e = true;
        final int a2 = c5j.a;
        ((tlp$a)rl$b).z(((n4j)dm$b).e());
        final wk1 w = ((xk1$a)rl$b).w();
        w.U1 = (xv8)new a9l(s, (nsb)nsb, (nsb)nsb2);
        ((Fragment)w).S1();
        w.l2(p4);
    }
    
    public static final class a
    {
    }
}
