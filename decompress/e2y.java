import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$f;
import java.util.Objects;
import com.google.android.gms.common.api.a;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e2y implements y2y
{
    public final b3y a;
    
    public e2y(final b3y a) {
        this.a = a;
    }
    
    public final void a(final Bundle bundle) {
    }
    
    public final void b() {
    }
    
    public final void c(final bi6 bi6, final a<?> a, final boolean b) {
    }
    
    public final void d() {
    }
    
    public final void e(final int n) {
        this.a.j();
        this.a.n.c0(n, false);
    }
    
    public final <A extends a.b, R extends etm, T extends com.google.android.gms.common.api.internal.a<R, A>> T f(final T t) {
        this.h(t);
        return t;
    }
    
    public final boolean g() {
        Objects.requireNonNull(this.a.m);
        this.a.j();
        return true;
    }
    
    public final <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends etm, A>> T h(final T t) {
        try {
            final q4y b1 = this.a.m.b1;
            b1.a.add(t);
            ((BasePendingResult)t).l(b1.b);
            final a$f a$f = this.a.m.T0.get(t.o);
            iuk.D((Object)a$f, (Object)"Appropriate Api was not requested.");
            if (!a$f.b() && this.a.g.containsKey(t.o)) {
                t.o(new Status(17, (String)null));
            }
            else {
                t.n((a.b)a$f);
            }
        }
        catch (final DeadObjectException ex) {
            this.a.k((z2y)new d2y(this, (y2y)this));
        }
        return t;
    }
}
