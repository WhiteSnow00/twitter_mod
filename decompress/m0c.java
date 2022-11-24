import java.util.Iterator;
import java.util.Objects;
import android.graphics.drawable.StateListDrawable;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m0c
{
    public static final ovo.e q;
    public static final ovo.d r;
    public Resources a;
    public int b;
    public float c;
    public Drawable d;
    public ovo$b e;
    public Drawable f;
    public ovo$b g;
    public Drawable h;
    public ovo$b i;
    public Drawable j;
    public ovo$b k;
    public ovo$b l;
    public Drawable m;
    public List<Drawable> n;
    public StateListDrawable o;
    public imo p;
    
    static {
        q = ovo.e.a;
        r = ovo.d.a;
    }
    
    public m0c(final Resources a) {
        this.a = a;
        this.b = 300;
        this.c = 0.0f;
        this.d = null;
        final ovo.e q = m0c.q;
        this.e = (ovo$b)q;
        this.f = null;
        this.g = (ovo$b)q;
        this.h = null;
        this.i = (ovo$b)q;
        this.j = null;
        this.k = (ovo$b)q;
        this.l = (ovo$b)m0c.r;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
    
    public final l0c a() {
        final List<Drawable> n = this.n;
        if (n != null) {
            final Iterator<Drawable> iterator = n.iterator();
            while (iterator.hasNext()) {
                Objects.requireNonNull((Object)iterator.next());
            }
        }
        return new l0c(this);
    }
}
