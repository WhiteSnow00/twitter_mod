import android.content.Context;
import com.twitter.app.common.args.ContentViewArgs;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aob
{
    public final Activity a;
    public final p b;
    public final fob c;
    
    public aob(final Activity a, final p b, final fob c) {
        czd.f((Object)a, "activity");
        czd.f((Object)c, "globalFragmentProvider");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final <T extends dnb> Fragment a(final T t) {
        czd.f((Object)t, "args");
        final Fragment c = this.c(this.c.c((Class)t.getClass()));
        c.N1(t.a());
        return c;
    }
    
    public final <T extends ContentViewArgs> Fragment b(final T t) {
        czd.f((Object)t, "args");
        final Fragment c = this.c(this.c.b((Class)t.getClass()));
        af8.N(c, (ContentViewArgs)t);
        return c;
    }
    
    public final Fragment c(final Class<? extends Fragment> clazz) {
        final Fragment a = this.b.L().a(((Context)this.a).getClassLoader(), clazz.getName());
        czd.e((Object)a, "fragmentManager.fragment\u2026ader, fragmentClass.name)");
        return a;
    }
}
