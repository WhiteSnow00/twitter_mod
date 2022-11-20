import android.view.View$OnFocusChangeListener;
import android.view.View;
import java.util.Iterator;
import android.view.View$OnClickListener;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsh
{
    public final a a;
    public final b b;
    public final w19 c;
    public List<c> d;
    public View$OnClickListener e;
    public View$OnClickListener f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    
    public fsh(final a a, final xbm xbm) {
        this.b = new b();
        final w19 c = new w19();
        this.c = c;
        final gdd$b e0 = gdd.E0;
        final int a2 = c5j.a;
        this.d = (List<c>)e0;
        this.g = "";
        this.h = "";
        this.i = "";
        this.a = a;
        xbm.i((oj)new cuf(c, 4));
    }
    
    public final c a() {
        for (final c c : this.d) {
            if (c.a()) {
                return c;
            }
        }
        return null;
    }
    
    public final c b(c c) {
        for (int index = this.d.indexOf(c), i = index + 1; i < this.d.size() + index; ++i) {
            final List<c> d = this.d;
            c = d.get(i % d.size());
            if (!c.isValid()) {
                return c;
            }
        }
        return null;
    }
    
    public final void c(final boolean b) {
        if (b) {
            this.a.h(this.i);
            this.a.j(true);
            this.a.a(this.f);
        }
        else {
            final c a = this.a();
            if (a == null) {
                return;
            }
            if (this.b(a) != null) {
                this.a.a((View$OnClickListener)this.b);
                this.a.h(this.g);
            }
            else {
                this.a.a(this.e);
                this.a.h(this.h);
            }
            this.a.j(a.isValid());
        }
    }
    
    public interface a
    {
        void a(final View$OnClickListener p0);
        
        void h(final CharSequence p0);
        
        void j(final boolean p0);
    }
    
    public final class b implements View$OnClickListener
    {
        public final fsh D0;
        
        public b(final fsh d0) {
            this.D0 = d0;
        }
        
        public final void onClick(final View view) {
            final c a = this.D0.a();
            if (a == null) {
                return;
            }
            final c b = this.D0.b(a);
            if (b != null) {
                b.requestFocus();
            }
        }
    }
    
    public interface c
    {
        boolean a();
        
        h5j<Boolean> b();
        
        void c(final View$OnFocusChangeListener p0);
        
        boolean isValid();
        
        boolean requestFocus();
    }
}
