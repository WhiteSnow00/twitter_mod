import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rul implements qul
{
    public final onm a;
    public final qo7 b;
    public final obi<?> c;
    
    public rul(final onm a, final qo7 b, final obi<?> c) {
        czd.f((Object)a, "requestInbox");
        czd.f((Object)b, "inboxItem");
        czd.f((Object)c, "navigator");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Long n) {
        cbw.b((elm)new af4(new String[] { da8.j("messages:inbox:", wiy.D(this.a), ":untrusted_overflow_menu:report") }));
        to7.Companion.a((obi)this.c, this.b, n);
    }
    
    public final void d(final Context context, final long n, final String s, final p p4) {
        m1f.a(context, n, s, p4);
    }
}
