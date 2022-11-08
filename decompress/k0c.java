import java.util.Iterator;
import java.util.Objects;
import android.graphics.drawable.StateListDrawable;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0c
{
    public static final duo$e q;
    public static final duo$d r;
    public Resources a;
    public int b;
    public float c;
    public Drawable d;
    public duo$b e;
    public Drawable f;
    public duo$b g;
    public Drawable h;
    public duo$b i;
    public Drawable j;
    public duo$b k;
    public duo$b l;
    public Drawable m;
    public List<Drawable> n;
    public StateListDrawable o;
    public alo p;
    
    static {
        q = duo$e.a;
        r = duo$d.a;
    }
    
    public k0c(final Resources a) {
        this.a = a;
        this.b = 300;
        this.c = 0.0f;
        this.d = null;
        final duo$e q = k0c.q;
        this.e = (duo$b)q;
        this.f = null;
        this.g = (duo$b)q;
        this.h = null;
        this.i = (duo$b)q;
        this.j = null;
        this.k = (duo$b)q;
        this.l = (duo$b)k0c.r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
    
    public final j0c a() {
        final List<Drawable> n = this.n;
        if (n != null) {
            final Iterator<Drawable> iterator = n.iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull((Object)iterator.next());
            }
        }
        return new j0c(this);
    }
}
