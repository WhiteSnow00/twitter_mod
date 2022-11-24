import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import android.os.Looper;
import android.content.Context;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$f;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class k5c<T extends IInterface> extends gm1<T> implements a$f, m5y
{
    public final lh4 i1;
    public final Set<Scope> j1;
    public final Account k1;
    
    public k5c(final Context context, final Looper looper, final int n, final lh4 i1, final zh6 zh6, final whj whj) {
        final l5c a = l5c.a(context);
        final int c = r5c.c;
        final r5c e = r5c.e;
        Objects.requireNonNull(zh6, "null reference");
        Objects.requireNonNull(whj, "null reference");
        super(context, looper, a, (s5c)e, n, (gm1$a)new d5y(zh6), (gm1$b)new h5y(whj), i1.g);
        this.i1 = i1;
        this.k1 = i1.a;
        final Set c2 = i1.c;
        final Iterator iterator = c2.iterator();
        while (iterator.hasNext()) {
            if (c2.contains(iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        this.j1 = c2;
    }
    
    public final void A() {
    }
    
    public final Set<Scope> C() {
        return this.j1;
    }
    
    public final Set<Scope> m() {
        Object o;
        if (this.k()) {
            o = this.j1;
        }
        else {
            o = Collections.emptySet();
        }
        return (Set<Scope>)o;
    }
    
    public final Account y() {
        return this.k1;
    }
}
