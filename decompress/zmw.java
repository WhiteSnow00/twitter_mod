import android.widget.TextView;
import java.util.WeakHashMap;
import android.view.View;
import com.twitter.ui.widget.TwitterEditText;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated(forRemoval = true, since = "9.39")
public final class zmw extends cnw
{
    public static final int[] f;
    public static final int[] g;
    public final TwitterEditText e;
    
    static {
        f = new int[] { 2130970711 };
        g = new int[0];
    }
    
    public zmw(final TwitterEditText e) {
        final tqm$a companion = tqm.Companion;
        super(e, (cnw.b)new zmw.zmw$a(companion.b((View)e), new cnw$a(companion.b((View)e))));
        this.e = e;
        this.i();
    }
    
    public final void i() {
        final TwitterEditText e = this.e;
        final WeakHashMap a = p5x.a;
        p5x$d.s((View)e, 1);
        this.e.setExtraState(zmw.g);
        ((TextView)this.e).setInputType(129);
    }
}
