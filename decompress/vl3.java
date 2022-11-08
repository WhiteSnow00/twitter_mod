import android.view.View;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vl3
{
    public final Queue<a> a;
    
    public vl3() {
        this.a = new ArrayDeque();
    }
    
    public final a a() {
        return (a)or4.H1((Iterable)this.a);
    }
    
    public final class a implements k81
    {
        public final k81 C0;
        public rd6 D0;
        
        public a(final k81 c0) {
            this.C0 = c0;
            this.D0 = new rd6();
        }
        
        public final void a1() {
            final Iterator iterator = vl3.this.a.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).C0.a1();
            }
        }
        
        public final boolean f0() {
            return this.C0.f0();
        }
        
        public final View getItemView() {
            return this.C0.getItemView();
        }
        
        public final void j1() {
            this.C0.j1();
        }
    }
}
