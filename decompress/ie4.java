import androidx.recyclerview.widget.RecyclerView$c0;
import java.util.Objects;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ie4<I, V extends View> extends h7m<I, V>
{
    public final de6 J0;
    public final znl<ie4.ie4$a<I, V>> K0;
    
    public ie4(final kcm kcm) {
        this.K0 = (znl<ie4.ie4$a<I, V>>)new znl();
        final de6 j0 = new de6();
        Objects.requireNonNull(this.J0 = j0);
        kcm.i((sj)new o52(j0, 2));
    }
    
    public void D(final V v, final I n, final int n2) {
        e0e.f((Object)v, "<this>");
        final b39 subscribe = too.f((View)v).filter((ouk)j71.T0).subscribe((rk6)new he4((Object)this, (Object)v, (Object)n, 0));
        v.setTag((Object)subscribe);
        this.J0.a(subscribe);
    }
    
    public final void x(final RecyclerView$c0 recyclerView$c0) {
        final Object tag = ((RecyclerView$c0)recyclerView$c0).F0.getTag();
        final int a = o5j.a;
        this.J0.b((b39)tag);
    }
}
